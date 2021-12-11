package creaciones_asbleidy;


import java.sql.*;
import javax.swing.JOptionPane;

public class modificar_usuario extends javax.swing.JFrame {

    public static String em = login.em;    
    conexion cc = new conexion();
    Connection cn = cc.getConection();

    public modificar_usuario() {
        //Para quitar los botones de cerrar, minimizar y maximizar
        this.setUndecorated(true);
        initComponents();
        //Para centrar la ventana
        this.setLocationRelativeTo(this);
     
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlPrincipal = new javax.swing.JPanel();
        btnModificar = new javax.swing.JButton();
        lblLogo = new javax.swing.JLabel();
        btnCerrar = new javax.swing.JButton();
        Separador = new javax.swing.JSeparator();
        lblDatos = new javax.swing.JLabel();
        lblDireccion = new javax.swing.JLabel();
        txtDireccion = new rojeru_san.RSMTextFull();
        lblTelefono = new javax.swing.JLabel();
        txtTelefono = new rojeru_san.RSMTextFull();
        lblCiudad = new javax.swing.JLabel();
        txtCiudad = new rojeru_san.RSMTextFull();
        lblNombre = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        lblLinea1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        pnlPrincipal.setBackground(new java.awt.Color(255, 255, 255));
        pnlPrincipal.setForeground(new java.awt.Color(255, 255, 255));
        pnlPrincipal.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnModificar.setBackground(new java.awt.Color(221, 98, 34));
        btnModificar.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        btnModificar.setForeground(new java.awt.Color(255, 255, 255));
        btnModificar.setText("Modificar");
        btnModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarActionPerformed(evt);
            }
        });
        pnlPrincipal.add(btnModificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 490, -1, -1));

        lblLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/marca.png"))); // NOI18N
        pnlPrincipal.add(lblLogo, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 180, 60));

        btnCerrar.setBackground(new java.awt.Color(255, 255, 255));
        btnCerrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/salir.png"))); // NOI18N
        btnCerrar.setBorder(null);
        btnCerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCerrarActionPerformed(evt);
            }
        });
        pnlPrincipal.add(btnCerrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 20, -1, -1));
        pnlPrincipal.add(Separador, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, 380, 30));

        lblDatos.setFont(new java.awt.Font("Pristina", 0, 55)); // NOI18N
        lblDatos.setText("Datos usuario");
        pnlPrincipal.add(lblDatos, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 130, 250, 76));

        lblDireccion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/direccion.png"))); // NOI18N
        pnlPrincipal.add(lblDireccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 280, 30, 40));

        txtDireccion.setForeground(new java.awt.Color(0, 0, 0));
        txtDireccion.setToolTipText("");
        txtDireccion.setBordeColorFocus(new java.awt.Color(221, 98, 34));
        txtDireccion.setBordeColorNoFocus(new java.awt.Color(221, 98, 34));
        txtDireccion.setBotonColor(new java.awt.Color(221, 98, 34));
        txtDireccion.setDisabledTextColor(new java.awt.Color(221, 98, 34));
        txtDireccion.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        txtDireccion.setModoMaterial(true);
        txtDireccion.setPlaceholder("Ingrese su dirección");
        pnlPrincipal.add(txtDireccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 280, 290, 40));

        lblTelefono.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/telefono.png"))); // NOI18N
        pnlPrincipal.add(lblTelefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 430, 30, 30));

        txtTelefono.setForeground(new java.awt.Color(0, 0, 0));
        txtTelefono.setToolTipText("");
        txtTelefono.setBordeColorFocus(new java.awt.Color(221, 98, 34));
        txtTelefono.setBordeColorNoFocus(new java.awt.Color(221, 98, 34));
        txtTelefono.setBotonColor(new java.awt.Color(221, 98, 34));
        txtTelefono.setDisabledTextColor(new java.awt.Color(221, 98, 34));
        txtTelefono.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        txtTelefono.setModoMaterial(true);
        txtTelefono.setPlaceholder("Ingrese su teléfono");
        txtTelefono.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtTelefonoKeyTyped(evt);
            }
        });
        pnlPrincipal.add(txtTelefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 420, 290, 40));

        lblCiudad.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/ciudad.png"))); // NOI18N
        pnlPrincipal.add(lblCiudad, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 350, 30, 40));

        txtCiudad.setForeground(new java.awt.Color(0, 0, 0));
        txtCiudad.setToolTipText("");
        txtCiudad.setBordeColorFocus(new java.awt.Color(221, 98, 34));
        txtCiudad.setBordeColorNoFocus(new java.awt.Color(221, 98, 34));
        txtCiudad.setBotonColor(new java.awt.Color(221, 98, 34));
        txtCiudad.setDisabledTextColor(new java.awt.Color(221, 98, 34));
        txtCiudad.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        txtCiudad.setModoMaterial(true);
        txtCiudad.setPlaceholder("Ingrese su ciudad");
        pnlPrincipal.add(txtCiudad, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 350, 290, 40));

        lblNombre.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/usuario.png"))); // NOI18N
        pnlPrincipal.add(lblNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 210, 30, 40));

        txtNombre.setEditable(false);
        txtNombre.setBackground(new java.awt.Color(255, 255, 255));
        txtNombre.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        txtNombre.setBorder(null);
        pnlPrincipal.add(txtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 210, 290, 30));

        lblLinea1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/linea.png"))); // NOI18N
        pnlPrincipal.add(lblLinea1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 240, 290, 10));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, 550, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCerrarActionPerformed
        String n = txtNombre.getText();
        inicio_usuario iu = new inicio_usuario();
        iu.txtNombre.setText(n);
        iu.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnCerrarActionPerformed

    private void btnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarActionPerformed
        //Se llama al método Actualizar
        Actualizar();
    }//GEN-LAST:event_btnModificarActionPerformed

    private void txtTelefonoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTelefonoKeyTyped
        //Solo deja ingresar números en la caja de texto
        char num = evt.getKeyChar();
        if ((num < '0' || num > '9')) {
            evt.consume();
        }
    }//GEN-LAST:event_txtTelefonoKeyTyped

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
            java.util.logging.Logger.getLogger(modificar_usuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(modificar_usuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(modificar_usuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(modificar_usuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new modificar_usuario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JSeparator Separador;
    private javax.swing.JButton btnCerrar;
    private javax.swing.JButton btnModificar;
    private javax.swing.JLabel lblCiudad;
    private javax.swing.JLabel lblDatos;
    private javax.swing.JLabel lblDireccion;
    private javax.swing.JLabel lblLinea1;
    private javax.swing.JLabel lblLogo;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JLabel lblTelefono;
    private javax.swing.JPanel pnlPrincipal;
    public rojeru_san.RSMTextFull txtCiudad;
    public rojeru_san.RSMTextFull txtDireccion;
    public javax.swing.JTextField txtNombre;
    public rojeru_san.RSMTextFull txtTelefono;
    // End of variables declaration//GEN-END:variables

    //Método para actualizar la información de un usuario
    public void Actualizar() {
        String n, d, c, t;
        n = txtNombre.getText();
        d = txtDireccion.getText();
        c = txtCiudad.getText();
        t = txtTelefono.getText();
        //Se verfica que las  cajas de texto no estén vacías
        if (d.equals("") || c.equals("") || t.equals("")) {
            JOptionPane.showMessageDialog(this, "Debe llenar todos los campos");
        } else {
            try {
                //Se crea la sentencia para actualizar la información del usuario
                String sql = "update usuario set direccion=?," + "ciudad=?," + "telefono=?" + " where email='" + em + "' ";
                PreparedStatement pst = cn.prepareStatement(sql);
                //Se ingresa la nueva información en la base de datos
                pst.setString(1, d);
                pst.setString(2, c);
                pst.setString(3, t);
                pst.executeUpdate();
                //Se informa que los datos fueron actualizados correctamente
                JOptionPane.showMessageDialog(null, "Datos Actualizados");
                inicio_usuario iu = new inicio_usuario();
                iu.txtNombre.setText(n);
                iu.setVisible(true);
                dispose();
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(this, "Ha ocurrido un error al actualizar los datos");
                System.out.println(ex.getMessage());
            }
        }
    }
}
