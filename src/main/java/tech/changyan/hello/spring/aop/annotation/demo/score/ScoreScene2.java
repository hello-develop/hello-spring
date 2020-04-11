package tech.changyan.hello.spring.aop.annotation.demo.score;

import org.springframework.stereotype.Component;

@Component
public class ScoreScene2 {

    public void failByArea(String userid, String cateid) {

        System.out.println("[scene2] 区管审核不通过");

    }
}
