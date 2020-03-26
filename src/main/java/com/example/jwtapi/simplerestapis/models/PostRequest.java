package com.example.jwtapi.simplerestapis.models;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel(description="This is a Post Api")
public class PostRequest {

    @ApiModelProperty(notes="This is the ID in Int")
    int id;
    @ApiModelProperty(notes="This is the name in String")
    String name;

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }
}
