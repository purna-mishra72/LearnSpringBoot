package com.example.demo.service;

import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class DemoService {

    // This method simulates a database query by returning dummy data
    public List<String> getDummyData() {
        return Arrays.asList("Data 1", "Data 2", "Data 3");
    }
}
