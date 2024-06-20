package SubVentanas;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.swing.JFrame;

import Principal.frmAdministrador;

public class frmCambioDescClienteHabi extends javax.swing.JPanel {

    // Atributos para la conexión a la base de datos
    String url = "jdbc:postgresql://localhost:5432/ProyectoFinal";
    String usuario = "postgres";
    String contraseña = "Nicolas1118";

    /**
     * Creates new form frmCambioDescClienteHabi
     */
    public frmCambioDescClienteHabi() {
        initComponents();
        
        // Configurar el ActionListener para el botón de ACTUALIZAR
        jButtonActualizar.addActionListener(e -> {
            actualizarDescuento();
        });

        jButtonAtras.addActionListener(e -> {
            JFrame Administrador = new JFrame("Administrador");
            Administrador.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            Administrador.add(new frmAdministrador());
            Administrador.pack();
            Administrador.setLocationRelativeTo(null);
            Administrador.setVisible(true);

            javax.swing.SwingUtilities.getWindowAncestor(this).dispose(); // Cierra la ventana actual
        });
    }

    private void actualizarDescuento() {
        // Obtener los valores de los campos de texto
        String cedulaStr = jTextFieldCedulaHabitual.getText().trim();
        String nuevoDescStr = jTextFieldNuevoValorDesc.getText().trim();
        
        // Validar que ambos campos no estén vacíos
        if (cedulaStr.isEmpty() || nuevoDescStr.isEmpty()) {
            javax.swing.JOptionPane.showMessageDialog(null, "Por Favor Ingresa Todos Los Campos");
            return;
        }
        
        int cedula = Integer.parseInt(cedulaStr);
        double nuevoDescuento = Double.parseDouble(nuevoDescStr);
        
        try {
            // Establecer la conexión a la base de datos
            Connection conn = DriverManager.getConnection(url, usuario, contraseña);
            
            // Preparar la consulta SQL parametrizada
            String sql = "UPDATE habitual SET descuento = ? WHERE cedula = ?";
            PreparedStatement pstmt = conn.prepareStatement(sql);
            
            // Establecer los parámetros de la consulta
            pstmt.setDouble(1, nuevoDescuento);
            pstmt.setInt(2, cedula);
            
            // Ejecutar la actualización
            int filasActualizadas = pstmt.executeUpdate();
            
            if (filasActualizadas > 0) {
                // Éxito: mostrar mensaje de éxito o hacer alguna acción adicional
                javax.swing.JOptionPane.showMessageDialog(null, "Descuento actualizado correctamente");
            } else {
                // Manejar el caso donde no se actualizó ninguna fila (por ejemplo, cédula no encontrada)
                javax.swing.JOptionPane.showMessageDialog(null, "No se encontró ningún registro para actualizar");
            }
            
            // Cerrar la conexión y el PreparedStatement
            pstmt.close();
            conn.close();
            
        } catch (SQLException ex) {
            // Manejar cualquier error de SQL
            ex.printStackTrace();
            javax.swing.JOptionPane.showMessageDialog(null, "Error al intentar actualizar el descuento");
        }
    }

    // Métodos generados por el GUI Builder (no modificados)
    
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        txtCambioClienteHabitual = new javax.swing.JLabel();
        jLabelCedulaClienteHabitual = new javax.swing.JLabel();
        jTextFieldCedulaHabitual = new javax.swing.JTextField();
        jLabelNuevoValorDescuento = new javax.swing.JLabel();
        jTextFieldNuevoValorDesc = new javax.swing.JTextField();
        jButtonActualizar = new javax.swing.JButton();
        jButtonAtras = new javax.swing.JButton();

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        txtCambioClienteHabitual.setBackground(new java.awt.Color(255, 255, 255));
        txtCambioClienteHabitual.setFont(new java.awt.Font("Franklin Gothic Demi", 0, 18)); // NOI18N
        txtCambioClienteHabitual.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtCambioClienteHabitual.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagene/favicon.png"))); // NOI18N
        txtCambioClienteHabitual.setText("CAMBIO DESC CLIENTE HABITUAL");

        jLabelCedulaClienteHabitual.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 12)); // NOI18N
        jLabelCedulaClienteHabitual.setText("CEDULA CLIENTE HABITUAL");

        jTextFieldCedulaHabitual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldCedulaHabitualActionPerformed(evt);
            }
        });

        jLabelNuevoValorDescuento.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 12)); // NOI18N
        jLabelNuevoValorDescuento.setText("NUEVO VALOR DESCUENTO");

        jButtonActualizar.setBackground(new java.awt.Color(204, 204, 255));
        jButtonActualizar.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 12)); // NOI18N
        jButtonActualizar.setText("ACTUALIZAR");
        jButtonActualizar.setBorder(null);

        jButtonAtras.setBackground(new java.awt.Color(204, 204, 255));
        jButtonAtras.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 12)); // NOI18N
        jButtonAtras.setText("ATRAS");
        jButtonAtras.setBorder(null);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(txtCambioClienteHabitual, javax.swing.GroupLayout.PREFERRED_SIZE, 367, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabelCedulaClienteHabitual, javax.swing.GroupLayout.DEFAULT_SIZE, 184, Short.MAX_VALUE)
                            .addComponent(jLabelNuevoValorDescuento, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButtonAtras, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(30, 30, 30)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextFieldNuevoValorDesc, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButtonActualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextFieldCedulaHabitual, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(27, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(txtCambioClienteHabitual, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelCedulaClienteHabitual, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldCedulaHabitual, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelNuevoValorDescuento, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldNuevoValorDesc, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonActualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonAtras, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(36, Short.MAX_VALUE))
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

    private void jTextFieldCedulaHabitualActionPerformed(java.awt.event.ActionEvent evt) {                                                         
        // TODO add your handling code here:
    }                                                        

    // Variables declaration - do not modify                     
    private javax.swing.JButton jButtonActualizar;
    private javax.swing.JButton jButtonAtras;
    private javax.swing.JLabel jLabelCedulaClienteHabitual;
    private javax.swing.JLabel jLabelNuevoValorDescuento;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextFieldCedulaHabitual;
    private javax.swing.JTextField jTextFieldNuevoValorDesc;
    private javax.swing.JLabel txtCambioClienteHabitual;
    // End of variables declaration                   
}
