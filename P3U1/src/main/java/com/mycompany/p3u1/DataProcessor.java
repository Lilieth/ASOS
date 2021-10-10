package com.mycompany.p3u1;

public class DataProcessor {

    private DataSourceIfc source;

    public DataProcessor() {
    }

//    public DataProcessor(DataSourceIfc source) {
//        this.source = source;
//    }
    public void setSource(DataSourceIfc source) {
        this.source = source;
    }

    public boolean processData() {
        if (source != null) {
            String s = source.getData();
            System.out.println(s);
            return s != null;
        } else {
            System.out.println("No datasource");
            return false;
        }
    }
}
