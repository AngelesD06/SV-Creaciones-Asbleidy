package creaciones_asbleidy;

import com.sun.awt.AWTUtilities;
import java.awt.Shape;
import java.awt.geom.RoundRectangle2D;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class registro extends javax.swing.JFrame {

    conexion con;
    conexion cc = new conexion();
    Connection cn = cc.getConection();

    public registro() {
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
        lblLogin = new javax.swing.JLabel();
        lblRegistro = new javax.swing.JLabel();
        lblEmail = new javax.swing.JLabel();
        btnCerrar = new javax.swing.JButton();
        lblImagen = new javax.swing.JLabel();
        lblPass = new javax.swing.JLabel();
        Separador = new javax.swing.JSeparator();
        lblNombre = new javax.swing.JLabel();
        btnRegistrar = new javax.swing.JButton();
        txtNombre = new rojeru_san.RSMTextFull();
        txtContra = new rojeru_san.RSMPassView();
        txtEmail = new rojeru_san.RSMTextFull();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        pnlPrincipal.setBackground(new java.awt.Color(255, 255, 255));
        pnlPrincipal.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblLogin.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        lblLogin.setForeground(new java.awt.Color(239, 166, 46));
        lblLogin.setText("Inicia sesión aquí");
        lblLogin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblLoginMouseClicked(evt);
            }
        });
        pnlPrincipal.add(lblLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 340, -1, -1));

        lblRegistro.setFont(new java.awt.Font("Pristina", 0, 55)); // NOI18N
        lblRegistro.setText("Registro");
        pnlPrincipal.add(lblRegistro, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 30, -1, 76));

        lblEmail.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/email.png"))); // NOI18N
        pnlPrincipal.add(lblEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 190, 30, 40));

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
        pnlPrincipal.add(lblPass, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 260, 30, 40));
        pnlPrincipal.add(Separador, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 360, 100, 10));

        lblNombre.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/user.png"))); // NOI18N
        pnlPrincipal.add(lblNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 120, 30, 40));

        btnRegistrar.setBackground(new java.awt.Color(239, 166, 46));
        btnRegistrar.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        btnRegistrar.setForeground(new java.awt.Color(255, 255, 255));
        btnRegistrar.setText("Registrar");
        btnRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarActionPerformed(evt);
            }
        });
        pnlPrincipal.add(btnRegistrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 340, -1, -1));

        txtNombre.setForeground(new java.awt.Color(0, 0, 0));
        txtNombre.setToolTipText("");
        txtNombre.setBordeColorFocus(new java.awt.Color(239, 166, 46));
        txtNombre.setBordeColorNoFocus(new java.awt.Color(239, 166, 46));
        txtNombre.setBotonColor(new java.awt.Color(0, 0, 0));
        txtNombre.setDisabledTextColor(new java.awt.Color(239, 166, 46));
        txtNombre.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        txtNombre.setModoMaterial(true);
        txtNombre.setPlaceholder("Ingrese su nombre");
        pnlPrincipal.add(txtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 120, 240, 40));

        txtContra.setForeground(new java.awt.Color(0, 0, 0));
        txtContra.setBordeColorFocus(new java.awt.Color(239, 166, 46));
        txtContra.setBordeColorNoFocus(new java.awt.Color(239, 166, 46));
        txtContra.setBotonColor(new java.awt.Color(0, 0, 0));
        txtContra.setDisabledTextColor(new java.awt.Color(239, 166, 46));
        txtContra.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        txtContra.setModoMaterial(true);
        txtContra.setPlaceholder("Ingrese su contraseña");
        pnlPrincipal.add(txtContra, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 260, 240, 40));

        txtEmail.setForeground(new java.awt.Color(0, 0, 0));
        txtEmail.setToolTipText("");
        txtEmail.setBordeColorFocus(new java.awt.Color(239, 166, 46));
        txtEmail.setBordeColorNoFocus(new java.awt.Color(239, 166, 46));
        txtEmail.setBotonColor(new java.awt.Color(0, 0, 0));
        txtEmail.setDisabledTextColor(new java.awt.Color(239, 166, 46));
        txtEmail.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        txtEmail.setModoMaterial(true);
        txtEmail.setPlaceholder("Ingrese su correo");
        pnlPrincipal.add(txtEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 190, 240, 40));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, 800, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarActionPerformed
        Validar();
    }//GEN-LAST:event_btnRegistrarActionPerformed

    private void lblLoginMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblLoginMouseClicked
        login l = new login();
        l.setVisible(true);
        dispose();
    }//GEN-LAST:event_lblLoginMouseClicked

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
            java.util.logging.Logger.getLogger(registro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(registro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(registro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(registro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new registro().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JSeparator Separador;
    private javax.swing.JButton btnCerrar;
    private javax.swing.JButton btnRegistrar;
    private javax.swing.JLabel lblEmail;
    private javax.swing.JLabel lblImagen;
    private javax.swing.JLabel lblLogin;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JLabel lblPass;
    private javax.swing.JLabel lblRegistro;
    private javax.swing.JPanel pnlPrincipal;
    private rojeru_san.RSMPassView txtContra;
    private rojeru_san.RSMTextFull txtEmail;
    private rojeru_san.RSMTextFull txtNombre;
    // End of variables declaration//GEN-END:variables

    private void Validar() {
        String Nombre, Email, Contra;
        String Tipo = "user";
        Nombre = txtNombre.getText();
        Email = txtNombre.getText();
        Contra = String.valueOf(txtContra.getPassword());
        if (Nombre.equals("") || Email.equals("") || Contra.equals("")) {
            JOptionPane.showMessageDialog(this, "Debe llenar todos los campos");
        } else {
            con = new conexion();
            Connection reg = con.getConection();
            String sql = "";
            sql = "insert into usuario (email,pass,tipo,nombre) VALUES (?, ?, ?, ?)";
            try {
                //Se ingresa la información en la base de datos
                PreparedStatement pst = reg.prepareStatement(sql);
                pst.setString(1, Email);
                pst.setString(2, Contra);
                pst.setString(3, Tipo);
                pst.setString(4, Nombre);
                pst.executeUpdate();
                JOptionPane.showMessageDialog(this, "Registro exitoso");
                login l = new login();
                l.setVisible(true);
                dispose();
            } catch (SQLException ex) {
                Logger.getLogger(inicio_admin.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
}
