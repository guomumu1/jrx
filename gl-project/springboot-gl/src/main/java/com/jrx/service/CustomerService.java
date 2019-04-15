package com.jrx.service;

import com.jrx.model.Customer;

import java.util.List;

/**
 * customer的Service接口
 *
 * @author Administrator
 * @create 2019-04-15 18:32
 * @interfaceName CustomerService
 **/
public interface CustomerService {
    /**
     * @returnList<Customer>
     */
    public List<Customer> listCustomer();

    /**
     * @param cusId
     * @return Customer
     */
    public Customer getCustomer(int cusId);

    /**
     * @param customer
     */
    public void updateCustomer(Customer customer);

    /**
     * @param customer
     */
    public void insertCustomer(Customer customer);

    /**
     * @param cusId
     */
    public void deleteByCusId(int cusId);
}
