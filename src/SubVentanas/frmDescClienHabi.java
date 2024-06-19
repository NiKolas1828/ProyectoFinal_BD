package SubVentanas;

import javax.swing.JFrame;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
//import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;

import Principal.frmRecepcionista;

public class frmDescClienHabi extends javax.swing.JPanel {

    public frmDescClienHabi() {
        initComponents();
    }

    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        txtIngresoConsultarDescClienteHabi = new javax.swing.JLabel();
        jLabel_Cedula = new javax.swing.JLabel();
        jTextField_CedulaClienteHabitual = new javax.swing.JTextField();
        jButton_ConsultarDesc = new javax.swing.JButton();
        jButton_Atras = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        txtIngresoConsultarDescClienteHabi.setFont(new java.awt.Font("Franklin Gothic Demi", 0, 18)); 
        txtIngresoConsultarDescClienteHabi.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtIngresoConsultarDescClienteHabi.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagene/favicon.png"))); 
        txtIngresoConsultarDescClienteHabi.setText("DESCUENTO CLIENTE HABITUAL");

        jLabel_Cedula.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 12)); 
        jLabel_Cedula.setText("CEDULA");

        jButton_ConsultarDesc.setBackground(new java.awt.Color(204, 204, 255));
        jButton_ConsultarDesc.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 12)); 
        jButton_ConsultarDesc.setText("CONSULTAR ");
        jButton_ConsultarDesc.setBorder(null);
        jButton_ConsultarDesc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_ConsultarDescActionPerformed(evt);
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

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(txtIngresoConsultarDescClienteHabi, javax.swing.GroupLayout.PREFERRED_SIZE, 376, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(66, 66, 66)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane1)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel_Cedula, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jTextField_CedulaClienteHabitual, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(18, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jButton_Atras, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton_ConsultarDesc, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(76, 76, 76))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtIngresoConsultarDescClienteHabi, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel_Cedula, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField_CedulaClienteHabitual, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton_ConsultarDesc, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton_Atras, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(27, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
    }

    private void jButton_ConsultarDescActionPerformed(java.awt.event.ActionEvent evt) {
        try {
            int cedula = Integer.parseInt(jTextField_CedulaClienteHabitual.getText());
            consultarDescuento(cedula);
        } catch (NumberFormatException e) {
            jTextArea1.setText("La cédula ingresada no es válida.\n");
        }
    }

    private void consultarDescuento(int cedula) {

        String url = "jdbc:postgresql://localhost:5432/ProyectoFinal";
        String usuario = "postgres";
        String contraseña = "Nicolas1118";

        String query = "SELECT DESCUENTO FROM HABITUAL WHERE CEDULA = ?";

        try (Connection con = DriverManager.getConnection(url, usuario, contraseña);
             PreparedStatement pst = con.prepareStatement(query)) {

            pst.setInt(1, cedula);
            ResultSet rs = pst.executeQuery();

            jTextArea1.setText(""); // Clear the text area

            if (!rs.isBeforeFirst()) {
                jTextArea1.append("No se encontró ningún cliente habitual con la cédula ingresada.\n");
                return;
            }

            while (rs.next()) {
                try {
                    int descuento = rs.getInt("descuento");
                    jTextArea1.append("Descuento: " + descuento + "%\n");
                } catch (SQLException e) {
                    System.err.println("Error al obtener datos de la columna: " + e.getMessage());
                    jTextArea1.append("Error al obtener datos de la columna: " + e.getMessage() + "\n");
                }
            }

        } catch (SQLException ex) {
            ex.printStackTrace();
            jTextArea1.setText("Error al consultar el descuento.\n");
        }
    }

    private void jButton_AtrasActionPerformed(java.awt.event.ActionEvent evt) {
        JFrame Recepcionista = new JFrame("Recepcionista");
        Recepcionista.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Recepcionista.add(new frmRecepcionista());
        Recepcionista.pack();
        Recepcionista.setLocationRelativeTo(null);
        Recepcionista.setVisible(true);
        SwingUtilities.getWindowAncestor(this).dispose();
    }

    // Variables declaration - do not modify                     
    private javax.swing.JButton jButton_Atras;
    private javax.swing.JButton jButton_ConsultarDesc;
    private javax.swing.JLabel jLabel_Cedula;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField jTextField_CedulaClienteHabitual;
    private javax.swing.JLabel txtIngresoConsultarDescClienteHabi;
    // End of variables declaration                   
}

