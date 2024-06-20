package SubVentanas;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;

import Principal.frmAdministrador;

public class frmCambioPrecioHab extends javax.swing.JPanel {

    // Define los tipos de habitación
    private static final String[] TIPOS_HABITACION = {
        "Sencilla", "Doble", "Matrimonial", "Suit Sencilla", "Suit Presidencial"
    };

    // Constructor
    public frmCambioPrecioHab() {
        initComponents();
        // Inicializa el JComboBox con los tipos de habitación
        jComboBox_TipoHabitacion.setModel(new javax.swing.DefaultComboBoxModel<>(TIPOS_HABITACION));
        // Añadir acción al botón de cambiar precio
        jButtonCambiarPrecio.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cambiarPrecio();
            }
        });
        
        JButton_Atras.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JFrame Administrador = new JFrame("Administrador");
                Administrador.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                Administrador.add(new frmAdministrador());
                Administrador.pack();
                Administrador.setLocationRelativeTo(null);
                Administrador.setVisible(true);

                JFrame CambioPrecioHab = (JFrame) SwingUtilities.getWindowAncestor(frmCambioPrecioHab.this);
                CambioPrecioHab.dispose();
            }
        });
    }

    
    private void cambiarPrecio() {
        String tipoHabitacion = (String) jComboBox_TipoHabitacion.getSelectedItem();
        String nuevoPrecioTexto = jTextField_ValorNuevoPrecio.getText();

        String url = "jdbc:postgresql://localhost:5432/ProyectoFinal";
        String usuario = "postgres";
        String contraseña = "Nicolas1118";
        
        // Validar que el nuevo precio sea un número entero
        int nuevoPrecio;
        try {
            nuevoPrecio = Integer.parseInt(nuevoPrecioTexto);
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Por favor, ingrese un valor válido para el precio.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        // Actualizar el precio en la base de datos
        try (Connection connection = DriverManager.getConnection(url, usuario, contraseña)) {
            String sql = "UPDATE habitacion SET precio = ? WHERE tipo = ?";
            try (PreparedStatement statement = connection.prepareStatement(sql)) {
                statement.setInt(1, nuevoPrecio);
                statement.setString(2, tipoHabitacion);
                int rowsUpdated = statement.executeUpdate();
                if (rowsUpdated > 0) {
                    JOptionPane.showMessageDialog(this, "El precio se ha actualizado correctamente.", "Éxito", JOptionPane.INFORMATION_MESSAGE);
                } else {
                    JOptionPane.showMessageDialog(this, "No se encontró el tipo de habitación especificado.", "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(this, "Error al conectar con la base de datos: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        txtCotizacion = new javax.swing.JLabel();
        jComboBox_TipoHabitacion = new javax.swing.JComboBox<>();
        jLabel_NuevoValorPrecio = new javax.swing.JLabel();
        jTextField_ValorNuevoPrecio = new javax.swing.JTextField();
        jButtonCambiarPrecio = new javax.swing.JButton();
        JButton_Atras = new javax.swing.JButton();

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        txtCotizacion.setFont(new java.awt.Font("Franklin Gothic Demi", 0, 18)); // NOI18N
        txtCotizacion.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtCotizacion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagene/favicon.png"))); // NOI18N
        txtCotizacion.setText("CAMBIO DE PRECIO DE HABITACION");

        jComboBox_TipoHabitacion.setBackground(new java.awt.Color(204, 204, 255));
        jComboBox_TipoHabitacion.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 12)); // NOI18N
        jComboBox_TipoHabitacion.setBorder(null);

        jLabel_NuevoValorPrecio.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 12)); // NOI18N
        jLabel_NuevoValorPrecio.setText("NUEVO VALOR");

        jButtonCambiarPrecio.setBackground(new java.awt.Color(204, 204, 255));
        jButtonCambiarPrecio.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 12)); // NOI18N
        jButtonCambiarPrecio.setText("CAMBIAR PRECIO");
        jButtonCambiarPrecio.setBorder(null);

        JButton_Atras.setBackground(new java.awt.Color(204, 204, 255));
        JButton_Atras.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 12)); // NOI18N
        JButton_Atras.setText("ATRAS");
        JButton_Atras.setBorder(null);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(56, 56, 56)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(txtCotizacion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(66, 66, 66))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jComboBox_TipoHabitacion, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel_NuevoValorPrecio, javax.swing.GroupLayout.DEFAULT_SIZE, 126, Short.MAX_VALUE))
                            .addComponent(JButton_Atras, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextField_ValorNuevoPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButtonCambiarPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(txtCotizacion, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jComboBox_TipoHabitacion, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel_NuevoValorPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField_ValorNuevoPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonCambiarPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JButton_Atras, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(45, Short.MAX_VALUE))
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
    }

    // Variables declaration - do not modify                     
    private javax.swing.JButton JButton_Atras;
    private javax.swing.JButton jButtonCambiarPrecio;
    private javax.swing.JComboBox<String> jComboBox_TipoHabitacion;
    private javax.swing.JLabel jLabel_NuevoValorPrecio;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextField_ValorNuevoPrecio;
    private javax.swing.JLabel txtCotizacion;
    // End of variables declaration                   
}
