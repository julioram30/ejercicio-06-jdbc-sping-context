package com.eiv;

import java.sql.Connection;
import java.sql.SQLException;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ConexionMssql implements Conexion {

    @Bean
    public Connection getDataSource(DataSource dataSource) {
        try {
            return dataSource.getConnection();
        } catch (SQLException e) {
            throw new RuntimeException(e.getMessage(), e);
        }

    }

}
