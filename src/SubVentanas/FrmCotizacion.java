package SubVentanas;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
//import javax.swing.JButton;
//import javax.swing.JLabel;
import javax.swing.JPanel;
//import javax.swing.JScrollPane;
//import javax.swing.JTextArea;
//import javax.swing.JTextField;
import javax.swing.SwingUtilities;

import Principal.frmRecepcionista;

public class FrmCotizacion extends JPanel {

    private final String url = "jdbc:postgresql://localhost:5432/ProyectoFinal";
    private final String usuario = "postgres";
    private final String contraseña = "Nicolas1118";
    private Connection conexion = null;
    
    public FrmCotizacion() {
        initComponents();
        establecerConexion();
    }

    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        txtCotizacion = new javax.swing.JLabel();
        jLabel_Cedula = new javax.swing.JLabel();
        jTextField_CedulaCotizacion = new javax.swing.JTextField();  // Cambiado a JTextField
        jLabel_NumHab = new javax.swing.JLabel();
        jTextField_NumHabitacion = new javax.swing.JTextField();
        jLabel_NumNoches = new javax.swing.JLabel();
        jTextField_NumNoches = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextAreaMostrarCotizacion = new javax.swing.JTextArea();
        jButton_Atras = new javax.swing.JButton();
        jButton_ConsultarCotizacion = new javax.swing.JButton();

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        txtCotizacion.setFont(new java.awt.Font("Franklin Gothic Demi", 0, 18)); // NOI18N
        txtCotizacion.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtCotizacion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagene/favicon.png"))); // NOI18N
        txtCotizacion.setText("COTIZACIÓN");

        jLabel_Cedula.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 12)); // NOI18N
        jLabel_Cedula.setText("CEDULA");

        jLabel_NumHab.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 12)); // NOI18N
        jLabel_NumHab.setText("NUM_HAB");

        jLabel_NumNoches.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 12)); // NOI18N
        jLabel_NumNoches.setText("NUM_NOCHE");

        jTextAreaMostrarCotizacion.setColumns(20);
        jTextAreaMostrarCotizacion.setRows(5);
        jScrollPane1.setViewportView(jTextAreaMostrarCotizacion);

        jButton_Atras.setBackground(new java.awt.Color(204, 204, 255));
        jButton_Atras.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 12)); // NOI18N
        jButton_Atras.setText("ATRAS");
        jButton_Atras.setBorder(null);
        jButton_Atras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_AtrasActionPerformed(evt);
            }
        });

        jButton_ConsultarCotizacion.setBackground(new java.awt.Color(204, 204, 255));
        jButton_ConsultarCotizacion.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 12)); // NOI18N
        jButton_ConsultarCotizacion.setText("CONSULTAR ");
        jButton_ConsultarCotizacion.setBorder(null);
        jButton_ConsultarCotizacion.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                jButton_ConsultarCotizacionActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(txtCotizacion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(70, 70, 70))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel_Cedula, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel_NumHab, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jTextField_CedulaCotizacion, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField_NumHabitacion, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jLabel_NumNoches, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jTextField_NumNoches, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(37, 37, 37))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(76, 76, 76)
                .addComponent(jButton_Atras, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addComponent(jButton_ConsultarCotizacion, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(txtCotizacion, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel_Cedula, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField_CedulaCotizacion, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel_NumHab, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField_NumHabitacion, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel_NumNoches, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField_NumNoches, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton_ConsultarCotizacion, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton_Atras, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(23, Short.MAX_VALUE))
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

    private void establecerConexion() {
        try {
            // Cargar el driver de PostgreSQL
            Class.forName("org.postgresql.Driver");
            
            // Establecer la conexión con los datos de la base de datos
            conexion = DriverManager.getConnection(url, usuario, contraseña);
            //System.out.println("Conexión establecida correctamente.");
            
        } catch (ClassNotFoundException | SQLException e) {
            //System.out.println("Error al conectar con la base de datos: " + e.getMessage());
        }
    }

    private void jButton_AtrasActionPerformed(java.awt.event.ActionEvent evt) {
        JFrame Recepcionista = new JFrame("Recepcionista");
        Recepcionista.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Recepcionista.add(new frmRecepcionista());
        Recepcionista.pack();
        Recepcionista.setLocationRelativeTo(null);
        Recepcionista.setVisible(true);

        JFrame Cotizacion = (JFrame) SwingUtilities.getWindowAncestor(this);
        Cotizacion.dispose();
        };
    
        private void jButton_ConsultarCotizacionActionPerformed(java.awt.event.ActionEvent evt) {
            // Obtener los valores ingresados por el usuario desde los campos de texto
            int cedula = Integer.parseInt(jTextField_CedulaCotizacion.getText());
            int numHabitacion = Integer.parseInt(jTextField_NumHabitacion.getText());
            int numNoches = Integer.parseInt(jTextField_NumNoches.getText());
    
            // Variables para almacenar el descuento y el precio de la habitación
            double descuento = 0.0;
            double precioHabitacion = 0.0;
    
            // Consulta para obtener el descuento si el cliente es habitual
            try {
                // Consulta para clientes habituales
                PreparedStatement stmtDescuentoHabitual = conexion.prepareStatement("SELECT DESCUENTO FROM HABITUAL WHERE CEDULA = ?");
                stmtDescuentoHabitual.setInt(1, cedula);
                ResultSet rsDescuentoHabitual = stmtDescuentoHabitual.executeQuery();
    
                if (rsDescuentoHabitual.next()) {
                    descuento = rsDescuentoHabitual.getDouble("DESCUENTO");
                    // Cliente encontrado como habitual
                    System.out.println("Cliente habitual encontrado.");
                } else {
                    // Cliente no encontrado como habitual, buscar como normal
                    PreparedStatement stmtDescuentoNormal = conexion.prepareStatement("SELECT 0 AS DESCUENTO FROM CLIENTE WHERE CEDULA = ?");
                    stmtDescuentoNormal.setInt(1, cedula);
                    ResultSet rsDescuentoNormal = stmtDescuentoNormal.executeQuery();
    
                    if (rsDescuentoNormal.next()) {
                        // Cliente encontrado como normal, descuento será 0
                        System.out.println("Cliente normal encontrado.");
                    } else {
                        // Mostrar mensaje de cliente no encontrado
                        JOptionPane.showMessageDialog(this, "El cliente con cédula " + cedula + " no está registrado.",
                                "Cliente no encontrado", JOptionPane.WARNING_MESSAGE);
                        // Liberar recursos
                        rsDescuentoNormal.close();
                        stmtDescuentoNormal.close();
                        rsDescuentoHabitual.close();
                        stmtDescuentoHabitual.close();
                        return; // Salir del método
                    }
    
                    rsDescuentoNormal.close();
                    stmtDescuentoNormal.close();
                }
    
                rsDescuentoHabitual.close();
                stmtDescuentoHabitual.close();
            } catch (SQLException e) {
                System.out.println("Error al consultar el descuento: " + e.getMessage());
            }
    
            // Consulta para obtener el precio de la habitación
            try {
                PreparedStatement stmtPrecio = conexion.prepareStatement("SELECT PRECIO FROM HABITACION WHERE NUM_HAB = ?");
                stmtPrecio.setInt(1, numHabitacion);
                ResultSet rsPrecio = stmtPrecio.executeQuery();
    
                if (rsPrecio.next()) {
                    precioHabitacion = rsPrecio.getDouble("PRECIO");
                    // Habitación encontrada
                    System.out.println("Habitación encontrada.");
                } else {
                    // Mostrar mensaje de habitación no encontrada
                    JOptionPane.showMessageDialog(this, "La habitación " + numHabitacion + " no está registrada.",
                            "Habitación no encontrada", JOptionPane.WARNING_MESSAGE);
                    // Liberar recursos
                    rsPrecio.close();
                    stmtPrecio.close();
                    return; // Salir del método
                }
    
                rsPrecio.close();
                stmtPrecio.close();
            } catch (SQLException e) {
                System.out.println("Error al consultar el precio de la habitación: " + e.getMessage());
            }
    
            // Calcular el precio total del hospedaje
            double precioTotal;
            if (descuento > 0) {
                precioTotal = precioHabitacion * numNoches * (1 - (descuento / 100));
            } else {
                precioTotal = precioHabitacion * numNoches;
            }
    
            // Mostrar el resultado en el JTextArea
            jTextAreaMostrarCotizacion.setText("Precio total del hospedaje: $" + precioTotal);
        }
        
    
        
        @Override
        public void finalize() {
            try {
                if (conexion != null) {
                    conexion.close();
                }
            } catch (SQLException e) {
                System.out.println("Error al cerrar la conexión: " + e.getMessage());
            }
        }
        
        // Variables declaration - do not modify                     
        private javax.swing.JButton jButton_Atras;
        private javax.swing.JButton jButton_ConsultarCotizacion;
        private javax.swing.JLabel jLabel_Cedula;
        private javax.swing.JLabel jLabel_NumHab;
        private javax.swing.JLabel jLabel_NumNoches;
        private javax.swing.JPanel jPanel1;
        private javax.swing.JScrollPane jScrollPane1;
        private javax.swing.JTextArea jTextAreaMostrarCotizacion;
        private javax.swing.JTextField jTextField_CedulaCotizacion;
        private javax.swing.JTextField jTextField_NumHabitacion;
        private javax.swing.JTextField jTextField_NumNoches;
        private javax.swing.JLabel txtCotizacion; 
        // End of variables declaration  
}            

