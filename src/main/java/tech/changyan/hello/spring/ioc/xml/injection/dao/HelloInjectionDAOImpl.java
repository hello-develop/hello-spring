package tech.changyan.hello.spring.ioc.xml.injection.dao;

public class HelloInjectionDAOImpl implements HelloInjectionDAO {

    @Override
    public void save(String arg) {
        System.out.println("[HELLO] DAO保存数据："+arg);
    }
}
