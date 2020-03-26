package com.example.jwtapi.simplerestapis.controller;

import com.example.jwtapi.okta.createverifytokens.JWTDemo;
import com.example.jwtapi.simplerestapis.models.*;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMethod;

@RestController
@RequestMapping("/jwt/api")
public class WebController {

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
        long time = 800000000;

        response.setJwtToken(
                JWTDemo.createJWT(
                inputPayload.getJwtId(), // claim = jti
                inputPayload.getJwtIssuer(), // claim = iss
                inputPayload.getJwtSubject(), // claim = sub
                800000000 // used to calculate expiration (claim = exp)
        ));
        return response;
    }


//    String jwtId = "SOMEID1234";
//    String jwtIssuer = "JWT Demo";
//    String jwtSubject = "Andrew";
//    long jwtTimeToLive = 800000000; //92 days
//
//    String jwt = JWTDemo.createJWT(
//            jwtId, // claim = jti
//            jwtIssuer, // claim = iss
//            jwtSubject, // claim = sub
//            jwtTimeToLive // used to calculate expiration (claim = exp)
//    );

    /**
     * 1. Add port request
     * 2. Add Post response
     * 3. Add a methods in Web Controller
     * 4. publish and test
     */


}
