package com.eiv;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DatosMySql implements Datos {

    @Override
    public String show(String sql) {

        ConexionMySql myConn = new ConexionMySql();
        Connection con = null;
        

        try {

            con = myConn.conectar(
                    "jdbc:mysql://localhost:3306/testjava" 
                  + "?useLegacyDatetimeCode=false&serverTimezone=UTC", "root",
                    "S1rm32nt4756", "3306");
            PreparedStatement stmt = con.prepareStatement(sql);
            ResultSet rsMySql = stmt.executeQuery();

            while (rsMySql.next()) {
                System.out.println(rsMySql.getString("ID") + " " 
                        + rsMySql.getString("descripcion"));
            }

        } catch (SQLException e1) {

            e1.printStackTrace();
        }
        return null;
    }
}
