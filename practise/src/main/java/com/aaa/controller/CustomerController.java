package com.aaa.controller;

import com.aaa.entity.EiDefault;
import com.aaa.service.ICustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("customer")
public class CustomerController {

    @Autowired
    private ICustomerService iCustomerService;

    @RequestMapping("query")
    public EiDefault query(EiDefault eiDefault) {
        return iCustomerService.selectAll(eiDefault);
    }

    @RequestMapping("insert")
    public EiDefault insertCustomer(@RequestBody EiDefault eiDefault) {
        return iCustomerService.insertSelective(eiDefault);
    }

    @RequestMapping("update")
    public EiDefault updateCustomer(@RequestBody EiDefault eiDefault) {
        return iCustomerService.updateByPrimaryKey(eiDefault);
    }

    @RequestMapping("delete")
    public EiDefault deleteCustomer(EiDefault eiDefault) {
        return iCustomerService.updateByPrimaryKey(eiDefault);
    }

}
