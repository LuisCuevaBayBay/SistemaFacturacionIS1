/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inicio_sesion;

import Conexiones.ConexionSQL;
import Empleados.RegistrarEmpleados;
import Empleados.decode;

import Venta.ModeloVenta;
import inicio_sesion.modelo.Hash;
import inicio_sesion.modelo.SqlUsuarios;
import inicio_sesion.modelo.usuarios;
import java.awt.Color;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import menu.menuPrincipal;
import static menu.menuPrincipal.nombre;

import org.apache.log4j.*;

/**
 *
 * @author luisc
 */
public class Pantalla_Inicio_Sesion extends javax.swing.JFrame {

    usuarios mod;

    final static org.apache.log4j.Logger logger = org.apache.log4j.Logger.getLogger(RegistrarEmpleados.class);

    public Pantalla_Inicio_Sesion() {
        initComponents();
        this.setLocationRelativeTo(null);
        PropertyConfigurator.configure("log4j.properties");
        logger.debug("Inicio el sistema");
        //this.setIconImage(new ImageIcon(getClass().getResource("/imagenes/logo.png")).getImage());
    }

    int cont = 0;

    RegistrarEmpleados metodo = new RegistrarEmpleados();
    SQLMetodos metodos = new SQLMetodos();
    menuPrincipal ventana = new menuPrincipal();

    ModeloVenta venta = new ModeloVenta();

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        usuario = new javax.swing.JLabel();
        txt_usuario = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txt_pass = new javax.swing.JPasswordField();
        btn_inicio_sesion = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        bienvenida = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        rSLabelHora1 = new rojeru_san.RSLabelHora();
        rSLabelFecha1 = new rojeru_san.RSLabelFecha();
        jLabel4 = new javax.swing.JLabel();
        aqui = new javax.swing.JLabel();
        fondo = new javax.swing.JLabel();

        jLabel1.setText("jLabel1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        usuario.setBackground(new java.awt.Color(255, 255, 255));
        usuario.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        usuario.setText("Nombre de Usuario");
        getContentPane().add(usuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 290, 150, 40));

        txt_usuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_usuarioActionPerformed(evt);
            }
        });
        getContentPane().add(txt_usuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 300, 174, 30));

        jLabel2.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel2.setText("Contraseña");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 350, -1, 20));
        getContentPane().add(txt_pass, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 340, 174, 30));

        btn_inicio_sesion.setBackground(new java.awt.Color(255, 255, 255));
        btn_inicio_sesion.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        btn_inicio_sesion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/inicio sesion (1).jpg"))); // NOI18N
        btn_inicio_sesion.setText("Iniciar Sesión");
        btn_inicio_sesion.setBorder(null);
        btn_inicio_sesion.setBorderPainted(false);
        btn_inicio_sesion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_inicio_sesionMouseClicked(evt);
            }
        });
        btn_inicio_sesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_inicio_sesionActionPerformed(evt);
            }
        });
        getContentPane().add(btn_inicio_sesion, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 390, 200, 60));

        jButton3.setBackground(new java.awt.Color(255, 255, 255));
        jButton3.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/salir.jpg"))); // NOI18N
        jButton3.setText("Salir");
        jButton3.setBorder(null);
        jButton3.setBorderPainted(false);
        jButton3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton3MouseClicked(evt);
            }
        });
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 460, 140, 60));

        bienvenida.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        bienvenida.setText("Bienvenido al Sistema ");
        bienvenida.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        getContentPane().add(bienvenida, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 240, -1, 82));

        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/logo.png"))); // NOI18N
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 60, 230, 200));

        rSLabelHora1.setForeground(new java.awt.Color(0, 0, 0));
        getContentPane().add(rSLabelHora1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 40, -1, -1));

        rSLabelFecha1.setForeground(new java.awt.Color(0, 0, 0));
        getContentPane().add(rSLabelFecha1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 0, -1, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setText("Olvidaste tú usuario o contraseña?, has clic");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 540, -1, -1));

        aqui.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        aqui.setForeground(new java.awt.Color(0, 0, 204));
        aqui.setText("Aqui");
        aqui.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                aquiMouseMoved(evt);
            }
        });
        aqui.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                aquiMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                aquiMouseExited(evt);
            }
        });
        getContentPane().add(aqui, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 540, -1, -1));

        fondo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/verde3.jpg"))); // NOI18N
        fondo.setMaximumSize(new java.awt.Dimension(32, 32));
        fondo.setMinimumSize(new java.awt.Dimension(32, 32));
        getContentPane().add(fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 500, 570));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_inicio_sesionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_inicio_sesionMouseClicked

    }//GEN-LAST:event_btn_inicio_sesionMouseClicked

    private void jButton3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton3MouseClicked
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_jButton3MouseClicked

    public Icon icono(String path, int width, int height) {
        Icon img = new ImageIcon(new ImageIcon(getClass().getResource(path)).getImage().
                getScaledInstance(width, height, java.awt.Image.SCALE_SMOOTH));
        return img;
    }

    /*public void nombreUsuario(){
        
         //String busqueda_usuario = metodos.buscarUsuario(txt_usuario.getText(), txt_pass.getText());
        
        //if(busqueda_usuario.equals("Usuario encontrado")){
            //String busqueda_nombre = metodos.BuscarNombre(txt_usuario.getText());
           
            
            this.dispose();
            
        
        }else{
            JOptionPane.showMessageDialog(this, "Usuario o contraseña incorrecta");
        
        }
    
    }*/
    void validacionVenta(String usuario) {
        String cap1 = "";
        ConexionSQL cc = new ConexionSQL();
        Connection cn = cc.getConnection();
        String sql;

        sql = "SELECT * FROM `compra_estado` WHERE `nom_usuario` = '" + usuario + "'";

        try {
            Statement st = cn.createStatement();
            java.sql.ResultSet rs = st.executeQuery(sql);

            while (rs.next()) {
                cap1 = rs.getString("mirar");

            }
            if (cap1.equals("inactivo")) {
                menuPrincipal.registrarVenta.setVisible(false);
                menuPrincipal.jLabel3.setVisible(false);
            } else {
                menuPrincipal.registrarVenta.setVisible(true);
                menuPrincipal.jLabel3.setVisible(true);
            }

        } catch (Exception e) {

        }

    }

    void validacionProductos(String usuario) {

        String cap1 = "";
        ConexionSQL cc = new ConexionSQL();
        Connection cn = cc.getConnection();
        String sql;

        sql = "SELECT * FROM `producto_estado` WHERE `nom_usuario` = '" + usuario + "'";

        try {
            Statement st = cn.createStatement();
            java.sql.ResultSet rs = st.executeQuery(sql);

            while (rs.next()) {
                cap1 = rs.getString("mirar");

            }
            if (cap1.equals("inactivo")) {
                menuPrincipal.jButton7.setVisible(false);
                menuPrincipal.jLabel7.setVisible(false);
            } else {
                menuPrincipal.jButton7.setVisible(true);
                menuPrincipal.jLabel7.setVisible(true);
            }

        } catch (Exception e) {

        }
    }

    void validacionCompra(String usuario) {
        String cap1 = "";
        ConexionSQL cc = new ConexionSQL();
        Connection cn = cc.getConnection();
        String sql;

        sql = "SELECT * FROM `compra_estado` WHERE `nom_usuario` = '" + usuario + "'";

        try {
            Statement st = cn.createStatement();
            java.sql.ResultSet rs = st.executeQuery(sql);

            while (rs.next()) {
                cap1 = rs.getString("mirar");

            }
            if (cap1.equals("inactivo")) {
                menuPrincipal.jButton1.setVisible(false);
                menuPrincipal.jLabel1.setVisible(false);
            } else {
                menuPrincipal.jButton1.setVisible(true);
                menuPrincipal.jLabel1.setVisible(true);
            }

        } catch (Exception e) {

        }
    }

    void validacionProveedor(String usuario) {
        String cap1 = "";
        ConexionSQL cc = new ConexionSQL();
        Connection cn = cc.getConnection();
        String sql;

        sql = "SELECT * FROM `proveedor_estado` WHERE `nom_usuario` = '" + usuario + "'";

        try {
            Statement st = cn.createStatement();
            java.sql.ResultSet rs = st.executeQuery(sql);

            while (rs.next()) {
                cap1 = rs.getString("mirar");

            }
            if (cap1.equals("inactivo")) {
                menuPrincipal.jButton2.setVisible(false);
                menuPrincipal.jLabel8.setVisible(false);
            } else {
                menuPrincipal.jButton2.setVisible(true);
                menuPrincipal.jLabel8.setVisible(true);
            }

        } catch (Exception e) {

        }

    }

    void validacionCliente(String usuario) {

        String cap1 = "";
        ConexionSQL cc = new ConexionSQL();
        Connection cn = cc.getConnection();
        String sql;

        sql = "SELECT * FROM `cliente_estado` WHERE `nom_usuario` = '" + usuario + "'";

        try {
            Statement st = cn.createStatement();
            java.sql.ResultSet rs = st.executeQuery(sql);

            while (rs.next()) {
                cap1 = rs.getString("mirar");

            }
            if (cap1.equals("inactivo")) {
                menuPrincipal.registroEmpleado.setVisible(false);
                menuPrincipal.jLabel5.setVisible(false);
            } else {
                menuPrincipal.registroEmpleado.setVisible(true);
                menuPrincipal.jLabel5.setVisible(true);
            }

        } catch (Exception e) {

        }

    }

    void validacion(String usuario) {
        String cap1 = "";
        ConexionSQL cc = new ConexionSQL();
        Connection cn = cc.getConnection();
        String sql;

        sql = "SELECT * FROM `vendedor_estado` WHERE `nom_usuario` = '" + usuario + "'";

        try {
            Statement st = cn.createStatement();
            java.sql.ResultSet rs = st.executeQuery(sql);

            while (rs.next()) {
                cap1 = rs.getString("mirar");

            }
            if (cap1.equals("inactivo")) {
                menuPrincipal.registroEmpleados1.setVisible(false);
                menuPrincipal.jLabel4.setVisible(false);
            } else {
                menuPrincipal.registroEmpleados1.setVisible(true);
                menuPrincipal.jLabel4.setVisible(true);
            }

        } catch (Exception e) {

        }

    }
    decode deco = new decode();
    private void btn_inicio_sesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_inicio_sesionActionPerformed
        // TODO add your handling code here:

        SqlUsuarios modSql = new SqlUsuarios();
        usuarios mod = new usuarios();
         ConexionSQL cc = new ConexionSQL();

        Connection cn = cc.getConnection();

        String pass = new String(txt_pass.getPassword());

        String sql;
        String cap1 = "";

        sql = "SELECT * FROM `vendedor` WHERE `usuario` = '" + txt_usuario.getText() + "'";
        if (!txt_usuario.getText().equals("") && !pass.equals("")) {
        try {
            Statement st = cn.createStatement();
            java.sql.ResultSet rs = st.executeQuery(sql);

            while (rs.next()) {
                cap1 = rs.getString("bloqueo");

            }
            if (cap1.equals("activo")) {

                

                    String nuevoPass = deco.ecnode("Proyecto", pass);

                    mod.setUsuario(txt_usuario.getText());
                    mod.setPassword(nuevoPass);

                    if (modSql.login(mod)) {
                        logger.debug("Se logueo exitosamente: " + mod.getNombre_empleado() + " " + mod.getApellido_empleado());
                        this.dispose();

                        menuPrincipal frmHome = new menuPrincipal(mod);

                        Object[] options = {"HOLA"};
                        int i = JOptionPane.showOptionDialog(null, "Bienvenido (a) \n " + mod.getNombre_empleado() + " " + mod.getApellido_empleado(), "DAENERYS", JOptionPane.OK_OPTION, JOptionPane.QUESTION_MESSAGE, icono("/Imagenes/logo.png", 40, 40), options, options[0]);
                        frmHome.setVisible(true);

                        validacion(txt_usuario.getText());
                        validacionCliente(txt_usuario.getText());
                        validacionProveedor(txt_usuario.getText());
                        validacionCompra(txt_usuario.getText());
                        validacionProductos(txt_usuario.getText());
                        validacionVenta(txt_usuario.getText());

                    } else {
                        JOptionPane.showMessageDialog(null, "Usuario o contraseña incorrecta");
                        logger.debug("Ingreso mal el usuario o la contraseña");
                        cont++;
                    }

                
                if (cont == 3) {

                    JOptionPane.showMessageDialog(null, "Trate de comunicarse con un administrador para obtener su codigo de recuperacion, numero de intenetos restantes = 1");

                }
                if (cont == 4) {
                    JOptionPane.showMessageDialog(null, "Intentelo mas tarde");
                    PreparedStatement pst = cn.prepareStatement("UPDATE vendedor SET bloqueo='inactivo' WHERE usuario='" + txt_usuario.getText() + "'");
                    pst.executeUpdate();
                    System.exit(0);

                }

            } else {
                JOptionPane.showMessageDialog(null, "Ups! El usuario esta bloqueado (Comuniquese con un administrador del sistema)");
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "404 not found");
        }

        } else {
                    JOptionPane.showMessageDialog(null, "Debe ingrear sus datos");
                    logger.debug("Ingreso campos vacios");
                }

        /*
        
        
        
        String busqueda_usuario = metodos.buscarUsuario(txt_usuario.getText(), txt_pass.getText());
        
        
        //String busqueda_usuario = metodos.buscarUsuarioR(txt_usuario.getText(), txt_pass.getText());
        
        
        if(busqueda_usuario.equals("Usuario encontrado")){
            String busqueda_nombre = metodos.BuscarNombre(txt_usuario.getText());
            Object[] options = {"HOLA"};
         int i = JOptionPane.showOptionDialog(null, "Bienvenido (a) \n "+ busqueda_nombre,"DAENERYS",JOptionPane.OK_OPTION, JOptionPane.QUESTION_MESSAGE, icono("/Imagenes/logo.png", 40, 40),  options, options[0]);
           
            
            this.dispose();
            
        
        }else{
            JOptionPane.showMessageDialog(this, "Usuario o contraseña incorrecta");
        
        }
        
        
        //validar();*/

    }//GEN-LAST:event_btn_inicio_sesionActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        // TODO add your handling code here:
        Object[] options = {"SI", "NO"};
        int i = JOptionPane.showOptionDialog(null, "Esta seguro que desea salir del sistema?", "Seleccione una opción", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, icono("/Imagenes/logo.png", 40, 40), options, options[0]);

        if (i == 0) {
            logger.debug("Salio del sistema: " + nombre.getText());
            System.exit(0);
        }

    }//GEN-LAST:event_jButton3ActionPerformed

    private void aquiMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_aquiMouseMoved
        // TODO add your handling code here:

        this.aqui.setForeground(new Color(224, 255, 255));
    }//GEN-LAST:event_aquiMouseMoved

    private void aquiMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_aquiMouseExited
        // TODO add your handling code here:
        this.aqui.setForeground(new Color(51, 153, 255));
    }//GEN-LAST:event_aquiMouseExited

    private void aquiMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_aquiMouseClicked
        // TODO add your handling code here:
        new Recupera(this, true).setVisible(true);
    }//GEN-LAST:event_aquiMouseClicked

    private void txt_usuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_usuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_usuarioActionPerformed

    /*public void validar(){
       RegistrarEmpleados registro = new RegistrarEmpleados();
        
        ConexionSQL cc = new ConexionSQL();
        Connection cn = cc.getConnection();
        int resultado = 0;
        
        String usuario = txt_usuario.getText();
        String pass = txt_pass.getText();
        String SQL = "SELECT * from vendedor where usuario ='"+usuario+"' and pass=md5('"+pass+"')";
        String SQL2 = "SELECT tipo_usuario from vendedor ";
        
        
        try{
        Statement st = cn.createStatement();
        ResultSet rs = st.executeQuery(SQL);
        ResultSet rst = st.executeQuery(SQL2);

        
        if(rs.next()){
            resultado = 1;
        
        if(resultado == 1){
            menuPrincipal menu = new menuPrincipal();
            menu.setVisible(true);
            JOptionPane.showMessageDialog(null, "Bienvenido al Sistema!");
            this.dispose();
        }
        }else{
            JOptionPane.showMessageDialog(null,"Error de Acceso, revise el usuario y contraseña");
        }
        }catch(Exception e){
        
        }
         
    }*/
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Pantalla_Inicio_Sesion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Pantalla_Inicio_Sesion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Pantalla_Inicio_Sesion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Pantalla_Inicio_Sesion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Pantalla_Inicio_Sesion().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel aqui;
    private javax.swing.JLabel bienvenida;
    private javax.swing.JButton btn_inicio_sesion;
    private javax.swing.JLabel fondo;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private rojeru_san.RSLabelFecha rSLabelFecha1;
    private rojeru_san.RSLabelHora rSLabelHora1;
    public javax.swing.JPasswordField txt_pass;
    public javax.swing.JTextField txt_usuario;
    private javax.swing.JLabel usuario;
    // End of variables declaration//GEN-END:variables
}
