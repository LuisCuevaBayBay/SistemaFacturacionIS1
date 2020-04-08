/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Conexiones;

/**
 *
 * @author luisc
 */

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class ConexionSQL {
   private static Connection conn;
   private static final String driver = "com.mysql.jdbc.Driver";
   private static final String user = "root";
   private static final String password= "loquendo1";
   private static final String url ="jdbc:mysql://localhost:3306/conexion_sistema1";
   
   
   public ConexionSQL(){
    conn = null;
    try{
         Class.forName("com.mysql.jdbc.Driver");
         conn = DriverManager.getConnection(url, user, password);
         if(conn != null){
             System.out.println("Conexion Exitosa xdd");
         }
     } catch (ClassNotFoundException | SQLException e){
         System.out.println("error al conectar: " + e);
     }
   }
   
   public Connection getConnection(){
       return conn;
   }
   
   public void Desconectar(){
       conn = null;
       if(conn == null){
           System.out.println("Conexion Terminada");
       }
   }

    public PreparedStatement prepareStatement(String sql) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
