package com.eiv;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.mysql.cj.jdbc.Driver;
import com.mysql.cj.jdbc.MysqlDataSource;

public class App {
    public static final ApplicationContext CTX;
    
    static {
        CTX = new ClassPathXmlApplicationContext("app-config.xml");
    }
    
    public static void main(String[] args) {
        
        DatosMsSql datosMsSql = CTX.getBean(DatosMsSql.class);
        DatosMySql datosMySql = CTX.getBean(DatosMySql.class);
        
        // MS SQL
        
        String sql = "SELECT * FROM LOCALIDAD";
        datosMsSql.show(sql);

        
        // MySQL
        
        String mySql = "SELECT * FROM localidad";
        //DatosMySql datosMySql1 = new DatosMySql();
        datosMySql.show(mySql);
    }
}
