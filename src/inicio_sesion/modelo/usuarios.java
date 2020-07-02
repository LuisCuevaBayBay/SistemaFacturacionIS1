/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inicio_sesion.modelo;

public class usuarios {
    
   private int Vendedor_id;
   private String nombre_empleado;
   private String apellido_empleado;
   private String num_identidad_empleado;
   private String direccion;
   private String usuario;
   private String pass;
   private int id_tipo;
   private String nombre_tipo;

    public int getId() {
        return Vendedor_id;
    }

    public void setId(int id) {
        this.Vendedor_id = id;
    }

    public String getNombre_empleado() {
        return nombre_empleado;
    }

    public void setNombre_empleado(String nombre_empleado) {
        this.nombre_empleado = nombre_empleado;
    }

    public String getApellido_empleado() {
        return apellido_empleado;
    }

    public void setApellido_empleado(String apellido_empleado) {
        this.apellido_empleado = apellido_empleado;
    }

    public String getNum_identidad_empleado() {
        return num_identidad_empleado;
    }

    public void setNum_identidad_empleado(String num_identidad_empleado) {
        this.num_identidad_empleado = num_identidad_empleado;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getPassword() {
        return pass;
    }

    public void setPassword(String password) {
        this.pass = password;
    }

    public int getId_tipo() {
        return id_tipo;
    }

    public void setId_tipo(int id_tipo) {
        this.id_tipo = id_tipo;
    }

    public String getNombre_tipo() {
        return nombre_tipo;
    }

    public void setNombre_tipo(String nombre_tipo) {
        this.nombre_tipo = nombre_tipo;
    }
    
    
   
   
    
}
