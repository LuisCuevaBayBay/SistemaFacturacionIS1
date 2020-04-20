/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inicio_sesion;


import Conexiones.ConexionSQL;
import Empleados.RegistrarEmpleados;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import menu.menuPrincipal;

/**
 *
 * @author luisc
 */
public class Pantalla_Inicio_Sesion extends javax.swing.JFrame {
  
   
    public Pantalla_Inicio_Sesion() {
        initComponents();
        this.setLocationRelativeTo(null);
    }
    
    RegistrarEmpleados metodo = new RegistrarEmpleados();
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
        fondo = new javax.swing.JLabel();

        jLabel1.setText("jLabel1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        usuario.setBackground(new java.awt.Color(255, 255, 255));
        usuario.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        usuario.setText("Nombre de Usuario");
        getContentPane().add(usuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 290, 150, 40));
        getContentPane().add(txt_usuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 300, 174, 30));

        jLabel2.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel2.setText("Contraseña");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 350, -1, 20));
        getContentPane().add(txt_pass, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 340, 174, 30));

        btn_inicio_sesion.setBackground(new java.awt.Color(0, 0, 153));
        btn_inicio_sesion.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        btn_inicio_sesion.setForeground(new java.awt.Color(255, 255, 255));
        btn_inicio_sesion.setText("Iniciar Sesion");
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
        getContentPane().add(btn_inicio_sesion, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 380, 174, -1));

        jButton3.setBackground(new java.awt.Color(0, 102, 204));
        jButton3.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setText("Salir");
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
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 420, 70, 30));

        bienvenida.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        bienvenida.setText("Bienvenido al Sistema ");
        bienvenida.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        getContentPane().add(bienvenida, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 240, -1, 82));

        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/logo.png"))); // NOI18N
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 50, 230, 200));

        fondo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/verde3.jpg"))); // NOI18N
        fondo.setMaximumSize(new java.awt.Dimension(32, 32));
        fondo.setMinimumSize(new java.awt.Dimension(32, 32));
        getContentPane().add(fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 500, 470));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_inicio_sesionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_inicio_sesionMouseClicked
      
    }//GEN-LAST:event_btn_inicio_sesionMouseClicked

    private void jButton3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton3MouseClicked
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_jButton3MouseClicked

    private void btn_inicio_sesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_inicio_sesionActionPerformed
        // TODO add your handling code here:
        
        validar();
    }//GEN-LAST:event_btn_inicio_sesionActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_jButton3ActionPerformed
    
    public void validar(){
       RegistrarEmpleados registro = new RegistrarEmpleados();
        
        ConexionSQL cc = new ConexionSQL();
        Connection cn = cc.getConnection();
        int resultado = 0;
        
        String usuario = txt_usuario.getText();
        String pass = txt_pass.getText();
        String SQL = "SELECT * from vendedor where usuario ='"+usuario+"' and pass='"+pass+"'";
        
        try{
        Statement st = cn.createStatement();
        ResultSet rs = st.executeQuery(SQL);
        
        if(rs.next()){
        resultado = 1;
        if(resultado == 1){
            menuPrincipal menu = new menuPrincipal();
            menu.setVisible(true);
            JOptionPane.showMessageDialog(null, "Bienvenido al Sistema!");
            this.dispose();
        }
        }else{
            JOptionPane.showMessageDialog(null,"Error de Acceso, Usuario no registrado");
        }
        }catch(Exception e){
        
        }
         
    }
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
    private javax.swing.JLabel bienvenida;
    private javax.swing.JButton btn_inicio_sesion;
    private javax.swing.JLabel fondo;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPasswordField txt_pass;
    private javax.swing.JTextField txt_usuario;
    private javax.swing.JLabel usuario;
    // End of variables declaration//GEN-END:variables
}
