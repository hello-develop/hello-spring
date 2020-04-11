package cn.znvis.hello.spring.ioc.annotation.injection.collection;

import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Order(2)
public class HelloInterfaceOneImpl implements HelloInterface {
}
