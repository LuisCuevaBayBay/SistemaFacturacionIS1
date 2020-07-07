package contactos.contacto_cliente;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import Clientes.RegistroClientes;
import Clientes.datos;
import Conexiones.ConexionSQL;
import Empleados.RegistrarEmpleados;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import org.apache.log4j.*;
/**
 *
 * @author LENOVO
 */
public final class ContactoC extends javax.swing.JFrame {

    /**
     *
     */
     final static org.apache.log4j.Logger logger = org.apache.log4j.Logger.getLogger(ContactoC.class);
    public ContactoC() {
        initComponents();
        PropertyConfigurator.configure("log4j.properties");
        this.setLocationRelativeTo(null);
        mostrardatos("");
    }

    void mostrardatos(String valor) {
        ConexionSQL cc = new ConexionSQL();
        Connection cn = cc.getConnection();
        DefaultTableModel modelo = new DefaultTableModel();

        modelo.addColumn("Id");
        modelo.addColumn("Extencion Numerica");
        modelo.addColumn("Numero Telefonico");
        modelo.addColumn("Numero Celuar");
        modelo.addColumn("Correo electronico");

        tabla1.setModel(modelo);
        String sql = "";
        if (valor.equals("")) {
            sql = "SELECT * FROM contacto_cliente";
        } else {
            sql = "SELECT * FROM contacto_cliente WHERE (ID_Contacto_Proveedor='" + valor + "' OR extension='" + valor + "'OR num_Telefonica='" + valor + "' OR Celular='" + valor + "'OR correo='" + valor + "')";
        }

        String[] datos = new String[5];
        try {
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                datos[0] = rs.getString(1);
                datos[1] = rs.getString(2);
                datos[2] = rs.getString(3);
                datos[3] = rs.getString(4);
                datos[4] = rs.getString(5);

                modelo.addRow(datos);
            }
            tabla1.setModel(modelo);
        } catch (SQLException ex) {
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
        bindingGroup = new org.jdesktop.beansbinding.BindingGroup();

        jPopupMenu1 = new javax.swing.JPopupMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jTextField02 = new javax.swing.JTextField();
        correos = new javax.swing.JTextField();
        num_celular = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        tabla1 = new javax.swing.JTable();
        jButton5 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        contacto = new javax.swing.JTextField();
        extension = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jToggleButton1 = new javax.swing.JToggleButton();
        jToggleButton2 = new javax.swing.JToggleButton();
        num_telefonico = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        usuario = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        rol = new javax.swing.JLabel();
        idcc = new javax.swing.JLabel();

        jMenuItem1.setText("Modificar");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jPopupMenu1.add(jMenuItem1);

        jMenuItem2.setText("Eliminar\n");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jPopupMenu1.add(jMenuItem2);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("Contacto Cliente");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(302, 11, -1, -1));

        jLabel2.setText("Número Telefónico");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 290, -1, -1));

        jLabel3.setText("Extención Numérica");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 240, -1, -1));

        jLabel4.setText("Correo Electrónico");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 330, -1, -1));

        jLabel5.setText("Número Celúlar");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 380, -1, -1));

        jButton1.setBackground(new java.awt.Color(0, 0, 153));
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Guardar");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 213, -1, 30));

        jButton3.setBackground(new java.awt.Color(0, 0, 153));
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setText("Mostrar");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 40, -1, -1));

        jButton4.setBackground(new java.awt.Color(0, 0, 153));
        jButton4.setForeground(new java.awt.Color(255, 255, 255));
        jButton4.setText("Buscar");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 40, 69, -1));

        jTextField02.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField02ActionPerformed(evt);
            }
        });
        jTextField02.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField02KeyTyped(evt);
            }
        });
        getContentPane().add(jTextField02, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 40, 97, -1));

        org.jdesktop.beansbinding.Binding binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, num_celular, org.jdesktop.beansbinding.ObjectProperty.create(), correos, org.jdesktop.beansbinding.BeanProperty.create("nextFocusableComponent"));
        bindingGroup.addBinding(binding);

        correos.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                correosKeyTyped(evt);
            }
        });
        getContentPane().add(correos, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 330, 151, 30));

        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, jButton1, org.jdesktop.beansbinding.ObjectProperty.create(), num_celular, org.jdesktop.beansbinding.BeanProperty.create("nextFocusableComponent"));
        bindingGroup.addBinding(binding);

        num_celular.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                num_celularKeyTyped(evt);
            }
        });
        getContentPane().add(num_celular, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 380, 108, 30));

        tabla1 = new javax.swing.JTable(){
            public boolean isCellEditable(int rowIndex, int colIndex){
                return false;
            }
        };
        tabla1.setBackground(new java.awt.Color(0, 0, 153));
        tabla1.setForeground(new java.awt.Color(255, 255, 255));
        tabla1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        tabla1.setComponentPopupMenu(jPopupMenu1);
        tabla1.getTableHeader().setReorderingAllowed(false);
        tabla1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabla1MouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tabla1);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(121, 64, 546, 121));

        jButton5.setBackground(new java.awt.Color(0, 0, 153));
        jButton5.setForeground(new java.awt.Color(255, 255, 255));
        jButton5.setText("Editar");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 250, 69, -1));

        jLabel6.setText("ID Contacto");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 200, -1, -1));

        contacto.setEditable(false);
        contacto.setBackground(new java.awt.Color(204, 204, 204));

        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, extension, org.jdesktop.beansbinding.ObjectProperty.create(), contacto, org.jdesktop.beansbinding.BeanProperty.create("nextFocusableComponent"));
        bindingGroup.addBinding(binding);

        contacto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                contactoActionPerformed(evt);
            }
        });
        contacto.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                contactoKeyTyped(evt);
            }
        });
        getContentPane().add(contacto, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 200, 105, 30));

        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, num_telefonico, org.jdesktop.beansbinding.ObjectProperty.create(), extension, org.jdesktop.beansbinding.BeanProperty.create("nextFocusableComponent"));
        bindingGroup.addBinding(binding);

        extension.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                extensionKeyTyped(evt);
            }
        });
        getContentPane().add(extension, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 240, 105, 30));

        jButton2.setBackground(new java.awt.Color(0, 0, 153));
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Eliminar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 280, -1, -1));

        jToggleButton1.setBackground(new java.awt.Color(0, 153, 204));
        jToggleButton1.setForeground(new java.awt.Color(255, 255, 255));
        jToggleButton1.setText("Atrás");
        jToggleButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jToggleButton1MouseClicked(evt);
            }
        });
        jToggleButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jToggleButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 390, -1, -1));

        jToggleButton2.setBackground(new java.awt.Color(0, 0, 153));
        jToggleButton2.setForeground(new java.awt.Color(255, 255, 255));
        jToggleButton2.setText("Nuevo");
        jToggleButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jToggleButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 310, -1, -1));

        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, correos, org.jdesktop.beansbinding.ObjectProperty.create(), num_telefonico, org.jdesktop.beansbinding.BeanProperty.create("nextFocusableComponent"));
        bindingGroup.addBinding(binding);

        num_telefonico.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                num_telefonicoKeyTyped(evt);
            }
        });
        getContentPane().add(num_telefonico, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 290, 100, 30));

        jLabel8.setText("Usuario: ");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, -1, -1));
        getContentPane().add(usuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 30, 70, 20));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/verde3.jpg"))); // NOI18N
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 440));
        getContentPane().add(rol, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, 40, 30));
        getContentPane().add(idcc, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 40, -1, -1));

        bindingGroup.bind();

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1MouseClicked


    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        ConexionSQL cc = new ConexionSQL();
        Connection cn = cc.getConnection();

        if (extension.getText().equals("") || num_telefonico.getText().equals("") || correos.getText().equals("") || num_celular.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Hay campos  vacios, debe llenar todos los campos");
            logger.debug("los campos no pueden ir vacios");
        } else {

            if (esEmail(correos.getText())) {

                if (existeUsuario(contacto.getText()) == 0) {

                    if (existeCorreo(correos.getText()) == 0) {

                        if (existeTel(num_telefonico.getText()) == 0) {

                            if (existeNum(num_celular.getText()) == 0) {
                                if (num_celular.getText().length() >= 8) {
                                    if (num_telefonico.getText().length() >= 8) {
                                        if (extension.getText().length() >= 3) {
                                            if (num_telefonico.getText().startsWith("2")) {
                                                    if(num_celular.getText().startsWith("3") || num_celular.getText().startsWith("8") ||num_celular.getText().startsWith("9")){

                                            try {

                                                PreparedStatement pst = cn.prepareStatement("INSERT INTO `contacto_cliente` (`ID_Contacto_Proveedor`, `extension`, `num_Telefonica`, `Celular`, `correo`) VALUES (NULL, ?, ?, ?, ?)");
                                                
                                                pst.setString(1, extension.getText());
                                                pst.setString(2, num_telefonico.getText());
                                                pst.setString(3, num_celular.getText());
                                                pst.setString(4, correos.getText());
                                                

                                                int a = pst.executeUpdate();
                                                if (a > 0) {
                                                    JOptionPane.showMessageDialog(null, "Registro exitoso");
                                                    logger.debug("Registro guardado exitosamente");
                                                    mostrardatos("");
                                                } else {
                                                    JOptionPane.showMessageDialog(null, "Error al agregar");
                                                    logger.debug("Error, no se guardo el contacto");
                                                }

                                            } catch (Exception e) {
                                                logger.error("Error: "+e.getMessage());

                                            }
                                                    }else{
                                                        JOptionPane.showMessageDialog(null, "Numero celular debe empezar 3, 8 o 9");
                                                        logger.debug("Error, inserto un numero de celular que no empieza con 3, 8 o 9");
                                                    }
                                        } else {
                                            JOptionPane.showMessageDialog(null, "Numero telefonico debe empezar con 2");
                                            logger.debug("Error, inserto un numero de telefono que no empieza con 2");
                                        }
                                                    
                                            }else{
                                                
                                                JOptionPane.showMessageDialog(null,"La casilla de extencion es de 3 caracteres");
                                                logger.debug("Error, inserto una extension con menos de 3 catacteres");
                                            }
                                        
                                                        
                                    } else {
                                        JOptionPane.showMessageDialog(null, "La casilla de numero telefonico es de 8 caracteres");
                                        logger.debug("Error, inserto un numero de telefono con menos de 8 caracteres");
                                    }

                                } else {
                                    JOptionPane.showMessageDialog(null, "La casilla de numero celular es de 8 caracteres");
                                    logger.debug("Error, inserto un numero de celular con menos de 8 caracteres");

                                }

                            } else {
                                JOptionPane.showMessageDialog(null, "El Numero de Celular ya existe");
                                logger.debug("Error, inserto un numero de celular que ya existia");
                            }

                        } else {
                            JOptionPane.showMessageDialog(null, "El Numero de Telefono ya existe");
                            logger.debug("Error, inserto un numero de telefono ya existente");
                        }

                    } else {
                        JOptionPane.showMessageDialog(null, "El correo ya existe");
                        logger.debug("Error, inserto un correo ya existente");
                    }

                } else {
                    JOptionPane.showMessageDialog(null, "El usuario ya existe");
                    logger.debug("Error, inserto un id ya existente");

                }
            } else {
                JOptionPane.showMessageDialog(null, "El correo es invalido. Ejemplo: nombre.apellido@gmail.com");
                logger.debug("Error, inserto un correo invalido");
            }

        } 
        contacto.setText("");
        extension.setText("");
        num_telefonico.setText("");
        correos.setText("");
        num_celular.setText("");
        nuevo();// TODO // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        logger.debug("Vuelve a mostrar los valores de la tabla");
        mostrardatos("");
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        logger.debug("Muestra los datos");
        mostrardatos(jTextField02.getText());
    }//GEN-LAST:event_jButton4ActionPerformed

    public int existeUsuario(String usuario) {

        ResultSet rs = null;
        PreparedStatement ps = null;

        ConexionSQL cc = new ConexionSQL();
        Connection con = cc.getConnection();

        String sql = "SELECT count(ID_Contacto_Proveedor) FROM contacto_cliente WHERE ID_Contacto_Proveedor = ?";

        try {

            ps = con.prepareStatement(sql);
            ps.setString(1, usuario);
            rs = ps.executeQuery();

            if (rs.next()) {
                return rs.getInt(1);

            }

        } catch (SQLException ex) {

            return 1;

        }
        return 1;

    }

    public int existeCorreo(String correo) {

        ResultSet rs = null;
        PreparedStatement ps = null;

        ConexionSQL cc = new ConexionSQL();
        Connection con = cc.getConnection();

        String sql = "SELECT count(ID_Contacto_Proveedor) FROM contacto_cliente WHERE correo = ?";

        try {

            ps = con.prepareStatement(sql);
            ps.setString(1, correo);
            rs = ps.executeQuery();

            if (rs.next()) {
                return rs.getInt(1);

            }

        } catch (SQLException ex) {

            return 1;

        }
        return 1;

    }

    public int existeTel(String telefono) {

        ResultSet rs = null;
        PreparedStatement ps = null;

        ConexionSQL cc = new ConexionSQL();
        Connection con = cc.getConnection();

        String sql = "SELECT count(ID_Contacto_Proveedor) FROM contacto_cliente WHERE num_Telefonica = ?";

        try {

            ps = con.prepareStatement(sql);
            ps.setString(1, telefono);
            rs = ps.executeQuery();

            if (rs.next()) {
                return rs.getInt(1);

            }

        } catch (SQLException ex) {

            return 1;

        }
        return 1;

    }

    public int existeNum(String num) {

        ResultSet rs = null;
        PreparedStatement ps = null;

        ConexionSQL cc = new ConexionSQL();
        Connection con = cc.getConnection();

        String sql = "SELECT count(ID_Contacto_Proveedor) FROM contacto_cliente WHERE Celular = ?";

        try {

            ps = con.prepareStatement(sql);
            ps.setString(1, num);
            rs = ps.executeQuery();

            if (rs.next()) {
                return rs.getInt(1);

            }

        } catch (SQLException ex) {

            return 1;

        }
        return 1;

    }

    public boolean esEmail(String correo) {

        Pattern pattern = Pattern.compile("^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)@"
                + "[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$");

        Matcher matcher = pattern.matcher(correo);
        return matcher.find();
    }

    String id = "";
    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        int fila = tabla1.getSelectedRow();
        if (fila >= 0) {

            contacto.setText(tabla1.getValueAt(fila, 0).toString());
            extension.setText(tabla1.getValueAt(fila, 1).toString());
            num_telefonico.setText(tabla1.getValueAt(fila, 2).toString());
            correos.setText(tabla1.getValueAt(fila, 4).toString());
            num_celular.setText(tabla1.getValueAt(fila, 3).toString());
            id = tabla1.getValueAt(fila, 0).toString();

        } else {
            JOptionPane.showMessageDialog(null, "No se encontro fila");
        }
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        ConexionSQL cc = new ConexionSQL();
        Connection cn = cc.getConnection();

        if (contacto.getText().equals("") || extension.getText().equals("") || num_telefonico.getText().equals("") || correos.getText().equals("") || num_celular.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Hay campos  vacios, debe llenar todos los campos");
        } else {

            if (esEmail(correos.getText())) {
                if (num_celular.getText().length() >= 8) {
                    if (num_telefonico.getText().length() >= 8) {
                        if (extension.getText().length() >= 3) {

                            try {
                                PreparedStatement pst = cn.prepareStatement("UPDATE contacto_cliente  SET  ID_Contacto_Proveedor='" + contacto.getText() + "'  ,extension='" + extension.getText() + "', num_Telefonica='" + num_telefonico.getText() + "',Celular='" + num_celular.getText() + "',correo='" + correos.getText() + "' WHERE ID_Contacto_Proveedor='" + id + "' ");
                                id = contacto.getText();
                                pst.executeUpdate();
                                JOptionPane.showMessageDialog(null, "Se a modificado con exito");

                                mostrardatos("");
                            } catch (Exception e) {
                                System.out.print(e.getMessage());
                            }
                        } else {
                            JOptionPane.showMessageDialog(null, "La casilla de extencion es de 3 caracteres");
                        }

                    } else {
                        JOptionPane.showMessageDialog(null, "La casilla de numero telefonico es de 8 caracteres");
                    }

                } else {
                    JOptionPane.showMessageDialog(null, "La casilla de numero celular es de 8 caracteres");

                }

            } else {
                JOptionPane.showMessageDialog(null, "El correo es invalido. Ejemplo: nombre.apellido@gmail.com");
            }
        }
        nuevo();
    }//GEN-LAST:event_jButton5ActionPerformed

    public void nuevo() {
        extension.setText("");
        contacto.setText("");
        num_telefonico.setText("");
        correos.setText("");
        num_celular.setText("");

    }


    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        ConexionSQL cc = new ConexionSQL();
        Connection cn = cc.getConnection();
        int fila = tabla1.getSelectedRow();
        String cod = "";
        cod = tabla1.getValueAt(fila, 0).toString();
        try {
            PreparedStatement pst = cn.prepareStatement("DELETE FROM contacto_cliente  WHERE ID_Contacto_Proveedor='" + cod + "'");
            pst.executeUpdate();
            JOptionPane.showMessageDialog(null, "Se a eliminado con exito");
            mostrardatos("");// TODO add your handling code here:
        } catch (Exception e) {
        }
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void contactoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_contactoActionPerformed

    }//GEN-LAST:event_contactoActionPerformed

    private void jTextField02ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField02ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField02ActionPerformed
    
    
    public Icon icono(String path, int width, int height){
        Icon img = new ImageIcon(new ImageIcon(getClass().getResource(path)).getImage().
                getScaledInstance(width,height,java.awt.Image.SCALE_SMOOTH));
        return img;
    }
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        Object[] options = {"SI", "NO"};
        int i = JOptionPane.showOptionDialog(null, "Esta seguro que desea eliminar el registro?","Seleccione una opcion",JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, icono("/Imagenes/logo.png", 40, 40),  options, options[0]);
        ConexionSQL cc = new ConexionSQL();
        Connection cn = cc.getConnection();
        int fila = tabla1.getSelectedRow();
        String cod = "";
        cod = tabla1.getValueAt(fila, 0).toString();
        if (i == 0) { 
        try {
            PreparedStatement pst = cn.prepareStatement("DELETE FROM contacto_cliente  WHERE ID_Contacto_Proveedor='" + cod + "'");
            pst.executeUpdate();
            mostrardatos("");
            JOptionPane.showMessageDialog(null, "Se a eliminado con exito");// TODO add your handling code here:
        } catch (Exception e) {
        }
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jToggleButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jToggleButton1MouseClicked
        RegistroClientes rg = new RegistroClientes();
        RegistroClientes.usuario.setText(usuario.getText());
        RegistroClientes.rolC.setText(rol.getText());
        RegistroClientes.idc.setText(idcc.getText());
        rg.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jToggleButton1MouseClicked

    private void jToggleButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jToggleButton1ActionPerformed

    private void contactoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_contactoKeyTyped
        char c = evt.getKeyChar();
        if (c < '0' || c > '9') {
            evt.consume();
        }
        if (contacto.getText().length() >= 5) {
            evt.consume();

        }
    }//GEN-LAST:event_contactoKeyTyped

    private void extensionKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_extensionKeyTyped
        char c = evt.getKeyChar();
        if (c < '0' || c > '9') {
            evt.consume();
        }
        if (extension.getText().length() >= 3) {
            evt.consume();

        }
    }//GEN-LAST:event_extensionKeyTyped

    private void num_celularKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_num_celularKeyTyped
        char c = evt.getKeyChar();
        if (c < '0' || c > '9') {
            evt.consume();
        } else if (num_celular.getText().startsWith("1") || num_celular.getText().startsWith("2") || num_celular.getText().startsWith("4") || num_celular.getText().startsWith("5") || num_celular.getText().startsWith("6") || num_celular.getText().startsWith("7") || num_celular.getText().startsWith("0")) {
            JOptionPane.showMessageDialog(null, "El numero de celular tiene que comenzar con 3, 8 o 9");
        }
        if (num_celular.getText().length() >= 8) {
            evt.consume();

        }
    }//GEN-LAST:event_num_celularKeyTyped

    private void correosKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_correosKeyTyped
        if (correos.getText().length() >= 40) {
            evt.consume();
        } else if (correos.getText().length() == 39) {
            JOptionPane.showMessageDialog(null, "El limite de caracteres es de 40");
        }
    }//GEN-LAST:event_correosKeyTyped

    private void jTextField02KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField02KeyTyped


    }//GEN-LAST:event_jTextField02KeyTyped

    private void jToggleButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton2ActionPerformed
        contacto.setText("");
        extension.setText("");
        num_telefonico.setText("");
        correos.setText("");
        num_celular.setText("");

    }//GEN-LAST:event_jToggleButton2ActionPerformed


    private void tabla1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabla1MouseClicked
        int fila = tabla1.getSelectedRow();
        if (fila >= 0) {

            contacto.setText(tabla1.getValueAt(fila, 0).toString());
            extension.setText(tabla1.getValueAt(fila, 1).toString());
            num_telefonico.setText(tabla1.getValueAt(fila, 2).toString());
            correos.setText(tabla1.getValueAt(fila, 4).toString());
            num_celular.setText(tabla1.getValueAt(fila, 3).toString());
            id = tabla1.getValueAt(fila, 0).toString();

        } else {
            JOptionPane.showMessageDialog(null, "No se encontro fila");
        }
    }//GEN-LAST:event_tabla1MouseClicked

    private void num_telefonicoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_num_telefonicoKeyTyped
        // TODO add your handling code here:
        char c = evt.getKeyChar();
        if (c < '0' || c > '9') {
            evt.consume();
        } else if (num_telefonico.getText().startsWith("1") || num_telefonico.getText().startsWith("3") || num_telefonico.getText().startsWith("4") || num_telefonico.getText().startsWith("5") || num_telefonico.getText().startsWith("6") || num_telefonico.getText().startsWith("7") || num_telefonico.getText().startsWith("8") || num_telefonico.getText().startsWith("9") || num_telefonico.getText().startsWith("0")) {
            JOptionPane.showMessageDialog(null, "El numero de celular tiene que comenzar con 2");
        }
        if (num_telefonico.getText().length() >= 8) {
            evt.consume();

        }

    }//GEN-LAST:event_num_telefonicoKeyTyped

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
            java.util.logging.Logger.getLogger(ContactoC.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ContactoC.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ContactoC.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ContactoC.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ContactoC().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField contacto;
    private javax.swing.JTextField correos;
    private javax.swing.JTextField extension;
    public static javax.swing.JLabel idcc;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JPopupMenu jPopupMenu1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField jTextField02;
    private javax.swing.JToggleButton jToggleButton1;
    private javax.swing.JToggleButton jToggleButton2;
    private javax.swing.JTextField num_celular;
    private javax.swing.JTextField num_telefonico;
    public static javax.swing.JLabel rol;
    private javax.swing.JTable tabla1;
    public static javax.swing.JLabel usuario;
    private org.jdesktop.beansbinding.BindingGroup bindingGroup;
    // End of variables declaration//GEN-END:variables

}
