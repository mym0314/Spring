package com.mym.services;

import com.mym.interfaces.HelloWorld;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Required;
import org.springframework.stereotype.Component;

@Component
public class HelloWorldService {
    @Autowired
    @Qualifier("springHelloWorld")
    private HelloWorld helloWorld;

    public HelloWorldService() {

    }

    public HelloWorldService(HelloWorld helloWorld) {
        this.helloWorld = helloWorld;
    }

    public void setHelloWorld(HelloWorld helloWorld) {
        this.helloWorld = helloWorld;
    }

    public HelloWorld getHelloWorld() {
        return this.helloWorld;
    }
}
