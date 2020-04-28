/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Compra;

import Conexiones.ConexionSQL;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 *
 * @author luisc
 */
public class sql {

    public int id_incrementable() {

        int id = 1;
        PreparedStatement pst = null;
        ResultSet rs = null;
        ConexionSQL cn = new ConexionSQL();
        try {
            pst = cn.getConnection().prepareStatement("SELECT MAX(Idcompra) from detallecompra");
            rs = pst.executeQuery();

            while (rs.next()) {
                id = rs.getInt(1) + 1;

            }

        } catch (Exception e) {
            System.out.println("Error" + e.getMessage());
        }
    return id;
    }

}
