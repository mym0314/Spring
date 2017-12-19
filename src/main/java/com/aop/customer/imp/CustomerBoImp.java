package com.aop.customer.imp;

import com.aop.customer.bo.CustomerBo;
import org.springframework.stereotype.Component;

@Component("customerBoImp")
public class CustomerBoImp implements CustomerBo {
    public void addCustomer() {
        System.out.println("addCustomer () is running ");
    }

    public String addCustomeReturnValue() {
        System.out.println("addCustomeReturnValue () is running ");
        return "abc";
    }

    public void addustomerThrowException() throws Exception {
        System.out.println("addustomerThrowException () is running ");

        throw new Exception("Generic Error");
    }

    public void addCustomerAround(String name) {
        System.out.println("addCustomerAround () is running :"+name);
    }
}
