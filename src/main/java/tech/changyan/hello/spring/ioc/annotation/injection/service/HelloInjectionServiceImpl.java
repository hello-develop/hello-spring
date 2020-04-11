package tech.changyan.hello.spring.ioc.annotation.injection.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tech.changyan.hello.spring.ioc.annotation.injection.dao.HelloInjectionDAO;

@Service
public class HelloInjectionServiceImpl implements HelloInjectionService {

    // Method 1: field
//    @Autowired
//    private HelloInjectionDAO helloInjectionDAO;

    // Method 2: constructor
//    private HelloInjectionDAO helloInjectionDAO;
//
//    @Autowired
//    public HelloInjectionServiceImpl(HelloInjectionDAO helloInjectionDAO){
//        this.helloInjectionDAO = helloInjectionDAO;
//    }

    // Method 3: setter method
    private HelloInjectionDAO helloInjectionDAO;

    @Autowired
    public void setHelloInjectionDAO(HelloInjectionDAO helloInjectionDAO) {
        this.helloInjectionDAO = helloInjectionDAO;
    }


    @Override
    public void save(String msg) {
        System.out.println("[HELLO] Service接收参数：" + msg);
        msg = msg + "-" + this.hashCode();
        System.out.println("[HELLO] Service处理参数：" + msg);
        this.helloInjectionDAO.save(msg);
    }
}
