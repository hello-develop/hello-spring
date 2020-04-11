package cn.znvis.hello.spring.aop.annotation.demo.score;

import cn.znvis.hello.spring.base.UnitTestBase;
import org.junit.Test;

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