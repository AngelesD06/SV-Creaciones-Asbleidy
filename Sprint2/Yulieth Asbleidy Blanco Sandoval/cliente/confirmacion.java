package creaciones_asbleidy;

import com.sun.awt.AWTUtilities;
import java.awt.Shape;
import java.awt.geom.RoundRectangle2D;
import javax.swing.JOptionPane;

public class confirmacion extends javax.swing.JFrame {

    public confirmacion() {
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
        Separador = new javax.swing.JSeparator();
        lblLogo = new javax.swing.JLabel();
        txtNombre = new rojeru_san.RSMTextFull();
        lblNombre = new javax.swing.JLabel();
        lblPago = new javax.swing.JLabel();
        txtPago = new rojeru_san.RSMTextFull();
        lblBanco = new javax.swing.JLabel();
        txtBanco = new rojeru_san.RSMTextFull();
        lblTotal = new javax.swing.JLabel();
        txtTotal = new rojeru_san.RSMTextFull();
        lblInfo3 = new javax.swing.JLabel();
        lblInfo1 = new javax.swing.JLabel();
        lblInfo2 = new javax.swing.JLabel();
        btnCancelar = new javax.swing.JButton();
        btnPagar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        pnlPrincipal.setBackground(new java.awt.Color(255, 255, 255));
        pnlPrincipal.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        pnlPrincipal.add(Separador, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, 380, 20));

        lblLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/marca.png"))); // NOI18N
        pnlPrincipal.add(lblLogo, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, -1));

        txtNombre.setForeground(new java.awt.Color(0, 0, 0));
        txtNombre.setToolTipText("");
        txtNombre.setBordeColorFocus(new java.awt.Color(221, 98, 34));
        txtNombre.setBordeColorNoFocus(new java.awt.Color(221, 98, 34));
        txtNombre.setBotonColor(new java.awt.Color(255, 255, 255));
        txtNombre.setDisabledTextColor(new java.awt.Color(221, 98, 34));
        txtNombre.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        txtNombre.setModoMaterial(true);
        txtNombre.setPlaceholder("");
        txtNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombreActionPerformed(evt);
            }
        });
        txtNombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNombreKeyTyped(evt);
            }
        });
        pnlPrincipal.add(txtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 220, 300, 40));

        lblNombre.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/usuario.png"))); // NOI18N
        pnlPrincipal.add(lblNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 230, 30, 30));

        lblPago.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/tarjeta.png"))); // NOI18N
        pnlPrincipal.add(lblPago, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 290, 30, 30));

        txtPago.setForeground(new java.awt.Color(0, 0, 0));
        txtPago.setToolTipText("");
        txtPago.setBordeColorFocus(new java.awt.Color(221, 98, 34));
        txtPago.setBordeColorNoFocus(new java.awt.Color(221, 98, 34));
        txtPago.setBotonColor(new java.awt.Color(255, 255, 255));
        txtPago.setDisabledTextColor(new java.awt.Color(221, 98, 34));
        txtPago.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        txtPago.setModoMaterial(true);
        txtPago.setPlaceholder("");
        txtPago.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPagoActionPerformed(evt);
            }
        });
        txtPago.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtPagoKeyTyped(evt);
            }
        });
        pnlPrincipal.add(txtPago, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 280, 300, 40));

        lblBanco.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/banco.png"))); // NOI18N
        pnlPrincipal.add(lblBanco, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 350, 30, 30));

        txtBanco.setForeground(new java.awt.Color(0, 0, 0));
        txtBanco.setToolTipText("");
        txtBanco.setBordeColorFocus(new java.awt.Color(221, 98, 34));
        txtBanco.setBordeColorNoFocus(new java.awt.Color(221, 98, 34));
        txtBanco.setBotonColor(new java.awt.Color(255, 255, 255));
        txtBanco.setDisabledTextColor(new java.awt.Color(221, 98, 34));
        txtBanco.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        txtBanco.setModoMaterial(true);
        txtBanco.setPlaceholder("");
        txtBanco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBancoActionPerformed(evt);
            }
        });
        txtBanco.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtBancoKeyTyped(evt);
            }
        });
        pnlPrincipal.add(txtBanco, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 340, 300, 40));

        lblTotal.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/pagar.png"))); // NOI18N
        pnlPrincipal.add(lblTotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 410, 30, 30));

        txtTotal.setForeground(new java.awt.Color(0, 0, 0));
        txtTotal.setToolTipText("");
        txtTotal.setBordeColorFocus(new java.awt.Color(221, 98, 34));
        txtTotal.setBordeColorNoFocus(new java.awt.Color(221, 98, 34));
        txtTotal.setBotonColor(new java.awt.Color(255, 255, 255));
        txtTotal.setDisabledTextColor(new java.awt.Color(221, 98, 34));
        txtTotal.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        txtTotal.setModoMaterial(true);
        txtTotal.setPlaceholder("");
        txtTotal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTotalActionPerformed(evt);
            }
        });
        txtTotal.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtTotalKeyTyped(evt);
            }
        });
        pnlPrincipal.add(txtTotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 400, 300, 40));

        lblInfo3.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        lblInfo3.setText("pago presiona \"Cancelar\"");
        pnlPrincipal.add(lblInfo3, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 180, -1, -1));

        lblInfo1.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        lblInfo1.setText("  Verifica la información presentada y presiona \"Pagar\" ");
        pnlPrincipal.add(lblInfo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 140, -1, -1));

        lblInfo2.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        lblInfo2.setText("para efectuar el pago, y si ya no deseas efectuar el");
        pnlPrincipal.add(lblInfo2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 160, -1, -1));

        btnCancelar.setBackground(new java.awt.Color(255, 255, 255));
        btnCancelar.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        btnCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/salir.png"))); // NOI18N
        btnCancelar.setText("Cancelar");
        btnCancelar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnCancelar.setBorderPainted(false);
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });
        pnlPrincipal.add(btnCancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 480, 110, 40));

        btnPagar.setBackground(new java.awt.Color(255, 255, 255));
        btnPagar.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        btnPagar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/total.png"))); // NOI18N
        btnPagar.setText("Pagar");
        btnPagar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnPagar.setBorderPainted(false);
        btnPagar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPagarActionPerformed(evt);
            }
        });
        pnlPrincipal.add(btnPagar, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 480, 90, 40));

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

    private void txtNombreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNombreKeyTyped
        //Solo deja ingresar números en la caja de texto del código
        char num = evt.getKeyChar();
        if ((num < '0' || num > '9')) {
            evt.consume();
        }
    }//GEN-LAST:event_txtNombreKeyTyped

    private void txtNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombreActionPerformed

    private void txtPagoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPagoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPagoActionPerformed

    private void txtPagoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPagoKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPagoKeyTyped

    private void txtBancoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBancoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtBancoActionPerformed

    private void txtBancoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBancoKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txtBancoKeyTyped

    private void txtTotalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTotalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTotalActionPerformed

    private void txtTotalKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTotalKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTotalKeyTyped

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnPagarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPagarActionPerformed
        comprobante_pago cp = new comprobante_pago();
        cp.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnPagarActionPerformed

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
            java.util.logging.Logger.getLogger(confirmacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(confirmacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(confirmacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(confirmacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new confirmacion().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JSeparator Separador;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnPagar;
    private javax.swing.JLabel lblBanco;
    private javax.swing.JLabel lblInfo1;
    private javax.swing.JLabel lblInfo2;
    private javax.swing.JLabel lblInfo3;
    private javax.swing.JLabel lblLogo;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JLabel lblPago;
    private javax.swing.JLabel lblTotal;
    private javax.swing.JPanel pnlPrincipal;
    private rojeru_san.RSMTextFull txtBanco;
    private rojeru_san.RSMTextFull txtNombre;
    private rojeru_san.RSMTextFull txtPago;
    private rojeru_san.RSMTextFull txtTotal;
    // End of variables declaration//GEN-END:variables
}
