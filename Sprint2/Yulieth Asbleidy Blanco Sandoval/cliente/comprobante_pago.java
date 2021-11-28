package creaciones_asbleidy;

import com.sun.awt.AWTUtilities;
import java.awt.Shape;
import java.awt.geom.RoundRectangle2D;
import javax.swing.JOptionPane;

public class comprobante_pago extends javax.swing.JFrame {

    public comprobante_pago() {
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
        btnCerrar = new javax.swing.JButton();
        Separador = new javax.swing.JSeparator();
        lblLogo = new javax.swing.JLabel();
        txtTotal = new rojeru_san.RSMTextFull();
        lblTotal = new javax.swing.JLabel();
        lblComprobante = new javax.swing.JLabel();
        lblFactura = new javax.swing.JLabel();
        txtFactura = new rojeru_san.RSMTextFull();
        lblNombre = new javax.swing.JLabel();
        txtNombre = new rojeru_san.RSMTextFull();
        lblFecha = new javax.swing.JLabel();
        txtFecha = new rojeru_san.RSMTextFull();

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
        pnlPrincipal.add(btnCerrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 20, -1, -1));
        pnlPrincipal.add(Separador, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, 400, 20));

        lblLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/marca.png"))); // NOI18N
        pnlPrincipal.add(lblLogo, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, -1));

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

        lblTotal.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/total.png"))); // NOI18N
        pnlPrincipal.add(lblTotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 410, 30, 30));

        lblComprobante.setFont(new java.awt.Font("Pristina", 0, 55)); // NOI18N
        lblComprobante.setText("Comprobante de pago");
        pnlPrincipal.add(lblComprobante, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 120, -1, 76));

        lblFactura.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/pagar.png"))); // NOI18N
        pnlPrincipal.add(lblFactura, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 290, 30, 30));

        txtFactura.setForeground(new java.awt.Color(0, 0, 0));
        txtFactura.setToolTipText("");
        txtFactura.setBordeColorFocus(new java.awt.Color(221, 98, 34));
        txtFactura.setBordeColorNoFocus(new java.awt.Color(221, 98, 34));
        txtFactura.setBotonColor(new java.awt.Color(255, 255, 255));
        txtFactura.setDisabledTextColor(new java.awt.Color(221, 98, 34));
        txtFactura.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        txtFactura.setModoMaterial(true);
        txtFactura.setPlaceholder("");
        txtFactura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFacturaActionPerformed(evt);
            }
        });
        txtFactura.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtFacturaKeyTyped(evt);
            }
        });
        pnlPrincipal.add(txtFactura, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 280, 300, 40));

        lblNombre.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/usuario.png"))); // NOI18N
        pnlPrincipal.add(lblNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 350, 30, 30));

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
        pnlPrincipal.add(txtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 340, 300, 40));

        lblFecha.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/fecha.png"))); // NOI18N
        pnlPrincipal.add(lblFecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 230, 30, 30));

        txtFecha.setForeground(new java.awt.Color(0, 0, 0));
        txtFecha.setToolTipText("");
        txtFecha.setBordeColorFocus(new java.awt.Color(221, 98, 34));
        txtFecha.setBordeColorNoFocus(new java.awt.Color(221, 98, 34));
        txtFecha.setBotonColor(new java.awt.Color(255, 255, 255));
        txtFecha.setDisabledTextColor(new java.awt.Color(221, 98, 34));
        txtFecha.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        txtFecha.setModoMaterial(true);
        txtFecha.setPlaceholder("");
        txtFecha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFechaActionPerformed(evt);
            }
        });
        txtFecha.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtFechaKeyTyped(evt);
            }
        });
        pnlPrincipal.add(txtFecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 220, 300, 40));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, 415, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, 475, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCerrarActionPerformed
        int r = JOptionPane.showConfirmDialog(null, "Gracias por su compra", "Cerrar", JOptionPane.YES_NO_OPTION);
        if (r == JOptionPane.YES_OPTION) {
            inicio_usuario iu = new inicio_usuario();
            iu.setVisible(true);
            dispose();
        }
    }//GEN-LAST:event_btnCerrarActionPerformed

    private void txtTotalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTotalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTotalActionPerformed

    private void txtTotalKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTotalKeyTyped
        //Solo deja ingresar números en la caja de texto del código
        char num = evt.getKeyChar();
        if ((num < '0' || num > '9')) {
            evt.consume();
        }
    }//GEN-LAST:event_txtTotalKeyTyped

    private void txtFacturaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFacturaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFacturaActionPerformed

    private void txtFacturaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtFacturaKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFacturaKeyTyped

    private void txtNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombreActionPerformed

    private void txtNombreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNombreKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombreKeyTyped

    private void txtFechaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFechaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFechaActionPerformed

    private void txtFechaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtFechaKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFechaKeyTyped

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
    private javax.swing.JLabel lblLogo;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JLabel lblTotal;
    private javax.swing.JPanel pnlPrincipal;
    private rojeru_san.RSMTextFull txtFactura;
    private rojeru_san.RSMTextFull txtFecha;
    private rojeru_san.RSMTextFull txtNombre;
    private rojeru_san.RSMTextFull txtTotal;
    // End of variables declaration//GEN-END:variables
}
