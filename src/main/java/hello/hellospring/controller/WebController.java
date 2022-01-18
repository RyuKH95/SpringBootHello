package hello.hellospring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class WebController {

    @GetMapping("web")
    public String Web(Model model) {
        model.addAttribute("data", "Ajax");
        return "web";
    }

}
