/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inicio_sesion;

import Conexiones.ConexionSQL;
import menu.menuPrincipal;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import menu.menuPrincipal;

/**
 *
 * @author Luis Cueva
 */
public class SQLMetodos {
    ConexionSQL cc = new ConexionSQL();
    Connection conexion;
    PreparedStatement sentencia;
    ResultSet rs;
    String sql;
    menuPrincipal mp = new menuPrincipal();
    
    
    
    public String buscarUsuario(String usuario, String contraseña){
        String tipo_usuario;
        String busqueda_usuario = null;
    
     try{
         conexion = cc.getConnection();
         //sql="SELECT usuario,pass FROM vendedor WHERE usuario = '"+usuario+"' && pass=md5('"+contraseña+"')";
         sql="SELECT * FROM vendedor ";
         sentencia = conexion.prepareStatement(sql);
         rs = sentencia.executeQuery();
         
         if(rs.next()){
             usuario = rs.getString("usuario");
             contraseña = rs.getString("pass");
             busqueda_usuario = "Usuario encontrado";
             
        
             
             if(usuario != null && contraseña != null){
                 tipo_usuario = rs.getString("tipo_usuario");
                 
                 switch(tipo_usuario){
                     case "Administrador":
                         mp.setVisible(true);
                         break;
                     case "Empleado":
                         //me.setVisible(true);
                         
                         break;
                         
                 }
             }
             //mp.setVisible(true);
         }else{
             JOptionPane.showMessageDialog(null,"Error en el usuario o contraseña");
             busqueda_usuario = "Usuario no encontrado";
         }
         
        
         
     }catch(Exception e){
         System.out.println("Error"+e);
     }
     
     return busqueda_usuario;
    }
    
    public String BuscarNombre (String usuario){
      String busqueda_nombre = null; 
      
      
     try{
         
         conexion = cc.getConnection();
         //sql="SELECT usuario,pass FROM vendedor WHERE usuario = '"+usuario+"' && pass=md5('"+contraseña+"')";
         String sentencia_buscar =("SELECT nombre_empleado,apellido_empleado FROM vendedor WHERE usuario='"+usuario+"'");
         sentencia = conexion.prepareStatement(sentencia_buscar);
         rs = sentencia.executeQuery();
         
         if(rs.next()){
             
             String nombre = rs.getString("nombre_empleado");
             String apellido = rs.getString("apellido_empleado");
             busqueda_nombre = (nombre+" "+apellido);
             
             
         }
         
         
     }catch(Exception e){
         System.out.print(e);
     
     }
     
     return busqueda_nombre;
      
     
        
    }
    
        
    
    
    
    public  String buscarUsuarioR (String usuario, String Contra){
         
          
         
        
        String busqueda_usuario = null;
        
        try{
            conexion = cc.getConnection();
            String sentencia_buscar_usuario = ("SELECT nombre_empleado,usuario,pass FROM vendedor WHERE usuario = '"+usuario+"' && pass=md5('"+Contra+"')");
            sentencia = conexion.prepareStatement(sentencia_buscar_usuario);
            rs = sentencia.executeQuery();
            
            if(rs.next()){
                
                busqueda_usuario = "Usuario encontrado";
            }else{
            
                busqueda_usuario = "Usuario no encontrado";
            }
            conexion.close();
        
        }catch(Exception e){
        
        
        }
        
        return busqueda_usuario;
        
        
    
        
    }
    
}
