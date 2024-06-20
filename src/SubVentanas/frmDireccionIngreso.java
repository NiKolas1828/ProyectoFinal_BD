package SubVentanas;

import java.awt.event.ActionEvent;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.SwingUtilities;

import Principal.frmRecepcionista;

public class frmDireccionIngreso extends javax.swing.JPanel {

    public frmDireccionIngreso() {
        initComponents();
    }

    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        txtTiposDeIngreso = new javax.swing.JLabel();
        jButtonIngresoConReserva = new javax.swing.JButton();
        jButtonIngresoSinReserva = new javax.swing.JButton();
        jButtonAtras = new javax.swing.JButton();

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        txtTiposDeIngreso.setFont(new java.awt.Font("Franklin Gothic Demi", 0, 18));
        txtTiposDeIngreso.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtTiposDeIngreso.setIcon(new ImageIcon(getClass().getResource("/Imagene/favicon.png")));
        txtTiposDeIngreso.setText("TIPOS DE INGRESO");

        jButtonIngresoConReserva.setBackground(new java.awt.Color(204, 204, 255));
        jButtonIngresoConReserva.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 12));
        jButtonIngresoConReserva.setText("INGRESO CON RESERVA");
        jButtonIngresoConReserva.setBorder(null);
        jButtonIngresoConReserva.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonIngresoConReservaActionPerformed(evt);
            }
        });

        jButtonIngresoSinReserva.setBackground(new java.awt.Color(204, 204, 255));
        jButtonIngresoSinReserva.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 12));
        jButtonIngresoSinReserva.setText("INGRESO SIN RESERVA");
        jButtonIngresoSinReserva.setBorder(null);
        jButtonIngresoSinReserva.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonIngresoSinReservaActionPerformed(evt);
            }

        
        });
        

        jButtonAtras.setBackground(new java.awt.Color(204, 204, 255));
        jButtonAtras.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 12));
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
                .addGap(82, 82, 82)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtTiposDeIngreso, javax.swing.GroupLayout.DEFAULT_SIZE, 226, Short.MAX_VALUE)
                    .addComponent(jButtonIngresoConReserva, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButtonIngresoSinReserva, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(92, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButtonAtras, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(142, 142, 142))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(txtTiposDeIngreso, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(jButtonIngresoConReserva, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButtonIngresoSinReserva, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButtonAtras, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
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

    private void jButtonIngresoConReservaActionPerformed(java.awt.event.ActionEvent evt) {
        JFrame Recepcionista = new JFrame("Recepcionista");
        Recepcionista.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Recepcionista.add(new frmIngresoClienteConReserva());
        Recepcionista.pack();
        Recepcionista.setLocationRelativeTo(null);
        Recepcionista.setVisible(true);
        SwingUtilities.getWindowAncestor(this).dispose();
    }

    private void jButtonAtrasActionPerformed(ActionEvent evt) {
        JFrame Recepcionista = new JFrame("Recepcionista");
        Recepcionista.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Recepcionista.add(new frmRecepcionista());
        Recepcionista.pack();
        Recepcionista.setLocationRelativeTo(null);
        Recepcionista.setVisible(true);
        SwingUtilities.getWindowAncestor(this).dispose();

    }

    private void jButtonIngresoSinReservaActionPerformed(ActionEvent evt) {
        JFrame Recepcionista = new JFrame("Recepcionista");
        Recepcionista.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Recepcionista.add(new frmIngresoSinReserva());
        Recepcionista.pack();
        Recepcionista.setLocationRelativeTo(null);
        Recepcionista.setVisible(true);
        SwingUtilities.getWindowAncestor(this).dispose();
    }
    

    // Variables declaration - do not modify                     
    private javax.swing.JButton jButtonAtras;
    private javax.swing.JButton jButtonIngresoConReserva;
    private javax.swing.JButton jButtonIngresoSinReserva;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel txtTiposDeIngreso;
    // End of variables declaration                   
}
