package com.example.ProductServices.controllers;

import com.example.ProductServices.exceptions.ProductNotFoundException;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SampleController {


    //End point name: GET /hello
    @GetMapping("/hello")
    public String helloWorld() {
        return "hello world";
    }

    @GetMapping("/hello/{name}")
    public String helloWithName(@PathVariable("name") String name)throws ProductNotFoundException {
        if(name.equals("Sunil")){
            throw new ProductNotFoundException("Sunil is not a product");
        }
        return "Hello" + name;
    }

    @GetMapping("/show/{showId}/seat/{seatId}")
    //GET/ show/{showId}/seat/{seatId}
    public String bmsExample(@PathVariable("showId") String showId, @PathVariable("seatId")int seatId){
        return "Hello"+ showId + " " +seatId;
    }


}
