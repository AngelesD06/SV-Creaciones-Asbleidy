package creaciones_asbleidy;

public class modificar_usuario extends javax.swing.JFrame {

    public modificar_usuario() {
        initComponents();
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
        txtNombre = new rojeru_san.RSMTextFull();

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
        txtDireccion.setBotonColor(new java.awt.Color(0, 0, 0));
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
        txtTelefono.setBotonColor(new java.awt.Color(0, 0, 0));
        txtTelefono.setDisabledTextColor(new java.awt.Color(221, 98, 34));
        txtTelefono.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        txtTelefono.setModoMaterial(true);
        txtTelefono.setPlaceholder("Ingrese su teléfono");
        pnlPrincipal.add(txtTelefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 420, 290, 40));

        lblCiudad.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/ciudad.png"))); // NOI18N
        pnlPrincipal.add(lblCiudad, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 350, 30, 40));

        txtCiudad.setForeground(new java.awt.Color(0, 0, 0));
        txtCiudad.setToolTipText("");
        txtCiudad.setBordeColorFocus(new java.awt.Color(221, 98, 34));
        txtCiudad.setBordeColorNoFocus(new java.awt.Color(221, 98, 34));
        txtCiudad.setBotonColor(new java.awt.Color(0, 0, 0));
        txtCiudad.setDisabledTextColor(new java.awt.Color(221, 98, 34));
        txtCiudad.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        txtCiudad.setModoMaterial(true);
        txtCiudad.setPlaceholder("Ingrese su ciudad");
        pnlPrincipal.add(txtCiudad, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 350, 290, 40));

        lblNombre.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/usuario.png"))); // NOI18N
        pnlPrincipal.add(lblNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 210, 30, 40));

        txtNombre.setEditable(false);
        txtNombre.setBackground(new java.awt.Color(255, 255, 255));
        txtNombre.setForeground(new java.awt.Color(0, 0, 0));
        txtNombre.setToolTipText("");
        txtNombre.setBordeColorFocus(new java.awt.Color(221, 98, 34));
        txtNombre.setBordeColorNoFocus(new java.awt.Color(221, 98, 34));
        txtNombre.setBotonColor(new java.awt.Color(255, 255, 255));
        txtNombre.setDisabledTextColor(new java.awt.Color(221, 98, 34));
        txtNombre.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        txtNombre.setModoMaterial(true);
        txtNombre.setPlaceholder("");
        pnlPrincipal.add(txtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 210, 290, 40));

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
        productos p = new productos();
        p.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnCerrarActionPerformed

    private void btnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarActionPerformed

    }//GEN-LAST:event_btnModificarActionPerformed

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
    private javax.swing.JLabel lblLogo;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JLabel lblTelefono;
    private javax.swing.JPanel pnlPrincipal;
    private rojeru_san.RSMTextFull txtCiudad;
    private rojeru_san.RSMTextFull txtDireccion;
    private rojeru_san.RSMTextFull txtNombre;
    private rojeru_san.RSMTextFull txtTelefono;
    // End of variables declaration//GEN-END:variables
}
