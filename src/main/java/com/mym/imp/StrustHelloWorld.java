package com.mym.imp;

import com.mym.interfaces.HelloWorld;

public class StrustHelloWorld  implements HelloWorld{
    public void sayHello(String str) {
        System.out.println("StrustHelloWorld："+str);
    }
}
