package com.mym.main;

import com.mym.interfaces.HelloWorld;
import com.mym.services.HelloWorldService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloProgram {

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring-beans/beans.xml");

        HelloWorldService  helloWorldService = (HelloWorldService) context.getBean("helloWorldService");
        HelloWorld hw = helloWorldService.getHelloWorld();

        hw.sayHello("你好");
    }
}
