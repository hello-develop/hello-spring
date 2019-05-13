package tech.changyan.hello.spring.aop.xml.demo;

import org.aspectj.lang.ProceedingJoinPoint;
import org.springframework.dao.PessimisticLockingFailureException;
import org.springframework.stereotype.Component;

@Component
public class ConcurrentOperationRetryAspect {

    private static final int DEFAULT_MAX_RETRIES = 2;
    private int maxRetries = DEFAULT_MAX_RETRIES;


    public void setMaxRetries(int maxRetries) {
        this.maxRetries = maxRetries;
    }

    public Object doConcurrentOperation(ProceedingJoinPoint pjp) throws Throwable{
        int attempNum = 0;
        PessimisticLockingFailureException pessimisticLockingFailureException;
        do{
            attempNum++;
            System.out.println("[HELLO] try times: "+attempNum);
            try {
                return pjp.proceed();
            }catch (PessimisticLockingFailureException ex){
                pessimisticLockingFailureException = ex;
            }
        }while(attempNum<=this.maxRetries);
        System.out.println("[HELLO] try error");
        throw pessimisticLockingFailureException;

    }
}
