/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Contacto;

import Conexiones.ConexionSQL;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author LENOVO
 */
public class UsuarioSQL {
    
    
    
    public int existeUsuario (String usuario){
    
        PreparedStatement ps = null;
        ResultSet rs = null;
        ConexionSQL cc=new ConexionSQL();
        Connection con=cc.getConnection();
    
        String sql = "SELECT count(id) FROM vendedor_contacto WHERE ID_Contacto_Proveedor = ?";
    
        try {
    
        ps= con.prepareStatement (sql);
        ps.setString(1, usuario);
        rs = ps.executeQuery();
        
        if(rs.next())
        {
            return rs.getInt(1);
            
        }
        
        return 1;
        
        }catch (SQLException ex){
            Logger.getLogger(UsuarioSQL.class.getName()).log(Level.SEVERE,null, ex);
            return 1;
        
        }
        
        
    }
    
     public int existeCorreo(String correo) {

        PreparedStatement ps = null;
        ResultSet rs = null;
        ConexionSQL cc = new ConexionSQL();
        Connection con = cc.getConnection();

        String sql = "SELECT count(id) FROM vendedor_contacto WHERE correo = ?";

        try {

            ps = con.prepareStatement(sql);
            ps.setString(1, correo);
            rs = ps.executeQuery();

            if (rs.next()) {
                return rs.getInt(1);

            }

            return 1;

        } catch (SQLException ex) {
            Logger.getLogger(UsuarioSQL.class.getName()).log(Level.SEVERE, null, ex);
            return 1;

        }
    }
    
    
    

     
}

    
    
    
    
    
    
    
    
    
    
    

