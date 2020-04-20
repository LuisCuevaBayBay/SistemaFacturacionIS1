/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Proveedor;

import Clientes.datos;
import Conexiones.ConexionSQL;
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
 * @author Hector
 */
public class frm_proveedores extends javax.swing.JFrame {

    /*
     * Creates new form frm_proveedores
     */
    
    Connection conectar = null;
    
    public frm_proveedores() {
        initComponents();
        
        mostrardatos("");
        bloquear();
        limpiar();
    }
    
    
    void mostrardatos(String valor){
        ConexionSQL cc = new ConexionSQL();
        Connection cn = cc.getConnection();

        modelo.addColumn("ID Empresa");
        modelo.addColumn("Nombre Empresa");
        modelo.addColumn("Direccion");
        modelo.addColumn("RTN");
        
        tablaproveedor.setModel(modelo);
        String sql = "";
        if(valor.equals("")){
            sql = "SELECT * FROM proveedor";
        }else{
            sql = "SELECT * FROM proveedor WHERE (Empresa_id='"+valor+"'OR Nombre_Empresa='"+valor+"'OR Direccion_Empresa='"+valor+"'OR rtn_empresa='"+valor+"')";
        }
        String [] datos = new String[4];
        try{
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while(rs.next()){
                datos[0] = rs.getString(1);
                datos[1] = rs.getString(2);
                datos[2] = rs.getString(3);
                datos[3] = rs.getString(4);
                
               modelo.addRow(datos);
               
            }
            tablaproveedor.setModel(modelo);
        }catch(SQLException ex){
            Logger.getLogger(datos.class.getName()).log(Level.SEVERE,null,ex);
        }
        
            
    }
    
    void limpiar(){
        Jtf_Id.setText("");
        Jtf_Nombre_Empresa.setText("");
        jtf_Rtn.setText("");
        Jtf_Direccion.setText("");
    }
    void desbloquear(){
        Jtf_Id.setEnabled(true);
        Jtf_Nombre_Empresa.setEnabled(true);
        jtf_Rtn.setEnabled(true);
        Jtf_Direccion.setEnabled(true);
        
        Jbt_Guardar.setEnabled(true);
        jtf_nuevo.setEnabled(true);
        jtf_editar.setEnabled(true);
        Jbt_Eliminar.setEnabled(true);
        jtf_salir.setEnabled(true);
    }
    
    void bloquear(){
        Jtf_Id.setEnabled(false);
        Jtf_Nombre_Empresa.setEnabled(false);
        jtf_Rtn.setEnabled(false);
        Jtf_Direccion.setEnabled(false);
        
        Jbt_Guardar.setEnabled(false);
        jtf_nuevo.setEnabled(true);
        jtf_editar.setEnabled(false);
        Jbt_Eliminar.setEnabled(false);
        jtf_salir.setEnabled(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jCalendar1 = new com.toedter.calendar.JCalendar();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        Jtf_Id = new javax.swing.JTextField();
        Jbt_Guardar = new javax.swing.JButton();
        Jtf_Nombre_Empresa = new javax.swing.JTextField();
        Jtf_Direccion = new javax.swing.JTextField();
        jtf_Rtn = new javax.swing.JTextField();
        Jbt_Eliminar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaproveedor = new javax.swing.JTable();
        jtf_editar = new javax.swing.JButton();
        jtf_nuevo = new javax.swing.JButton();
        jtf_salir = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        buscar_txt = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        jButton9 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 102, 0));

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Trebuchet MS", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("PROVEEDORES");

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("DATOS DEL PROVEEDOR"));
        jPanel2.setForeground(new java.awt.Color(0, 0, 255));

        jLabel2.setText("Id_Proveedor");

        jLabel3.setText("Nombre_Empresa");

        jLabel4.setText("Direccion");

        jLabel5.setText("RTN");

        Jtf_Id.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Jtf_IdActionPerformed(evt);
            }
        });
        Jtf_Id.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                Jtf_IdKeyTyped(evt);
            }
        });

        Jbt_Guardar.setBackground(new java.awt.Color(0, 255, 153));
        Jbt_Guardar.setForeground(new java.awt.Color(0, 0, 204));
        Jbt_Guardar.setText("GUARDAR");
        Jbt_Guardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Jbt_GuardarActionPerformed(evt);
            }
        });

        Jtf_Nombre_Empresa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Jtf_Nombre_EmpresaActionPerformed(evt);
            }
        });
        Jtf_Nombre_Empresa.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                Jtf_Nombre_EmpresaKeyTyped(evt);
            }
        });

        Jtf_Direccion.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                Jtf_DireccionKeyTyped(evt);
            }
        });

        jtf_Rtn.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtf_RtnKeyTyped(evt);
            }
        });

        Jbt_Eliminar.setBackground(new java.awt.Color(0, 255, 153));
        Jbt_Eliminar.setForeground(new java.awt.Color(0, 0, 204));
        Jbt_Eliminar.setText("ELIMINAR");
        Jbt_Eliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Jbt_EliminarActionPerformed(evt);
            }
        });

        tablaproveedor.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(tablaproveedor);

        jtf_editar.setBackground(new java.awt.Color(0, 255, 102));
        jtf_editar.setForeground(new java.awt.Color(0, 0, 204));
        jtf_editar.setText("EDITAR");
        jtf_editar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtf_editarActionPerformed(evt);
            }
        });

        jtf_nuevo.setBackground(new java.awt.Color(0, 255, 102));
        jtf_nuevo.setForeground(new java.awt.Color(0, 0, 204));
        jtf_nuevo.setText("NUEVO");
        jtf_nuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtf_nuevoActionPerformed(evt);
            }
        });

        jtf_salir.setBackground(new java.awt.Color(0, 255, 102));
        jtf_salir.setForeground(new java.awt.Color(0, 0, 255));
        jtf_salir.setText("SALIR");
        jtf_salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtf_salirActionPerformed(evt);
            }
        });

        jButton4.setBackground(new java.awt.Color(51, 255, 102));
        jButton4.setForeground(new java.awt.Color(0, 0, 255));
        jButton4.setText("INICIO");

        jButton5.setBackground(new java.awt.Color(51, 255, 102));
        jButton5.setForeground(new java.awt.Color(0, 0, 255));
        jButton5.setText("REGISTRAR EMPLEADOS");

        jButton6.setBackground(new java.awt.Color(51, 255, 102));
        jButton6.setForeground(new java.awt.Color(0, 0, 204));
        jButton6.setText("REGISTRAR CLIENTES");

        jButton7.setBackground(new java.awt.Color(0, 255, 102));
        jButton7.setForeground(new java.awt.Color(0, 0, 255));
        jButton7.setText("REGISTRAR FACTURA VENTA");

        jButton8.setBackground(new java.awt.Color(51, 255, 51));
        jButton8.setForeground(new java.awt.Color(0, 51, 204));
        jButton8.setText("REGISTRAR FACTURA COMPRA");

        jButton1.setText("Buscar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("ATRAS");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("< Anterior");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton9.setText("Siguiente >");
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton9)
                        .addGap(177, 177, 177))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(180, 180, 180)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel5))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Jtf_Id, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Jtf_Nombre_Empresa, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jtf_Rtn, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(221, 221, 221)
                                .addComponent(jLabel4)
                                .addGap(18, 18, 18)
                                .addComponent(Jtf_Direccion, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton2)
                            .addComponent(jtf_editar)
                            .addComponent(Jbt_Guardar)
                            .addComponent(jtf_nuevo)
                            .addComponent(Jbt_Eliminar)
                            .addComponent(jtf_salir))))
                .addGap(76, 76, 76))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jButton4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton7)
                .addGap(18, 18, 18)
                .addComponent(jButton8)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 565, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(buscar_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton1)))
                .addGap(107, 107, 107))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton4)
                    .addComponent(jButton5)
                    .addComponent(jButton6)
                    .addComponent(jButton7)
                    .addComponent(jButton8))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buscar_txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton3)
                            .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton9))
                        .addGap(18, 18, 18)
                        .addComponent(Jbt_Guardar)
                        .addGap(26, 26, 26)
                        .addComponent(jtf_nuevo)
                        .addGap(18, 18, 18)
                        .addComponent(jtf_editar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 10, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(Jtf_Id, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Jtf_Nombre_Empresa, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(25, 25, 25)))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addGap(60, 60, 60)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Jtf_Direccion, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4)))
                    .addComponent(jtf_Rtn, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addComponent(jButton2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Jbt_Eliminar)
                        .addGap(18, 18, 18)
                        .addComponent(jtf_salir)))
                .addContainerGap(78, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 22, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        // TODO add your handling code here:
      
    }//GEN-LAST:event_jButton9ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
       
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        menuPrincipal menu = new menuPrincipal();
        menu.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        mostrardatos(buscar_txt.getText());
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jtf_salirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtf_salirActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_jtf_salirActionPerformed

    private void jtf_nuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtf_nuevoActionPerformed
        // TODO add your handling code here:
        this.Jtf_Id.setText("");
        this.Jtf_Nombre_Empresa.setText("");
        this.jtf_Rtn.setText("");
        this.Jtf_Direccion.setText("");

        this.Jtf_Id.grabFocus();
        desbloquear();
    }//GEN-LAST:event_jtf_nuevoActionPerformed

    private void jtf_editarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtf_editarActionPerformed
        // TODO add your handling code here:
        ConexionSQL cc = new ConexionSQL();
        Connection cn = cc.getConnection();

        try{
            PreparedStatement pst = cn.prepareStatement("UPDATE proveedor SET Empresa_id='"+Jtf_Id.getText()+"'Nombre_Empresa='"+Jtf_Nombre_Empresa.getText()+"'Direccion_Empresa='"+Jtf_Direccion.getText()+"'rtn_empresa='"+jtf_Rtn.getText()+"'WHERE Empresa_id='"+id+"'");
            id = Jtf_Id.getText();
            pst.executeUpdate();

            mostrardatos("");
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }//GEN-LAST:event_jtf_editarActionPerformed

    private void Jbt_EliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Jbt_EliminarActionPerformed
        // TODO add your handling code here:
        ConexionSQL cc = new ConexionSQL();
        Connection cn = cc.getConnection();
        int fila = tablaproveedor.getSelectedRow();
        String cod = "";
        cod = tablaproveedor.getValueAt(fila, 0).toString();

        try{
            PreparedStatement pst = cn.prepareStatement("DELETE FROM proveedor WHERE Empresa_id='"+cod+"'");
            pst.executeUpdate();
            mostrardatos("");
            int a = pst.executeUpdate();
            if(a>0){
                JOptionPane.showMessageDialog(null,"No se pudo eliminar");
                mostrardatos("");
            }else{
                JOptionPane.showMessageDialog(null, "Eliminacion exitosa");
            }
        }catch(Exception e){
        }
        bloquear();
        limpiar();
    }//GEN-LAST:event_Jbt_EliminarActionPerformed

    private void Jtf_Nombre_EmpresaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Jtf_Nombre_EmpresaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Jtf_Nombre_EmpresaActionPerformed

    private void Jbt_GuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Jbt_GuardarActionPerformed
        // TODO add your handling code here:
        ConexionSQL cc = new ConexionSQL();

        Connection cn = cc.getConnection();

    if(Jtf_Id.getText().equals("") || Jtf_Nombre_Empresa.getText().equals("") || Jtf_Direccion.getText().equals("") ||
                Jtf_Direccion.getText().equals("")){
           JOptionPane.showMessageDialog(null,"Hay campos que estan vacios. No pueden quedar asi ");
        }
        
        try{
            
            if(existeUsuario(Jtf_Id.getText())==0){
                
                
                
                
            
            PreparedStatement pst = cn.prepareStatement("INSERT INTO proveedor(Empresa_id,Nombre_Empresa,Direccion_Empresa,rtn_empresa) values(?,?,?,?)");
            pst.setString(1,Jtf_Id.getText());
            pst.setString(2,Jtf_Nombre_Empresa.getText());
            pst.setString(3,Jtf_Direccion.getText());
            pst.setString(4,jtf_Rtn.getText());

            int a = pst.executeUpdate();

            if(a>0){
                JOptionPane.showMessageDialog(null,"Registro Guardado con Exito");
                mostrardatos("");
            }else{
                JOptionPane.showMessageDialog(null, "Error al Agregar Registro");
            }
            }else{
                JOptionPane.showMessageDialog(null, "El usuario ya existe");
            }
        }catch(Exception e){

        }
    }//GEN-LAST:event_Jbt_GuardarActionPerformed

    
    private int existeUsuario(String usuario) {                                              
      
        ConexionSQL cc = new ConexionSQL();
        
        Connection cn = cc.getConnection();
        
        ResultSet rs = null;
        PreparedStatement ps = null;
        
        String sql = "SELECT count(Empresa_id) FROM proveedor WHERE Empresa_id = ?";
    
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
    
    private void Jtf_IdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Jtf_IdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Jtf_IdActionPerformed

    private void Jtf_IdKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Jtf_IdKeyTyped
        // TODO add your handling code here:
        char c = evt.getKeyChar();
        
        if(c<'0' || c>'9') evt.consume();
    }//GEN-LAST:event_Jtf_IdKeyTyped

    private void jtf_RtnKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtf_RtnKeyTyped
        // TODO add your handling code here:
        char c = evt.getKeyChar();
        
        if(c<'0' || c>'9') evt.consume();
    }//GEN-LAST:event_jtf_RtnKeyTyped

    private void Jtf_Nombre_EmpresaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Jtf_Nombre_EmpresaKeyTyped
        // TODO add your handling code here:
        char c = evt.getKeyChar();
        
        if((c<'a' || c>'z')&& (c<'A' || c>'Z')) evt.consume();
    }//GEN-LAST:event_Jtf_Nombre_EmpresaKeyTyped

    private void Jtf_DireccionKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Jtf_DireccionKeyTyped
        // TODO add your handling code here:
        char c = evt.getKeyChar();
        
        if((c<'a' || c>'z')&& (c<'A' || c>'Z')) evt.consume();
    }//GEN-LAST:event_Jtf_DireccionKeyTyped
    DefaultTableModel modelo = new DefaultTableModel();
   String id = "";
   
    
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
            java.util.logging.Logger.getLogger(frm_proveedores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frm_proveedores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frm_proveedores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frm_proveedores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frm_proveedores().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Jbt_Eliminar;
    private javax.swing.JButton Jbt_Guardar;
    private javax.swing.JTextField Jtf_Direccion;
    private javax.swing.JTextField Jtf_Id;
    private javax.swing.JTextField Jtf_Nombre_Empresa;
    private javax.swing.JTextField buscar_txt;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private com.toedter.calendar.JCalendar jCalendar1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jtf_Rtn;
    private javax.swing.JButton jtf_editar;
    private javax.swing.JButton jtf_nuevo;
    private javax.swing.JButton jtf_salir;
    private javax.swing.JTable tablaproveedor;
    // End of variables declaration//GEN-END:variables
}