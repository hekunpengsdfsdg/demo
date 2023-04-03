package com.aaa.service;

import com.aaa.entity.Customer;
import com.aaa.entity.EiDefault;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;


public interface ICustomerService {

    int deleteByPrimaryKey(Integer id);

    int insert(Customer record);

    EiDefault insertSelective(EiDefault eiDefault);

    Customer selectByPrimaryKey(Integer id);

    EiDefault selectAll(EiDefault eiDefault);

    int updateByPrimaryKeySelective(Customer record);

    EiDefault updateByPrimaryKey(EiDefault eiDefault);
}
