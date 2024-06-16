package Principal;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
//import java.beans.Statement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;

/**
 * Main class to run the application
 */
public class Main {

    public static void main(String[] args) {
        try {
            Connection connection = DatabaseConnection.getConnection();
            if (connection != null) {
                System.out.println("Conexión exitosa a la base de datos!");

                // Ejecutar una consulta simple
                String query = "SELECT version()";
                java.sql.Statement stmt = connection.createStatement();
                ResultSet rs = stmt.executeQuery(query);

                // Procesar los resultados
                if (rs.next()) {
                    System.out.println("Versión de PostgreSQL: " + rs.getString(1));
                }

                // Cerrar la conexión
                rs.close();
                stmt.close();
                connection.close();
            }
        } catch (SQLException e) {
            e.printStackTrace();
            System.out.println("Error al conectar con la base de datos.");
        }

        // Create the main frame
        JFrame frame = new JFrame("Login");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Create the login panel
        frmlogin loginPanel = new frmlogin();

        // Add the panel to the frame
        frame.add(loginPanel);
        frame.pack();
        frame.setLocationRelativeTo(null); // Center the frame on the screen
        frame.setVisible(true);
    }
}

class frmlogin extends JPanel {

    public static frmCajero frmc;
    private JTextField txtUsername;
    private JPasswordField txtPassword;

    // Map to store username, password, and role
    private Map<String, String[]> userDatabase;

    public frmlogin() {
        initComponents();
        initializeUserDatabase();
    }

    // Initialize user database with some example users
    private void initializeUserDatabase() {
        userDatabase = new HashMap<>();
        userDatabase.put("cajero1", new String[]{"password1", "cajero"});
        userDatabase.put("Nicolas", new String[]{"12345", "cajero"});
        userDatabase.put("Alexis", new String[]{"12345", "Gerente"});
        userDatabase.put("Santiago", new String[]{"12345", "Recepcionista"});
        userDatabase.put("JuanManuel", new String[]{"12345", "Administrador"});
        // Agregar más usuarios según sea necesario
    }

    //@SuppressWarnings("unchecked")
    private void initComponents() {

        JPanel jPanel1 = new JPanel();
        JLabel jLabel1 = new JLabel();
        JLabel jLabel2 = new JLabel();
        txtUsername = new JTextField();
        JLabel jLabel3 = new JLabel();
        txtPassword = new JPasswordField();
        JButton Button_Ingresar = new JButton();
        JButton Button_Limpiar = new JButton();

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));

        jLabel1.setIcon(new ImageIcon(getClass().getResource("/Imagene/login (1).png"))); // NOI18N

        jLabel2.setText("USUARIO");

        jLabel3.setText("CONTRASEÑA");

        Button_Ingresar.setText("Ingresar");
        Button_Ingresar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                Button_IngresarActionPerformed(evt);
            }
        });

        Button_Limpiar.setText("Limpiar");
        Button_Limpiar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                Button_LimpiarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(35, 35, 35)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 80, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(Button_Ingresar)
                                                .addGap(32, 32, 32)
                                                .addComponent(Button_Limpiar))
                                        .addComponent(txtPassword)
                                        .addComponent(txtUsername))
                                .addContainerGap(97, Short.MAX_VALUE))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jLabel1)
                                .addGap(135, 135, 135))
        );
        jPanel1Layout.setVerticalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(12, 12, 12)
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(txtUsername, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(24, 24, 24)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(Button_Ingresar)
                                        .addComponent(Button_Limpiar))
                                .addContainerGap(29, Short.MAX_VALUE))
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

    private void Button_IngresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button_IngresarActionPerformed
        String username = txtUsername.getText();
        String password = new String(txtPassword.getPassword());

        if (userDatabase.containsKey(username)) {
            String[] userDetails = userDatabase.get(username);
            String correctPassword = userDetails[0];
            String role = userDetails[1];

            if (correctPassword.equals(password)) {
                if ("cajero".equals(role)) {
                    JFrame cajeroFrame = new JFrame("Cajero");
                    cajeroFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                    cajeroFrame.add(new frmCajero());
                    cajeroFrame.pack();
                    cajeroFrame.setLocationRelativeTo(null); // Centrar el frame en la pantalla
                    cajeroFrame.setVisible(true);

                    // Cerrar el frame de login
                    //JFrame loginFrame = (JFrame) SwingUtilities.getWindowAncestor(this);
                    //loginFrame.dispose();
                } else if ("Gerente".equals(role)) {
                    JFrame gerenteFrame = new JFrame("Gerente");
                    gerenteFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                    gerenteFrame.add(new frmGerente());
                    gerenteFrame.pack();
                    gerenteFrame.setLocationRelativeTo(null);
                    gerenteFrame.setVisible(true);

                    //JFrame loginFrame = (JFrame) SwingUtilities.getWindowAncestor(this);
                    //loginFrame.dispose();
                } else if ("Recepcionista".equals(role)) {
                    JFrame recepcionistaFrame = new JFrame("Recepcionista");
                    recepcionistaFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                    recepcionistaFrame.add(new frmRecepcionista());
                    recepcionistaFrame.pack();
                    recepcionistaFrame.setLocationRelativeTo(null);
                    recepcionistaFrame.setVisible(true);

                    //JFrame loginFrame = (JFrame) SwingUtilities.getWindowAncestor(this);
                    //loginFrame.dispose();
                
                } else if("Administrador".equals(role)){
                    JFrame administradorFrame = new JFrame("Administrador");
                    administradorFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                    administradorFrame.add(new frmAdministrador());
                    administradorFrame.pack();
                    administradorFrame.setLocationRelativeTo(null);
                    administradorFrame.setVisible(true);

                    //JFrame loginFrame = (JFrame) SwingUtilities.getWindowAncestor(this);
                    //loginFrame.dispose();

                } else {
                    JOptionPane.showMessageDialog(this, "Rol no reconocido", "Error", JOptionPane.ERROR_MESSAGE);
                }
            } else {
                JOptionPane.showMessageDialog(this, "Contraseña incorrecta", "Error", JOptionPane.ERROR_MESSAGE);
            }
        } else {
            JOptionPane.showMessageDialog(this, "Usuario no encontrado", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_Button_IngresarActionPerformed
    

    private void Button_LimpiarActionPerformed(ActionEvent evt) {
        txtUsername.setText("");
        txtPassword.setText("");
    }
}
