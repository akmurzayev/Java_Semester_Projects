package pl.edu.vistula.first_project_java_spring.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
public class HelloController {

    @GetMapping("/")
    public String hello() {
        return "Hello Vistula, in my first Spring controller.";
    }
}