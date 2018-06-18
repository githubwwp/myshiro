package com.wwp.web.entity;

import java.io.Serializable;

public class SysPermission implements Serializable {
    private String pCode;

    private String pName;

    private static final long serialVersionUID = 1L;

    public String getpCode() {
        return pCode;
    }

    public void setpCode(String pCode) {
        this.pCode = pCode;
    }

    public String getpName() {
        return pName;
    }

    public void setpName(String pName) {
        this.pName = pName;
    }
}