package com.mock.bean.circular;

import lombok.Data;

@Data
public class AXB {

  private BXA BXA;

  private String name;

    public com.mock.bean.circular.BXA getBXA() {
        return BXA;
    }

    public void setBXA(com.mock.bean.circular.BXA BXA) {
        this.BXA = BXA;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
