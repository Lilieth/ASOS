package com.mycompany.p3u4;

public class DataSource implements DataSourceIfc{

    int count = 5; //ma property count

    public void setCount(int count) {
        this.count = count;
    }

    @Override
    public String getData() {
        if (0 < count) {
            return "Hello from DataSource: " + count--;
        } else {
            return null;
        }
    }
}