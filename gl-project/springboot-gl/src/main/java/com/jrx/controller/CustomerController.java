package com.jrx.controller;

import com.jrx.model.Customer;
import com.jrx.pojo.Result;
import com.jrx.pojo.Status;
import com.jrx.service.CustomerService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * customer的Controller
 *对Customer表进行操作
 * @author Administrator
 * @create 2019-04-15 18:32
 * @className CustomerController
 **/
@RequestMapping("/customer")
@RestController
@Api(description = "customer的Controller访问API")
public class CustomerController {
    Logger logger = LoggerFactory.getLogger(CustomerController.class);
    @Autowired
    private CustomerService customerService;

    @ApiOperation(value = "获取所有Customer对象",notes = "获取所有Customer",response = Result.class)
    @RequestMapping(value = "/listCustomer",method = RequestMethod.GET)
    public Result<List> listCustomer(){
        try {
            List<Customer> customerList = customerService.listCustomer();
            return new Result<List>(Status.SUCCESS,"查询成功",customerList);
        } catch (Exception e) {
            logger.error(e.getMessage());
            return new Result<List>(Status.FAIL,"查询失败");
        }
    }

    @ApiOperation(value = "获取一个Customer对象",notes = "根据cusId获取一个Customer",response = Result.class)
    @ApiImplicitParam(required = true,dataTypeClass = Integer.class,name="cusId",value = "传入用户id获取consumer对象")
    @RequestMapping(value = "/getCustomer/{cusId}",method = RequestMethod.GET)
    public Result<Customer> getCustomer(@PathVariable Integer cusId){
        try {
            Customer customer = customerService.getCustomer(cusId);
            return new Result<Customer>(Status.SUCCESS,"查询成功",customer);
        } catch (Exception e) {
            logger.error(e.getMessage());
            return new Result<Customer>(Status.FAIL,"查询失败");
        }
    }

    @ApiOperation(value = "修改Customer对象",notes = "传入Customer对象修改Customer",response = Result.class)
    @ApiImplicitParam(required = true,dataType = "Customer",name="customer",value = "传入customer修改consumer对象")
    @RequestMapping(value = "/updateCustomer",method = RequestMethod.PUT)
    public Result updateCustomer(@RequestBody Customer customer){
        try {
            customerService.updateCustomer(customer);
            return new Result(Status.SUCCESS,"修改成功");
        } catch (Exception e) {
            logger.error(e.getMessage());
            return new Result(Status.FAIL,"修改失败");
        }
    }

    @ApiOperation(value = "添加Customer对象",notes = "传入Customer对象添加Customer",response = Result.class)
    @ApiImplicitParam(required = true,dataType = "Customer",name="customer",value = "传入customer添加consumer对象")
    @RequestMapping(value = "/insertCustomer",method = RequestMethod.POST)
    public Result<Customer> insertCustomer(@RequestBody Customer customer){
        try {
            customerService.updateCustomer(customer);
            return new Result<Customer>(Status.SUCCESS,"添加成功");
        } catch (Exception e) {
            logger.error(e.getMessage());
            return new Result<Customer>(Status.FAIL,"添加失败");
        }
    }

    @ApiOperation(value = "删除Customer对象",notes = "传入cusId删除consumer对象",response = Result.class)
    @ApiImplicitParam(required = true,dataType = "Integer",name="cusId",value = "传入cusId删除consumer对象")
    @RequestMapping(value = "/deleteCustomer/{cusId}",method = RequestMethod.DELETE)
    public Result deleteCustomer(@PathVariable Integer cusId){
        try {
            customerService.deleteByCusId(cusId);
            return new Result(Status.SUCCESS,"删除成功");
        } catch (Exception e) {
            logger.error(e.getMessage());
            return new Result(Status.FAIL,"删除失败");
        }
    }
}
