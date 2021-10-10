package com.mycompany.p3u1;

public class DataSourceMock implements DataSourceIfc {

    public String getData() {
        System.out.println("Halabala DataSourceMock");
        return null;
    }
}