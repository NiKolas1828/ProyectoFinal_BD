/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package SubVentanas;

import java.awt.event.ActionEvent;
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
public class frmIngresoClienteConReserva extends javax.swing.JPanel {

    String url = "jdbc:postgresql://localhost:5432/ProyectoFinal";
    String usuario = "postgres";
    String contraseña = "Nicolas1118";
    /**
     * Creates new form frmIngresoCliente
     */
    public frmIngresoClienteConReserva() {
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

        jPanel1 = new javax.swing.JPanel();
        txtingresoHabitacion = new javax.swing.JLabel();
        jTextFieldCodigoReserva = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabelConReserva_AVISO = new javax.swing.JLabel();
        jButtonINGRESAR_CON_RESERVA = new javax.swing.JButton();
        jButtonAtras = new javax.swing.JButton();

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        txtingresoHabitacion.setFont(new java.awt.Font("Franklin Gothic Demi", 0, 18)); // NOI18N
        txtingresoHabitacion.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtingresoHabitacion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagene/favicon.png"))); // NOI18N
        txtingresoHabitacion.setText("INGRESO HABITACION CON RESERVA");

        jLabel2.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 12)); // NOI18N
        jLabel2.setText("CODIGO RESERVA");

        jLabelConReserva_AVISO.setBackground(new java.awt.Color(204, 204, 255));
        jLabelConReserva_AVISO.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 12)); // NOI18N
        jLabelConReserva_AVISO.setText("CON RESERVA");

        jButtonINGRESAR_CON_RESERVA.setBackground(new java.awt.Color(204, 204, 255));
        jButtonINGRESAR_CON_RESERVA.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 12)); // NOI18N
        jButtonINGRESAR_CON_RESERVA.setText("INGRESAR CON RESERVA");
        jButtonINGRESAR_CON_RESERVA.setBorder(null);
        jButtonINGRESAR_CON_RESERVA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonINGRESAR_CON_RESERVAActionPerformed(evt);
            }

        });

        jButtonAtras.setBackground(new java.awt.Color(204, 204, 255));
        jButtonAtras.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 12)); // NOI18N
        jButtonAtras.setText("ATRAS");
        jButtonAtras.setBorder(null);
        jButtonAtras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAtrasActionPerformed(evt);
            }

        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(97, 97, 97)
                        .addComponent(jButtonINGRESAR_CON_RESERVA, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(txtingresoHabitacion, javax.swing.GroupLayout.PREFERRED_SIZE, 369, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(27, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(55, 55, 55)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelConReserva_AVISO, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextFieldCodigoReserva, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(133, 133, 133)
                        .addComponent(jButtonAtras, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(txtingresoHabitacion, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabelConReserva_AVISO, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldCodigoReserva, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22)
                .addComponent(jButtonINGRESAR_CON_RESERVA, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButtonAtras, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>          
    
    private void jButtonINGRESAR_CON_RESERVAActionPerformed(java.awt.event.ActionEvent evt) {                                                              
        // Obtener el codigo de reserva ingresado por el usuario
        int codigoReserva = Integer.parseInt(jTextFieldCodigoReserva.getText().trim());
        
        // Variables para almacenar los datos de la reserva
        int numHabitacion = 0; // Inicializar en caso de necesitarlo
        
        // Realizar la conexión y las operaciones con la base de datos
        try (Connection conn = DriverManager.getConnection(url, usuario, contraseña)) {
            // Consulta para verificar si existe la reserva y obtener num_hab
            String sql = "SELECT num_hab FROM reserva WHERE codigo_reserva = ?";
            
            try (PreparedStatement pstmt = conn.prepareStatement(sql)) {
                pstmt.setInt(1, codigoReserva);
                ResultSet rs = pstmt.executeQuery();
                
                if (rs.next()) {
                    // Si hay resultados, la reserva existe
                    numHabitacion = rs.getInt("num_hab");
                    
                    // Actualizar el estado de la habitación a "Ocupado"
                    String updateSql = "UPDATE habitacion SET estado = 'Ocupada' WHERE num_hab = ?";
                    
                    try (PreparedStatement updateStmt = conn.prepareStatement(updateSql)) {
                        updateStmt.setInt(1, numHabitacion);
                        int rowsAffected = updateStmt.executeUpdate();
                        
                        if (rowsAffected > 0) {
                            JOptionPane.showMessageDialog(this, "Ha ingresado con su reserva correctamente.");
                        } else {
                            JOptionPane.showMessageDialog(this, "No se pudo ingresar.", "Error", JOptionPane.ERROR_MESSAGE);
                        }
                    }
                } else {
                    // No se encontró la reserva
                    JOptionPane.showMessageDialog(this, "La reserva no existe.", "Aviso", JOptionPane.WARNING_MESSAGE);
                }
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, "Error al conectar con la base de datos: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }  

    private void jButtonAtrasActionPerformed(ActionEvent evt) {
        JFrame DireccionIngreso= new JFrame("RDireccionIngresoecepcionista");
        DireccionIngreso.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        DireccionIngreso.add(new frmDireccionIngreso());
        DireccionIngreso.pack();
        DireccionIngreso.setLocationRelativeTo(null);
        DireccionIngreso.setVisible(true);
        SwingUtilities.getWindowAncestor(this).dispose();
    }




    // Variables declaration - do not modify                     
    private javax.swing.JButton jButtonAtras;
    private javax.swing.JButton jButtonINGRESAR_CON_RESERVA;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabelConReserva_AVISO;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextFieldCodigoReserva;
    private javax.swing.JLabel txtingresoHabitacion;
    // End of variables declaration                   
}