package com.eiv;

import java.sql.Connection;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public interface Conexion {
    
    @Bean
    public Connection getDataSource(DataSource dataSource);
    
   
    
}
