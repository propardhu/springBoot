package com.pardhu.api.resources;

import java.util.Collections;
import java.util.List;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SampleData {

    @RequestMapping("/{userId}")
    public List<RoughData> getName(@PathVariable String userId) {
        return Collections.singletonList(new RoughData("pardhu", 20, userId));
    }

    @RequestMapping("/")
    public String A() {
        return "<h1>Hello world</h1><a href='/ok'>click me</a>";
    }
    
}