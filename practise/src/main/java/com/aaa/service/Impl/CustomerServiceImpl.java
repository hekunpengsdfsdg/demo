package com.aaa.service.Impl;

import com.aaa.dao.CustomerMapper;
import com.aaa.entity.Customer;
import com.aaa.entity.EIConstant;
import com.aaa.entity.EiDefault;
import com.aaa.service.ICustomerService;
import com.alibaba.fastjson2.JSON;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class CustomerServiceImpl implements ICustomerService {
    @Autowired
    private CustomerMapper customerMapper;

    @Override
    public int deleteByPrimaryKey(Integer id) {
        return customerMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(Customer record) {
        return customerMapper.insert(record);
    }

    @Override
    public EiDefault insertSelective(EiDefault eiDefault) {
        Customer customer = JSON.parseObject(JSON.toJSONString(eiDefault.getDataBlock()), Customer.class);
        int status = customerMapper.insertSelective(customer);
        if (status > 0) {
            eiDefault.setStatus(EIConstant.SUCCESS_STATUS);
            eiDefault.setMsg("新增成功");
        } else {
            eiDefault.setStatus(EIConstant.FAIL_STATUS);
            eiDefault.setMsg("新增失败");
        }
        return eiDefault;
    }

    @Override
    public Customer selectByPrimaryKey(Integer id) {
        return customerMapper.selectByPrimaryKey(id);
    }

    @Override
    public EiDefault selectAll(EiDefault eiDefault) {
        eiDefault.setDataBlock(customerMapper.selectAll());
        eiDefault.setStatus(EIConstant.SUCCESS_STATUS);
        eiDefault.setMsg("查询成功");
        return eiDefault;
    }

    @Override
    public int updateByPrimaryKeySelective(Customer record) {
        return customerMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public EiDefault updateByPrimaryKey(EiDefault eiDefault) {
        int status = customerMapper.updateByPrimaryKey(JSON.parseObject(JSON.toJSONString(eiDefault.getDataBlock()), Customer.class));
        if (status > 0) {
            eiDefault.setStatus(EIConstant.SUCCESS_STATUS);
            eiDefault.setMsg("修改成功");
        } else {
            eiDefault.setStatus(EIConstant.FAIL_STATUS);
            eiDefault.setMsg("修改失败");
        }
        return eiDefault;
    }
}
