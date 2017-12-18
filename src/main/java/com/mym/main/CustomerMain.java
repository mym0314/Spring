package com.mym.main;

import com.mym.bean.Customer;
import com.mym.dao.CustomerDAOImp;
import com.mym.dao.JdbcTemplateCustomer;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CustomerMain {

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("Spring-Module.xml");
        //CustomerDAOImp customerDAOImp = (CustomerDAOImp) context.getBean("customerDAOImp");
        JdbcTemplateCustomer jdbcTemplateCustomer = (JdbcTemplateCustomer) context.getBean("jdbcTemplateCustomer");
        //Customer  customer = new Customer(4,"小黑",21);
       // jdbcTemplateCustomer.insert(customer);
        Customer customer1 = jdbcTemplateCustomer.findByCustomerId(2);
        //customerDAOImp.insert(customer);

        //Customer customer1 = customerDAOImp.findByCustomerId(1);
        System.out.println(customer1);
    }
}
