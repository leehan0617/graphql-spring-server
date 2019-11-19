package com.heron.graphql.model;

/**
 * Created by heron.lee 2019-11-19
 */
public class SimpleResponse {
    private String message;

    public SimpleResponse () {}
    public SimpleResponse(String message) {
        this.message = message;
    }

    public String getMessage () {
        return this.message;
    }
    public void setMessage (String message) {
        this.message = message;
    }
}
