package com.github.coruja182.springenvironmentvariables.service;

import org.springframework.stereotype.Service;

@Service
public class HelloWorldService {

    public HelloWorldService() {
        System.out.println(getClass().getSimpleName());
    }

    public String getHelloWorld() {
        return "Hello World!";
    }

}
