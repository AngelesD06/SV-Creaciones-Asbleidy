package creaciones_asbleidy;


import javax.swing.JOptionPane;

public class comprobante_pago extends javax.swing.JFrame {

    public comprobante_pago() {
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
        btnCerrar = new javax.swing.JButton();
        Separador = new javax.swing.JSeparator();
        lblLogo = new javax.swing.JLabel();
        lblTotal = new javax.swing.JLabel();
        lblComprobante = new javax.swing.JLabel();
        lblFactura = new javax.swing.JLabel();
        lblNombre = new javax.swing.JLabel();
        lblFecha = new javax.swing.JLabel();
        txtFecha = new javax.swing.JTextField();
        lblLinea2 = new javax.swing.JLabel();
        txtFactura = new javax.swing.JTextField();
        lblLinea3 = new javax.swing.JLabel();
        lblLinea4 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        lblLinea5 = new javax.swing.JLabel();
        txtTotal = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        pnlPrincipal.setBackground(new java.awt.Color(255, 255, 255));
        pnlPrincipal.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnCerrar.setBackground(new java.awt.Color(255, 255, 255));
        btnCerrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/salir.png"))); // NOI18N
        btnCerrar.setBorder(null);
        btnCerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCerrarActionPerformed(evt);
            }
        });
        pnlPrincipal.add(btnCerrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 20, -1, -1));
        pnlPrincipal.add(Separador, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, 400, 20));

        lblLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/marca.png"))); // NOI18N
        pnlPrincipal.add(lblLogo, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, -1));

        lblTotal.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/total.png"))); // NOI18N
        pnlPrincipal.add(lblTotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 410, 30, 30));

        lblComprobante.setFont(new java.awt.Font("Pristina", 0, 55)); // NOI18N
        lblComprobante.setText("Comprobante de pago");
        pnlPrincipal.add(lblComprobante, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, 390, 76));

        lblFactura.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/pagar.png"))); // NOI18N
        pnlPrincipal.add(lblFactura, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 290, 30, 30));

        lblNombre.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/usuario.png"))); // NOI18N
        pnlPrincipal.add(lblNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 350, 30, 30));

        lblFecha.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/fecha.png"))); // NOI18N
        pnlPrincipal.add(lblFecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 230, 30, 30));

        txtFecha.setEditable(false);
        txtFecha.setBackground(new java.awt.Color(255, 255, 255));
        txtFecha.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        txtFecha.setBorder(null);
        txtFecha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFechaActionPerformed(evt);
            }
        });
        pnlPrincipal.add(txtFecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 220, 300, 30));

        lblLinea2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/linea.png"))); // NOI18N
        pnlPrincipal.add(lblLinea2, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 250, 300, 10));

        txtFactura.setEditable(false);
        txtFactura.setBackground(new java.awt.Color(255, 255, 255));
        txtFactura.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        txtFactura.setBorder(null);
        txtFactura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFacturaActionPerformed(evt);
            }
        });
        pnlPrincipal.add(txtFactura, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 280, 300, 30));

        lblLinea3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/linea.png"))); // NOI18N
        pnlPrincipal.add(lblLinea3, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 310, 300, 10));

        lblLinea4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/linea.png"))); // NOI18N
        pnlPrincipal.add(lblLinea4, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 370, 300, 10));

        txtNombre.setEditable(false);
        txtNombre.setBackground(new java.awt.Color(255, 255, 255));
        txtNombre.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        txtNombre.setBorder(null);
        txtNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombreActionPerformed(evt);
            }
        });
        pnlPrincipal.add(txtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 340, 300, 30));

        lblLinea5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/linea.png"))); // NOI18N
        pnlPrincipal.add(lblLinea5, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 430, 300, 10));

        txtTotal.setEditable(false);
        txtTotal.setBackground(new java.awt.Color(255, 255, 255));
        txtTotal.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        txtTotal.setBorder(null);
        txtTotal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTotalActionPerformed(evt);
            }
        });
        pnlPrincipal.add(txtTotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 400, 300, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, 475, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCerrarActionPerformed
        String us = txtNombre.getText();
        //Se agradece al cliente por su compra
        int r = JOptionPane.showConfirmDialog(null, "Gracias por su compra", "Cerrar", JOptionPane.YES_NO_OPTION);
        if (r == JOptionPane.YES_OPTION) {
            //Se eliminan las compras que realizó de los modelos de las tablas
            carrito c = new carrito();
            int nf1 = c.modelo.getRowCount();
            for (int i = nf1 - 1; i >= 0; i--) {
                c.modelo.removeRow(i);
            }
            inicio_usuario iu = new inicio_usuario();
            int nf2 = iu.md.getRowCount();
            for (int i = nf2 - 1; i >= 0; i--) {
                iu.md.removeRow(i);
            }
            //Se elimina el total que tenía acumulado de las compras
            iu.total = 0;
            iu.txtNombre.setText(us);
            iu.setVisible(true);
            dispose();
        }      
    }//GEN-LAST:event_btnCerrarActionPerformed

    private void txtFechaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFechaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFechaActionPerformed

    private void txtFacturaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFacturaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFacturaActionPerformed

    private void txtNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombreActionPerformed

    private void txtTotalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTotalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTotalActionPerformed

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
            java.util.logging.Logger.getLogger(comprobante_pago.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(comprobante_pago.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(comprobante_pago.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(comprobante_pago.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new comprobante_pago().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JSeparator Separador;
    private javax.swing.JButton btnCerrar;
    private javax.swing.JLabel lblComprobante;
    private javax.swing.JLabel lblFactura;
    private javax.swing.JLabel lblFecha;
    private javax.swing.JLabel lblLinea2;
    private javax.swing.JLabel lblLinea3;
    private javax.swing.JLabel lblLinea4;
    private javax.swing.JLabel lblLinea5;
    private javax.swing.JLabel lblLogo;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JLabel lblTotal;
    private javax.swing.JPanel pnlPrincipal;
    public javax.swing.JTextField txtFactura;
    public javax.swing.JTextField txtFecha;
    public javax.swing.JTextField txtNombre;
    public javax.swing.JTextField txtTotal;
    // End of variables declaration//GEN-END:variables
}
