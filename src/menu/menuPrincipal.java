/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package menu;

import Clientes.RegistroClientes;
import Compra.ModeloCompra1;
import Empleados.RegistrarEmpleados;
/*import FacturaCompra.FacturaCompra;
/*import Factura_Venta.Factura_Venta;*/
import Proveedor.frm_proveedores;
import Venta.ModeloVenta;
import inicio_sesion.Pantalla_Inicio_Sesion;
import inicio_sesion.modelo.usuarios;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import producto.Producto;
import org.apache.log4j.*;
/**
 *
 * @author luisc
 */
public class menuPrincipal extends javax.swing.JFrame {
    
    usuarios mod;

    /**
     * Creates new form menuPrincipal
     */
    final static org.apache.log4j.Logger logger = org.apache.log4j.Logger.getLogger(RegistrarEmpleados.class);
    public menuPrincipal() {
        initComponents();
        PropertyConfigurator.configure("log4j.properties");
        this.setLocationRelativeTo(null);
    }
    
    public menuPrincipal(usuarios mod){
        
     initComponents();
     this.setLocationRelativeTo(null);
     this.mod = mod;
     
     rol.setText(mod.getNombre_tipo());
     nombre.setText(mod.getNombre_empleado()+" "+mod.getApellido_empleado() );
     idv.setText(String.valueOf(mod.getId()));
     
     if(mod.getId_tipo() == 1){
     
     }else if(mod.getId_tipo() == 2){
         jLabel5.setVisible(false);
         jLabel8.setVisible(false);
         jLabel4.setVisible(false);
         jLabel7.setVisible(false);
         registroEmpleados.setVisible(false);
         jButton7.setVisible(false);
         registroEmpleado.setVisible(false);
         jButton2.setVisible(false);
         
     
     }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        jLabel2 = new javax.swing.JLabel();
        registroEmpleado = new javax.swing.JButton();
        registroEmpleados = new javax.swing.JButton();
        registrarVenta = new javax.swing.JButton();
        salir = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        nombre = new javax.swing.JLabel();
        rol = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        rSLabelHora1 = new rojeru_san.RSLabelHora();
        jLabel11 = new javax.swing.JLabel();
        fondo = new javax.swing.JLabel();
        idv = new javax.swing.JLabel();
        rSLabelHora2 = new rojeru_san.RSLabelHora();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        jLabel2.setText("Menú Daenerys");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 0, 240, 78));

        registroEmpleado.setBackground(new java.awt.Color(0, 0, 204));
        registroEmpleado.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        registroEmpleado.setForeground(new java.awt.Color(255, 255, 255));
        registroEmpleado.setText("Registrar Cliente");
        registroEmpleado.setFocusable(false);
        registroEmpleado.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        registroEmpleado.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        registroEmpleado.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                registroEmpleadoMouseClicked(evt);
            }
        });
        registroEmpleado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registroEmpleadoActionPerformed(evt);
            }
        });
        getContentPane().add(registroEmpleado, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 200, 190, 30));

        registroEmpleados.setBackground(new java.awt.Color(0, 0, 204));
        registroEmpleados.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        registroEmpleados.setForeground(new java.awt.Color(255, 255, 255));
        registroEmpleados.setText("Registrar Empleado");
        registroEmpleados.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                registroEmpleadosMouseClicked(evt);
            }
        });
        registroEmpleados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registroEmpleadosActionPerformed(evt);
            }
        });
        getContentPane().add(registroEmpleados, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 200, 190, 30));

        registrarVenta.setBackground(new java.awt.Color(0, 0, 204));
        registrarVenta.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        registrarVenta.setForeground(new java.awt.Color(255, 255, 255));
        registrarVenta.setText("Registrar Venta");
        registrarVenta.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                registrarVentaMouseClicked(evt);
            }
        });
        registrarVenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registrarVentaActionPerformed(evt);
            }
        });
        getContentPane().add(registrarVenta, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 200, 190, 30));

        salir.setBackground(new java.awt.Color(0, 102, 204));
        salir.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        salir.setForeground(new java.awt.Color(255, 255, 255));
        salir.setText("Salir");
        salir.setBorder(null);
        salir.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salirActionPerformed(evt);
            }
        });
        getContentPane().add(salir, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 420, 140, 30));

        jButton2.setBackground(new java.awt.Color(0, 0, 204));
        jButton2.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Registrar Proveedor");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 370, 190, 30));

        jButton6.setBackground(new java.awt.Color(0, 102, 204));
        jButton6.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jButton6.setForeground(new java.awt.Color(255, 255, 255));
        jButton6.setText("Cerrar Sesión");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 420, -1, 30));

        jButton7.setBackground(new java.awt.Color(0, 0, 204));
        jButton7.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jButton7.setForeground(new java.awt.Color(255, 255, 255));
        jButton7.setText("Registrar Producto");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton7, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 370, 190, 30));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/venta.png"))); // NOI18N
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 70, 120, 120));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/empleado.png"))); // NOI18N
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 80, 120, 120));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/cliente.png"))); // NOI18N
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 70, 120, 120));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/producto.png"))); // NOI18N
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 250, 120, 120));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/proveedor.png"))); // NOI18N
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 240, 120, 120));

        jButton1.setBackground(new java.awt.Color(0, 0, 204));
        jButton1.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Registrar Compra");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 370, 190, 30));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/compra.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 240, 130, 120));
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 440, -1, -1));

        nombre.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        getContentPane().add(nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 50, 130, 20));

        rol.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        getContentPane().add(rol, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 20, 130, 20));

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setText("Rol:");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 20, 30, 20));

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel10.setText("Inicio de sesion como:");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, -1, -1));

        rSLabelHora1.setForeground(new java.awt.Color(0, 0, 0));
        getContentPane().add(rSLabelHora1, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 20, -1, -1));

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel11.setText("Hora:");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 30, -1, -1));

        fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/verde3.jpg"))); // NOI18N
        getContentPane().add(fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 0, 900, 540));
        getContentPane().add(idv, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, 50, 20));
        getContentPane().add(rSLabelHora2, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 20, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void registroEmpleadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registroEmpleadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_registroEmpleadoActionPerformed

    
    public Icon icono(String path, int width, int height){
        Icon img = new ImageIcon(new ImageIcon(getClass().getResource(path)).getImage().
                getScaledInstance(width,height,java.awt.Image.SCALE_SMOOTH));
        return img;
    }
    private void salirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salirActionPerformed
        // TODO add your handling code here:
        Object[] options = {"SI", "NO"};
         int i = JOptionPane.showOptionDialog(null, "Esta seguro que desea salir del sistema?","Seleccione una opción",JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, icono("/Imagenes/logo.png", 40, 40),  options, options[0]);
        
        if (i == 0) { 
            logger.debug("Salio del sistema: "+nombre.getText());
        System.exit(0);
        }
    }//GEN-LAST:event_salirActionPerformed

    private void registroEmpleadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registroEmpleadosActionPerformed
        
    }//GEN-LAST:event_registroEmpleadosActionPerformed

    private void registrarVentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registrarVentaActionPerformed
        // TODO add your handling code here:
        logger.debug("Ingreso a la pantalla de ventas");
        ModeloVenta mv = new ModeloVenta();
        mv.setVisible(true);
        ModeloVenta.txtvendedor.setText(idv.getText());
        
    }//GEN-LAST:event_registrarVentaActionPerformed

    private void registroEmpleadoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_registroEmpleadoMouseClicked
        
        
        logger.debug("Ingreso a la pantalla de registro de empleados");
        RegistroClientes registrar2 = new RegistroClientes();
 registrar2.setVisible (true);

    RegistroClientes.usuario.setText(nombre.getText());
    RegistroClientes.rolC.setText(rol.getText());
    RegistroClientes.idc.setText(idv.getText());
    this.dispose();
 
    }//GEN-LAST:event_registroEmpleadoMouseClicked

    private void registroEmpleadosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_registroEmpleadosMouseClicked
 
        RegistrarEmpleados registrar = new RegistrarEmpleados();
        RegistrarEmpleados.user.setText(nombre.getText());
        RegistrarEmpleados.rol.setText(rol.getText());
        RegistrarEmpleados.ide.setText(idv.getText());
        
        registrar.setVisible (true);
        this.dispose();

 
    }//GEN-LAST:event_registroEmpleadosMouseClicked

    private void registrarVentaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_registrarVentaMouseClicked
/*Factura_Venta facv = new Factura_Venta();
facv.setVisible(true);
this.dispose();*/
    }//GEN-LAST:event_registrarVentaMouseClicked

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        
        frm_proveedores proveedor = new frm_proveedores();
        frm_proveedores.usuarios.setText(nombre.getText());
        frm_proveedores.rol.setText(rol.getText());
        frm_proveedores.idp1.setText(idv.getText());
        proveedor.setVisible(true);
        this.dispose();
        
        logger.debug("Ingreso a la pantalla de proveedores "+nombre.getText());
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
        Object[] options = {"SI", "NO"};
         int i = JOptionPane.showOptionDialog(null, "Esta seguro que desea cerrar sesión?","Seleccione una opción",JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, icono("/Imagenes/logo.png", 40, 40),  options, options[0]);
        
        if (i == 0) { 
            logger.debug("Cerro Sesion: "+nombre.getText());
        Pantalla_Inicio_Sesion inicio = new Pantalla_Inicio_Sesion();
        inicio.setVisible(true);
        this.dispose();
        }
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        // TODO add your handling code here:
        Producto producto = new Producto();
        producto.setVisible(true);
        
        Producto.usuario.setText(nombre.getText());
        Producto.rol.setText(rol.getText());
        Producto.idp.setText(idv.getText());
        this.dispose();
        logger.debug("Ingreso a la pantalla de productos: "+nombre.getText());
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        ModeloCompra1 c = new ModeloCompra1();
        c.setVisible(true);
        
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(menuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(menuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(menuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(menuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new menuPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JLabel fondo;
    public static javax.swing.JLabel idv;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    public static javax.swing.JLabel nombre;
    private rojeru_san.RSLabelHora rSLabelHora1;
    private rojeru_san.RSLabelHora rSLabelHora2;
    private javax.swing.JButton registrarVenta;
    private javax.swing.JButton registroEmpleado;
    private javax.swing.JButton registroEmpleados;
    public static javax.swing.JLabel rol;
    private javax.swing.JButton salir;
    // End of variables declaration//GEN-END:variables
}
