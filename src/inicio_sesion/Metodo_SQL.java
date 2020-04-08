/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inicio_sesion;

import Conexiones.ConexionSQL;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 *
 * @author luisc
 */
public class Metodo_SQL {
    public static ConexionSQL conexion = new ConexionSQL();
    
    
    public static PreparedStatement sentencia_preparada;
    public static ResultSet resultado;
    public static String sql;
    public static int resultado_numero = 0;
    
    
    
}
