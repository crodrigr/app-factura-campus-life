package com.campusland.utils.conexionesdb.conexiondbmysql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import com.campusland.utils.Configuracion;

public class ConexionBDMysql  {

    private static String url=Configuracion.obtenerValor("db.url");
    private static String username=Configuracion.obtenerValor("db.username");
    private static String password=Configuracion.obtenerValor("db.password");
    private static Connection connection;


    public static Connection getInstance()throws SQLException{
        if(connection==null){
           connection=DriverManager.getConnection(url, username, password);
        }
        return connection;
    }





    
}
