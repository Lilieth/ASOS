package com.mycompany.p3u4;

import javax.inject.Named;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
//@ComponentScan(basePackages = "com.mycompany.p3u4")
public class AppConfig {

    @Bean(name="mysource")
    //factory metody sluzia na vytvaranie objektov, maju anotaciu @Bean
    //sluzi namiesto 
    // <bean id="myprocessor" class="com.mycompany.p3u1.DataProcessor"> 
    //ktore najdem v P3U1 .xml subore (bez autowire)
    public DataSourceIfc msFactory() {
        return new DataSource();
    }
    
    //Source potrebujem dostat ako argument factoring metody. Named mi zabezpeci,
    //source (argument) factory metody dostane ako skutocny argument objekt,
    //ktory je vytvoreny factory metodou (riadok 16):
    //public DataSourceIfc msFactory() {
    @Bean(name="myprocessor")
    public DataProcessor mpFactory(@Named("mysource") DataSourceIfc source) {
        DataProcessor dp = new DataProcessor();
        dp.setSource(source);
        return dp;
    }
    
    //ries
    @Bean(name = "processor")
    public DataProcessor mpFactory() {
        return new DataProcessor(msFactory());
    }
}
