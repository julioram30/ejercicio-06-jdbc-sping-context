package com.eiv;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;


import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;

public class ConexionMssql implements Conexion {

    Connection con;
    final HikariConfig configMssql = new HikariConfig();

    @Override
    public Connection conectar(String url, String user, String password, String port) 
            throws SQLException {

        configMssql.setDriverClassName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
        configMssql.setJdbcUrl(url);
        configMssql.setUsername(user);
        configMssql.setPassword(password);
        HikariDataSource ds = getDataSource();
        return ds.getConnection();

    }

    @Override
    public HikariDataSource getDataSource() {
        HikariDataSource ds = new HikariDataSource(configMssql);
        return ds;
    }

    @Override
    public void getStatus() {
        // TODO Auto-generated method stub

    }

    public Statement getStatement() throws SQLException {
        Statement stmt = con.createStatement();

        return stmt;
    }

}
