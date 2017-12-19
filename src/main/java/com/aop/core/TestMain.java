package com.aop.core;


import com.aop.customer.bo.CustomerBo;
import com.aop.customer.imp.CustomerBoImp;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class TestMain {

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring-aop.xml");
        CustomerBo customerBoImp= (CustomerBo) context.getBean("customerBoImp");
        customerBoImp.addCustomer();

    }
}
