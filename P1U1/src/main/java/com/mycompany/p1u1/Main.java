package com.mycompany.p1u1;

public class Main {

    public static void main(String[] args) {
        DataProcessor processor = new DataProcessor();

        boolean cont = true;
        while (cont) {
            cont = processor.processData();
        }
    }
}
