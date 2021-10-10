package com.mycompany.p1u1;

public class DataProcessor {
    // private DataSource source;
    private DataSourceInterface source;
    
    public DataProcessor(){
        //source = new DataSource();
        source = new DataSourceMock();
    }
    
    public boolean processData(){
        String s = source.getData();
        System.out.println(s);
        return s != null;
    }
    
}
