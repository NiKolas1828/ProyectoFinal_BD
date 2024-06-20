/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package SubVentanas;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;


/**
 *
 * @author Nicolas
 */
public class frmClienteEsporadico extends javax.swing.JPanel {

    /**
     * Creates new form frmCliente
     */
    public frmClienteEsporadico() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    //@SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        txtIngresoCliente = new javax.swing.JLabel();
        jTextField_NombreCliente = new javax.swing.JTextField();
        Label_NombreCliente = new javax.swing.JLabel();
        Label_CedulaCliente = new javax.swing.JLabel();
        jTextField_TelefonoCliente = new javax.swing.JTextField();
        Label_TelefonoCliente = new javax.swing.JLabel();
        jTextField_CedulaCliente = new javax.swing.JTextField();
        jButton_IngresarCliente = new javax.swing.JButton();
        jButton_Atras = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));

        txtIngresoCliente.setFont(new java.awt.Font("Franklin Gothic Demi", 0, 18)); // NOI18N
        txtIngresoCliente.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtIngresoCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagene/favicon.png"))); // NOI18N
        txtIngresoCliente.setText("INGRESO CLIENTE HABITUAL");

        Label_NombreCliente.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 12)); // NOI18N
        Label_NombreCliente.setText("NOMBRE");

        Label_CedulaCliente.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 12)); // NOI18N
        Label_CedulaCliente.setText("CEDULA");

        Label_TelefonoCliente.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 12)); // NOI18N
        Label_TelefonoCliente.setText("TELEFONO");

        jButton_IngresarCliente.setBackground(new java.awt.Color(204, 204, 255));
        jButton_IngresarCliente.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 12)); // NOI18N
        jButton_IngresarCliente.setText("INGRESAR");
        jButton_IngresarCliente.setBorder(null);
        jButton_IngresarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_IngresarClienteActionPerformed(evt);
            }
        });

        jButton_Atras.setBackground(new java.awt.Color(204, 204, 255));
        jButton_Atras.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 12)); // NOI18N
        jButton_Atras.setText("ATRAS");
        jButton_Atras.setBorder(null);
        jButton_Atras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_AtrasActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(51, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(Label_CedulaCliente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Label_NombreCliente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Label_TelefonoCliente, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(28, 28, 28)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jTextField_NombreCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField_TelefonoCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField_CedulaCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(jButton_IngresarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jButton_Atras, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(43, 43, 43)))
                        .addGap(47, 47, 47))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(txtIngresoCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(95, 95, 95))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtIngresoCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField_NombreCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Label_NombreCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Label_CedulaCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField_CedulaCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(14, 14, 14)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Label_TelefonoCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField_TelefonoCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton_IngresarCliente, javax.swing.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE)
                    .addComponent(jButton_Atras, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(23, 23, 23))
        );
    }// </editor-fold>                        

    private void jButton_IngresarClienteActionPerformed(java.awt.event.ActionEvent evt) {
        ingresarCliente();
    }

    private void ingresarCliente() {
        String nombre = jTextField_NombreCliente.getText();
        String cedulaStr = jTextField_CedulaCliente.getText();
        int cedulaInt = Integer.parseInt(cedulaStr);
        String telefono = jTextField_TelefonoCliente.getText();
    
        String url = "jdbc:postgresql://localhost:5432/ProyectoFinal";
        String usuario = "postgres";
        String contraseña = "Nicolas1118";
    
        String sqlVerificar = "SELECT COUNT(*) FROM cliente WHERE cedula = ?";
        String sqlInsertarCliente = "INSERT INTO cliente (nombre, cedula, telefono) VALUES (?, ?, ?)";
        String sqlInsertarEsporadico = "INSERT INTO esporadico (codigo_e, cedula) VALUES (?, ?)";
    
        try (Connection conn = DriverManager.getConnection(url, usuario, contraseña)) {
            // Verificar si la cédula ya está registrada
            try (PreparedStatement pstmtVerificar = conn.prepareStatement(sqlVerificar)) {
                pstmtVerificar.setInt(1, cedulaInt);
                ResultSet rs = pstmtVerificar.executeQuery();
                rs.next();
                int count = rs.getInt(1);
    
                if (count > 0) {
                    JOptionPane.showMessageDialog(this, "Error: La cédula ya está registrada", "Error", JOptionPane.ERROR_MESSAGE);
                    return; // Salir del método si la cédula ya existe
                }
            }
    
            // Insertar en la tabla cliente
            try (PreparedStatement pstmtInsertarCliente = conn.prepareStatement(sqlInsertarCliente)) {
                pstmtInsertarCliente.setString(1, nombre);
                pstmtInsertarCliente.setInt(2, cedulaInt);
                pstmtInsertarCliente.setString(3, telefono);
                pstmtInsertarCliente.executeUpdate();
            }
    
            // Insertar en la tabla esporadico
            try (PreparedStatement pstmtInsertarEsporadico = conn.prepareStatement(sqlInsertarEsporadico)) {
                pstmtInsertarEsporadico.setInt(1, cedulaInt);
                pstmtInsertarEsporadico.setInt(2, cedulaInt);
                pstmtInsertarEsporadico.executeUpdate();
            }
    
            JOptionPane.showMessageDialog(this, "Cliente ingresado correctamente");
    
            // Cerrar la ventana de ingreso cliente
            JFrame Recepcionista = new JFrame("Recepcionista");
            Recepcionista.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            Recepcionista.add(new frmDireccionIngresoCliente());
            Recepcionista.pack();
            Recepcionista.setLocationRelativeTo(null);
            Recepcionista.setVisible(true);
    
            JFrame ClienteFrame = (JFrame) SwingUtilities.getWindowAncestor(this);
            ClienteFrame.dispose();
    
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(this, "Error al ingresar cliente: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
                                                          

    private void jButton_AtrasActionPerformed(java.awt.event.ActionEvent evt) {                                              
        JFrame Administrador = new JFrame("Administrador");
        Administrador.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Administrador.add(new frmDireccionIngresoCliente());
        Administrador.pack();
        Administrador.setLocationRelativeTo(null);
        Administrador.setVisible(true);

        JFrame ClienteFrame = (JFrame) SwingUtilities.getWindowAncestor(this);
        ClienteFrame.dispose();
    }                                             


    // Variables declaration - do not modify                     
    private javax.swing.JLabel Label_CedulaCliente;
    private javax.swing.JLabel Label_NombreCliente;
    private javax.swing.JLabel Label_TelefonoCliente;
    private javax.swing.JButton jButton_Atras;
    private javax.swing.JButton jButton_IngresarCliente;
    private javax.swing.JTextField jTextField_CedulaCliente;
    private javax.swing.JTextField jTextField_NombreCliente;
    private javax.swing.JTextField jTextField_TelefonoCliente;
    private javax.swing.JLabel txtIngresoCliente;
    // End of variables declaration                   
}