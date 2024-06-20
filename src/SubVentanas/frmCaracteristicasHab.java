package SubVentanas;

import javax.swing.JFrame;
import javax.swing.SwingUtilities;

import Principal.frmGerente;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class frmCaracteristicasHab extends javax.swing.JPanel {

    public frmCaracteristicasHab() {
        initComponents();
        initializeComboBox();
    }

    private void initializeComboBox() {
        jComboBox_Tipo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] {
            "Sencilla", "Doble", "Matrimonial", "Suit Sencilla", "Suit Presidencial"
        }));
    }

    private void initComponents() {
        jPanel1 = new javax.swing.JPanel();
        txtIngresoConsultarDisponibilidad = new javax.swing.JLabel();
        jComboBox_Tipo = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea_MostrarPrecio = new javax.swing.JTextArea();
        jButton_ConsultarPrecio = new javax.swing.JButton();
        jButton_Atras = new javax.swing.JButton();

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        txtIngresoConsultarDisponibilidad.setFont(new java.awt.Font("Franklin Gothic Demi", 0, 18));
        txtIngresoConsultarDisponibilidad.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtIngresoConsultarDisponibilidad.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagene/favicon.png")));
        txtIngresoConsultarDisponibilidad.setText("CARACTERISTICAS HABITACIONES");

        jComboBox_Tipo.setBackground(new java.awt.Color(204, 204, 255));
        jComboBox_Tipo.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 12));
        jComboBox_Tipo.setBorder(null);
        jComboBox_Tipo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox_TipoActionPerformed(evt);
            }
        });

        jTextArea_MostrarPrecio.setColumns(20);
        jTextArea_MostrarPrecio.setRows(5);
        jScrollPane1.setViewportView(jTextArea_MostrarPrecio);

        jButton_ConsultarPrecio.setBackground(new java.awt.Color(204, 204, 255));
        jButton_ConsultarPrecio.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 12));
        jButton_ConsultarPrecio.setText("CONSULTAR");
        jButton_ConsultarPrecio.setBorder(null);
        jButton_ConsultarPrecio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_ConsultarPrecioActionPerformed(evt);
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

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addContainerGap(30, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jScrollPane1)
                                    .addComponent(txtIngresoConsultarDisponibilidad, javax.swing.GroupLayout.DEFAULT_SIZE, 344, Short.MAX_VALUE))
                                .addComponent(jComboBox_Tipo, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(26, 26, 26))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                            .addComponent(jButton_Atras, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(jButton_ConsultarPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(95, 95, 95))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(16, 16, 16)
                    .addComponent(txtIngresoConsultarDisponibilidad, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                    .addComponent(jComboBox_Tipo, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(12, 12, 12)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jButton_ConsultarPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButton_Atras, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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

    private void jComboBox_TipoActionPerformed(java.awt.event.ActionEvent evt) {
        // No action needed here for now.
    }

    private void jButton_ConsultarPrecioActionPerformed(java.awt.event.ActionEvent evt) {
        String tipo = jComboBox_Tipo.getSelectedItem().toString();
        consultarPrecio(tipo);
    }

    private void consultarPrecio(String tipo) {
        String url = "jdbc:postgresql://localhost:5432/ProyectoFinal";
        String usuario = "postgres";
        String contraseña = "Nicolas1118";

        String query = "SELECT DISTINCT h.precio, s.nombre_servicio, s.costo_serv " +
                       "FROM habitacion h " +
                       "LEFT JOIN tiene t ON h.num_hab = t.num_hab " +
                       "LEFT JOIN servicios s ON t.cod_serv = s.cod_serv " +
                       "WHERE h.tipo = ?";

        try (Connection con = DriverManager.getConnection(url, usuario, contraseña);
             PreparedStatement pst = con.prepareStatement(query)) {

            pst.setString(1, tipo);
            ResultSet rs = pst.executeQuery();

            jTextArea_MostrarPrecio.setText(""); // Clear the text area

            // Check if there are results
            if (!rs.isBeforeFirst()) {
                jTextArea_MostrarPrecio.append("No hay habitaciones del tipo seleccionado.\n");
                return;
            }

            boolean isFirstRow = true;
            while (rs.next()) {
                if (isFirstRow) {
                    int precio = rs.getInt("precio");
                    jTextArea_MostrarPrecio.append("Precio: " + precio + "\n\n");
                    jTextArea_MostrarPrecio.append("Servicios:\n");
                    isFirstRow = false;
                }
                String nombreServicio = rs.getString("nombre_servicio");
                int costoServ = rs.getInt("costo_serv");
                jTextArea_MostrarPrecio.append("- " + nombreServicio + ": " + costoServ + "\n");
            }

        } catch (SQLException ex) {
            ex.printStackTrace();
            jTextArea_MostrarPrecio.setText("Error al consultar el precio y los servicios.\n");
        }
    }

    private void jButton_AtrasActionPerformed(java.awt.event.ActionEvent evt) {
        JFrame Gerente = new JFrame("Gerente");
        Gerente.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Gerente.add(new frmGerente());
        Gerente.pack();
        Gerente.setLocationRelativeTo(null);
        Gerente.setVisible(true);

        JFrame PrecioHabFrame = (JFrame) SwingUtilities.getWindowAncestor(this);
        PrecioHabFrame.dispose();
    }

    // Variables declaration - do not modify                     
    private javax.swing.JButton jButton_Atras;
    private javax.swing.JButton jButton_ConsultarPrecio;
    private javax.swing.JComboBox<String> jComboBox_Tipo;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea_MostrarPrecio;
    private javax.swing.JLabel txtIngresoConsultarDisponibilidad;
    // End of variables declaration                   
}
