/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clientes;

import Conexiones.ConexionSQL;
import Empleados.RegistrarEmpleados;
import contactos.contacto_cliente.ContactoC;
import java.awt.Toolkit;
//import FacturaCompra.FacturaCompra;
/*import Factura_Venta.Factura_Venta;*/
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import menu.menuPrincipal;

/**
 *
 * @author luisc
 */
public class RegistroClientes extends javax.swing.JFrame {

    /**
     * Creates new form RegistroClientes
     */
    public RegistroClientes() {
        initComponents();
        mostrardatos("");
     this.setLocationRelativeTo(null);
    }
    void mostrardatos(String valor){
        ConexionSQL cc = new ConexionSQL();
        Connection cn = cc.getConnection();
        DefaultTableModel modelo2 = new DefaultTableModel();
        
        modelo2.addColumn("ID Cliente");
        modelo2.addColumn("Nombre Cliente");
        modelo2.addColumn("Apellido Cliente");
        modelo2.addColumn("Direccion");
        modelo2.addColumn("Numero de indentidad");
        modelo2.addColumn("RTN Cliente");
        
        
        
        tablaclientes.setModel(modelo2);
        String sql = "";
        if (valor.equals(""))
        {
            sql="SELECT * FROM cliente";
        }
        else{
            sql= "SELECT * FROM cliente WHERE (Cli_id ='" +valor+ "'OR Nombre_Cliente='" +valor+"'OR Apellido_Cliente='"+valor+"'OR rtn_Cliente='"+valor+"'OR Num_Identidad_cliente='" +valor+"'OR Direccion_Cliente='"+valor+"')";
        }  
        
        String [] datos = new String[6];
        try{
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while(rs.next()){
                datos[0] = rs.getString(1);
                datos[1]=rs.getString(2);
                datos[2]=rs.getString(3);
                datos[3]=rs.getString(4);
                datos[4]=rs.getString(5);
                datos[5]=rs.getString(6);
                
                modelo2.addRow(datos);
            }
            tablaclientes.setModel(modelo2);
        }catch (SQLException ex){
           Logger.getLogger(datos.class.getName()).log(Level.SEVERE, null, ex); 
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

        jPopupMenu2 = new javax.swing.JPopupMenu();
        jMenuItem2 = new javax.swing.JMenuItem();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txt_nombre_cli = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txt_rtn_cliente = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txt_cli_id = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        btn_guardar = new javax.swing.JButton();
        btn_eliminar = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tablaclientes = new javax.swing.JTable();
        txt_apellido_cli = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        btn_nuevo = new javax.swing.JButton();
        btn_editar = new javax.swing.JButton();
        btn_salir = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        txt_num_id_cli = new javax.swing.JTextField();
        txt_dir_cli = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        buscar_txt = new javax.swing.JTextField();
        jButton6 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();

        jMenuItem2.setText("Modificar");
        jMenuItem2.setToolTipText("");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jPopupMenu2.add(jMenuItem2);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(773, 31, -1, -1));

        jLabel2.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jLabel2.setText("Registro Clientes");
        jLabel2.setToolTipText("");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 0, -1, -1));

        jLabel3.setText("Nombre Cliente");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 280, -1, -1));

        txt_nombre_cli.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_nombre_cliActionPerformed(evt);
            }
        });
        txt_nombre_cli.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_nombre_cliKeyTyped(evt);
            }
        });
        getContentPane().add(txt_nombre_cli, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 270, 160, 30));

        jLabel4.setText("RTN");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 360, -1, -1));

        txt_rtn_cliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_rtn_clienteActionPerformed(evt);
            }
        });
        txt_rtn_cliente.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_rtn_clienteKeyTyped(evt);
            }
        });
        getContentPane().add(txt_rtn_cliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 350, 160, 30));

        jLabel5.setText("ID Cliente");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 240, -1, -1));

        txt_cli_id.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_cli_idActionPerformed(evt);
            }
        });
        txt_cli_id.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_cli_idKeyTyped(evt);
            }
        });
        getContentPane().add(txt_cli_id, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 230, 160, 30));

        jLabel7.setText("Dirección");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 450, -1, -1));

        btn_guardar.setBackground(new java.awt.Color(0, 0, 204));
        btn_guardar.setForeground(new java.awt.Color(255, 255, 255));
        btn_guardar.setText("Guardar");
        btn_guardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_guardarActionPerformed(evt);
            }
        });
        getContentPane().add(btn_guardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 230, 80, -1));

        btn_eliminar.setBackground(new java.awt.Color(0, 0, 204));
        btn_eliminar.setForeground(new java.awt.Color(255, 255, 255));
        btn_eliminar.setText("Eliminar");
        btn_eliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_eliminarActionPerformed(evt);
            }
        });
        getContentPane().add(btn_eliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 320, 80, -1));

        tablaclientes.setForeground(new java.awt.Color(0, 0, 204));
        tablaclientes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        tablaclientes.setComponentPopupMenu(jPopupMenu2);
        tablaclientes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablaclientesMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tablaclientes);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 100, 622, 117));

        txt_apellido_cli.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_apellido_cliKeyTyped(evt);
            }
        });
        getContentPane().add(txt_apellido_cli, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 310, 160, 30));

        jLabel9.setText("Apellido Cliente");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 320, -1, -1));

        btn_nuevo.setBackground(new java.awt.Color(0, 0, 255));
        btn_nuevo.setForeground(new java.awt.Color(255, 255, 255));
        btn_nuevo.setText("Nuevo");
        btn_nuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_nuevoActionPerformed(evt);
            }
        });
        getContentPane().add(btn_nuevo, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 260, 80, -1));

        btn_editar.setBackground(new java.awt.Color(0, 0, 255));
        btn_editar.setForeground(new java.awt.Color(255, 255, 255));
        btn_editar.setText("Editar");
        btn_editar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_editarActionPerformed(evt);
            }
        });
        getContentPane().add(btn_editar, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 290, 80, -1));

        btn_salir.setBackground(new java.awt.Color(0, 153, 204));
        btn_salir.setForeground(new java.awt.Color(255, 255, 255));
        btn_salir.setText("Salir");
        btn_salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_salirActionPerformed(evt);
            }
        });
        getContentPane().add(btn_salir, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 460, 80, -1));

        jLabel10.setText("Numero de Identidad");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 400, -1, -1));

        txt_num_id_cli.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_num_id_cliActionPerformed(evt);
            }
        });
        txt_num_id_cli.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_num_id_cliKeyTyped(evt);
            }
        });
        getContentPane().add(txt_num_id_cli, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 390, 160, 30));

        txt_dir_cli.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_dir_cliKeyTyped(evt);
            }
        });
        getContentPane().add(txt_dir_cli, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 430, 160, 70));

        jButton2.setBackground(new java.awt.Color(0, 0, 204));
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Buscar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 70, -1, -1));

        buscar_txt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscar_txtActionPerformed(evt);
            }
        });
        getContentPane().add(buscar_txt, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 70, 140, 30));

        jButton6.setBackground(new java.awt.Color(0, 153, 255));
        jButton6.setForeground(new java.awt.Color(255, 255, 255));
        jButton6.setText("Atrás");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 430, 80, -1));

        jButton9.setBackground(new java.awt.Color(0, 0, 204));
        jButton9.setForeground(new java.awt.Color(255, 255, 255));
        jButton9.setText("Contacto");
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton9, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 350, 80, -1));

        jButton7.setBackground(new java.awt.Color(0, 0, 204));
        jButton7.setForeground(new java.awt.Color(255, 255, 255));
        jButton7.setText("Mostrar");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton7, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 70, 70, -1));

        jButton1.setBackground(new java.awt.Color(0, 0, 204));
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Inicio");
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, -1, -1));

        jButton3.setBackground(new java.awt.Color(0, 0, 204));
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setText("Registrar Empleado");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 30, -1, -1));

        jButton4.setBackground(new java.awt.Color(0, 0, 204));
        jButton4.setForeground(new java.awt.Color(255, 255, 255));
        jButton4.setText("Registrar Cliente");
        getContentPane().add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 30, -1, -1));

        jButton5.setBackground(new java.awt.Color(0, 0, 204));
        jButton5.setForeground(new java.awt.Color(255, 255, 255));
        jButton5.setText("Registrar Compra");
        getContentPane().add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 30, -1, -1));

        jButton8.setBackground(new java.awt.Color(0, 0, 204));
        jButton8.setForeground(new java.awt.Color(255, 255, 255));
        jButton8.setText("Registrar Venta");
        getContentPane().add(jButton8, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 30, -1, -1));

        jButton10.setBackground(new java.awt.Color(0, 0, 204));
        jButton10.setForeground(new java.awt.Color(255, 255, 255));
        jButton10.setText("Registrar Proveedor");
        getContentPane().add(jButton10, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 30, -1, -1));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/verde3.jpg"))); // NOI18N
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 520));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    
    private void btn_guardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_guardarActionPerformed
        // TODO add your handling code here:
       ConexionSQL cc = new ConexionSQL();
       Connection cn = cc.getConnection();
       
    if(txt_cli_id.getText().equals("") || txt_rtn_cliente.getText().equals("") || txt_nombre_cli.getText().equals("")
            || txt_apellido_cli.getText().equals("") || txt_num_id_cli.getText().equals("")
            || txt_dir_cli.getText().equals("")){
        
        JOptionPane.showMessageDialog(null, "Hay Campos que estan vacios debe llenar todos los campos"); 
    
    }else{
       
       try{
           if(existeUsuario(txt_cli_id.getText())==0){
           
           
            if(txt_num_id_cli.getText().length() >= 13){
                    if(txt_rtn_cliente.getText().length() >=14){
           
           PreparedStatement pst = cn.prepareStatement("INSERT INTO cliente (Cli_id,rtn_Cliente,Nombre_Cliente,Apellido_Cliente"
                   + ",Num_Identidad_cliente,Direccion_Cliente) VALUES(?,?,?,?,?,?)");
            pst.setString(1, txt_cli_id.getText());
                pst.setString(2, txt_rtn_cliente.getText()); 
                    pst.setString(3, txt_nombre_cli.getText());
                       pst.setString(4, txt_apellido_cli.getText());
            pst.setString(5, txt_num_id_cli.getText());
            pst.setString(6, txt_dir_cli.getText());
           
           int a = pst.executeUpdate();
           if(a>0){
               JOptionPane.showMessageDialog(null, "Registro Exitoso");
               nuevo();
               mostrardatos("");
           }else{
               JOptionPane.showMessageDialog(null, "Error al agregar");
           }
                    }else{
                        JOptionPane.showMessageDialog(null, "Error al agregar, el RTN debe ser de 14");
                    }
           }else{
               JOptionPane.showMessageDialog(null, "Error al agregar, el Num Identidad debe ser de 13");
           }
           }
       }catch (Exception e){
       }
    }
    }//GEN-LAST:event_btn_guardarActionPerformed

    
    private int existeUsuario(String usuario) {                                              
      
        ConexionSQL cc = new ConexionSQL();
        
        Connection cn = cc.getConnection();
        
        ResultSet rs = null;
        PreparedStatement ps = null;
        
        String sql = "SELECT count(Cli_id) FROM cliente WHERE Cli_id = ?";
    
        try {
            ps = cn.prepareStatement(sql);
            ps.setString(1, usuario);
            rs = ps.executeQuery();
            
            if(rs.next()){
                return rs.getInt(1);
            }
        } catch (Exception e) {
            return 1;
        }
        return 1;
    }
    
    private void txt_nombre_cliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_nombre_cliActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_nombre_cliActionPerformed

    private void txt_cli_idActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_cli_idActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_cli_idActionPerformed
void nuevo(){
txt_cli_id.setText("");
txt_nombre_cli.setText("");
txt_apellido_cli.setText("");
txt_rtn_cliente.setText("");
txt_num_id_cli.setText("");
txt_dir_cli.setText("");
}
    private void btn_nuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_nuevoActionPerformed
        // TODO add your handling code here:
        nuevo();
        
        
    }//GEN-LAST:event_btn_nuevoActionPerformed
    String id ="";
    private void btn_editarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_editarActionPerformed
        // TODO add your handling code here:
       ConexionSQL cc = new ConexionSQL();
       Connection cn = cc.getConnection();
       
       if(txt_cli_id.getText().equals("") || txt_nombre_cli.getText().equals("") || txt_apellido_cli.getText().equals("") || txt_dir_cli.getText().equals("") || 
               txt_num_id_cli.getText().equals("") || txt_rtn_cliente.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Hay Campos que estan vacios, debe llenarlos");
       }else{
            try{
                if(txt_rtn_cliente.getText().length()>=14){
                if(txt_num_id_cli.getText().length()>= 13){
                PreparedStatement pst = cn.prepareStatement("UPDATE cliente SET Cli_id='"+txt_cli_id.getText()+"',Nombre_Cliente='"+txt_nombre_cli.getText()+"',Apellido_Cliente='"+txt_apellido_cli.getText()+"',Direccion_Cliente='"+txt_dir_cli.getText()+"',Num_Identidad_Cliente='"+txt_num_id_cli.getText()+"',rtn_Cliente='"+txt_rtn_cliente.getText()+"'WHERE Cli_id='"+id+"'");
                     pst.executeUpdate();
                        JOptionPane.showMessageDialog(null,"Se a modificado con exito");
                        mostrardatos("");
                }else{
                    JOptionPane.showMessageDialog(null, "El RTN debe ser de 14 numeros");
                }
                }else{
                    JOptionPane.showMessageDialog(null, "El numero de Identidad debe ser de 13 numeros");
                }
                }catch(Exception e){
                    System.out.println(e.getMessage());
            } 
       }
    }//GEN-LAST:event_btn_editarActionPerformed

    private void btn_eliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_eliminarActionPerformed
        // TODO add your handling code here:
       ConexionSQL cc = new ConexionSQL();
        Connection cn = cc.getConnection();
        int fila = tablaclientes.getSelectedRow();
        String cod = "";
        cod = tablaclientes.getValueAt(fila, 0).toString();
        try {
            PreparedStatement pst = cn.prepareStatement("DELETE FROM cliente WHERE Cli_id='" + cod + "'");
            int a = pst.executeUpdate();
            mostrardatos("");

            if (a > 0) {
                JOptionPane.showMessageDialog(null, "Eliminacion Exitosa");
            } else {
                JOptionPane.showMessageDialog(null, "No se pudo Eliminar");
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
            JOptionPane.showMessageDialog(null, "No se pudo eliminar, el cliente tiene facturas registradas");
        }
       nuevo();
    }//GEN-LAST:event_btn_eliminarActionPerformed

    private void btn_salirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_salirActionPerformed
        // TODO add your handling code here:
        
        System.exit(0);
    }//GEN-LAST:event_btn_salirActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        mostrardatos(buscar_txt.getText());
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
        menuPrincipal menu = new menuPrincipal();
        menu.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton6ActionPerformed

    private void txt_cli_idKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_cli_idKeyTyped
        // TODO add your handling code here:
        char c = evt.getKeyChar();
        
        if(c<'0' || c>'9') evt.consume();
        
        if(txt_cli_id.getText().length() >= 5){
            evt.consume();
            Toolkit.getDefaultToolkit().beep();
        }
    }//GEN-LAST:event_txt_cli_idKeyTyped

    private void txt_rtn_clienteKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_rtn_clienteKeyTyped
        // TODO add your handling code here:
        char c = evt.getKeyChar();
        
        if(c<'0' || c>'9') evt.consume();
        
        if(txt_rtn_cliente.getText().length() >= 14){
            evt.consume();
            Toolkit.getDefaultToolkit().beep();
        }
    }//GEN-LAST:event_txt_rtn_clienteKeyTyped

    private void txt_nombre_cliKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_nombre_cliKeyTyped
        // TODO add your handling code here:
        
        char c = evt.getKeyChar();
        
        if((c<'a' || c>'z')&& (c<'A' || c>'Z')) evt.consume();
        
        
        if(txt_nombre_cli.getText().length() >= 20){
            evt.consume();
            Toolkit.getDefaultToolkit().beep();
        }
    }//GEN-LAST:event_txt_nombre_cliKeyTyped

    private void txt_apellido_cliKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_apellido_cliKeyTyped
        // TODO add your handling code here:
         char c = evt.getKeyChar();
        
        if((c<'a' || c>'z')&& (c<'A' || c>'Z')) evt.consume();
        
        if(txt_apellido_cli.getText().length() >= 20){
            evt.consume();
            Toolkit.getDefaultToolkit().beep();
        }
    }//GEN-LAST:event_txt_apellido_cliKeyTyped

    private void txt_num_id_cliKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_num_id_cliKeyTyped
        // TODO add your handling code here:
        char c = evt.getKeyChar();
        
        if(c<'0' || c>'9') evt.consume();
        
        
        if(txt_num_id_cli.getText().length() >= 13){
            evt.consume();
            Toolkit.getDefaultToolkit().beep();
        }
    }//GEN-LAST:event_txt_num_id_cliKeyTyped

    private void txt_dir_cliKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_dir_cliKeyTyped
        // TODO add your handling code here:
        
     
        
        if(txt_dir_cli.getText().length() >= 70){
            evt.consume();
            Toolkit.getDefaultToolkit().beep();
        }
    }//GEN-LAST:event_txt_dir_cliKeyTyped
  
    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        // TODO add your handling code here:
        ContactoC contacto = new ContactoC();
        contacto.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton9ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        // TODO add your handling code here:
         int fila = tablaclientes.getSelectedRow();
        if(fila >= 0){
            txt_cli_id.setText(tablaclientes.getValueAt(fila, 0).toString());
            txt_rtn_cliente.setText(tablaclientes.getValueAt(fila,1).toString());
            txt_nombre_cli.setText(tablaclientes.getValueAt(fila, 2).toString());
            txt_apellido_cli.setText(tablaclientes.getValueAt(fila, 3).toString());
            txt_num_id_cli.setText(tablaclientes.getValueAt(fila, 4).toString());
            txt_dir_cli.setText(tablaclientes.getValueAt(fila, 5).toString());
            id = tablaclientes.getValueAt(fila,0).toString();
        }else{
            JOptionPane.showMessageDialog(null, "No se encontro fila ");
        }
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void tablaclientesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaclientesMouseClicked
        // TODO add your handling code here:
         int fila = tablaclientes.getSelectedRow();
        if(fila >= 0){
            txt_cli_id.setText(tablaclientes.getValueAt(fila, 0).toString());
            txt_nombre_cli.setText(tablaclientes.getValueAt(fila,1).toString());
            txt_apellido_cli.setText(tablaclientes.getValueAt(fila, 2).toString());
            txt_dir_cli.setText(tablaclientes.getValueAt(fila, 3).toString());
            txt_num_id_cli.setText(tablaclientes.getValueAt(fila, 4).toString());
            txt_rtn_cliente.setText(tablaclientes.getValueAt(fila, 5).toString());
            id = tablaclientes.getValueAt(fila,0).toString();
        }else{
            JOptionPane.showMessageDialog(null, "No se encontro fila ");
        }
    }//GEN-LAST:event_tablaclientesMouseClicked

    private void txt_rtn_clienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_rtn_clienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_rtn_clienteActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        // TODO add your handling code here:
        mostrardatos("");
        buscar_txt.setText("");
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        RegistrarEmpleados re = new RegistrarEmpleados();
        re.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void txt_num_id_cliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_num_id_cliActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_num_id_cliActionPerformed

    private void buscar_txtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscar_txtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_buscar_txtActionPerformed

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
            java.util.logging.Logger.getLogger(RegistroClientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RegistroClientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RegistroClientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RegistroClientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RegistroClientes().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_editar;
    private javax.swing.JButton btn_eliminar;
    private javax.swing.JButton btn_guardar;
    private javax.swing.JButton btn_nuevo;
    private javax.swing.JButton btn_salir;
    private javax.swing.JTextField buscar_txt;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JPopupMenu jPopupMenu2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tablaclientes;
    private javax.swing.JTextField txt_apellido_cli;
    private javax.swing.JTextField txt_cli_id;
    private javax.swing.JTextField txt_dir_cli;
    private javax.swing.JTextField txt_nombre_cli;
    private javax.swing.JTextField txt_num_id_cli;
    private javax.swing.JTextField txt_rtn_cliente;
    // End of variables declaration//GEN-END:variables
}
