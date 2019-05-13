package tech.changyan.hello.spring.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * DESC
 *
 * @author cc
 */
@RequestMapping("/hello")
@Controller
public class HelloController {

    @GetMapping("/getEncode")
    public String getEncode(String welcome, ModelMap modelMap){

        modelMap.addAttribute("welcome", welcome);
        return "encode";
    }

    @PostMapping("/postEncode")
    public String postEncode(String username, String password, Model model){

        model.addAttribute("username", username);
        return "encode";
    }
}
