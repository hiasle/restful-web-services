package com.in28minutes.rest.webservices.restfulwebservices.helloworld;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class HelloWorldBean {

    private String title;

    public HelloWorldBean(String title) {
        this.title = title;
    }

}
