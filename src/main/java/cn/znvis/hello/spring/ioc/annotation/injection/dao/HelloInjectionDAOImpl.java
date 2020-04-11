package cn.znvis.hello.spring.ioc.annotation.injection.dao;

import org.springframework.stereotype.Repository;

@Repository
public class HelloInjectionDAOImpl implements HelloInjectionDAO {
    @Override
    public void save(String msg) {
        msg = msg + "-" + this.hashCode();
        System.out.println("[HELLO] DAO处理数据：" + msg);
    }
}
