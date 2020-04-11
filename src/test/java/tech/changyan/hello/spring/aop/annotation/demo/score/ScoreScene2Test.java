package tech.changyan.hello.spring.aop.annotation.demo.score;

import org.junit.Test;
import tech.changyan.hello.spring.base.UnitTestBase;

public class ScoreScene2Test extends UnitTestBase {

    public ScoreScene2Test() {
        super("spring-aop-annotation.xml");
    }

    @Test
    public void failByArea() {
        ScoreScene2 ss2 = super.getBean("scoreScene2");

        String userid = "1Q112D1ED11R12R";
        String cateid = "1000001";

        ss2.failByArea(userid, cateid);
    }
}