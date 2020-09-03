package com.pardhu.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

@Service
public class reviewService {

    @Autowired
    private reviewRepository reviewRepository;

    /*private List<reviewmodel> reviews=new ArrayList<>(Arrays.asList(
            new reviewmodel("1","pardhu","Its nice"),
            new reviewmodel("2","ramana","Its great"),
            new reviewmodel("3","load","its okay")
        ));*/
    public List<reviewmodel> getAllReview(){
        //return reviews;
        List<reviewmodel> reviews=new ArrayList<>();
        reviewRepository.findAll().forEach(reviews::add);
        return reviews;
    }
    public Optional<reviewmodel> getreview(String id){
        //return reviews.stream().filter(t -> t.getId().equals(id)).findFirst().get();
        return reviewRepository.findById(id);
    }

    public void addreview(reviewmodel review) {
        reviewRepository.save(review);
    }
}
