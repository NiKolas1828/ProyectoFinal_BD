package SubVentanas;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class frmCliente extends javax.swing.JPanel {

    public frmCliente() {
        initComponents();
        jButton_IngresarCliente.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ingresarCliente();
            }
        });
    }

    //@SuppressWarnings("unchecked")
    private void initComponents() {
        txtIngresoCliente = new javax.swing.JLabel();
        jTextField_NombreCliente = new javax.swing.JTextField();
        Label_NombreCliente = new javax.swing.JLabel();
        Label_CedulaCliente = new javax.swing.JLabel();
        jTextField_TelefonoCliente = new javax.swing.JTextField();
        Label_TelefonoCliente = new javax.swing.JLabel();
        jTextField_CedulaCliente = new javax.swing.JTextField();
        jButton_IngresarCliente = new javax.swing.JButton();

        setBackground(new java.awt.Color(204, 204, 204));

        txtIngresoCliente.setFont(new java.awt.Font("Franklin Gothic Demi", 0, 18)); // NOI18N
        txtIngresoCliente.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtIngresoCliente.setText("INGRESO CLIENTE");

        Label_NombreCliente.setText("NOMBRE");

        Label_CedulaCliente.setText("CEDULA");

        Label_TelefonoCliente.setText("TELEFONO");

        jButton_IngresarCliente.setText("INGRESAR");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(97, 97, 97)
                .addComponent(txtIngresoCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(61, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(Label_CedulaCliente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Label_NombreCliente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Label_TelefonoCliente, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton_IngresarCliente)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jTextField_NombreCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jTextField_TelefonoCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jTextField_CedulaCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(47, 47, 47))
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                .addComponent(jButton_IngresarCliente)
                .addGap(23, 23, 23))
        );
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

        String sqlInsertar = "INSERT INTO cliente (nombre, cedula, telefono) VALUES (?, ?, ?)";

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

        try (PreparedStatement pstmtInsertar = conn.prepareStatement(sqlInsertar)) {
            pstmtInsertar.setString(1, nombre);
            pstmtInsertar.setInt(2, cedulaInt);
            pstmtInsertar.setString(3, telefono);
            pstmtInsertar.executeUpdate();

            JOptionPane.showMessageDialog(this, "Cliente ingresado correctamente");
        }

    } catch (SQLException e) {
        JOptionPane.showMessageDialog(this, "Error al ingresar cliente: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
    }

    }


    private javax.swing.JLabel Label_CedulaCliente;
    private javax.swing.JLabel Label_NombreCliente;
    private javax.swing.JLabel Label_TelefonoCliente;
    private javax.swing.JButton jButton_IngresarCliente;
    private javax.swing.JTextField jTextField_CedulaCliente;
    private javax.swing.JTextField jTextField_NombreCliente;
    private javax.swing.JTextField jTextField_TelefonoCliente;
    private javax.swing.JLabel txtIngresoCliente;
}
