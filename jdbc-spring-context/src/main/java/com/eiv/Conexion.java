package com.eiv;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public interface Conexion {
    
    @Bean
    public DataSource getDataSource();
    
   
    
}
