package com.mycompany.p3u3;

import org.springframework.stereotype.Component;

//anotacia component
@Component
public class DataSourceMock implements DataSourceIfc{

    public String getData() {
        return null;
    }
}
