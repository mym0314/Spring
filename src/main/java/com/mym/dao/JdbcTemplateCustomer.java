package com.mym.dao;

import com.mym.bean.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import javax.sql.DataSource;

@Component
public class JdbcTemplateCustomer implements CustomerDAO {
    @Autowired
    private DataSource dataSource;
    private JdbcTemplate jdbcTemplate;

    public void setDataSource(DataSource dataSource) {
        this.dataSource = dataSource;
    }

    public void insert(Customer customer) {
        String sql = "Insert into customer(CUST_ID,NAME,AGE) values (?,?,?)";
        jdbcTemplate = new JdbcTemplate(dataSource);
        jdbcTemplate.update(sql, customer.getCustId(), customer.getName(), customer.getCustId());
    }

    public Customer findByCustomerId(int custId) {
        String sql = "select *  from customer  where CUST_ID = ?";
        jdbcTemplate = new JdbcTemplate(dataSource);
        Customer customer = (Customer) jdbcTemplate.queryForObject(sql, new Object[]{custId}, new CustomerRowMapper());
        return customer;
    }
}
