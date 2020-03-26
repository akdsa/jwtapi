package com.example.jwtapi.simplerestapis.models;

import com.example.jwtapi.okta.createverifytokens.JWTDemo;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel(description = "This is a response for JWT")
public class JwtResponse {

    @ApiModelProperty(notes = "This is the ID")
    String jwtId;

    @ApiModelProperty(notes = "Token issuer name")
    String jwtIssuer;

    @ApiModelProperty(notes = "Token subject")
    String jwtSubject;

    @ApiModelProperty(notes = "Token life time")
    long jwtTimeToLive;

    public void setJwtId(String jwtId){
        this.jwtId = jwtId;
    }

    public void setJwtIssuer(String jwtIssuer){
        this.jwtIssuer = jwtIssuer;
    }

    public void setJwtSubject(String jwtSubject){
        this.jwtSubject = jwtSubject;
    }

    public void setJwtTimeToLive(long jwtTimeToLive){
        this.jwtTimeToLive = jwtTimeToLive;
    }

    public String getJwtId(){
        return jwtId;
    }

    public String getJwtIssuer(){
        return jwtIssuer;
    }

    public String getJwtSubject(){
        return jwtSubject;
    }

    public long getJwtTimeToLive(){
        return jwtTimeToLive;
    }




//    public String getJwtToken(String jwtId, String jwtIssuer, String jwtSubject, long jwtTimeToLive) {
//        return JWTDemo.createJWT(
//                jwtId, // claim = jti
//                jwtIssuer, // claim = iss
//                jwtSubject, // claim = sub
//                jwtTimeToLive // used to calculate expiration (claim = exp)
//        );
//    }


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
}
