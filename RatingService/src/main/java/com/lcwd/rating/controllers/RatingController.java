package com.lcwd.rating.controllers;


import com.lcwd.rating.entities.Rating;
import com.lcwd.rating.services.RatingServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/ratings")
public class RatingController {
    @Autowired
    private RatingServices ratingServices;
    //create rating
    @PostMapping
    public ResponseEntity<Rating> create(@RequestBody Rating rating) {
        System.out.println("Received rating: " + rating);
        return ResponseEntity.status(HttpStatus.CREATED).body(ratingServices.create(rating));
    }


    //get all
    @GetMapping
    public ResponseEntity<List<Rating>> getRatings()
    {
        return ResponseEntity.ok(ratingServices.getRatings());
    }

    //get all
    @GetMapping("/users/{userId}")
    public ResponseEntity<List<Rating>> getRatingsByUserId(@PathVariable String userId)
    {
        return ResponseEntity.ok(ratingServices.getRatingByUserId(userId));
    }

    //get all
    @GetMapping("/hotels/{hotelId}")
    public ResponseEntity<List<Rating>> getRatingByHotelId(@PathVariable String hotelId)
    {
        return ResponseEntity.ok(ratingServices.getRatingByHotelId(hotelId));
    }

}
