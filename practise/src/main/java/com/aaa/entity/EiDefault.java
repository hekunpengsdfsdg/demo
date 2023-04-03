package com.aaa.entity;

import org.springframework.stereotype.Component;

@Component
public class EiDefault<T> {
    private String status;
    private String msg;
    private String detailMsg;
    private T dataBlock;

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public String getDetailMsg() {
        return detailMsg;
    }

    public void setDetailMsg(String detailMsg) {
        this.detailMsg = detailMsg;
    }

    public T getDataBlock() {
        return dataBlock;
    }

    public void setDataBlock(T dataBlock) {
        this.dataBlock = dataBlock;
    }
}
