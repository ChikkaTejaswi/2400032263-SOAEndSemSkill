
package com.klu.springmvc;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

@RestController
public class DriverController {

    @Value("${server.port}")
    private String port;

    @GetMapping("/drivers/{id}")
    public String getDriver(@PathVariable String id) {

        return "Driver ID: " + id +
               " served by port: " + port;
    }
}
