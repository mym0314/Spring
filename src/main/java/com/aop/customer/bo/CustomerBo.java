package com.aop.customer.bo;

public interface CustomerBo {

    void addCustomer();

    String addCustomeReturnValue();

    void addustomerThrowException() throws Exception;

    void addCustomerAround(String name);
}
