/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Empleados;

import Conexiones.ConexionSQL;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 *
 * @author luisc
 */
public class id_incrementable {
    public void id(){
        int id = 1;
        PreparedStatement ps = null;
        ResultSet rs = null;
        ConexionSQL cn = new ConexionSQL();
        
        try{
            ps = cn.getConnection().prepareStatement("select MAX(Vendedor_id) From vendedor");
            rs = ps.executeQuery();
            while(rs.next());
            id = rs.getInt(1) + 1;
        }catch(Exception e){
        }
        
    }
}
