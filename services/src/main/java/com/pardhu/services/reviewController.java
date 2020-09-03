package com.pardhu.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class reviewController {
    @Autowired
    private reviewService reviewService;

    @RequestMapping("/reviews")
    public List<reviewmodel> getreviews() {
        return reviewService.getAllReview();
    }
    @RequestMapping("/{id}")
    public Optional<reviewmodel> getreview(@PathVariable String id){
        return reviewService.getreview(id);
    }
    @RequestMapping(method = RequestMethod.POST, value = "/review")
    public void addreview(@RequestBody reviewmodel review){
            reviewService.addreview(review);
    }
}
