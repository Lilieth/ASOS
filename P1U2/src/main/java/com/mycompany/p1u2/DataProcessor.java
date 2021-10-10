package com.mycompany.p1u2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DataProcessor {

    // private DataSource source;
    private DataSourceInterface source;

    public DataProcessor() {
        //ak chcem spravit nejaku zmenu, vzdy budem potrebovat menit instanciu DataSource
        //preto na rozdiel od predosleho riesenia vyuzijeme context, teda nebude to 
        //zadane v source kode, ktoru implementaciu vyuzijeme, ale v konfiguracnom subore
        //source = new DataSourceMock();
        ApplicationContext context = new ClassPathXmlApplicationContext(new String[]{"myConfig.xml"}); //nacitam xml, ktory obsahuje, co mam pouzit na vytvorenie
        //component v XML sa nazyva beam
        source = context.getBean("mysource", DataSourceInterface.class);
    }

    public boolean processData() {
        String s = source.getData();
        System.out.println(s);
        return s != null;
    }
}
