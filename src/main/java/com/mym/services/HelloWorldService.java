package com.mym.services;

import com.mym.interfaces.HelloWorld;

public class HelloWorldService {

    private HelloWorld helloWorld;

    public HelloWorldService(){

    }

    public HelloWorldService(HelloWorld helloWorld){
        this.helloWorld = helloWorld;
    }

    public void setHelloWorld(HelloWorld helloWorld) {
        this.helloWorld = helloWorld;
    }

    public HelloWorld getHelloWorld(){
        return this.helloWorld;
    }
}
