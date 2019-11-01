package com.eiv;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DatosMsSql implements Datos {
    
    @Autowired private Connection connection;
    
    public String show(String sql) {
        
        try (Statement stmt = connection.createStatement() ;
            ResultSet rsMSsql = stmt.executeQuery(sql))
        {
            while (rsMSsql.next()) {
                System.out.println(rsMSsql.getString("loc_postal") + " " 
                        + rsMSsql.getString("descripcion"));
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
       
        return null;
    }

}
