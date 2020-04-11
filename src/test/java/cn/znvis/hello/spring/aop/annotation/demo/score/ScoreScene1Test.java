package cn.znvis.hello.spring.aop.annotation.demo.score;

import cn.znvis.hello.spring.base.UnitTestBase;
import org.junit.Test;

public class ScoreScene1Test extends UnitTestBase {

    public ScoreScene1Test() {
        super("spring-aop-annotation.xml");
    }

    @Test
    public void passBySchool() {
        ScoreScene1 ss1 = super.getBean("scoreScene1");

        String userid = "1Q112D1ED11R12R";
        String cateid = "10000001";
        String[] awardsArr = {"1001", "1002"};
        ss1.passBySchool(userid, cateid, awardsArr);
    }
}