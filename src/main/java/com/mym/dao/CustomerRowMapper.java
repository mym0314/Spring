package com.mym.dao;


import com.mym.bean.Customer;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class CustomerRowMapper implements RowMapper {

    public Object mapRow(ResultSet resultSet, int i) throws SQLException {
        Customer customer = new Customer();

            customer.setCustId(resultSet.getInt("CUST_ID"));
            customer.setName(resultSet.getString("NAME"));
            customer.setAge(resultSet.getInt("AGE"));

        return customer;
    }
}
