package tech.changyan.hello.spring.ioc.xml.aware;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class HelloBeanNameAware implements ApplicationContextAware, BeanNameAware {

    private String beanName;

    @Override
    public void setBeanName(String name) {
        this.beanName = name;
        System.out.println("[HELLO] BeanName: " + name);
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        System.out.println("[HELLO] BeanName bean Instance: " + applicationContext.getBean(this.beanName).hashCode());
    }
}
