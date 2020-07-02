/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inicio_sesion.modelo;

import Conexiones.ConexionSQL;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import org.jdesktop.beansbinding.Validator.Result;

/**
 *
 * @author LENOVO
 */
public class SqlUsuarios extends ConexionSQL {

    /* public boolean Registrar (usuarios usr){
        
        
        PreparedStatement ps = null;
         ConexionSQL cc = new ConexionSQL();
        Connection cn = cc.getConnection();
        Result rs = null;
        
        
        String sql = "INSERT INTO vendedor (Vendedor_id,nombre_empleado,apellido_empleado,num_identidad_empleado, direccion,usuario,pass,id_tipo) VALUES(?,?,?,?,?,?,?,?)";
        
        try{
        ps = cn.prepareStatement(sql);
        ps.setInt(1, usr.getId());
        ps.setString(2, usr.getNombre_empleado());
        ps.setString(3, usr.getApellido_empleado());
        ps.setString(4, usr.getNum_identidad_empleado());
        ps.setString(5, usr.getDireccion());
        ps.setString(6, usr.getUsuario());
        ps.setString(7, usr.getPassword());
        ps.setInt(8, usr.getId_tipo());
        ps.execute();
        return true;
    
    
        }catch(Exception e){
            return false;
        }
    }*/
    public boolean login(usuarios usr) {

        PreparedStatement ps = null;
        ResultSet rs = null;
        ConexionSQL cc = new ConexionSQL();
        Connection cn = cc.getConnection();

        String sql = "SELECT u.Vendedor_id,u.usuario,u.pass, u.nombre_empleado,u.apellido_empleado, u.id_tipo, t.nombre FROM vendedor AS u INNER JOIN tipo_usuario AS t ON u.id_tipo=t.id WHERE usuario = ?";

        try {

            ps = cn.prepareStatement(sql);
            ps.setString(1, usr.getUsuario());
            rs = ps.executeQuery();

            if (rs.next()) {

                if (usr.getPassword().equals(rs.getString(3))) {

                    usr.setId(rs.getInt(1));
                    usr.setNombre_empleado(rs.getString(4));
                    usr.setApellido_empleado(rs.getString(5));
                    usr.setId_tipo(rs.getInt(6));
                    usr.setNombre_tipo(rs.getString(7));
                    return true;
                } else {

                    return false;

                }

            }

            return false;

        } catch (Exception e) {
            return false;
        }

    }

}
