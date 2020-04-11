package tech.changyan.hello.spring.aop.annotation.demo.score;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

@Component
@Aspect
public class ScoreAspect {

    private static Map<String, Integer> scoreDic = new HashMap<>();

    public ScoreAspect() {
        scoreDic.put("1001", 1);
        scoreDic.put("1002", 2);

    }

    @Pointcut("execution(* tech.changyan.hello.spring.aop.annotation.demo.score.ScoreScene*.passBySchool(..)) && args(userid, cateid, awardsArr)")
    private void addScorePointcut(String userid, String cateid, String[] awardsArr) {
    }

    @AfterReturning("addScorePointcut(userid, cateid, awardsArr)")
    private void after(JoinPoint jp, String userid, String cateid, String[] awardsArr) {
        int score = 0;
        for (int i = 0; i < awardsArr.length; i++) {
            score += scoreDic.get(awardsArr[i]);
        }
        System.out.printf("[score] calculating score..(userid:%s cateid:%s score:%d)", userid, cateid, score);
    }

    @Pointcut("execution(* tech.changyan.hello.spring.aop.annotation.demo.score.ScoreScene*.failByArea(..)) && args(userid, cateid)")
    private void subScorePointcut(String userid, String cateid) {
    }

    @AfterReturning("subScorePointcut(userid, cateid)")
    private void after(JoinPoint jp, String userid, String cateid) {

        System.out.printf("[score] calculating score..(userid:%s cateid:%s)", userid, cateid);
    }

}
