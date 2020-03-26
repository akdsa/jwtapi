package com.example.jwtapi.simplerestapis.models;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel(description="This is response for POST Api")
public class PostResponse {
    @ApiModelProperty(notes="This is the ID")
    int id;
    @ApiModelProperty(notes="This is the message")
    String message;
    @ApiModelProperty(notes="This is the extra message")
    String extra;

    public String getExtra() {
        return extra;
    }

    public int getId() {
        return id;
    }

    public String getMessage() {
        return message;
    }

    public void setExtra(String extra) {
        this.extra = extra;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
