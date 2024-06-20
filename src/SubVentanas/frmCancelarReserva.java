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

import Principal.frmRecepcionista;

/**
 *
 * @author Nicolas
 */
public class frmCancelarReserva extends javax.swing.JPanel {

    private Connection connection;
    /**
     * Creates new form frmCancelarReserva
     */
    public frmCancelarReserva() {
        initComponents();
        initDatabaseConnection();
        jButtonConsultarReserva.addActionListener(evt -> consultarReserva());
        jButtonCancelarReserva.addActionListener(evt -> cancelarReserva());
    }


    private void initDatabaseConnection() {
        try {
            // Configura la conexión a la base de datos PostgreSQL
            String url = "jdbc:postgresql://localhost:5432/ProyectoFinal";
            String usuario = "postgres";
            String contraseña = "Nicolas1118";
            connection = DriverManager.getConnection(url, usuario, contraseña);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    private void consultarReserva() {
        String codigoReserva = jTextFieldCodigoReserva.getText();
        String query = "SELECT * FROM reserva WHERE codigo_reserva = ?";
        try (PreparedStatement ps = connection.prepareStatement(query)) {
            ps.setInt(1, Integer.parseInt(codigoReserva));
            ResultSet rs = ps.executeQuery();
            StringBuilder sb = new StringBuilder();
            boolean reservaEncontrada = false;

            while (rs.next()) {
                reservaEncontrada = true;
                // Suponiendo que tu tabla tiene columnas: codigo_reserva, num_hab, y otras
                sb.append("Código Reserva: ").append(rs.getInt("codigo_reserva")).append("\n");
                sb.append("Número Habitación: ").append(rs.getInt("num_hab")).append("\n");
                // Agrega más columnas según sea necesario
                sb.append("---------------------------\n");
            }

            if (reservaEncontrada) {
                jTextAreaMostrarDatosReserva.setText(sb.toString());
            } else {
                JOptionPane.showMessageDialog(this, "El número de reserva no está registrado.", "Reserva no encontrada", JOptionPane.WARNING_MESSAGE);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    private void cancelarReserva() {
        String codigoReserva = jTextFieldCodigoReserva.getText();
        String countQuery = "SELECT COUNT(num_hab) FROM reserva WHERE num_hab IN (SELECT num_hab FROM reserva WHERE codigo_reserva = ?)";
        String updateQuery = "UPDATE habitacion SET estado = 'Disponible' WHERE num_hab IN (SELECT num_hab FROM reserva WHERE codigo_reserva = ?)";
        String deleteQuery = "DELETE FROM reserva WHERE codigo_reserva = ?";
        try {
            // Inicia una transacción
            connection.setAutoCommit(false);

            // Verifica la cantidad de reservas
            int cantidadReserva = 0;
            try (PreparedStatement psCount = connection.prepareStatement(countQuery)) {
                psCount.setInt(1, Integer.parseInt(codigoReserva));
                try (ResultSet rs = psCount.executeQuery()) {
                    if (rs.next()) {
                        cantidadReserva = rs.getInt(1);
                    }
                }
            }

            // Actualiza el estado de la habitación si corresponde
            if (cantidadReserva == 1) {
                try (PreparedStatement psUpdate = connection.prepareStatement(updateQuery)) {
                    psUpdate.setInt(1, Integer.parseInt(codigoReserva));
                    psUpdate.executeUpdate();
                }
            }

            // Elimina la reserva
            try (PreparedStatement psDelete = connection.prepareStatement(deleteQuery)) {
                psDelete.setInt(1, Integer.parseInt(codigoReserva));
                psDelete.executeUpdate();
            }

            // Confirma la transacción
            connection.commit();
            jTextAreaMostrarDatosReserva.setText("Reserva cancelada correctamente.");
        } catch (SQLException e) {
            try {
                connection.rollback();
            } catch (SQLException rollbackEx) {
                rollbackEx.printStackTrace();
            }
            e.printStackTrace();
        } finally {
            try {
                connection.setAutoCommit(true);
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        }
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
        txtCancelarReserva = new javax.swing.JLabel();
        jLabelCodigoReserva = new javax.swing.JLabel();
        jTextFieldCodigoReserva = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextAreaMostrarDatosReserva = new javax.swing.JTextArea();
        jButtonCancelarReserva = new javax.swing.JButton();
        jButtonConsultarReserva = new javax.swing.JButton();
        jButtonAtras = new javax.swing.JButton();

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        txtCancelarReserva.setFont(new java.awt.Font("Franklin Gothic Demi", 0, 18)); // NOI18N
        txtCancelarReserva.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtCancelarReserva.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagene/favicon.png"))); // NOI18N
        txtCancelarReserva.setText("CANCELAR RESERVA ");

        jLabelCodigoReserva.setBackground(new java.awt.Color(255, 255, 255));
        jLabelCodigoReserva.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 12)); // NOI18N
        jLabelCodigoReserva.setText("CODIGO DE RESERVA");

        jTextAreaMostrarDatosReserva.setColumns(20);
        jTextAreaMostrarDatosReserva.setRows(5);
        jScrollPane1.setViewportView(jTextAreaMostrarDatosReserva);

        jButtonCancelarReserva.setBackground(new java.awt.Color(204, 204, 255));
        jButtonCancelarReserva.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 12)); // NOI18N
        jButtonCancelarReserva.setText("CANCELAR RESERVA");
        jButtonCancelarReserva.setBorder(null);

        jButtonConsultarReserva.setBackground(new java.awt.Color(204, 204, 255));
        jButtonConsultarReserva.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 12)); // NOI18N
        jButtonConsultarReserva.setText("CONSULTAR RESERVA");
        jButtonConsultarReserva.setBorder(null);

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
                        .addGap(67, 67, 67)
                        .addComponent(txtCancelarReserva, javax.swing.GroupLayout.PREFERRED_SIZE, 257, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(52, 52, 52)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jButtonConsultarReserva, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(18, 18, 18)
                                .addComponent(jButtonCancelarReserva, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 318, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabelCodigoReserva, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jTextFieldCodigoReserva, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jButtonAtras, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(30, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(txtCancelarReserva, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldCodigoReserva, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelCodigoReserva, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonCancelarReserva, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonConsultarReserva, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButtonAtras, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(29, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        
        
    }
    
    private void jButtonAtrasActionPerformed(java.awt.event.ActionEvent evt) {                                           
        JFrame Recepcionista = new JFrame("Recepcionista");
        Recepcionista.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Recepcionista.add(new frmRecepcionista());
        Recepcionista.pack();
        Recepcionista.setLocationRelativeTo(null);
        Recepcionista.setVisible(true);

        JFrame ClienteFrame = (JFrame) SwingUtilities.getWindowAncestor(this);
        ClienteFrame.dispose();
    }// </editor-fold>             
    
    


    // Variables declaration - do not modify                     
    private javax.swing.JButton jButtonAtras;
    private javax.swing.JButton jButtonCancelarReserva;
    private javax.swing.JButton jButtonConsultarReserva;
    private javax.swing.JLabel jLabelCodigoReserva;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextAreaMostrarDatosReserva;
    private javax.swing.JTextField jTextFieldCodigoReserva;
    private javax.swing.JLabel txtCancelarReserva;
    // End of variables declaration                   
}
