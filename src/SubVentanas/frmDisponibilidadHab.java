package SubVentanas;

import javax.swing.JFrame;
import javax.swing.SwingUtilities;
import Principal.frmRecepcionista;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class frmDisponibilidadHab extends javax.swing.JPanel {

    public frmDisponibilidadHab() {
        initComponents();
        initializeComboBox();
    }

    private void initializeComboBox() {
        jComboBox_DOR.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Disponible", "Reservada", "Ocupada" }));
    }

    //@SuppressWarnings("unchecked")
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        txtIngresoConsultarDisponibilidad = new javax.swing.JLabel();
        jComboBox_DOR = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea_MostrarDisponibilidad = new javax.swing.JTextArea();
        jButton_ConsultarDispo = new javax.swing.JButton();
        jButton_Atras = new javax.swing.JButton();

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        txtIngresoConsultarDisponibilidad.setFont(new java.awt.Font("Franklin Gothic Demi", 0, 18));
        txtIngresoConsultarDisponibilidad.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtIngresoConsultarDisponibilidad.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagene/favicon.png")));
        txtIngresoConsultarDisponibilidad.setText("CONSULTAR DISPONIBILIDAD");

        jComboBox_DOR.setBackground(new java.awt.Color(204, 204, 255));
        jComboBox_DOR.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 12));
        jComboBox_DOR.setBorder(null);
        jComboBox_DOR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox_DORActionPerformed(evt);
            }
        });

        jTextArea_MostrarDisponibilidad.setColumns(20);
        jTextArea_MostrarDisponibilidad.setRows(5);
        jScrollPane1.setViewportView(jTextArea_MostrarDisponibilidad);

        jButton_ConsultarDispo.setBackground(new java.awt.Color(204, 204, 255));
        jButton_ConsultarDispo.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 12));
        jButton_ConsultarDispo.setText("CONSULTAR");
        jButton_ConsultarDispo.setBorder(null);
        jButton_ConsultarDispo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_ConsultarDispoActionPerformed(evt);
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
                            .addComponent(jComboBox_DOR, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(26, 26, 26))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jButton_Atras, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton_ConsultarDispo, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(95, 95, 95))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(txtIngresoConsultarDisponibilidad, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jComboBox_DOR, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton_ConsultarDispo, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton_Atras, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(10, Short.MAX_VALUE))
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

    private void jComboBox_DORActionPerformed(java.awt.event.ActionEvent evt) {
        // No action needed here for now.
    }

    private void jButton_ConsultarDispoActionPerformed(java.awt.event.ActionEvent evt) {
        String estado = jComboBox_DOR.getSelectedItem().toString();
        consultarDisponibilidad(estado);
    }

    private void consultarDisponibilidad(String estado) {
        String url = "jdbc:postgresql://localhost:5432/ProyectoFinal";
        String usuario = "postgres";
        String contraseña = "Nicolas1118";

        String query = "SELECT * FROM HABITACION WHERE ESTADO = ?";

        try (Connection con = DriverManager.getConnection(url, usuario, contraseña);
             PreparedStatement pst = con.prepareStatement(query)) {

            pst.setString(1, estado);
            ResultSet rs = pst.executeQuery();

            jTextArea_MostrarDisponibilidad.setText(""); // Clear the text area

            // Check if there are results
            if (!rs.isBeforeFirst()) {
                jTextArea_MostrarDisponibilidad.append("No hay habitaciones en el estado seleccionado.\n");
                return;
            }

            while (rs.next()) {
                int id = rs.getInt("num_hab");
                String tipo = rs.getString("tipo");
                String descripcion = rs.getString("estado");
                // Append data to the text area
                jTextArea_MostrarDisponibilidad.append("Num_Hab: " + id + ", Tipo: " + tipo + ", Estado: " + descripcion + "\n");
            }

        } catch (SQLException ex) {
            ex.printStackTrace();
            jTextArea_MostrarDisponibilidad.setText("Error al consultar la disponibilidad.\n");
        }
    }

    private void jButton_AtrasActionPerformed(java.awt.event.ActionEvent evt) {
        JFrame Recepcionista = new JFrame("Recepcionista");
        Recepcionista.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Recepcionista.add(new frmRecepcionista());
        Recepcionista.pack();
        Recepcionista.setLocationRelativeTo(null);
        Recepcionista.setVisible(true);

        JFrame DisponibilidadFrame = (JFrame) SwingUtilities.getWindowAncestor(this);
        DisponibilidadFrame.dispose();
    }

    private javax.swing.JButton jButton_Atras;
    private javax.swing.JButton jButton_ConsultarDispo;
    private javax.swing.JComboBox<String> jComboBox_DOR;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea_MostrarDisponibilidad;
    private javax.swing.JLabel txtIngresoConsultarDisponibilidad;
}
