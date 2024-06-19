package SubVentanas;

import javax.swing.JFrame;
import javax.swing.SwingUtilities;
import Principal.frmRecepcionista;
import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class frmReservas extends javax.swing.JPanel {

    public frmReservas() {
        initComponents();
    }

    private void initComponents() {
        jButton_CerrarSesion = new javax.swing.JButton();
        txtIngresoCliente = new javax.swing.JLabel();
        jLabel_CedulaCliente = new javax.swing.JLabel();
        jTextField_CedulaCliente = new javax.swing.JTextField();
        jLabel_FechaIngreso = new javax.swing.JLabel();
        jTextField_NumHabitacion = new javax.swing.JTextField();
        jLabel_NumHabitacion = new javax.swing.JLabel();
        jTextField_FechaIngreso = new javax.swing.JTextField();
        jLabel_NumeroDias = new javax.swing.JLabel();
        jTextField_NumeroDias = new javax.swing.JTextField();
        jButton_Reservar = new javax.swing.JButton();
        jButton_Atras = new javax.swing.JButton();

        jButton_CerrarSesion.setText("Cerrar Sesion");
        jButton_CerrarSesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_CerrarSesionActionPerformed(evt);
            }
        });

        setBackground(new java.awt.Color(255, 255, 255));

        txtIngresoCliente.setFont(new java.awt.Font("Franklin Gothic Demi", 0, 18)); 
        txtIngresoCliente.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtIngresoCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagene/favicon.png"))); 
        txtIngresoCliente.setText("REGISTRO RESERVA");

        jLabel_CedulaCliente.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 12)); 
        jLabel_CedulaCliente.setText("CEDULA CLIENTE");

        jLabel_FechaIngreso.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 12)); 
        jLabel_FechaIngreso.setText("FECHA DE INGRESO");

        jLabel_NumHabitacion.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 12)); 
        jLabel_NumHabitacion.setText("NUM DE HABITACION");

        jLabel_NumeroDias.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 12)); 
        jLabel_NumeroDias.setText("NUMERO DE DIAS");

        jButton_Reservar.setBackground(new java.awt.Color(204, 204, 255));
        jButton_Reservar.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 12)); 
        jButton_Reservar.setText("RESERVAR");
        jButton_Reservar.setBorder(null);
        jButton_Reservar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_ReservarActionPerformed(evt);
            }
        });

        jButton_Atras.setBackground(new java.awt.Color(204, 204, 255));
        jButton_Atras.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 12)); 
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
                .addGap(62, 62, 62)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel_NumHabitacion)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel_NumeroDias, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel_FechaIngreso, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel_CedulaCliente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(35, 35, 35))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jButton_Atras, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTextField_FechaIngreso, javax.swing.GroupLayout.DEFAULT_SIZE, 112, Short.MAX_VALUE)
                            .addComponent(jTextField_CedulaCliente)
                            .addComponent(jTextField_NumHabitacion, javax.swing.GroupLayout.DEFAULT_SIZE, 112, Short.MAX_VALUE)
                            .addComponent(jTextField_NumeroDias, javax.swing.GroupLayout.DEFAULT_SIZE, 112, Short.MAX_VALUE)
                            .addComponent(jButton_Reservar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addComponent(txtIngresoCliente, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 77, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(txtIngresoCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel_CedulaCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField_CedulaCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel_FechaIngreso, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField_FechaIngreso, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel_NumeroDias, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField_NumeroDias, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel_NumHabitacion, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField_NumHabitacion, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton_Reservar, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton_Atras, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(17, Short.MAX_VALUE))
        );
    }

    private void jButton_ReservarActionPerformed(java.awt.event.ActionEvent evt) {
        int cedula = Integer.parseInt(jTextField_CedulaCliente.getText());
        Date fechaIngreso = Date.valueOf(jTextField_FechaIngreso.getText()); // Convertir a java.sql.Date
        int numDias = Integer.parseInt(jTextField_NumeroDias.getText());
        int numHab = Integer.parseInt(jTextField_NumHabitacion.getText());
        
            // Verificar si el cliente existe en la base de datos
            if (!clienteExiste(cedula)) {
                javax.swing.JOptionPane.showMessageDialog(this, "El cliente no existe en la base de datos. Primero debe ingresar el cliente.");
                return;
            }
            
            // SE DEBE CAMBIAR LA VERIFICACION POR INTERVALOS. 
            // Verificar si la habitación existe y está disponible
            if (!habitacionDisponible(numHab)) {
                javax.swing.JOptionPane.showMessageDialog(this, "La habitación no existe o no está disponible para reservar.");
                return;
            }
        
            try {
                int codigoReserva = insertarReserva(cedula, fechaIngreso, numDias, numHab);
                actualizarEstadoHabitacion(numHab); // Actualizar el estado de la habitación a "Reservada"
                javax.swing.JOptionPane.showMessageDialog(this, "Reserva ingresada correctamente. Código de reserva: " + codigoReserva);
            } catch (SQLException e) {
                javax.swing.JOptionPane.showMessageDialog(this, "Error al ingresar la reserva: " + e.getMessage(), "Error", javax.swing.JOptionPane.ERROR_MESSAGE);
            }
        }
        
        private boolean clienteExiste(int cedula) {
            String url = "jdbc:postgresql://localhost:5432/ProyectoFinal";
            String user = "postgres";
            String password = "Nicolas1118";
            String sql = "SELECT * FROM cliente WHERE cedula = ?";
        
            try (Connection conn = DriverManager.getConnection(url, user, password);
                 PreparedStatement pstmt = conn.prepareStatement(sql)) {
        
                pstmt.setInt(1, cedula);
                try (ResultSet rs = pstmt.executeQuery()) {
                    return rs.next(); // Devuelve true si hay resultados (cliente encontrado), false si no hay resultados
                }
            } catch (SQLException e) {
                javax.swing.JOptionPane.showMessageDialog(this, "Error al verificar cliente: " + e.getMessage(), "Error", javax.swing.JOptionPane.ERROR_MESSAGE);
                return false;
            }
        }
        
        private boolean habitacionDisponible(int numHab) {
            String url = "jdbc:postgresql://localhost:5432/ProyectoFinal";
            String user = "postgres";
            String password = "Nicolas1118";
            String sql = "SELECT estado FROM habitacion WHERE num_hab = ? AND (estado = 'Disponible' or estado = 'Reservada')";
        
            try (Connection conn = DriverManager.getConnection(url, user, password);
                 PreparedStatement pstmt = conn.prepareStatement(sql)) {
        
                pstmt.setInt(1, numHab);
                try (ResultSet rs = pstmt.executeQuery()) {
                    return rs.next(); // Devuelve true si hay resultados (habitación disponible), false si no hay resultados
                }
            } catch (SQLException e) {
                javax.swing.JOptionPane.showMessageDialog(this, "Error al verificar habitación: " + e.getMessage(), "Error", javax.swing.JOptionPane.ERROR_MESSAGE);
                return false;
            }
        }
        
        private int insertarReserva(int cedula, Date fechaIngreso, int numDias, int numHab) throws SQLException {
            String url = "jdbc:postgresql://localhost:5432/ProyectoFinal";
            String user = "postgres";
            String password = "Nicolas1118";
            String sql = "INSERT INTO reserva (codigo_reserva, cod_c, fecha_entrada, num_dias, num_hab) VALUES (?, ?, ?, ?, ?)";
        
            int codigoReserva = generarCodigoReserva(); // Generar código de reserva
        
            try (Connection conn = DriverManager.getConnection(url, user, password);
                 PreparedStatement pstmt = conn.prepareStatement(sql)) {
        
                pstmt.setInt(1, codigoReserva);
                pstmt.setInt(2, cedula);
                pstmt.setDate(3, fechaIngreso);
                pstmt.setInt(4, numDias);
                pstmt.setInt(5, numHab);
                pstmt.executeUpdate();
        
            }
        
            return codigoReserva;
        }
        
        private int generarCodigoReserva() throws SQLException {
            String url = "jdbc:postgresql://localhost:5432/ProyectoFinal";
            String user = "postgres";
            String password = "Nicolas1118";
            String sql = "SELECT MAX(codigo_reserva) AS max_codigo_reserva FROM reserva";
        
            int siguienteCodigo = 1; // Valor por defecto si no hay reservas en la base de datos
        
            try (Connection conn = DriverManager.getConnection(url, user, password);
                 PreparedStatement pstmt = conn.prepareStatement(sql);
                 ResultSet rs = pstmt.executeQuery()) {
        
                if (rs.next()) {
                    siguienteCodigo = rs.getInt("max_codigo_reserva") + 1;
                }
            }
        
            return siguienteCodigo;
        }
        
        private void actualizarEstadoHabitacion(int numHab) throws SQLException {
            String url = "jdbc:postgresql://localhost:5432/ProyectoFinal";
            String user = "postgres";
            String password = "Nicolas1118";
            String sql = "UPDATE habitacion SET estado = 'Reservada' WHERE num_hab = ?";
        
            try (Connection conn = DriverManager.getConnection(url, user, password);
                 PreparedStatement pstmt = conn.prepareStatement(sql)) {
        
                pstmt.setInt(1, numHab);
                pstmt.executeUpdate();
            }
        }

    private void jButton_CerrarSesionActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void jButton_AtrasActionPerformed(java.awt.event.ActionEvent evt) {
        JFrame Recepcionista = new JFrame("Recepcionista");
        Recepcionista.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Recepcionista.add(new frmRecepcionista());
        Recepcionista.pack();
        Recepcionista.setLocationRelativeTo(null);
        Recepcionista.setVisible(true);

        JFrame ReservaFrame = (JFrame) SwingUtilities.getWindowAncestor(this);
        ReservaFrame.dispose();
    }

    private javax.swing.JButton jButton_Atras;
    private javax.swing.JButton jButton_CerrarSesion;
    private javax.swing.JButton jButton_Reservar;
    private javax.swing.JLabel jLabel_CedulaCliente;
    private javax.swing.JLabel jLabel_FechaIngreso;
    private javax.swing.JLabel jLabel_NumHabitacion;
    private javax.swing.JLabel jLabel_NumeroDias;
    private javax.swing.JTextField jTextField_CedulaCliente;
    private javax.swing.JTextField jTextField_FechaIngreso;
    private javax.swing.JTextField jTextField_NumHabitacion;
    private javax.swing.JTextField jTextField_NumeroDias;
    private javax.swing.JLabel txtIngresoCliente;
}
