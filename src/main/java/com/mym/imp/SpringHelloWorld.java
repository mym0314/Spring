package com.mym.imp;

import com.mym.interfaces.HelloWorld;
import org.springframework.stereotype.Component;

@Component
public class SpringHelloWorld implements HelloWorld{
    public void sayHello(String str) {
        System.out.println("SpringHelloWorld："+str);
    }
}
