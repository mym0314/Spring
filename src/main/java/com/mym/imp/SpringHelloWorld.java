package com.mym.imp;

import com.mym.interfaces.HelloWorld;

public class SpringHelloWorld implements HelloWorld{
    public void sayHello(String str) {
        System.out.println("SpringHelloWorld："+str);
    }
}
