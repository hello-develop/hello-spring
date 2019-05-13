package tech.changyan.hello.spring.ioc.annotation.injection.collection;

import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Order(1)
public class HelloInterfaceTwoImpl implements HelloInterface {

}
