package com.example.demo.controller;

import com.example.demo.service.DemoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

    @Autowired
    private DemoService demoService;

    // This method handles GET requests to the /demo endpoint
    @GetMapping("/demo")
    public String getDemoData() {
        // Fetch dummy data from the service layer and return as a simple text response
        return String.join(", ", demoService.getDummyData());
    }
}
