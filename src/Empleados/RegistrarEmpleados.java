/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Empleados;

import Clientes.RegistroClientes;
import Compra.ModeloCompra1;
import Conexiones.ConexionSQL;

import Proveedor.frm_proveedores;
import Venta.ModeloVenta;
import contactos.Contacto.Contacto;
import contactos.contacto_proveedor.ContactoP;
import java.awt.Toolkit;



/*import Factura_Venta.Factura_Venta;*/
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import menu.menuPrincipal;
import producto.Producto;
import org.apache.log4j.*;
import inicio_sesion.Pantalla_Inicio_Sesion;
import inicio_sesion.modelo.SqlUsuarios;
import inicio_sesion.modelo.usuarios;
import java.sql.Date;
import java.text.SimpleDateFormat;
import java.util.Calendar;
/**
 *
 * @author luisc
 */
public class RegistrarEmpleados extends javax.swing.JFrame {

    /**
     * Creates new form RegistrarEmpleados
     */
    Connection conectar = null;
    String SQL="select max(Vendedor_id) from vendedor";
     usuarios mod;
    
     
    
    
    final static org.apache.log4j.Logger logger = org.apache.log4j.Logger.getLogger(RegistrarEmpleados.class);
    public RegistrarEmpleados() {
        initComponents();
        PropertyConfigurator.configure("log4j.properties");
        mostrardatos("");
        limpiar();
        bloquear();
        this.setLocationRelativeTo(null);
         Calendar cal= Calendar.getInstance();
        String fecha;
        fecha = cal.get(Calendar.YEAR)+"-"+cal.get(Calendar.MONTH)+"-"+cal.get(Calendar.DATE);
        
    
        
    }
    
   
   
    
    
    void mostrardatos(String valor) {
        ConexionSQL cc = new ConexionSQL();
        Connection cn = cc.getConnection();
        DefaultTableModel modelo = new DefaultTableModel();
        modelo.addColumn("ID Empleado");
        modelo.addColumn("Nombre Empleado");
        modelo.addColumn("Apellido Empleado");
        modelo.addColumn("Numero de Identidad Empleado");
        modelo.addColumn("Direccion Empleado");
        modelo.addColumn("Usuario");
        modelo.addColumn("PASS");
        modelo.addColumn("Tipo Usuario");
        modelo.addColumn("Fecha de Registro");
        

        tablaempleados.setModel(modelo);
        String sql = "";
        if (valor.equals("")) {
            sql = "SELECT * From vendedor";
        } else {
            sql = "SELECT Vendedor_id,nombre_empleado,apellido_empleado,num_identidad_empleado, direccion,usuario,id_tipo,fecha_registro FROM vendedor WHERE (Vendedor_id='" + valor + "' OR nombre_empleado='" + valor + "' OR apellido_empleado='" + valor + "'OR num_identidad_empleado='" + valor + "'OR direccion='" + valor + "'OR tipo_usuario='"+valor+"')";
        }
        String[] datos = new String[9];
        try {
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                datos[0] = rs.getString(1);
                datos[1] = rs.getString(2);
                datos[2] = rs.getString(3);
                datos[3] = rs.getString(4);
                datos[4] = rs.getString(5);
                datos[5] = rs.getString(6);
                datos[6] = rs.getString(7);
                datos[7] = rs.getString(8);
                datos[8] = rs.getString(9);

                modelo.addRow(datos);

            }
            tablaempleados.setModel(modelo);
        } catch (SQLException ex) {

        }
        
    }

    void limpiar() {
        id_empleado.setText("");
        nom_empleado.setText("");
        apelld_empleado.setText("");
        num_id_emplea.setText("");
        dir_empleado.setText("");
        txt_usuario.setText("");
        txt_pass.setText("");

    }

    void desbloquear() {
        id_empleado.setEnabled(true);
        nom_empleado.setEnabled(true);
        apelld_empleado.setEnabled(true);
        num_id_emplea.setEnabled(true);
        dir_empleado.setEnabled(true);
        txt_usuario.setEnabled(true);
        txt_pass.setEnabled(true);
        save_empleado.setEnabled(true);
        nuevo.setEnabled(true);
        btn_editar.setEnabled(true);
        del_empleado.setEnabled(true);
        salir_btn.setEnabled(true);

    }

    void bloquear() {
        id_empleado.setEnabled(false);
        nom_empleado.setEnabled(false);
        apelld_empleado.setEnabled(false);
        num_id_emplea.setEnabled(false);
        dir_empleado.setEnabled(false);
        txt_usuario.setEnabled(false);
        txt_pass.setEnabled(false);

        save_empleado.setEnabled(false);
        nuevo.setEnabled(true);
        btn_editar.setEnabled(true);
        del_empleado.setEnabled(true);
        salir_btn.setEnabled(true);

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

        jTextField1 = new javax.swing.JTextField();
        jPopupMenu1 = new javax.swing.JPopupMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        idEmpleado = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        id_empleado = new javax.swing.JTextField();
        nom_empleado = new javax.swing.JTextField();
        apelld_empleado = new javax.swing.JTextField();
        num_id_emplea = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        save_empleado = new javax.swing.JButton();
        del_empleado = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tablaempleados = new javax.swing.JTable();
        jButton4 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        btn_editar = new javax.swing.JButton();
        salir_btn = new javax.swing.JButton();
        dir_empleado = new javax.swing.JTextField();
        nuevo = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        txt_usuario = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txt_pass = new javax.swing.JPasswordField();
        jLabel7 = new javax.swing.JLabel();
        buscar_txt = new javax.swing.JButton();
        buscar_txt_box = new javax.swing.JTextField();
        jButton5 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        tipo = new javax.swing.JComboBox<>();
        jLabel10 = new javax.swing.JLabel();
        fechar = new rojeru_san.RSLabelFecha();
        user = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        pom = new javax.swing.JTextField();
        rol = new javax.swing.JLabel();
        ide = new javax.swing.JLabel();

        jTextField1.setText("Registro de Empleados");
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        jMenuItem1.setText("Editar");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jPopupMenu1.add(jMenuItem1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        idEmpleado.setText("ID Empleado");
        getContentPane().add(idEmpleado, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 260, -1, -1));

        jLabel2.setText("Nombre Empleado");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 300, -1, -1));

        jLabel3.setText("Apellido Empleado");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 350, -1, -1));

        id_empleado.setEditable(false);
        id_empleado.setBackground(new java.awt.Color(204, 204, 204));

        org.jdesktop.beansbinding.Binding binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, nom_empleado, org.jdesktop.beansbinding.ObjectProperty.create(), id_empleado, org.jdesktop.beansbinding.BeanProperty.create("nextFocusableComponent"));
        bindingGroup.addBinding(binding);

        id_empleado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                id_empleadoActionPerformed(evt);
            }
        });
        id_empleado.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                id_empleadoKeyTyped(evt);
            }
        });
        getContentPane().add(id_empleado, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 250, 124, 25));

        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, apelld_empleado, org.jdesktop.beansbinding.ObjectProperty.create(), nom_empleado, org.jdesktop.beansbinding.BeanProperty.create("nextFocusableComponent"));
        bindingGroup.addBinding(binding);

        nom_empleado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nom_empleadoActionPerformed(evt);
            }
        });
        nom_empleado.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                nom_empleadoKeyTyped(evt);
            }
        });
        getContentPane().add(nom_empleado, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 290, 124, 28));

        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, num_id_emplea, org.jdesktop.beansbinding.ObjectProperty.create(), apelld_empleado, org.jdesktop.beansbinding.BeanProperty.create("nextFocusableComponent"));
        bindingGroup.addBinding(binding);

        apelld_empleado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                apelld_empleadoActionPerformed(evt);
            }
        });
        apelld_empleado.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                apelld_empleadoKeyTyped(evt);
            }
        });
        getContentPane().add(apelld_empleado, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 340, 124, 29));

        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, dir_empleado, org.jdesktop.beansbinding.ObjectProperty.create(), num_id_emplea, org.jdesktop.beansbinding.BeanProperty.create("nextFocusableComponent"));
        bindingGroup.addBinding(binding);

        num_id_emplea.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                num_id_empleaActionPerformed(evt);
            }
        });
        num_id_emplea.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                num_id_empleaKeyTyped(evt);
            }
        });
        getContentPane().add(num_id_emplea, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 390, 130, 31));

        jLabel4.setText("Núm. Identidad Empleado");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 390, -1, 25));

        jLabel5.setText("Dirección del Empleado");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 450, -1, -1));

        save_empleado.setBackground(new java.awt.Color(255, 255, 255));
        save_empleado.setForeground(new java.awt.Color(255, 255, 255));
        save_empleado.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/guardar.jpg"))); // NOI18N
        save_empleado.setBorder(null);
        save_empleado.setFocusPainted(false);
        save_empleado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                save_empleadoActionPerformed(evt);
            }
        });
        getContentPane().add(save_empleado, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 260, 60, 60));

        del_empleado.setBackground(new java.awt.Color(255, 255, 255));
        del_empleado.setForeground(new java.awt.Color(255, 255, 255));
        del_empleado.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/eliminar.jpg"))); // NOI18N
        del_empleado.setBorder(null);
        del_empleado.setFocusPainted(false);
        del_empleado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                del_empleadoActionPerformed(evt);
            }
        });
        getContentPane().add(del_empleado, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 340, 60, 60));

        jLabel1.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jLabel1.setText("Registro Empleados");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 10, 130, -1));

        tablaempleados = new javax.swing.JTable(){
            public boolean isCellEditable(int rowIndex, int colIndex){
                return false;
            }
        };
        tablaempleados.setForeground(new java.awt.Color(0, 0, 204));
        tablaempleados.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        tablaempleados.setComponentPopupMenu(jPopupMenu1);
        tablaempleados.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        tablaempleados.getTableHeader().setReorderingAllowed(false);
        tablaempleados.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablaempleadosMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tablaempleados);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 110, 760, 133));

        jButton4.setBackground(new java.awt.Color(0, 0, 204));
        jButton4.setForeground(new java.awt.Color(255, 255, 255));
        jButton4.setText("Registrar Cliente");
        jButton4.setFocusable(false);
        jButton4.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton4.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton4MouseClicked(evt);
            }
        });
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 40, -1, -1));

        jButton6.setBackground(new java.awt.Color(0, 0, 204));
        jButton6.setForeground(new java.awt.Color(255, 255, 255));
        jButton6.setText("Registrar Venta");
        jButton6.setFocusable(false);
        jButton6.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton6.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton6MouseClicked(evt);
            }
        });
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 40, -1, -1));

        jButton7.setBackground(new java.awt.Color(0, 0, 204));
        jButton7.setForeground(new java.awt.Color(255, 255, 255));
        jButton7.setText("Registrar Compra");
        jButton7.setFocusable(false);
        jButton7.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton7.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton7MouseClicked(evt);
            }
        });
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton7, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 40, -1, -1));

        btn_editar.setBackground(new java.awt.Color(255, 255, 255));
        btn_editar.setForeground(new java.awt.Color(255, 255, 255));
        btn_editar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/editar.jpg"))); // NOI18N
        btn_editar.setBorder(null);
        btn_editar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_editarActionPerformed(evt);
            }
        });
        getContentPane().add(btn_editar, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 340, 60, 60));

        salir_btn.setBackground(new java.awt.Color(255, 255, 255));
        salir_btn.setForeground(new java.awt.Color(255, 255, 255));
        salir_btn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/salir.jpg"))); // NOI18N
        salir_btn.setBorder(null);
        salir_btn.setBorderPainted(false);
        salir_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salir_btnActionPerformed(evt);
            }
        });
        getContentPane().add(salir_btn, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 510, 50, 60));

        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, txt_usuario, org.jdesktop.beansbinding.ObjectProperty.create(), dir_empleado, org.jdesktop.beansbinding.BeanProperty.create("nextFocusableComponent"));
        bindingGroup.addBinding(binding);

        dir_empleado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dir_empleadoActionPerformed(evt);
            }
        });
        dir_empleado.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                dir_empleadoKeyTyped(evt);
            }
        });
        getContentPane().add(dir_empleado, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 430, 130, 87));

        nuevo.setBackground(new java.awt.Color(255, 255, 255));
        nuevo.setForeground(new java.awt.Color(255, 255, 255));
        nuevo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/nuevo.jpg"))); // NOI18N
        nuevo.setBorder(null);
        nuevo.setBorderPainted(false);
        nuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nuevoActionPerformed(evt);
            }
        });
        getContentPane().add(nuevo, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 260, 60, 60));

        jButton3.setBackground(new java.awt.Color(0, 0, 204));
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setText("Inicio");
        jButton3.setFocusable(false);
        jButton3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton3.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
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
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, -1, -1));

        jButton1.setBackground(new java.awt.Color(0, 0, 204));
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("REGISTRAR PROVEEDOR");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 40, 160, -1));

        jButton2.setBackground(new java.awt.Color(255, 255, 255));
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/contacto.jpg"))); // NOI18N
        jButton2.setBorder(null);
        jButton2.setBorderPainted(false);
        jButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton2MouseClicked(evt);
            }
        });
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 420, 50, 60));

        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, txt_pass, org.jdesktop.beansbinding.ObjectProperty.create(), txt_usuario, org.jdesktop.beansbinding.BeanProperty.create("nextFocusableComponent"));
        bindingGroup.addBinding(binding);

        getContentPane().add(txt_usuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 530, 124, 30));

        jLabel6.setText("Usuario");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 540, -1, -1));

        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, save_empleado, org.jdesktop.beansbinding.ObjectProperty.create(), txt_pass, org.jdesktop.beansbinding.BeanProperty.create("nextFocusableComponent"));
        bindingGroup.addBinding(binding);

        getContentPane().add(txt_pass, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 580, 124, 33));

        jLabel7.setText("Contraseña");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 590, -1, -1));

        buscar_txt.setBackground(new java.awt.Color(0, 0, 204));
        buscar_txt.setForeground(new java.awt.Color(255, 255, 255));
        buscar_txt.setText("Buscar");
        buscar_txt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscar_txtActionPerformed(evt);
            }
        });
        getContentPane().add(buscar_txt, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 70, -1, 30));
        getContentPane().add(buscar_txt_box, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 70, 125, 30));

        jButton5.setBackground(new java.awt.Color(255, 255, 255));
        jButton5.setForeground(new java.awt.Color(255, 255, 255));
        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/atras.jpg"))); // NOI18N
        jButton5.setBorder(null);
        jButton5.setBorderPainted(false);
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 510, 60, 60));

        jButton8.setBackground(new java.awt.Color(0, 0, 204));
        jButton8.setForeground(new java.awt.Color(255, 255, 255));
        jButton8.setText("Mostrar");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton8, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 70, -1, 30));

        jButton9.setBackground(new java.awt.Color(0, 0, 204));
        jButton9.setForeground(new java.awt.Color(255, 255, 255));
        jButton9.setText("REGISTRAR PRODUCTO");
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton9, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 40, 150, -1));

        jLabel9.setText("Tipo Usuario");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 260, -1, -1));

        tipo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Empleado", "Administrador" }));
        tipo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tipoActionPerformed(evt);
            }
        });
        getContentPane().add(tipo, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 260, -1, -1));

        jLabel10.setText("Usuario: ");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, -1));

        fechar.setForeground(new java.awt.Color(51, 51, 51));
        fechar.setFormato("yyyy-MM-dd");
        getContentPane().add(fechar, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 290, 110, -1));
        getContentPane().add(user, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 10, 80, 20));

        jLabel11.setText("Fecha de Registro");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 300, -1, -1));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/verde3.jpg"))); // NOI18N
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 790, 630));

        pom.setText("jTextField2");
        pom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pomActionPerformed(evt);
            }
        });
        getContentPane().add(pom, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 290, -1, -1));

        rol.setText("jLabel11");
        getContentPane().add(rol, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, -1, -1));
        getContentPane().add(ide, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 90, -1, -1));

        bindingGroup.bind();

        pack();
    }// </editor-fold>//GEN-END:initComponents


    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void apelld_empleadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_apelld_empleadoActionPerformed
        // TODO add your handling code here:
        apelld_empleado.transferFocus();
    }//GEN-LAST:event_apelld_empleadoActionPerformed

    private void nom_empleadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nom_empleadoActionPerformed
        // TODO add your handling code here:
        nom_empleado.transferFocus();
    }//GEN-LAST:event_nom_empleadoActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        logger.debug("Entra a la pantalla de registro de cliente");
        RegistroClientes rc = new RegistroClientes();
        rc.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        // TODO add your handling code here:
        logger.debug("Entra a la pantalla de registrar Compra");
        ModeloCompra1 mc = new ModeloCompra1();
        mc.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton7ActionPerformed

    private void num_id_empleaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_num_id_empleaActionPerformed
        // TODO add your handling code here:
        num_id_emplea.transferFocus();

    }//GEN-LAST:event_num_id_empleaActionPerformed

   
    
    
     void numeros()
     {
      
         ConexionSQL cc = new ConexionSQL();

        Connection cn = cc.getConnection();
         int j;
        int cont=1;
        String num="";
        String c="";
        
       // String SQL="select count(*) from factura";
        //String SQL="SELECT MAX(cod_emp) AS cod_emp FROM empleado";
        //String SQL="SELECT @@identity AS ID";
        try {
            Statement st = cn.createStatement();
            ResultSet rs=st.executeQuery(SQL);
            if(rs.next())
            {              
                 c=rs.getString(1);
            }
            
           
            if(c==null){
                id_empleado.setText(SQL +1);
            }
            else{
                 j=Integer.parseInt(c);
                 GenerarNumero gen= new GenerarNumero();
                 gen.generar(j);
                 id_empleado.setText(gen.serie());
                
            
            }
       
          
                  
           
           
         
        } catch (SQLException ex) {
           
        }
     }

   /* public boolean esDireccion(String direccion){
        Pattern pattern = Pattern.compile("^[_A-Za-z0-9-#-\\+]+(\\[_A-Za-z0-9-#]+)"
                + "[A-Za-z0-9-#]+(\\[A-Za-z0-9-#]+)*(\\[A-Za-z-#]{2,})$");

        Matcher matcher = pattern.matcher(direccion);
        return matcher.find();
    }
    */
     
     
    
     
     void empleadodir(){
     
                    
                    
            JOptionPane.showMessageDialog(null,"No se permiten caracteres especiales a parte del # y el .");
            
         
     }
     
         
    private void save_empleadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_save_empleadoActionPerformed

        ConexionSQL cc = new ConexionSQL();
        
        Connection cn = cc.getConnection();
        Pantalla_Inicio_Sesion ses = new Pantalla_Inicio_Sesion();
        
        
        
        if(dir_empleado.getText().contains("!") || dir_empleado.getText().contains("~")|| dir_empleado.getText().contains("`")||
                   dir_empleado.getText().contains("@") || dir_empleado.getText().contains("$") || dir_empleado.getText().contains("%")||
                    dir_empleado.getText().contains("^")||dir_empleado.getText().contains("&")||dir_empleado.getText().contains("*")||
                    dir_empleado.getText().contains("(")||dir_empleado.getText().contains(")")||dir_empleado.getText().contains("-")||
                    dir_empleado.getText().contains("_")||dir_empleado.getText().contains("+")||dir_empleado.getText().contains("=")){
              JOptionPane.showMessageDialog(null,"No se permiten caracteres especiales a parte del # y el .");
              logger.debug("Error, inserto caracteres especiales");
        }else{
        if(dir_empleado.getText().equals("!") || dir_empleado.getText().equals("~")|| dir_empleado.getText().equals("`")||
                   dir_empleado.getText().equals("@") || dir_empleado.getText().equals("$") || dir_empleado.getText().equals("%")||
                    dir_empleado.getText().equals("^")||dir_empleado.getText().equals("&")||dir_empleado.getText().equals("*")||
                    dir_empleado.getText().equals("(")||dir_empleado.getText().equals(")")||dir_empleado.getText().equals("-")||
                    dir_empleado.getText().equals("_")||dir_empleado.getText().equals("+")||dir_empleado.getText().equals("=")){
              JOptionPane.showMessageDialog(null,"No se permiten caracteres especiales a parte del # y el .");
              logger.debug("Error trato de guardar con un caracter especial");
        }else{
        if (nom_empleado.getText().equals("") || apelld_empleado.getText().equals("")
                || num_id_emplea.getText().equals("") || dir_empleado.getText().equals("") || txt_usuario.getText().equals("")
                || txt_pass.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Hay Campos que estan vacios debe llenar todos los campos");
            logger.debug("Error, trato de guardar con campos vacios");

        } else{ 
            
            
            try {
                
                if (existeUsuario(txt_usuario.getText()) == 0) {
                   
                    if (esUsuario(txt_usuario.getText())) {
                        
                        if (num_id_emplea.getText().length() >= 13) {
                            
                            if (num_id_emplea.getText().startsWith("0") || num_id_emplea.getText().startsWith("1")) {
                                
                                if (nom_empleado.getText().length() >= 3) {
                                    
                                    if (apelld_empleado.getText().length() >= 3) {
                                        
                                        if (existeId(id_empleado.getText()) == 0) {
                                            
                                            if (existeidentidad(num_id_emplea.getText()) == 0) {
                                                
                                                
                                                 
                                                
                                                PreparedStatement pst = cn.prepareStatement("INSERT INTO `vendedor` (`Vendedor_id`, `nombre_empleado`, `apellido_empleado`, `num_identidad_empleado`, `direccion`, `usuario`, `pass`,`id_tipo`,`fecha_registro`) VALUES (NULL, ?, ?, ?, ?, ?, MD5(?),?,?)");
                                                
                                                
                                                
         
                                                pst.setString(1, nom_empleado.getText());
                                                pst.setString(2, apelld_empleado.getText());
                                                pst.setString(3, num_id_emplea.getText());
                                                pst.setString(4, dir_empleado.getText());
                                                pst.setString(5, txt_usuario.getText());
                                                pst.setString(6, txt_pass.getText());
                                                pst.setString(7, pom.getText());
                                                pst.setString(8, fechar.getFecha());

                                                int a = pst.executeUpdate();
                                                if (a > 0) {
                                                    JOptionPane.showMessageDialog(null, "Registro Guardado con exito");
                                                        logger.info("Registro Exitoso: "+ses.txt_usuario.getText());
                                                    mostrardatos("");
                                                    nuevo();
                                                } else {
                                                    JOptionPane.showMessageDialog(null, "Error al agregar");
                                                    logger.debug("Error al almacenar");
                                                }
                                            } else {
                                                JOptionPane.showMessageDialog(null, "Error al agregar, este numero de identidad ya existe, inserte otro");
                                                logger.debug("Error, guardo un numero de identidad que ya existia");
                                            }
                                        } else {
                                            JOptionPane.showMessageDialog(null, "Error al agregar, este ID ya existe, inserte otro");
                                            logger.debug("Error, guardo un ID repetido");
                                        }
                                    } else {
                                        JOptionPane.showMessageDialog(null, "Error al agregar, el apellido debe tener al menos 3 caracteres");
                                        logger.debug("Error, guardo un apellido con menos de 3 caracteres");
                                    }
                                } else {
                                    JOptionPane.showMessageDialog(null, "Error al agregar, el Nombre debe tener al menos 3 caracteres");
                                    logger.debug("Error, guardo un nombre con menos de 3 caracteres");
                                }
                            } else {
                                JOptionPane.showMessageDialog(null, "El numero de identidad debe empezar con 0 o 1");
                                logger.debug("Error, ingreso un numero de identidad que no empezaba con 0 o con 1");
                            }
                        } else {
                            JOptionPane.showMessageDialog(null, "Error al agregar, el num Identidad debe ser de 13 caracteres");
                            logger.debug("Error, ingreso un numero de identidad de menos de 13 caracteres");
                        }
                    } else {
                        JOptionPane.showMessageDialog(null, "El usuario es incorrecto");
                        logger.debug("Error, guardo un usuario de forma invalida");
                    }

                } else {
                    JOptionPane.showMessageDialog(null, "El usuario ya esta ingresado, intente con otro");
                     logger.debug("Error, guardo un usuario que ya existe");
                }
                
            } catch (Exception e) {
               logger.error("Error: "+e.getMessage());
               
            }
                
        }
        }

        }
    }//GEN-LAST:event_save_empleadoActionPerformed

    private int existeUsuario(String usuario) {

        ConexionSQL cc = new ConexionSQL();

        Connection cn = cc.getConnection();

        ResultSet rs = null;
        PreparedStatement ps = null;

        String sql = "SELECT count(Vendedor_id) FROM vendedor WHERE usuario = ?";

        try {
            ps = cn.prepareStatement(sql);
            ps.setString(1, usuario);
            rs = ps.executeQuery();

            if (rs.next()) {
                return rs.getInt(1);
            }
        } catch (Exception e) {
            return 1;
        }
        return 1;

    }

    public int existeId(String id) {

        ResultSet rs = null;
        PreparedStatement ps = null;

        ConexionSQL cc = new ConexionSQL();
        Connection con = cc.getConnection();

        String sql = "SELECT count(Vendedor_id) FROM vendedor WHERE Vendedor_id = ?";

        try {

            ps = con.prepareStatement(sql);
            ps.setString(1, id);
            rs = ps.executeQuery();

            if (rs.next()) {
                return rs.getInt(1);

            }

        } catch (SQLException ex) {

            return 1;

        }
        return 1;

    }

    public int existeidentidad(String usuario) {

        ResultSet rs = null;
        PreparedStatement ps = null;

        ConexionSQL cc = new ConexionSQL();
        Connection con = cc.getConnection();

        String sql = "SELECT count(Vendedor_id) FROM vendedor WHERE num_identidad_empleado = ?";

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

    public boolean esUsuario(String correo) {

        Pattern pattern = Pattern.compile("^[_A-Za-z0-9-\\+]+(\\.+)"
                + "[A-Za-z0-9-]+");

        Matcher matcher = pattern.matcher(correo);
        return matcher.find();
    }

    void nuevo() {
        this.id_empleado.setText("");
        this.nom_empleado.setText("");
        this.apelld_empleado.setText("");
        this.num_id_emplea.setText("");
        this.dir_empleado.setText("");
        this.txt_usuario.setText("");
        this.txt_pass.setText("");

        this.id_empleado.grabFocus();
    }
    private void nuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nuevoActionPerformed
        // TODO add your handling code here:
        nuevo();
        
        desbloquear();
        logger.debug("Limpio los campos");
       
    }//GEN-LAST:event_nuevoActionPerformed

    String id = "";
    private void btn_editarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_editarActionPerformed
        desbloquear();

        ConexionSQL cc = new ConexionSQL();
        Connection cn = cc.getConnection();
        if (id_empleado.getText().equals("") || nom_empleado.getText().equals("") || apelld_empleado.getText().equals("")
                || num_id_emplea.getText().equals("") || dir_empleado.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Hay Campos que estan vacios debe llenar todos los campos");
            logger.debug("Error, guardo con campos vacios");

        } else {
            try {

                if (num_id_emplea.getText().length() >= 13) {
                    if (num_id_emplea.getText().startsWith("0") || num_id_emplea.getText().startsWith("1")) {
                    PreparedStatement pst = cn.prepareStatement("UPDATE vendedor SET Vendedor_id='" + id_empleado.getText() + "',nombre_empleado='" + nom_empleado.getText() + "',apellido_empleado='" + apelld_empleado.getText() + "',num_identidad_empleado='" + num_id_emplea.getText() + "',direccion='" + dir_empleado.getText() + "'WHERE Vendedor_id='" + id + "'");
                    id = id_empleado.getText();
                    pst.executeUpdate();
                    mostrardatos("");
                    JOptionPane.showMessageDialog(null, "Se a modificado con exito");
                    logger.debug("Edicion exitosa");
                    }else{
                        JOptionPane.showMessageDialog(null, "El numero de Identidad debe ser con 0 o con 1");
                        logger.debug("Error, guardo un numero de identidad que no empezaba con 0 o con 1");
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "El num identidad debe ser de 13 numeros");
                    logger.debug("Error, guardo un numero de identidad con menos de 13 caracteres");
                }

            } catch (Exception e) {
                System.out.println(e.getMessage());
                logger.debug("Error: ",e);
            }
        }
        limpiar();
    }//GEN-LAST:event_btn_editarActionPerformed
public Icon icono(String path, int width, int height){
        Icon img = new ImageIcon(new ImageIcon(getClass().getResource(path)).getImage().
                getScaledInstance(width,height,java.awt.Image.SCALE_SMOOTH));
        return img;
    }
    private void del_empleadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_del_empleadoActionPerformed
        // TODO add your handling code here:
        Object[] options = {"SI", "NO"};
         int i = JOptionPane.showOptionDialog(null, "Esta seguro que desea eliminar el registro?","Seleccione una opción",JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, icono("/Imagenes/logo.png", 40, 40),  options, options[0]);
        ConexionSQL cc = new ConexionSQL();
       
        Connection cn = cc.getConnection();
        int fila = tablaempleados.getSelectedRow();
        String cod = "";
        cod = tablaempleados.getValueAt(fila, 0).toString();
        if (i == 0) {
            try {
                PreparedStatement pst = cn.prepareStatement("DELETE FROM vendedor WHERE Vendedor_id='" + cod + "'");
                int a = pst.executeUpdate();
                mostrardatos("");

                if (a > 0) {
                    JOptionPane.showMessageDialog(null, "Eliminacion Exitosa");
                    logger.debug("Eliminacion exitosa");
                } else {
                    JOptionPane.showMessageDialog(null, "No se pudo Eliminar");
                    logger.debug("Error, no se elimino con exito");
                }
            } catch (Exception e) {
                System.out.println(e.getMessage());
                JOptionPane.showMessageDialog(null, "No se pudo eliminar, el cliente tiene facturas registradas");
                logger.debug("Error al eliminar");
            }
        }
        bloquear();
        limpiar();
    }//GEN-LAST:event_del_empleadoActionPerformed
    
    private void salir_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salir_btnActionPerformed
        // TODO add your handling code here:
        logger.debug("Salio del sistema");
        System.exit(0);
        
    }//GEN-LAST:event_salir_btnActionPerformed

    private void tablaempleadosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaempleadosMouseClicked
        // TODO add your handling code here:
        int fila_seleccionada = tablaempleados.getSelectedRow();
        if (fila_seleccionada >= 0) {
            id_empleado.setText(tablaempleados.getValueAt(fila_seleccionada, 0).toString());
            nom_empleado.setText(tablaempleados.getValueAt(fila_seleccionada, 1).toString());
            apelld_empleado.setText(tablaempleados.getValueAt(fila_seleccionada, 2).toString());
            num_id_emplea.setText(tablaempleados.getValueAt(fila_seleccionada, 3).toString());
            dir_empleado.setText(tablaempleados.getValueAt(fila_seleccionada, 4).toString());
            txt_usuario.setText(tablaempleados.getValueAt(fila_seleccionada, 5).toString());
            txt_pass.setText(tablaempleados.getValueAt(fila_seleccionada, 6).toString());
            id = tablaempleados.getValueAt(fila_seleccionada, 0).toString();
        } else {
            JOptionPane.showMessageDialog(null, "No se Encontro FIla");
        }

        txt_usuario.setEnabled(true);
        txt_pass.setEnabled(true);
    }//GEN-LAST:event_tablaempleadosMouseClicked


    private void jButton3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton3MouseClicked
        menuPrincipal menu = new menuPrincipal();
        menu.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton3MouseClicked

    private void jButton4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton4MouseClicked
        RegistroClientes registrar2 = new RegistroClientes();
        registrar2.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton4MouseClicked

    private void jButton6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton6MouseClicked
        /*     Factura_Venta facv = new Factura_Venta();
         facv.setVisible(true);
         this.dispose();*/
    }//GEN-LAST:event_jButton6MouseClicked

    private void jButton7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton7MouseClicked
        /*FacturaCompra facc = new FacturaCompra();
         facc.setVisible(true);
         this.dispose();*/
    }//GEN-LAST:event_jButton7MouseClicked

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        logger.debug("vuelve al menu principal");
        menuPrincipal mp = new menuPrincipal();
        mp.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseClicked

    }//GEN-LAST:event_jButton2MouseClicked

    private void buscar_txtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscar_txtActionPerformed
        // TODO add your handling code here:
        logger.debug("Busca un empleado");
        mostrardatos(buscar_txt_box.getText());
    }//GEN-LAST:event_buscar_txtActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        logger.debug("Ingreso a la pantalla de contacto: "+user.getText());
        Contacto contacto = new Contacto();
        contacto.setVisible(true);
        Contacto.usuarios.setText(user.getText());
        Contacto.rol.setText(rol.getText());
        Contacto.idcv.setText(ide.getText());
        this.dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
          
        SqlUsuarios modSql = new SqlUsuarios();
        usuarios mod = new usuarios();
         
        menuPrincipal mp = new menuPrincipal();
        mp.setVisible(true);
        
       menuPrincipal.nombre.setText(user.getText());
       menuPrincipal.rol.setText(rol.getText());
       menuPrincipal.idv.setText(ide.getText());
        
        logger.debug("Volvio al menu principal: "+user.getText());
        
        this.dispose();
        
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        // TODO add your handling code here:\

        int fila = tablaempleados.getSelectedRow();
        if (fila >= 0) {

            id_empleado.setText(tablaempleados.getValueAt(fila, 0).toString());
            nom_empleado.setText(tablaempleados.getValueAt(fila, 1).toString());
            apelld_empleado.setText(tablaempleados.getValueAt(fila, 2).toString());
            num_id_emplea.setText(tablaempleados.getValueAt(fila, 3).toString());
            dir_empleado.setText(tablaempleados.getValueAt(fila, 4).toString());

            id = tablaempleados.getValueAt(fila, 0).toString();
        } else {
            JOptionPane.showMessageDialog(null, "No se encontro fila");
        }
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void nom_empleadoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_nom_empleadoKeyTyped
        // TODO add your handling code here:
        char c = evt.getKeyChar();

        if ((c < 'a' || c > 'z') && (c < 'A' || c > 'Z')) {
            evt.consume();
        }

        if (nom_empleado.getText().length() >= 20) {
            evt.consume();
            Toolkit.getDefaultToolkit().beep();
        }
    }//GEN-LAST:event_nom_empleadoKeyTyped

    private void apelld_empleadoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_apelld_empleadoKeyTyped
        // TODO add your handling code here:
        char c = evt.getKeyChar();

        if ((c < 'a' || c > 'z') && (c < 'A' || c > 'Z')) {
            evt.consume();
        }
        if (apelld_empleado.getText().length() >= 20) {
            evt.consume();
            Toolkit.getDefaultToolkit().beep();
        }
    }//GEN-LAST:event_apelld_empleadoKeyTyped

    private void num_id_empleaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_num_id_empleaKeyTyped
        // TODO add your handling code here:
        char c = evt.getKeyChar();

        if (c < '0' || c > '9') {
            evt.consume();
        }

        if (num_id_emplea.getText().length() >= 13) {
            evt.consume();
            Toolkit.getDefaultToolkit().beep();
        }


    }//GEN-LAST:event_num_id_empleaKeyTyped

    private void dir_empleadoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_dir_empleadoKeyTyped
        // TODO add your handling code here:
        if(dir_empleado.getText().equals("!") || dir_empleado.getText().equals("~")|| dir_empleado.getText().equals("`")||
                   dir_empleado.getText().equals("@") || dir_empleado.getText().equals("$") || dir_empleado.getText().equals("%")||
                    dir_empleado.getText().equals("^")||dir_empleado.getText().equals("&")||dir_empleado.getText().equals("*")||
                    dir_empleado.getText().equals("(")||dir_empleado.getText().equals(")")||dir_empleado.getText().equals("-")||
                    dir_empleado.getText().equals("_")||dir_empleado.getText().equals("+")||dir_empleado.getText().equals("=")){
                    evt.consume();
                    Toolkit.getDefaultToolkit().beep();
            JOptionPane.showMessageDialog(null,"No se permiten caracteres especiales a parte del # y el .");
            }
        if (dir_empleado.getText().length() >= 60) {
            evt.consume();
            Toolkit.getDefaultToolkit().beep();
        }
    }//GEN-LAST:event_dir_empleadoKeyTyped

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        // TODO add your handling code here:
        logger.debug("Muestra los datos de la tabla");
        mostrardatos("");
        buscar_txt_box.setText("");
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        logger.debug("Entra a la pantalla de registro de proveedores");
        frm_proveedores fp = new frm_proveedores();
        fp.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        // TODO add your handling code here:
        logger.debug("Entra a la pantalla de registro de producto");
        Producto prod = new Producto();
        prod.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton9ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
        logger.debug("Entra a la pantalla de Venta");
        ModeloVenta mv = new ModeloVenta();
        mv.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton6ActionPerformed

    private void dir_empleadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dir_empleadoActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_dir_empleadoActionPerformed

    private void id_empleadoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_id_empleadoKeyTyped
        // TODO add your handling code here:
        char c = evt.getKeyChar();

        if (c < '0' || c > '9') {
            evt.consume();
        }

        if (id_empleado.getText().length() >= 5) {
            evt.consume();
            Toolkit.getDefaultToolkit().beep();
        }
    }//GEN-LAST:event_id_empleadoKeyTyped

    private void id_empleadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_id_empleadoActionPerformed
        // TODO add your handling code here:
        id_empleado.setText(SQL);
        id_empleado.transferFocus();
    }//GEN-LAST:event_id_empleadoActionPerformed

    private void tipoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tipoActionPerformed
        // TODO add your handling code here:
        if (tipo.getSelectedItem().toString().equals("Administrador")) {
            pom.setText("1");

        } else if (tipo.getSelectedItem().toString().equals("Empleado")) {
            pom.setText("2");

        }else{
            JOptionPane.showMessageDialog(null, "No es admin ni empleado");
        }
    }//GEN-LAST:event_tipoActionPerformed

    private void pomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pomActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pomActionPerformed

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
            java.util.logging.Logger.getLogger(RegistrarEmpleados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RegistrarEmpleados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RegistrarEmpleados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RegistrarEmpleados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new RegistrarEmpleados().setVisible(true);
            }
        });
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField apelld_empleado;
    private javax.swing.JButton btn_editar;
    private javax.swing.JButton buscar_txt;
    private javax.swing.JTextField buscar_txt_box;
    private javax.swing.JButton del_empleado;
    private javax.swing.JTextField dir_empleado;
    private rojeru_san.RSLabelFecha fechar;
    private javax.swing.JLabel idEmpleado;
    private javax.swing.JTextField id_empleado;
    public static javax.swing.JLabel ide;
    private javax.swing.JButton jButton1;
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
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JPopupMenu jPopupMenu1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField nom_empleado;
    private javax.swing.JButton nuevo;
    private javax.swing.JTextField num_id_emplea;
    private javax.swing.JTextField pom;
    public static javax.swing.JLabel rol;
    private javax.swing.JButton salir_btn;
    private javax.swing.JButton save_empleado;
    private javax.swing.JTable tablaempleados;
    private javax.swing.JComboBox<String> tipo;
    private javax.swing.JPasswordField txt_pass;
    private javax.swing.JTextField txt_usuario;
    public static javax.swing.JLabel user;
    private org.jdesktop.beansbinding.BindingGroup bindingGroup;
    // End of variables declaration//GEN-END:variables

}
