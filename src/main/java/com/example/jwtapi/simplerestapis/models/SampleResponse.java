package com.example.jwtapi.simplerestapis.models;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel(description="This is a response for Sample Api")
public class SampleResponse {

    @ApiModelProperty(notes="This was the message passed as url param")
    private String message;
    @ApiModelProperty(notes="This is the ID returned to the user as part of response")
    private long id;

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }
}
