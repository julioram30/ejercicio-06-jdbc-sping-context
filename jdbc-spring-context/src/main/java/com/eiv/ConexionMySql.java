package com.eiv;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.sql.DataSource;

import org.springframework.context.annotation.Configuration;

import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;

public class ConexionMySql implements Conexion {
    

    public Connection conectar(String url, String user, String password, String port) 
            throws SQLException {

       
        return ds.getConnection();

    }

    @Override
    public DataSource getDataSource() {
        

        return ds;
    }

    @Override
    public void getStatus() {
        // TODO Auto-generated method stub

    }

    public PreparedStatement getStatement() throws SQLException {
        PreparedStatement stmt = null;
        return stmt;
    }

}
