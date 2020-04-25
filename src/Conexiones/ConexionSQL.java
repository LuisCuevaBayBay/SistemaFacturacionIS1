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
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.DefaultComboBoxModel;

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
    
    public ResultSet consulta(String sql){
        ResultSet res = null;
        try{
            PreparedStatement pstm = conn.prepareStatement(sql);
            res = pstm.executeQuery();
        }catch(SQLException e){
            
        }
        return res;
    }
    
    
    public DefaultComboBoxModel obt_proveedor(){
        DefaultComboBoxModel Lista_Proveedor = new DefaultComboBoxModel();
        Lista_Proveedor.addElement("Seleccione un Proveedor");
       ResultSet res = this.consulta("SELECT * FROM proveedor ORDER BY Nombre_Empresa");
       
       try{
           while(res.next()){
           Lista_Proveedor.addElement(res.getString("Nombre_Empresa"));
           }
       
       }catch(SQLException e){
       }
       return Lista_Proveedor;
    }
    
    
    public DefaultComboBoxModel obt_producto(){
        DefaultComboBoxModel Lista_Producto = new DefaultComboBoxModel();
        Lista_Producto.addElement("Seleccione un productos");
       ResultSet res = this.consulta("SELECT * FROM productos ORDER BY Nombre");
       
       try{
           while(res.next()){
           Lista_Producto.addElement(res.getString("Nombre"));
           }
       
       }catch(SQLException e){
       }
       return Lista_Producto;
    }
}
