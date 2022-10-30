package com.example.pojo;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties(prefix = "ob")
public class Ob {

    private String para1;
    private int para2;
    private String para3;

    @Override
    public String toString() {
        return "Ob{" +
                "para1='" + para1 + '\'' +
                ", para2=" + para2 +
                ", para3='" + para3 + '\'' +
                '}';
    }

    public String getPara1() {
        return para1;
    }

    public void setPara1(String para1) {
        this.para1 = para1;
    }

    public int getPara2() {
        return para2;
    }

    public void setPara2(int para2) {
        this.para2 = para2;
    }

    public String getPara3() {
        return para3;
    }

    public void setPara3(String para3) {
        this.para3 = para3;
    }
}
