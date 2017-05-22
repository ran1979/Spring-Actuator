package com.learn.microservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.actuate.metrics.CounterService;
import org.springframework.web.bind.annotation.*;

/**
 * This is a demo controller to show a quick usage of the metric api using the CounterService of spring boot
 */
@RestController
@RequestMapping("/")
public class HelloController {
    @Autowired
    CounterService counterService;

    @RequestMapping(method= RequestMethod.GET)
    public @ResponseBody String hello() {
        counterService.increment("api.hello");
        return "Hello";
    }
}
