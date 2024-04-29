package com.aula1.aulaSpring.Controllers;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/initial")
public class InitialController {
    @GetMapping
    public String hello() {
        return "Hello";
    }

    @GetMapping("{id}")
    public String helloWithId(@PathVariable Long id) {
        return "Hello" + id;
    }

    @GetMapping(params = "id")
    public String helloWithQuery(@RequestParam Long id) {
        return "Hello" + id;
    }
}
