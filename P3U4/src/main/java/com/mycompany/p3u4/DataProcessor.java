package com.mycompany.p3u4;

public class DataProcessor {

    private DataSourceIfc source;   

    public DataProcessor() {
    }

    //aby som mohla pouzivat riesenie od MAJT <3
    public DataProcessor(DataSourceIfc source) {
        this.source = source;
    }
    
    public void setSource(DataSourceIfc source) {
        this.source = source;
    }

    public boolean processData() {
        String s = source.getData();
        System.out.println(s);
        return s!=null;
    }
    
}

