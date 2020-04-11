package cn.znvis.hello.spring.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/hello2")
public class AnnotationHelloController {

    @RequestMapping(method = RequestMethod.GET)
    public String printHello(ModelMap mm, Model model) {
        System.out.println("hllle");
        mm.addAttribute("message", "hello annotation~~1");
        return "annotation_hello";
    }
}
