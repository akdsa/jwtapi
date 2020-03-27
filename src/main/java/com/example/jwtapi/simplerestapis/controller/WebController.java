package com.example.jwtapi.simplerestapis.controller;

import com.example.jwtapi.simplerestapis.createverifytokens.JWTDemo;
import com.example.jwtapi.simplerestapis.models.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMethod;

@RestController
@RequestMapping("/jwt/api")
public class WebController {
//    @Autowired JWTDemo jwtDemo ;

    @RequestMapping(value = "/sample", method = RequestMethod.GET)
    public SampleResponse Sample(@RequestParam(value = "name",
            defaultValue = "Akshat") String name) {
        SampleResponse response = new SampleResponse();
        response.setId(1);
        response.setMessage("Your name is " + name);
        return response;

    }

    @RequestMapping(value = "/test", method = RequestMethod.POST)
    public PostResponse Test(@RequestBody PostRequest inputPayload) {
        PostResponse response = new PostResponse();
        response.setId(inputPayload.getId() * 100);
        response.setMessage("Hello " + inputPayload.getName());
        response.setExtra("Some text");
        return response;
    }

    @RequestMapping(value = "/token", method = RequestMethod.POST)
    public JwtResponse getJwtToken(@RequestBody JwtRequest inputPayload) {
        JwtResponse response = new JwtResponse();

        response.setJwtToken(
                JWTDemo.createJWT(
                inputPayload.getCdsId(),
                inputPayload.getJwtIssuer(),
                inputPayload.getJwtSubject(),
                800000000 // used to calculate expiration (claim = exp)
        ));
        return response;
    }
}
