package tech.changyan.hello.spring.ioc.xml.injection.service;

import tech.changyan.hello.spring.ioc.xml.injection.dao.HelloInjectionDAO;

public class HelloInjectionServiceImpl implements HelloInjectionService {

    private HelloInjectionDAO helloInjectionDAO;

    public void save(String arg){
        System.out.println("[HELLO] Service接收参数："+arg);
        arg = arg + "-" + this.hashCode();
        helloInjectionDAO.save(arg);
    }

    //构造器注入
//    public HelloInjectionServiceImpl(HelloInjectionDAO helloInjectionDAO) {
//        this.helloInjectionDAO = helloInjectionDAO;
//    }

    //设值注入
    public void setHelloInjectionDAO(HelloInjectionDAO helloInjectionDAO) {
        this.helloInjectionDAO = helloInjectionDAO;
    }


}
