package com.jrx.service.impl;

import com.jrx.model.Customer;
import com.jrx.repository.CustomerMapper;
import com.jrx.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * customer的Service接口实现类
 *
 * @author Administrator
 * @create 2019-04-15 18:32
 * @class CustomerServiceImpl
 **/
@Service
@Transactional(rollbackFor = Exception.class)
public class CustomerServiceImpl implements CustomerService{
    @Autowired
    private CustomerMapper customerMapper;

    @Override
    public List<Customer> listCustomer() {
        return customerMapper.selectByExample(null);
    }

    @Override
    public Customer getCustomer(int cusId) {
        return customerMapper.selectByPrimaryKey(cusId);
    }

    @Override
    public void updateCustomer(Customer customer) {
        customerMapper.updateByPrimaryKeySelective(customer);
    }

    @Override
    public void insertCustomer(Customer customer) {
        customerMapper.insertSelective(customer);
    }

    @Override
    public void deleteByCusId(int cusId) {
        customerMapper.deleteByPrimaryKey(cusId);
    }
}
