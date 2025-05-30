package com.one.store;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
     @RequestMapping("/")
    public String index() {
         return "index.html"; // This will resolve to src/main/resources/templates/index.html
     }
}
