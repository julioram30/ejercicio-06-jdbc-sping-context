package com.eiv;

import java.sql.Connection;
import java.sql.SQLException;

import javax.sql.DataSource;

import org.springframework.context.annotation.Configuration;

@Configuration
public interface Conexion {

    public Connection conectar(String url,String user, String password,String port) 
            throws SQLException;
    
    public DataSource getDataSource();
    
    public void getStatus();
   
    
}
