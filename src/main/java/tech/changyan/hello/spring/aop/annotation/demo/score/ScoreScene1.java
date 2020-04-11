package tech.changyan.hello.spring.aop.annotation.demo.score;

import org.springframework.stereotype.Component;

@Component
public class ScoreScene1 {

    public void passBySchool(String userid, String cateid, String[] awardsArr) {

        System.out.println("[scene1] 校管审核通过");

    }
}
