package com.mycompany.p3u3;

import org.springframework.stereotype.Component;

// Nemozem nechat obidve ako component, lebo to skape ako pred tym v P3U1
//@Component
public class DataSource implements DataSourceIfc {

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
