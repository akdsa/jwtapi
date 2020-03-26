package com.example.jwtapi.simplerestapis.models;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel(description = "This is a response for JWT")
public class JwtResponse {

    @ApiModelProperty(notes = "This is the generated token")
    String token;

    public void setJwtToken(String token){
        this.token = token;
    }

    public String getJwtToken(){
        return token;
    }

}
