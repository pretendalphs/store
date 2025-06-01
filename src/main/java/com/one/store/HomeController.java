package com.one.store;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
    @Value("${spring.application.name}")
    private String AppName ;
     @RequestMapping("/")
    public String index() {
         System.out.println(AppName);
         return "index.html"; // This will resolve to src/main/resources/templates/index.html
     }
}
