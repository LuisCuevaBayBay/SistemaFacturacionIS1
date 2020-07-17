/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package producto;

import Clientes.RegistroClientes;
import Compra.ModeloCompra1;
import Conexiones.ConexionSQL;
import Empleados.RegistrarEmpleados;

import Proveedor.frm_proveedores;
import Venta.ModeloVenta;
import inicio_sesion.modelo.SqlUsuarios;
import inicio_sesion.modelo.usuarios;
import java.awt.Toolkit;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Calendar;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import menu.menuPrincipal;
import org.apache.log4j.*;
/**
 *
 * @author luisc
 */
public class Producto extends javax.swing.JFrame {

    /**
     * Creates new form Producto
     */
    final static org.apache.log4j.Logger logger = org.apache.log4j.Logger.getLogger(Producto.class);
    public Producto() {
        initComponents();
        mostrardatos("");
        PropertyConfigurator.configure("log4j.properties");
        this.setLocationRelativeTo(null);
        
        Calendar cal= Calendar.getInstance();
        String fecha;
        fecha = cal.get(Calendar.YEAR)+"-"+cal.get(Calendar.MONTH)+"-"+cal.get(Calendar.DATE);
        this.setIconImage(new ImageIcon(getClass().getResource("/imagenes/logo.png")).getImage());
    }
    
   
    void mostrardatos(String valor) {

        ConexionSQL cc = new ConexionSQL();
        Connection cn = cc.getConnection();
        DefaultTableModel modelo = new DefaultTableModel();
        modelo.addColumn("ID Producto");
        modelo.addColumn("Nombre Producto");
        modelo.addColumn("Precio");
        modelo.addColumn("Fecha Registro");

        tablaproducto.setModel(modelo);
        String sql = "";

        if (valor.equals("")) {
            sql = "SELECT * FROM productos";
        } else {

            sql = "SELECT * FROM productos Where(IdProducto='" + valor + "'OR Nombre='" + valor + "'OR Precio='" + valor + "')";
        }

        String[] datos = new String[4];
        try {
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(sql);

            while (rs.next()) {
                datos[0] = rs.getString(1);
                datos[1] = rs.getString(2);
                datos[2] = rs.getString(3);
                datos[3] = rs.getString(4);

                modelo.addRow(datos);
            }
            tablaproducto.setModel(modelo);
        } catch (SQLException e) {
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
        bindingGroup = new org.jdesktop.beansbinding.BindingGroup();

        jPopupMenu2 = new javax.swing.JPopupMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        id_producto_txt = new javax.swing.JTextField();
        nom_producto_txt = new javax.swing.JTextField();
        guardar_btn = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        edit_btn = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaproducto = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        buscar_btn = new javax.swing.JButton();
        buscar_txt = new javax.swing.JTextField();
        jButton10 = new javax.swing.JButton();
        jButton11 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        usuario = new javax.swing.JLabel();
        precio_double = new javax.swing.JFormattedTextField();
        jLabel6 = new javax.swing.JLabel();
        rSLabelFecha1 = new rojeru_san.RSLabelFecha();
        jLabel4 = new javax.swing.JLabel();
        rol = new javax.swing.JLabel();
        idp = new javax.swing.JLabel();

        jMenuItem1.setText("Modificar");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jPopupMenu2.add(jMenuItem1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("ID Producto");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 250, -1, -1));

        jLabel2.setText("Nombre");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 300, -1, -1));

        jLabel3.setText("Precio");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 350, -1, -1));

        id_producto_txt.setEditable(false);
        id_producto_txt.setBackground(new java.awt.Color(204, 204, 204));

        org.jdesktop.beansbinding.Binding binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, nom_producto_txt, org.jdesktop.beansbinding.ObjectProperty.create(), id_producto_txt, org.jdesktop.beansbinding.BeanProperty.create("nextFocusableComponent"));
        bindingGroup.addBinding(binding);

        id_producto_txt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                id_producto_txtActionPerformed(evt);
            }
        });
        id_producto_txt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                id_producto_txtKeyTyped(evt);
            }
        });
        getContentPane().add(id_producto_txt, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 240, 140, 30));

        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, precio_double, org.jdesktop.beansbinding.ObjectProperty.create(), nom_producto_txt, org.jdesktop.beansbinding.BeanProperty.create("nextFocusableComponent"));
        bindingGroup.addBinding(binding);

        nom_producto_txt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nom_producto_txtActionPerformed(evt);
            }
        });
        nom_producto_txt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                nom_producto_txtKeyTyped(evt);
            }
        });
        getContentPane().add(nom_producto_txt, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 290, 140, 32));

        guardar_btn.setBackground(new java.awt.Color(255, 255, 255));
        guardar_btn.setForeground(new java.awt.Color(255, 255, 255));
        guardar_btn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/guardar.jpg"))); // NOI18N
        guardar_btn.setBorder(null);
        guardar_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                guardar_btnActionPerformed(evt);
            }
        });
        getContentPane().add(guardar_btn, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 240, 60, 60));

        jButton2.setBackground(new java.awt.Color(255, 255, 255));
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/nuevo.jpg"))); // NOI18N
        jButton2.setBorder(null);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 240, 70, 60));

        edit_btn.setBackground(new java.awt.Color(255, 255, 255));
        edit_btn.setForeground(new java.awt.Color(255, 255, 255));
        edit_btn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/editar.jpg"))); // NOI18N
        edit_btn.setBorder(null);
        edit_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                edit_btnActionPerformed(evt);
            }
        });
        getContentPane().add(edit_btn, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 310, 70, 60));

        jButton6.setBackground(new java.awt.Color(255, 255, 255));
        jButton6.setForeground(new java.awt.Color(255, 255, 255));
        jButton6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/atras.jpg"))); // NOI18N
        jButton6.setBorder(null);
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 390, 70, 50));

        jButton7.setBackground(new java.awt.Color(255, 255, 255));
        jButton7.setForeground(new java.awt.Color(255, 255, 255));
        jButton7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/eliminar.jpg"))); // NOI18N
        jButton7.setBorder(null);
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton7, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 310, 70, 60));

        jButton4.setBackground(new java.awt.Color(255, 255, 255));
        jButton4.setForeground(new java.awt.Color(255, 255, 255));
        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/salir.jpg"))); // NOI18N
        jButton4.setBorder(null);
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 390, 70, 50));

        tablaproducto = new javax.swing.JTable(){
            public boolean isCellEditable(int rowIndex, int colIndex){
                return false;
            }
        };
        tablaproducto.setForeground(new java.awt.Color(0, 0, 204));
        tablaproducto.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        tablaproducto.setComponentPopupMenu(jPopupMenu2);
        tablaproducto.getTableHeader().setReorderingAllowed(false);
        tablaproducto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablaproductoMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tablaproducto);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, 745, 140));

        jButton1.setBackground(new java.awt.Color(0, 0, 153));
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Registrar Empleado");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 10, -1, -1));

        jButton3.setBackground(new java.awt.Color(0, 0, 204));
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setText("Registrar Cliente");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 10, -1, -1));

        jButton5.setBackground(new java.awt.Color(0, 0, 204));
        jButton5.setForeground(new java.awt.Color(255, 255, 255));
        jButton5.setText("Registrar Proveedor");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 10, -1, -1));

        jButton8.setBackground(new java.awt.Color(0, 0, 204));
        jButton8.setForeground(new java.awt.Color(255, 255, 255));
        jButton8.setText("Registrar Compra");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton8, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 10, -1, -1));

        jButton9.setBackground(new java.awt.Color(0, 0, 204));
        jButton9.setForeground(new java.awt.Color(255, 255, 255));
        jButton9.setText("Registrar Venta");
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton9, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 10, -1, -1));

        buscar_btn.setBackground(new java.awt.Color(0, 0, 153));
        buscar_btn.setForeground(new java.awt.Color(255, 255, 255));
        buscar_btn.setText("Buscar");
        buscar_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscar_btnActionPerformed(evt);
            }
        });
        getContentPane().add(buscar_btn, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 50, -1, 30));

        buscar_txt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscar_txtActionPerformed(evt);
            }
        });
        getContentPane().add(buscar_txt, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 50, 120, 30));

        jButton10.setBackground(new java.awt.Color(0, 0, 153));
        jButton10.setForeground(new java.awt.Color(255, 255, 255));
        jButton10.setText("Mostrar");
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton10, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 50, -1, 30));

        jButton11.setBackground(new java.awt.Color(0, 0, 153));
        jButton11.setForeground(new java.awt.Color(255, 255, 255));
        jButton11.setText("Inicio");
        jButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton11ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton11, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, -1));

        jLabel5.setText("Usuario: ");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, 50, 20));
        getContentPane().add(usuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(74, 50, 80, 20));

        precio_double.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0.00"))));
        precio_double.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                precio_doubleActionPerformed(evt);
            }
        });
        getContentPane().add(precio_double, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 340, 140, 30));

        jLabel6.setText("Fecha Registro:");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 400, -1, -1));

        rSLabelFecha1.setForeground(new java.awt.Color(0, 0, 0));
        rSLabelFecha1.setFormato("yyyy-MM-dd");
        getContentPane().add(rSLabelFecha1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 390, 110, -1));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/verde3.jpg"))); // NOI18N
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 770, 470));
        getContentPane().add(rol, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 60, 60, 20));
        getContentPane().add(idp, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 60, -1, -1));

        bindingGroup.bind();

        pack();
    }// </editor-fold>//GEN-END:initComponents

    void limpiar() {
        id_producto_txt.setText("");
        nom_producto_txt.setText("");
        precio_double.setText("");
    }

    void desbloquear() {
        id_producto_txt.setEnabled(true);
        nom_producto_txt.setEnabled(true);
        precio_double.setEnabled(true);
        guardar_btn.setEnabled(true);
        jButton2.setEnabled(true);
        jButton7.setEnabled(true);

    }

    void bloquear() {
        id_producto_txt.setEnabled(false);
        nom_producto_txt.setEnabled(false);
        precio_double.setEnabled(false);
        guardar_btn.setEnabled(false);
        jButton2.setEnabled(true);
        jButton7.setEnabled(false);
        jButton6.setEnabled(true);
        jButton4.setEnabled(true);
    }


    private void guardar_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_guardar_btnActionPerformed
        // TODO add your handling code here:

        ConexionSQL cc = new ConexionSQL();
        Connection cn = cc.getConnection();

        if (nom_producto_txt.getText().equals("") || precio_double.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Hay Campos que estan vacios debe llenar todos los campos");
            logger.debug("los campos no pueden ir vacios");
        } else {
            if (precio_double.getText().startsWith("1") || precio_double.getText().startsWith("2") || precio_double.getText().startsWith("3") || precio_double.getText().startsWith("4")
                    || precio_double.getText().startsWith("5") || precio_double.getText().startsWith("6") || precio_double.getText().startsWith("7") || precio_double.getText().startsWith("8")
                    || precio_double.getText().startsWith("9")) {
                
                
                try {
                    PreparedStatement pst = cn.prepareStatement("INSERT INTO `productos` (`IdProducto`, `Nombre`, `Precio`,`fecha_registro`) VALUES (NULL, ?, ?, ?)");
                    
                    pst.setString(1, nom_producto_txt.getText());
                    pst.setString(2, precio_double.getText());
                    pst.setString(3, rSLabelFecha1.getFecha());

                    int a = pst.executeUpdate();

                    if (a > 0) {
                        JOptionPane.showMessageDialog(null, "Registro Exitoso");
                        logger.debug("El registro se guardo exitosamente");
                        limpiar();
                        mostrardatos("");

                    } else {
                        JOptionPane.showMessageDialog(null, "Error al Agregar");
                        logger.debug("Error al agregar");
                    }
                } catch (Exception e) {
                }
                
        }else{
                JOptionPane.showMessageDialog(null, "El precio no debe de ser 0");
                logger.debug("El precio no puede ser 0");
            }
                }
        limpiar();

    }//GEN-LAST:event_guardar_btnActionPerformed
    String id = "";
    private void edit_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_edit_btnActionPerformed
        // TODO add your handling code here:
        ConexionSQL cc = new ConexionSQL();
        Connection cn = cc.getConnection();
        if (id_producto_txt.getText().equals("") || nom_producto_txt.getText().equals("") || precio_double.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Hay Campos que estan vacios debe llenar todos los campos");
            logger.debug("los campos no pueden ir vacios");
        } else {

            try {
                PreparedStatement pst = cn.prepareStatement("UPDATE productos SET IdProducto='" + id_producto_txt.getText() + "',Nombre='" + nom_producto_txt.getText() + "',Precio='" + precio_double.getText() + "'WHERE IdProducto='" + id + "'");
                id = id_producto_txt.getText();
                pst.executeUpdate();
                JOptionPane.showMessageDialog(null, "Se a modificado con exito");
                logger.debug("Se edito el campo con exito");
                limpiar();
                mostrardatos("");

            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
        
    }//GEN-LAST:event_edit_btnActionPerformed
    public Icon icono(String path, int width, int height){
        Icon img = new ImageIcon(new ImageIcon(getClass().getResource(path)).getImage().
                getScaledInstance(width,height,java.awt.Image.SCALE_SMOOTH));
        return img;
    }
    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        // TODO add your handling code here:
        Object[] options = {"SI", "NO"};
        int i = JOptionPane.showOptionDialog(null, "Esta seguro que desea eliminar el registro?","Seleccione una opcion",JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, icono("/Imagenes/logo.png", 40, 40),  options, options[0]);
        ConexionSQL cc = new ConexionSQL();
        Connection cn = cc.getConnection();

        int fila = tablaproducto.getSelectedRow();
        String cod = "";
        cod = tablaproducto.getValueAt(fila, 0).toString();
        if (i == 0) {
            try {
                PreparedStatement pst = cn.prepareStatement("DELETE FROM productos WHERE IdProducto='" + cod + "'");
                pst.executeUpdate();
                mostrardatos("");
                int a = pst.executeUpdate();
                if (a > 0) {
                    JOptionPane.showMessageDialog(null, "No se pudo Eliminar");
                    logger.debug("Error al eliminar el campo");
                } else {
                    JOptionPane.showMessageDialog(null, "Eliminacion Exitosa");
                    logger.debug("Eliminacion Exitosa");
                }
            } catch (Exception e) {

            }
        }
            limpiar();
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here
        SqlUsuarios modSql = new SqlUsuarios();
         usuarios mod = new usuarios();
          menuPrincipal mp = new menuPrincipal();
         mp.setVisible(true);
        
          menuPrincipal.nombre.setText(usuario.getText());
          menuPrincipal.rol.setText(rol.getText());
          menuPrincipal.idv.setText(idp.getText());
        this.dispose();
        logger.debug("Vuelve al menu principal: "+usuario.getText());
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        logger.debug("Sale del sistema");
        System.exit(0);
    }//GEN-LAST:event_jButton4ActionPerformed


    private void tablaproductoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaproductoMouseClicked
        int fila = tablaproducto.getSelectedRow();
        if (fila >= 0) {
            id_producto_txt.setText(tablaproducto.getValueAt(fila, 0).toString());
            nom_producto_txt.setText(tablaproducto.getValueAt(fila, 1).toString());
            precio_double.setText(tablaproducto.getValueAt(fila, 2).toString());
            id = tablaproducto.getValueAt(fila, 0).toString();
        } else {
            JOptionPane.showMessageDialog(null, "No se Encontro Fila");
        }
    }//GEN-LAST:event_tablaproductoMouseClicked

    private void buscar_txtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscar_txtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_buscar_txtActionPerformed

    private void buscar_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscar_btnActionPerformed
        // TODO add your handling code here:
        logger.debug("busca los datos");
        mostrardatos(buscar_txt.getText());
    }//GEN-LAST:event_buscar_btnActionPerformed

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
        // TODO add your handling code here:
        logger.debug("vuelve a mostrar los valores de la tabla");
        mostrardatos("");
    }//GEN-LAST:event_jButton10ActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        // TODO add your handling code here:
        int fila = tablaproducto.getSelectedRow();
        if (fila >= 0) {
            id_producto_txt.setText(tablaproducto.getValueAt(fila, 0).toString());
            nom_producto_txt.setText(tablaproducto.getValueAt(fila, 1).toString());
            precio_double.setText(tablaproducto.getValueAt(fila, 2).toString());
            id = tablaproducto.getValueAt(fila, 0).toString();
        } else {
            JOptionPane.showMessageDialog(null, "No se Encontro Fila");
        }
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void id_producto_txtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_id_producto_txtActionPerformed
        // TODO add your handling code here:char c = evt.getKeyChar();


    }//GEN-LAST:event_id_producto_txtActionPerformed

    private void id_producto_txtKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_id_producto_txtKeyTyped
        // TODO add your handling code here:
        char c = evt.getKeyChar();

        if (c < '0' || c > '9') {
            evt.consume();
        }

        if (id_producto_txt.getText().length() >= 5) {
            evt.consume();
            Toolkit.getDefaultToolkit().beep();
        }
    }//GEN-LAST:event_id_producto_txtKeyTyped

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        logger.debug("se limpian los campos");
        limpiar();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        logger.debug("Entra a la pantalla de registro de Cliente");
        RegistroClientes rc = new RegistroClientes();
        rc.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        logger.debug("Entra a la pantalla de registrar Empleados");
        RegistrarEmpleados re = new RegistrarEmpleados();
        re.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
        logger.debug("Entra a la ventana de proveedores");
        frm_proveedores fp = new frm_proveedores();
        fp.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        // TODO add your handling code here:
        logger.debug("Entra a la ventana de compras");
        ModeloCompra1 mc = new ModeloCompra1();
        mc.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        // TODO add your handling code here:
        logger.debug("Entra a la ventana de Ventas");
        ModeloVenta mv = new ModeloVenta();
        mv.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton9ActionPerformed

    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton11ActionPerformed
        // TODO add your handling code here:
        logger.debug("Vuelve al menu principal");
        menuPrincipal mp = new menuPrincipal();
        mp.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton11ActionPerformed

    private void nom_producto_txtKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_nom_producto_txtKeyTyped
        // TODO add your handling code here:
       

        

        if (nom_producto_txt.getText().length() >= 25) {
            evt.consume();
            Toolkit.getDefaultToolkit().beep();
        }
    }//GEN-LAST:event_nom_producto_txtKeyTyped

    private void precio_doubleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_precio_doubleActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_precio_doubleActionPerformed

    private void nom_producto_txtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nom_producto_txtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nom_producto_txtActionPerformed

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
            java.util.logging.Logger.getLogger(Producto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Producto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Producto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Producto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Producto().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buscar_btn;
    private javax.swing.JTextField buscar_txt;
    private javax.swing.JButton edit_btn;
    private javax.swing.JButton guardar_btn;
    private javax.swing.JTextField id_producto_txt;
    public static javax.swing.JLabel idp;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JPopupMenu jPopupMenu2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField nom_producto_txt;
    private javax.swing.JFormattedTextField precio_double;
    private rojeru_san.RSLabelFecha rSLabelFecha1;
    public static javax.swing.JLabel rol;
    private javax.swing.JTable tablaproducto;
    public static javax.swing.JLabel usuario;
    private org.jdesktop.beansbinding.BindingGroup bindingGroup;
    // End of variables declaration//GEN-END:variables
}
