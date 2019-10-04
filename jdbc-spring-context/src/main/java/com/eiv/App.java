package com.eiv;

public class App {
    public static void main(String[] args) {
        
        // MS SQL
        
        String sql = "SELECT TOP 10 * FROM LOCALIDAD";
        DatosMsSql datosMsSql = new DatosMsSql();
        datosMsSql.show(sql);

        
        // MySQL
        
        
        sql = "SELECT * FROM LOCALIDAD";
        DatosMySql datosMySql = new DatosMySql();
        datosMySql.show(sql);
    }
}
