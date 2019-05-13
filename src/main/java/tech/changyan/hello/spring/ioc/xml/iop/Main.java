package tech.changyan.hello.spring.ioc.xml.iop;

public class Main {
    public static void main(String[] args){
        HelloInterface hif = new HelloInterfaceImpl();
        System.out.println(hif.hello("cc"));
    }
}
