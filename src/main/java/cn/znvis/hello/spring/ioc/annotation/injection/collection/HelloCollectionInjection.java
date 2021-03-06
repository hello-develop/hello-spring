package cn.znvis.hello.spring.ioc.annotation.injection.collection;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Map;

@Component
public class HelloCollectionInjection {

    private final List<HelloInterface> list;

    private final Map<String, HelloInterface> map;

    private final HelloInterface helloInterface;

    public HelloCollectionInjection(List<HelloInterface> list, Map<String, HelloInterface> map, @Qualifier("helloInterfaceTwoImpl") HelloInterface helloInterface) {
        this.list = list;
        this.map = map;
        this.helloInterface = helloInterface;
    }

    public void traversal() {
        if (list != null && list.size() != 0) {
            for (HelloInterface helloInterface : list) {
                System.out.println("[HELLO] list traversal: " + helloInterface.getClass().getName());
            }
        } else {
            System.out.println("[HELLO] list is null");
        }

        if (map != null && map.size() != 0) {
            for (Map.Entry<String, HelloInterface> entry : map.entrySet()) {
                System.out.println("[HELLO] map traversal: " + entry.getValue().getClass().getName());
            }
        } else {
            System.out.println("[HELLO] map is mull");
        }

        if (this.helloInterface != null) {
            System.out.println("[HELLO] helloInterface: " + helloInterface.getClass().getName());
        } else {
            System.out.println("[HELLO] helloInterface is null");
        }

    }


}
