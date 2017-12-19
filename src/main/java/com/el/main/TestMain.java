package com.el.main;

import com.el.bean.Customer;
import com.el.bean.Item;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;

@Component
public class TestMain {


    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring-el/el-beans.xml");
        Customer customer = (Customer) context.getBean("customerBean");
        Item item = (Item) context.getBean("itemBean");
        System.out.println(customer.getItem()+customer.getItemName());
        System.out.println(item.getName()+item.getQty());


    }
}
