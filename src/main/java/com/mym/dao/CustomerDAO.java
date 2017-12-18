package com.mym.dao;

import com.mym.bean.Customer;

public interface CustomerDAO {

    public void insert(Customer customer);

    public Customer  findByCustomerId(int custId);
}
