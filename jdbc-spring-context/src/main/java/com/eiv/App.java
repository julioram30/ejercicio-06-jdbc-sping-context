package com.eiv;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static final ApplicationContext CTX;
    
    static {
        CTX = new ClassPathXmlApplicationContext("app-config.xml");
    }
    
    public static void main(String[] args) {
        
        DatosMsSql datosMsSql = CTX.getBean(DatosMsSql.class);
        DatosMySql datosMySql = CTX.getBean(DatosMySql.class);
        
        // MS SQL
        
        String sql = "SELECT TOP 10 * FROM LOCALIDAD";
        datosMsSql.show(sql);

        
        // MySQL
        
        
        sql = "SELECT * FROM LOCALIDAD";
       // DatosMySql datosMySql = new DatosMySql();
        datosMySql.show(sql);
    }
}
