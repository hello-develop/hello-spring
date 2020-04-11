package tech.changyan.hello.spring.aop.annotation.demo.concurrent;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.dao.PessimisticLockingFailureException;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class ConcurrentAspect {

    public static final int MAX_RETRY_TIMES = 2;
    private int maxRetries = MAX_RETRY_TIMES;

    @Value("6")
    public void setMaxRetries(int maxRetries) {
        this.maxRetries = maxRetries;
    }

    @Pointcut("execution(* tech.changyan.hello.spring.aop.annotation.demo.concurrent.*.*(..))")
    private void concurrentPointcut() {
    }

    @Before("concurrentPointcut()")
    private void before() {
        System.out.println("[HELLO] before");
    }

    @Around("concurrentPointcut()")
    public Object doConcurrent(ProceedingJoinPoint pjp) throws Throwable {
        int attempNum = 1;
        PessimisticLockingFailureException pessimisticLockingFailureException = null;

        while (attempNum <= this.maxRetries) {
            System.out.println("[HELLO] try times: " + attempNum);
            try {
                return pjp.proceed();
            } catch (PessimisticLockingFailureException e) {
                pessimisticLockingFailureException = e;
            }
            attempNum++;
        }
        System.out.println("[HELLO] error");
        throw pessimisticLockingFailureException;
    }


}
