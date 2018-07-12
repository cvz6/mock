package com.mock.bean.circular;

import lombok.Data;

@Data
public class BXA {

  private AXB AXB;

  private String name;


    public com.mock.bean.circular.AXB getAXB() {
        return AXB;
    }

    public void setAXB(com.mock.bean.circular.AXB AXB) {
        this.AXB = AXB;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
