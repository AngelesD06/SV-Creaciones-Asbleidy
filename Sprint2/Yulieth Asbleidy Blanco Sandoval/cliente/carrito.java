package creaciones_asbleidy;

import com.sun.awt.AWTUtilities;
import java.awt.Shape;
import java.awt.geom.RoundRectangle2D;
import javax.swing.JOptionPane;

public class carrito extends javax.swing.JFrame {

    public carrito() {
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
        lblLogo = new javax.swing.JLabel();
        Separador = new javax.swing.JSeparator();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaf = new javax.swing.JTable();
        btnCerrar = new javax.swing.JButton();
        txtTotal = new rojeru_san.RSMTextFull();
        lblTotal = new javax.swing.JLabel();
        txtFecha = new rojeru_san.RSMTextFull();
        lblFecha = new javax.swing.JLabel();
        btnEliminar = new javax.swing.JButton();
        btnPagar = new javax.swing.JButton();
        txtNombre = new rojeru_san.RSMTextFull();
        lblUsuario = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        pnlPrincipal.setBackground(new java.awt.Color(255, 255, 255));
        pnlPrincipal.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/marca.png"))); // NOI18N
        pnlPrincipal.add(lblLogo, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, -1));
        pnlPrincipal.add(Separador, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, 730, 20));

        tablaf.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        tablaf.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Producto", "Precio", "Cantidad", "Subtotal"
            }
        ));
        tablaf.setSelectionBackground(new java.awt.Color(221, 98, 34));
        jScrollPane1.setViewportView(tablaf);

        pnlPrincipal.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 190, 710, 210));

        btnCerrar.setBackground(new java.awt.Color(255, 255, 255));
        btnCerrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/salir.png"))); // NOI18N
        btnCerrar.setBorder(null);
        btnCerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCerrarActionPerformed(evt);
            }
        });
        pnlPrincipal.add(btnCerrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 20, -1, -1));

        txtTotal.setEditable(false);
        txtTotal.setBackground(new java.awt.Color(255, 255, 255));
        txtTotal.setForeground(new java.awt.Color(0, 0, 0));
        txtTotal.setToolTipText("");
        txtTotal.setBordeColorFocus(new java.awt.Color(221, 98, 34));
        txtTotal.setBordeColorNoFocus(new java.awt.Color(221, 98, 34));
        txtTotal.setBotonColor(new java.awt.Color(255, 255, 255));
        txtTotal.setDisabledTextColor(new java.awt.Color(221, 98, 34));
        txtTotal.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        txtTotal.setModoMaterial(true);
        txtTotal.setPlaceholder("");
        pnlPrincipal.add(txtTotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 410, 300, 40));

        lblTotal.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/total.png"))); // NOI18N
        lblTotal.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblTotalMouseClicked(evt);
            }
        });
        pnlPrincipal.add(lblTotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 420, -1, 30));

        txtFecha.setEditable(false);
        txtFecha.setBackground(new java.awt.Color(255, 255, 255));
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
        pnlPrincipal.add(txtFecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 130, 300, 40));

        lblFecha.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/fecha.png"))); // NOI18N
        lblFecha.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblFechaMouseClicked(evt);
            }
        });
        pnlPrincipal.add(lblFecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 140, -1, 30));

        btnEliminar.setBackground(new java.awt.Color(255, 255, 255));
        btnEliminar.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        btnEliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/eliminar.png"))); // NOI18N
        btnEliminar.setText("Eliminar");
        btnEliminar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnEliminar.setBorderPainted(false);
        pnlPrincipal.add(btnEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 420, 100, 40));

        btnPagar.setBackground(new java.awt.Color(255, 255, 255));
        btnPagar.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        btnPagar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/pagar.png"))); // NOI18N
        btnPagar.setText("Pagar");
        btnPagar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnPagar.setBorderPainted(false);
        btnPagar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPagarActionPerformed(evt);
            }
        });
        pnlPrincipal.add(btnPagar, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 420, 90, 40));

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
        txtNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombreActionPerformed(evt);
            }
        });
        pnlPrincipal.add(txtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 130, 300, 40));

        lblUsuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/usuario.png"))); // NOI18N
        lblUsuario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblUsuarioMouseClicked(evt);
            }
        });
        pnlPrincipal.add(lblUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, -1, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(pnlPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, 755, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, 475, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void lblTotalMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblTotalMouseClicked

    }//GEN-LAST:event_lblTotalMouseClicked

    private void lblFechaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblFechaMouseClicked

    }//GEN-LAST:event_lblFechaMouseClicked

    private void btnPagarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPagarActionPerformed
        pago p = new pago();
        p.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnPagarActionPerformed

    private void txtFechaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFechaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFechaActionPerformed

    private void lblUsuarioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblUsuarioMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_lblUsuarioMouseClicked

    private void btnCerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCerrarActionPerformed
        int r = JOptionPane.showConfirmDialog(null, "¿Está seguro de cancelar la compra", "Cancelar", JOptionPane.YES_NO_OPTION);
        if (r == JOptionPane.YES_OPTION) {
            inicio_usuario iu = new inicio_usuario();
            iu.setVisible(true);
            dispose();
        }
    }//GEN-LAST:event_btnCerrarActionPerformed

    private void txtNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombreActionPerformed

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
            java.util.logging.Logger.getLogger(carrito.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(carrito.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(carrito.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(carrito.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new carrito().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JSeparator Separador;
    private javax.swing.JButton btnCerrar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnPagar;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblFecha;
    private javax.swing.JLabel lblLogo;
    private javax.swing.JLabel lblTotal;
    private javax.swing.JLabel lblUsuario;
    private javax.swing.JPanel pnlPrincipal;
    public static javax.swing.JTable tablaf;
    public rojeru_san.RSMTextFull txtFecha;
    public rojeru_san.RSMTextFull txtNombre;
    public rojeru_san.RSMTextFull txtTotal;
    // End of variables declaration//GEN-END:variables
}
