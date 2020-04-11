package tech.changyan.hello.spring.ioc.xml.aware;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class HelloApplicationContextAware implements ApplicationContextAware {

    private ApplicationContext applicationContext;

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        this.applicationContext = applicationContext;
        System.out.println("[HELLO] ApplicationContext: " + applicationContext.getBean("helloApplicationContextAware").hashCode());
    }

    public void hello() {
        System.out.println("[HELLO] ApplicationContextDisplayName: " + this.applicationContext.getDisplayName());
    }
}
