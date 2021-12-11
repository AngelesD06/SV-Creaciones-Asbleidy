package creaciones_asbleidy;

import com.sun.awt.AWTUtilities;
import java.awt.Shape;
import java.awt.geom.RoundRectangle2D;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class login extends javax.swing.JFrame {

    conexion con;
    public static String em;

    public login() {
        //Para quitar los botones de cerrar, minimizar y maximizar
        this.setUndecorated(true);
        initComponents();
        //Para centrar la ventana
        this.setLocationRelativeTo(this);
        //Para redondear las esquinas
        Shape forma = new RoundRectangle2D.Double(0, 0, this.getBounds().width, this.getBounds().height, 27, 27);
        AWTUtilities.setWindowShape(this, forma);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlPrincipal = new javax.swing.JPanel();
        txtEmail = new rojeru_san.RSMTextFull();
        txtContra = new rojeru_san.RSMPassView();
        btnIngresar = new javax.swing.JButton();
        lblRegistro = new javax.swing.JLabel();
        lblBienvenido = new javax.swing.JLabel();
        lblEmail = new javax.swing.JLabel();
        btnCerrar = new javax.swing.JButton();
        lblImagen = new javax.swing.JLabel();
        lblPass = new javax.swing.JLabel();
        Separador = new javax.swing.JSeparator();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        pnlPrincipal.setBackground(new java.awt.Color(255, 255, 255));
        pnlPrincipal.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtEmail.setForeground(new java.awt.Color(0, 0, 0));
        txtEmail.setToolTipText("");
        txtEmail.setBordeColorFocus(new java.awt.Color(239, 166, 46));
        txtEmail.setBordeColorNoFocus(new java.awt.Color(239, 166, 46));
        txtEmail.setBotonColor(new java.awt.Color(239, 166, 46));
        txtEmail.setDisabledTextColor(new java.awt.Color(239, 166, 46));
        txtEmail.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        txtEmail.setModoMaterial(true);
        txtEmail.setPlaceholder("Ingrese su correo");
        pnlPrincipal.add(txtEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 150, 240, 40));

        txtContra.setForeground(new java.awt.Color(0, 0, 0));
        txtContra.setBordeColorFocus(new java.awt.Color(239, 166, 46));
        txtContra.setBordeColorNoFocus(new java.awt.Color(239, 166, 46));
        txtContra.setBotonColor(new java.awt.Color(239, 166, 46));
        txtContra.setDisabledTextColor(new java.awt.Color(239, 166, 46));
        txtContra.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        txtContra.setModoMaterial(true);
        txtContra.setPlaceholder("Ingrese su contraseña");
        pnlPrincipal.add(txtContra, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 220, 240, 40));

        btnIngresar.setBackground(new java.awt.Color(239, 166, 46));
        btnIngresar.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        btnIngresar.setForeground(new java.awt.Color(255, 255, 255));
        btnIngresar.setText("Ingresar");
        btnIngresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIngresarActionPerformed(evt);
            }
        });
        pnlPrincipal.add(btnIngresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 300, 90, -1));

        lblRegistro.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        lblRegistro.setForeground(new java.awt.Color(239, 166, 46));
        lblRegistro.setText("Regístrate aquí");
        lblRegistro.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblRegistroMouseClicked(evt);
            }
        });
        pnlPrincipal.add(lblRegistro, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 300, -1, -1));

        lblBienvenido.setFont(new java.awt.Font("Pristina", 0, 55)); // NOI18N
        lblBienvenido.setText("Bienvenido");
        pnlPrincipal.add(lblBienvenido, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 50, -1, 76));

        lblEmail.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/email.png"))); // NOI18N
        pnlPrincipal.add(lblEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 150, 30, 40));

        btnCerrar.setBackground(new java.awt.Color(255, 255, 255));
        btnCerrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/cerrar.png"))); // NOI18N
        btnCerrar.setBorder(null);
        btnCerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCerrarActionPerformed(evt);
            }
        });
        pnlPrincipal.add(btnCerrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 10, -1, -1));

        lblImagen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/login.png"))); // NOI18N
        pnlPrincipal.add(lblImagen, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 400, 400));

        lblPass.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/pass.png"))); // NOI18N
        pnlPrincipal.add(lblPass, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 220, 30, 40));
        pnlPrincipal.add(Separador, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 320, 90, 10));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, 800, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnIngresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIngresarActionPerformed
        //Se llama al método Validar
        Validar();
    }//GEN-LAST:event_btnIngresarActionPerformed

    private void lblRegistroMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblRegistroMouseClicked
        registro r = new registro();
        r.setVisible(true);
        dispose();
    }//GEN-LAST:event_lblRegistroMouseClicked

    private void btnCerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCerrarActionPerformed
        int r = JOptionPane.showConfirmDialog(null, "¿Está seguro de cerrar la aplicación?", "Salir", JOptionPane.YES_NO_OPTION);
        if (r == JOptionPane.YES_OPTION) {
            System.exit(0);
        }
    }//GEN-LAST:event_btnCerrarActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JSeparator Separador;
    private javax.swing.JButton btnCerrar;
    private javax.swing.JButton btnIngresar;
    private javax.swing.JLabel lblBienvenido;
    private javax.swing.JLabel lblEmail;
    private javax.swing.JLabel lblImagen;
    private javax.swing.JLabel lblPass;
    private javax.swing.JLabel lblRegistro;
    private javax.swing.JPanel pnlPrincipal;
    private rojeru_san.RSMPassView txtContra;
    private rojeru_san.RSMTextFull txtEmail;
    // End of variables declaration//GEN-END:variables

    //Método para validar la información ingresada
    public void Validar() {
        String contra = "", tip = "", nom = "", s = "";
        String Email = String.valueOf(txtEmail.getText());
        String Clave = String.valueOf(txtContra.getPassword());
        em = Email;
        //Se verifica que los campos no estén vacíos
        if (Email.equals(s) && Clave.equals(s)) {
            JOptionPane.showMessageDialog(this, "Complete los campos vacios");
        } else if (Email.equals(s)) {
            JOptionPane.showMessageDialog(this, "Ingrese el correo");
        } else if (Clave.equals(s)) {
            JOptionPane.showMessageDialog(this, "Ingrese la contraseña");
        } else {
            //Se llama al método Verificarec y se envía el Email del usuario
            int ec = Verificarec(Email);
            //Si no se encuentra registrado se le informa al usuario
            if (ec == 0) {
                JOptionPane.showMessageDialog(this, "No se encuentra registrado un usuario con este correo electrónico");
            } else {
                //Si está registrado se verifica que coincida la información
                Connection reg = con.getConection();
                //Se crea la sentencia para consultar los datos del usuario de acuerdo al email
                String sql = "select pass, tipo, nombre from usuario where email='" + Email + "'";
                try {
                    Statement st = reg.createStatement();
                    ResultSet rs = st.executeQuery(sql);
                    while (rs.next()) {
                        contra = rs.getString("pass");
                        tip = rs.getString("tipo");
                        nom = rs.getString("nombre");
                    }
                } catch (SQLException ex) {
                    Logger.getLogger(login.class.getName()).log(Level.SEVERE, null, ex);
                }
                //Si la contraseña coincide con el email ingresado y el usuario es admin se abre su inicio
                if (Clave.equals(contra) && tip.equals("admin")) {
                    inicio_admin ia = new inicio_admin();
                    ia.setVisible(true);
                    dispose();
                } else {
                    //Si la contraseña coincide con el email ingresado y el usuario es user se abre su inicio
                    if (Clave.equals(contra) && tip.equals("user")) {
                        inicio_usuario id = new inicio_usuario();
                        //Se envía el nombre del usuario
                        id.txtNombre.setText(nom);
                        id.setVisible(true);
                        dispose();
                        //Se informa que se debe primero completar los datos personales
                        JOptionPane.showMessageDialog(this, "Antes de realizar una compra complete o actualice su información personal");
                    } else {
                        //Si la contraseña no coincide con el email ingresado se informa que no es válido
                        JOptionPane.showMessageDialog(this, "Datos no válidos");
                    }
                }
            }
        }
    }

    //Método para verificar si ya está registrado un correo electrónico
    public int Verificarec(String e) {
        int ec;
        boolean b = false;
        //Se crea la sentencia para consultar si ya existe el email ingresado
        String sql = "select exists (select email from usuario where email='" + e + "')";
        try {
            Connection reg = con.getConection();
            Statement st = reg.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                b = rs.getBoolean("exists");
            }
        } catch (SQLException ex) {
            Logger.getLogger(login.class.getName()).log(Level.SEVERE, null, ex);
        }
        //Si ya existe se le asigna 1
        if (b == true) {
            ec = 1;
        //Si no existe se le asigna 0
        } else {
            ec = 0;
        }
        //Se retorna el valor correspondiente
        return ec;
    }
    
}
