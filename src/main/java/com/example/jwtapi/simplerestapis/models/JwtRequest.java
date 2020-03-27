package com.example.jwtapi.simplerestapis.models;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel(description="This is a Post Api")
public class JwtRequest {

    @ApiModelProperty(notes = "This is the ID")
    String cdsId;

    @ApiModelProperty(notes = "Token issuer name")
    String jwtIssuer;

    @ApiModelProperty(notes = "Token subject")
    String jwtSubject;

    public void setCdsId(String cdsId){
        this.cdsId = cdsId;
    }

    public void setJwtIssuer(String jwtIssuer){
        this.jwtIssuer = jwtIssuer;
    }

    public void setJwtSubject(String jwtSubject){
        this.jwtSubject = jwtSubject;
    }

    public String getCdsId(){
        return cdsId;
    }

    public String getJwtIssuer(){
        return jwtIssuer;
    }

    public String getJwtSubject(){
        return jwtSubject;
    }

}
