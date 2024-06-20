package SubVentanas;

import javax.swing.JFrame;
import javax.swing.SwingUtilities;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import Principal.frmGerente;

/**
 *
 * @author Nicolas
 */
public class frmInformes extends javax.swing.JPanel {

    /**
     * Creates new form frmInformes
     */
    public frmInformes() {
        initComponents();
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
        txtIInformes = new javax.swing.JLabel();
        jButtonlListadoReserva = new javax.swing.JButton();
        jButtonVentasMensuales = new javax.swing.JButton();
        jButtonCaracteristicasHab = new javax.swing.JButton();
        jButtonServiciosMasUsados = new javax.swing.JButton();
        jButtonAtras = new javax.swing.JButton();

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        txtIInformes.setFont(new java.awt.Font("Franklin Gothic Demi", 0, 18)); // NOI18N
        txtIInformes.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtIInformes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagene/favicon.png"))); // NOI18N
        txtIInformes.setText("INFORMES");

        jButtonlListadoReserva.setBackground(new java.awt.Color(204, 204, 255));
        jButtonlListadoReserva.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 12)); // NOI18N
        jButtonlListadoReserva.setText("LISTADO RESERVAS");
        jButtonlListadoReserva.setBorder(null);
        jButtonlListadoReserva.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                jButtonlListadoReservaActionPerformed(evt);
            }
        });

        jButtonVentasMensuales.setBackground(new java.awt.Color(204, 204, 255));
        jButtonVentasMensuales.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 12)); // NOI18N
        jButtonVentasMensuales.setText("VENTAS MENSUALES");
        jButtonVentasMensuales.setBorder(null);
        jButtonVentasMensuales.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                jButtonVentasMensualesActionPerformed(evt);
            }
        });

        jButtonCaracteristicasHab.setBackground(new java.awt.Color(204, 204, 255));
        jButtonCaracteristicasHab.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 12)); // NOI18N
        jButtonCaracteristicasHab.setText("CARACTERISTICAS HAB");
        jButtonCaracteristicasHab.setBorder(null);
        jButtonCaracteristicasHab.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                jButtonCaracteristicasHabActionPerformed(evt);
            }
        });

        jButtonServiciosMasUsados.setBackground(new java.awt.Color(204, 204, 255));
        jButtonServiciosMasUsados.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 12)); // NOI18N
        jButtonServiciosMasUsados.setText("SERVICIOS MAS USADOS");
        jButtonServiciosMasUsados.setBorder(null);
        jButtonServiciosMasUsados.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                jButtonServiciosMasUsadosActionPerformed(evt);
            }
        });

        jButtonAtras.setBackground(new java.awt.Color(204, 204, 255));
        jButtonAtras.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 12)); // NOI18N
        jButtonAtras.setText("ATRAS");
        jButtonAtras.setBorder(null);
        jButtonAtras.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                jButtonAtrasActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(144, 144, 144)
                .addComponent(jButtonAtras, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(txtIInformes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(28, 28, 28))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButtonCaracteristicasHab, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonVentasMensuales, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButtonServiciosMasUsados, javax.swing.GroupLayout.DEFAULT_SIZE, 165, Short.MAX_VALUE)
                    .addComponent(jButtonlListadoReserva, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(26, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(txtIInformes, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonCaracteristicasHab, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonlListadoReserva, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonServiciosMasUsados, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonVentasMensuales, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jButtonAtras, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(25, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
    }// </editor-fold>                        

    // Action methods for buttons
    private void jButtonlListadoReservaActionPerformed(ActionEvent evt) {
        JFrame ListadoReservas = new JFrame("ListadoReservas");
        ListadoReservas.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ListadoReservas.add(new frmListadoReservas());
        ListadoReservas.pack();
        ListadoReservas.setLocationRelativeTo(null);
        ListadoReservas.setVisible(true);

        JFrame Informes = (JFrame) SwingUtilities.getWindowAncestor(this);
        Informes.dispose();
    }

    private void jButtonVentasMensualesActionPerformed(ActionEvent evt) {
        // Action for Ventas Mensuales
        // Implement your code to handle the action
        System.out.println("Ventas Mensuales button clicked");
    }

    private void jButtonCaracteristicasHabActionPerformed(ActionEvent evt) {
        JFrame CaracteristicasHab = new JFrame("CaracteristicasHab");
        CaracteristicasHab.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        CaracteristicasHab.add(new frmCaracteristicasHab());
        CaracteristicasHab.pack();
        CaracteristicasHab.setLocationRelativeTo(null);
        CaracteristicasHab.setVisible(true);

        JFrame Informes = (JFrame) SwingUtilities.getWindowAncestor(this);
        Informes.dispose();
    }

    private void jButtonServiciosMasUsadosActionPerformed(ActionEvent evt) {
        // Action for Servicios Mas Usados
        // Implement your code to handle the action
        System.out.println("Servicios Mas Usados button clicked");
    }

    private void jButtonAtrasActionPerformed(ActionEvent evt) {
        JFrame Gerente = new JFrame("Gerente");
        Gerente.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Gerente.add(new frmGerente());
        Gerente.pack();
        Gerente.setLocationRelativeTo(null);
        Gerente.setVisible(true);

        JFrame Informes = (JFrame) SwingUtilities.getWindowAncestor(this);
        Informes.dispose();
    }

    // Variables declaration - do not modify                     
    private javax.swing.JButton jButtonAtras;
    private javax.swing.JButton jButtonCaracteristicasHab;
    private javax.swing.JButton jButtonServiciosMasUsados;
    private javax.swing.JButton jButtonVentasMensuales;
    private javax.swing.JButton jButtonlListadoReserva;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel txtIInformes;
    // End of variables declaration                   
}
