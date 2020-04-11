package tech.changyan.hello.spring.ioc.xml.bean;

public class HelloBeanLifecycle {

    public void start() {
        System.out.println("[HELLO] Lifecycle bean Start: " + this.hashCode());
    }

    public void stop() {
        System.out.println("[HELLO] Lifecycle bean Stop: " + this.hashCode());
    }

    public void printBeanScope() {
        System.out.println("[HELLO] Print bean Scope: " + this.hashCode());
    }

}
