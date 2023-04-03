package com.aaa.entity;

import java.io.Serializable;

import lombok.Data;

@Data
public class Customer implements Serializable {
    private Integer id;

    private String name;

    private String gender;

    private Integer age;

    private String iphone;

    private String certType;

    private String certNo;

    private String address;

    private Integer status;

    private static final long serialVersionUID = 1L;
}