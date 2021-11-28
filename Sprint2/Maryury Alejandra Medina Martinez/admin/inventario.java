package creaciones_asbleidy;

import com.sun.awt.AWTUtilities;
import java.awt.Shape;
import java.awt.geom.RoundRectangle2D;
import java.text.SimpleDateFormat;

public class inventario extends javax.swing.JFrame {

    public inventario() {
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
        btnProductos = new javax.swing.JLabel();
        lblProductos = new javax.swing.JLabel();
        btnEntrada = new javax.swing.JLabel();
        lblEntrada = new javax.swing.JLabel();
        btnCerrar = new javax.swing.JButton();
        btnHistoriale = new javax.swing.JLabel();
        lblHistoriale = new javax.swing.JLabel();
        lblHistorials = new javax.swing.JLabel();
        btnHistorials = new javax.swing.JLabel();
        lblInventario = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        pnlPrincipal.setBackground(new java.awt.Color(255, 255, 255));
        pnlPrincipal.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/marca.png"))); // NOI18N
        pnlPrincipal.add(lblLogo, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 180, 60));
        pnlPrincipal.add(Separador, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, 580, 30));

        btnProductos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/disponibles.png"))); // NOI18N
        btnProductos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnProductosMouseClicked(evt);
            }
        });
        pnlPrincipal.add(btnProductos, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 200, 100, 100));

        lblProductos.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        lblProductos.setText("Productos disponibles");
        pnlPrincipal.add(lblProductos, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 310, -1, -1));

        btnEntrada.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/ingreso.png"))); // NOI18N
        btnEntrada.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnEntradaMouseClicked(evt);
            }
        });
        pnlPrincipal.add(btnEntrada, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 200, 100, 100));

        lblEntrada.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        lblEntrada.setText("Entrada de productos");
        pnlPrincipal.add(lblEntrada, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 310, 130, -1));

        btnCerrar.setBackground(new java.awt.Color(255, 255, 255));
        btnCerrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/salir.png"))); // NOI18N
        btnCerrar.setBorder(null);
        btnCerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCerrarActionPerformed(evt);
            }
        });
        pnlPrincipal.add(btnCerrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 20, -1, -1));

        btnHistoriale.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/entrada.png"))); // NOI18N
        btnHistoriale.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnHistorialeMouseClicked(evt);
            }
        });
        pnlPrincipal.add(btnHistoriale, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 200, -1, 100));

        lblHistoriale.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        lblHistoriale.setText("Historial de entradas");
        pnlPrincipal.add(lblHistoriale, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 310, 120, -1));

        lblHistorials.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        lblHistorials.setText("Historial de salidas");
        pnlPrincipal.add(lblHistorials, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 310, -1, -1));

        btnHistorials.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/salida.png"))); // NOI18N
        btnHistorials.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnHistorialsMouseClicked(evt);
            }
        });
        pnlPrincipal.add(btnHistorials, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 200, 100, 100));

        lblInventario.setFont(new java.awt.Font("Pristina", 0, 55)); // NOI18N
        lblInventario.setText("Inventario");
        pnlPrincipal.add(lblInventario, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 120, -1, 76));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, 600, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, 350, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    //Método que obtiene la fecha actual
    public static String FechaActual() {
        java.util.Date Fecha = new java.util.Date();
        SimpleDateFormat FormatoFecha = new SimpleDateFormat("YYYY-MM-dd");
        return FormatoFecha.format(Fecha);
    }

    private void btnProductosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnProductosMouseClicked
        productos_disponibles pd = new productos_disponibles();
        pd.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnProductosMouseClicked

    private void btnEntradaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEntradaMouseClicked
        String fecha = FechaActual();
        entrada_productos ep = new entrada_productos();
        ep.txtFecha.setText(fecha);
        ep.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnEntradaMouseClicked

    private void btnCerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCerrarActionPerformed
        inicio_admin ia = new inicio_admin();
        ia.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnCerrarActionPerformed

    private void btnHistorialeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnHistorialeMouseClicked
        historial_e he = new historial_e();
        he.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnHistorialeMouseClicked

    private void btnHistorialsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnHistorialsMouseClicked
        historial_s hs = new historial_s();
        hs.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnHistorialsMouseClicked

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
            java.util.logging.Logger.getLogger(inventario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(inventario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(inventario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(inventario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new inventario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JSeparator Separador;
    private javax.swing.JButton btnCerrar;
    private javax.swing.JLabel btnEntrada;
    private javax.swing.JLabel btnHistoriale;
    private javax.swing.JLabel btnHistorials;
    private javax.swing.JLabel btnProductos;
    private javax.swing.JLabel lblEntrada;
    private javax.swing.JLabel lblHistoriale;
    private javax.swing.JLabel lblHistorials;
    private javax.swing.JLabel lblInventario;
    private javax.swing.JLabel lblLogo;
    private javax.swing.JLabel lblProductos;
    private javax.swing.JPanel pnlPrincipal;
    // End of variables declaration//GEN-END:variables
}
