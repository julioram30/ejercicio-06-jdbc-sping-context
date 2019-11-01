package com.eiv;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DatosMySql implements Datos {

    @Autowired private Connection connection;
    public String show(String sql) {

        try (Statement stmt = connection.createStatement() ;
            ResultSet rsMySql = stmt.executeQuery(sql))
        {
            while (rsMySql.next()) {
                System.out.println(rsMySql.getString("loc_postal") + " " 
                        + rsMySql.getString("descripcion"));
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
       
        return null;
    }
}
