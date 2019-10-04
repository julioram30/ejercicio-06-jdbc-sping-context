package com.eiv;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DatosMsSql implements Datos {
    
    @Override
    public String show(String sql) {
        
        ConexionMssql msConn = new ConexionMssql();
        Connection conn = null;
        try {
            conn = msConn.conectar("jdbc:sqlserver://sqlserver\\sql2008:1433;"
                    + "databaseName=DESARROLLO_MUTUAL",
                    "sa", "rv760", "1433");
           
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
