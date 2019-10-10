package com.eiv;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DatosMsSql implements Datos {
    
    public String show(String sql) {
        
        ConexionMssql msConn = new ConexionMssql();
        Connection conn = null;
        try {
            
           
            PreparedStatement stmt = conn.prepareStatement(sql);
                     
            ResultSet rsMSsql = stmt.executeQuery();
           
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
