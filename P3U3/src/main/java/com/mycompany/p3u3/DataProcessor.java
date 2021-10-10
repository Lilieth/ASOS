package com.mycompany.p3u3;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

// anotacia component sluzi namiesto 
// <bean id="myprocessor" class="com.mycompany.p3u1.DataProcessor" autowire="byType"> 
// najdeme to v P3U1 v pracovanie_s_U3P3.xml (zadanie to iste, len toto je 
// riesene cez anotacie)
@Component("myprocessor")
public class DataProcessor {
//    @Autowired

    private DataSourceIfc source;

    //inicializuje setter based dependency injection
    @Autowired
    public void setSource(DataSourceIfc source) {
        this.source = source;
    }

    public DataProcessor() {
    }

    //takto vyzera constructor based dependency injection
//    @Autowired(required = false)
//    public DataProcessor(DataSourceIfc source) {
//        this.source = source;
//    }

    public boolean processData() {
        if (source != null) {
            String s = source.getData();
            System.out.println(s);
            return s != null;
        } else {
            System.out.println("No datasource!");
            return false;
        }
    }
}
