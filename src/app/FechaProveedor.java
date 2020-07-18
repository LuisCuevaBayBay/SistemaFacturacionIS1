/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app;

import Conexiones.ConexionSQL;
import java.sql.Connection;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.HashMap;
import java.util.Map;
import javax.swing.ImageIcon;
import static javax.swing.WindowConstants.DISPOSE_ON_CLOSE;
import menu.menuPrincipal;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.util.JRLoader;
import net.sf.jasperreports.view.JasperViewer;

/**
 *
 * @author Luis Cueva
 */
public class FechaProveedor extends javax.swing.JFrame {

    /**
     * Creates new form FechaEmpleados
     */
    public FechaProveedor() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setIconImage(new ImageIcon(getClass().getResource("/imagenes/logo.png")).getImage());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        fecha2 = new com.toedter.calendar.JDateChooser();
        jButton1 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        nombre = new javax.swing.JLabel();
        rol = new javax.swing.JLabel();
        idv = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Escoja la Fecha: ");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 160, -1, -1));

        fecha2.setDateFormatString("MMM d, yyyy");
        getContentPane().add(fecha2, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 160, -1, -1));

        jButton1.setText("Crear Informe");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 340, -1, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Escoje Fecha para crear Reporte de Proveedores");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 40, -1, -1));

        jButton2.setText("Atras");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 340, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Abstract_sky_blue-2016_Vector_Design_HD_Wallpaper_1366x768.jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 538, 373));

        nombre.setText("jLabel4");
        getContentPane().add(nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 120, -1, -1));

        rol.setText("jLabel5");
        getContentPane().add(rol, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 90, -1, -1));

        idv.setText("jLabel6");
        getContentPane().add(idv, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 230, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here
        
        
        SimpleDateFormat dFormat=new SimpleDateFormat("yyyy-MM-dd");
        String date = dFormat.format(fecha2.getDate());
         try {
            ConexionSQL con = new ConexionSQL();
        Connection conn = con.getConnection();
        
        JasperReport reporte = null;
        String path = "/reportes/ReporteProveedor.jasper";
            reporte = (JasperReport) JRLoader.loadObject(getClass().getResource(path));
            Map parametro = new HashMap();
           parametro.put("fecha",date);
            
            JasperPrint jprint = JasperFillManager.fillReport(reporte,parametro,conn);
            
            JasperViewer view = new  JasperViewer(jprint,false);
            view.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
            view.setVisible(true);
            
        } catch (JRException ex) {
            java.util.logging.Logger.getLogger(menuReportes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    
    void validacionVenta(String usuario){
    String cap1="";
        ConexionSQL cc = new ConexionSQL();
        Connection cn = cc.getConnection();
        String sql;
        
        sql = "SELECT * FROM `compra_estado` WHERE `nom_usuario` = '"+usuario+"'";
        
        try{
            Statement st = cn.createStatement();
            java.sql.ResultSet rs = st.executeQuery(sql);
            
            while(rs.next()){
                cap1 = rs.getString("mirar");
                
                
            }
            if(cap1.equals("inactivo")){
                    menuPrincipal.registrarVenta.setVisible(false);
                    menuPrincipal.jLabel3.setVisible(false);
                }else{
                    menuPrincipal.registrarVenta.setVisible(true);
                    menuPrincipal.jLabel3.setVisible(true);
                }
        
        }catch(Exception e){
            
        }
    
        
    }
    
    
    void validacionProductos(String usuario){
    
        String cap1="";
        ConexionSQL cc = new ConexionSQL();
        Connection cn = cc.getConnection();
        String sql;
        
        sql = "SELECT * FROM `producto_estado` WHERE `nom_usuario` = '"+usuario+"'";
        
        try{
            Statement st = cn.createStatement();
            java.sql.ResultSet rs = st.executeQuery(sql);
            
            while(rs.next()){
                cap1 = rs.getString("mirar");
                
                
            }
            if(cap1.equals("inactivo")){
                    menuPrincipal.jButton7.setVisible(false);
                    menuPrincipal.jLabel7.setVisible(false);
                }else{
                    menuPrincipal.jButton7.setVisible(true);
                    menuPrincipal.jLabel7.setVisible(true);
                }
        
        }catch(Exception e){
            
        }
    }
    
    void validacionCompra(String usuario){
         String cap1="";
        ConexionSQL cc = new ConexionSQL();
        Connection cn = cc.getConnection();
        String sql;
        
        sql = "SELECT * FROM `compra_estado` WHERE `nom_usuario` = '"+usuario+"'";
        
        try{
            Statement st = cn.createStatement();
            java.sql.ResultSet rs = st.executeQuery(sql);
            
            while(rs.next()){
                cap1 = rs.getString("mirar");
                
                
            }
            if(cap1.equals("inactivo")){
                    menuPrincipal.jButton1.setVisible(false);
                    menuPrincipal.jLabel1.setVisible(false);
                }else{
                    menuPrincipal.jButton1.setVisible(true);
                    menuPrincipal.jLabel1.setVisible(true);
                }
        
        }catch(Exception e){
            
        }
    }
    
    void validacionProveedor(String usuario){
        String cap1="";
        ConexionSQL cc = new ConexionSQL();
        Connection cn = cc.getConnection();
        String sql;
        
        sql = "SELECT * FROM `proveedor_estado` WHERE `nom_usuario` = '"+usuario+"'";
        
        try{
            Statement st = cn.createStatement();
            java.sql.ResultSet rs = st.executeQuery(sql);
            
            while(rs.next()){
                cap1 = rs.getString("mirar");
                
                
            }
            if(cap1.equals("inactivo")){
                    menuPrincipal.jButton2.setVisible(false);
                    menuPrincipal.jLabel8.setVisible(false);
                }else{
                    menuPrincipal.jButton2.setVisible(true);
                    menuPrincipal.jLabel8.setVisible(true);
                }
        
        }catch(Exception e){
            
        }
        
        
    }
    
    void validacionCliente(String usuario){
    
    String cap1="";
        ConexionSQL cc = new ConexionSQL();
        Connection cn = cc.getConnection();
        String sql;
        
        sql = "SELECT * FROM `cliente_estado` WHERE `nom_usuario` = '"+usuario+"'";
        
        try{
            Statement st = cn.createStatement();
            java.sql.ResultSet rs = st.executeQuery(sql);
            
            while(rs.next()){
                cap1 = rs.getString("mirar");
                
                
            }
            if(cap1.equals("inactivo")){
                    menuPrincipal.registroEmpleado.setVisible(false);
                    menuPrincipal.jLabel5.setVisible(false);
                }else{
                    menuPrincipal.registroEmpleado.setVisible(true);
                    menuPrincipal.jLabel5.setVisible(true);
                }
        
        }catch(Exception e){
            
        }
        
    }
    void validacion(String usuario){
        String cap1="";
        ConexionSQL cc = new ConexionSQL();
        Connection cn = cc.getConnection();
        String sql;
        
        sql = "SELECT * FROM `vendedor_estado` WHERE `nom_usuario` = '"+usuario+"'";
        
        try{
            Statement st = cn.createStatement();
            java.sql.ResultSet rs = st.executeQuery(sql);
            
            while(rs.next()){
                cap1 = rs.getString("mirar");
                
                
            }
            if(cap1.equals("inactivo")){
                    menuPrincipal.registroEmpleados1.setVisible(false);
                    menuPrincipal.jLabel4.setVisible(false);
                }else{
                    menuPrincipal.registroEmpleados1.setVisible(true);
                    menuPrincipal.jLabel4.setVisible(true);
                }
        
        }catch(Exception e){
            
        }
        
        
        
    
    }
    
    
    
    
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        
        menuReportes mr = new menuReportes();
        mr.setVisible(true);
        menuReportes.nombre.setText(nombre.getText());
        menuReportes.rol.setText(rol.getText());
        menuReportes.idv.setText(idv.getText());
        validacion(nombre.getText());
        validacionCliente(nombre.getText());
        validacionProveedor(nombre.getText());
        validacionCompra(nombre.getText());
        validacionProductos(nombre.getText());
        validacionVenta(nombre.getText());


        this.dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(FechaProveedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FechaProveedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FechaProveedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FechaProveedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FechaProveedor().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.toedter.calendar.JDateChooser fecha2;
    public static javax.swing.JLabel idv;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    public static javax.swing.JLabel nombre;
    public static javax.swing.JLabel rol;
    // End of variables declaration//GEN-END:variables
}
