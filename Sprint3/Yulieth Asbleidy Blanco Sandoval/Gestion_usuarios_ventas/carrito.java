package creaciones_asbleidy;

import com.sun.awt.AWTUtilities;
import java.awt.Shape;
import java.awt.geom.RoundRectangle2D;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class carrito extends javax.swing.JFrame {

    public static DefaultTableModel modelo = inicio_usuario.md;
    public static String em = login.em;
    conexion con;
    public static int tot;
    public static String nuser;

    public carrito() {
        //Para quitar los botones de cerrar, minimizar y maximizar
        this.setUndecorated(true);
        initComponents();
        //Para centrar la ventana
        this.setLocationRelativeTo(this);
        //Para redondear las esquinas
        Shape forma = new RoundRectangle2D.Double(0, 0, this.getBounds().width, this.getBounds().height, 27, 27);
        AWTUtilities.setWindowShape(this, forma);
        //Para implementar en la tabla el modelo que contiene las compras
        tablaf.setModel(modelo);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlPrincipal = new javax.swing.JPanel();
        lblLogo = new javax.swing.JLabel();
        Separador = new javax.swing.JSeparator();
        btnCerrar = new javax.swing.JButton();
        lblTotal = new javax.swing.JLabel();
        lblFecha = new javax.swing.JLabel();
        btnEliminar = new javax.swing.JButton();
        btnPagar = new javax.swing.JButton();
        lblUsuario = new javax.swing.JLabel();
        lblLinea1 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaf = new javax.swing.JTable();
        txtFecha = new javax.swing.JTextField();
        lblLinea2 = new javax.swing.JLabel();
        txtTotal = new javax.swing.JTextField();
        lblLinea3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        pnlPrincipal.setBackground(new java.awt.Color(255, 255, 255));
        pnlPrincipal.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/marca.png"))); // NOI18N
        pnlPrincipal.add(lblLogo, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, -1));
        pnlPrincipal.add(Separador, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, 730, 20));

        btnCerrar.setBackground(new java.awt.Color(255, 255, 255));
        btnCerrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/salir.png"))); // NOI18N
        btnCerrar.setBorder(null);
        btnCerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCerrarActionPerformed(evt);
            }
        });
        pnlPrincipal.add(btnCerrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 20, -1, -1));

        lblTotal.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/total.png"))); // NOI18N
        lblTotal.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblTotalMouseClicked(evt);
            }
        });
        pnlPrincipal.add(lblTotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 420, -1, 40));

        lblFecha.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/fecha.png"))); // NOI18N
        lblFecha.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblFechaMouseClicked(evt);
            }
        });
        pnlPrincipal.add(lblFecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 130, -1, 40));

        btnEliminar.setBackground(new java.awt.Color(255, 255, 255));
        btnEliminar.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        btnEliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/eliminar.png"))); // NOI18N
        btnEliminar.setText("Eliminar");
        btnEliminar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnEliminar.setBorderPainted(false);
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });
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

        lblUsuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/usuario.png"))); // NOI18N
        lblUsuario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblUsuarioMouseClicked(evt);
            }
        });
        pnlPrincipal.add(lblUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, -1, 40));

        lblLinea1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/linea.png"))); // NOI18N
        pnlPrincipal.add(lblLinea1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 160, 290, 10));

        txtNombre.setEditable(false);
        txtNombre.setBackground(new java.awt.Color(255, 255, 255));
        txtNombre.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        txtNombre.setBorder(null);
        pnlPrincipal.add(txtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 130, 290, 30));

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

        txtFecha.setEditable(false);
        txtFecha.setBackground(new java.awt.Color(255, 255, 255));
        txtFecha.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        txtFecha.setBorder(null);
        txtFecha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFechaActionPerformed(evt);
            }
        });
        pnlPrincipal.add(txtFecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 130, 290, 30));

        lblLinea2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/linea.png"))); // NOI18N
        pnlPrincipal.add(lblLinea2, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 160, 290, 10));

        txtTotal.setEditable(false);
        txtTotal.setBackground(new java.awt.Color(255, 255, 255));
        txtTotal.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        txtTotal.setBorder(null);
        pnlPrincipal.add(txtTotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 420, 290, 30));

        lblLinea3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/linea.png"))); // NOI18N
        pnlPrincipal.add(lblLinea3, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 450, 290, 10));

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
        //Se llama al método para pasar al pago
        Consulta();
    }//GEN-LAST:event_btnPagarActionPerformed

    private void lblUsuarioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblUsuarioMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_lblUsuarioMouseClicked

    private void btnCerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCerrarActionPerformed
        String us = txtNombre.getText();
        //Se verifica que el cliente desea cancelar la compra
        int r = JOptionPane.showConfirmDialog(null, "¿Está seguro de cancelar la compra", "Cancelar", JOptionPane.YES_NO_OPTION);
        if (r == JOptionPane.YES_OPTION) {
            //Si la respuesta es sí, se eliminan las compras que ha realizado de los modelos de las tablas
            int nf1 = modelo.getRowCount();
            for (int i = nf1-1; i>= 0; i--) {
                modelo.removeRow(i);
            }          
            inicio_usuario iu = new inicio_usuario();
            int nf2 = iu.md.getRowCount();
            for(int i = nf2-1; i>=0; i--){
                iu.md.removeRow(i);
            }
            //Se elimina el total que tenía acumulado de las compras
            iu.total = 0;
            iu.txtNombre.setText(us);
            iu.setVisible(true);            
            dispose();
        }
    }//GEN-LAST:event_btnCerrarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        int f, r;
        f = tablaf.getSelectedRow();
        //Se verifica que se haya seleccionado una compra
        if (f == -1) {
            //Si no es así, se indica que se debe seleccionar la compra a eliminar
            JOptionPane.showMessageDialog(null, "Debe seleccionar una compra");
        } else {
            //Si es así, se verifica que realmente se desee eliminar la compra
            r = JOptionPane.showConfirmDialog(null, "¿Está seguro de eliminar esta compra?", "Eliminar", JOptionPane.YES_NO_OPTION);
            if (r == JOptionPane.YES_OPTION) {
                //Si la respuesta es sí, se obtiene el subtotal de la compra por ese producto y el total a pagar
                int total = Integer.parseInt(txtTotal.getText());
                int t = Integer.parseInt(String.valueOf(tablaf.getValueAt(f, 5)));
                //Se resta el subtotal de esa compra del total a pagar
                total = total - t;
                //Se muestra el nuevo total a pagar
                String nt = String.valueOf(total);
                txtTotal.setText(nt);
                //Se elimina la información de la tabla
                modelo.removeRow(f);
            }
        }
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void txtFechaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFechaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFechaActionPerformed

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
    private javax.swing.JLabel lblLinea1;
    private javax.swing.JLabel lblLinea2;
    private javax.swing.JLabel lblLinea3;
    private javax.swing.JLabel lblLogo;
    private javax.swing.JLabel lblTotal;
    private javax.swing.JLabel lblUsuario;
    private javax.swing.JPanel pnlPrincipal;
    public static javax.swing.JTable tablaf;
    public javax.swing.JTextField txtFecha;
    public javax.swing.JTextField txtNombre;
    public javax.swing.JTextField txtTotal;
    // End of variables declaration//GEN-END:variables

    //Método para verificar si ya existe el método de pago del usuario
    public void Consulta() {
        tot = Integer.parseInt(txtTotal.getText());
        nuser = txtNombre.getText();
        modificar_usuario mu = new modificar_usuario();
        String mp = "";
        con = new conexion();
        Connection reg = con.getConection();
        //Se crea la sentencia para consultar el método de pago del usuario
        String sql = "select metodo_pago from datos_pago where email='" + em + "'";
        try {
            Statement st = reg.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                mp = rs.getString("metodo_pago");
            }
        } catch (SQLException ex) {
            Logger.getLogger(login.class.getName()).log(Level.SEVERE, null, ex);
        }
        //Si no tiene un método de pago, lo envía a que ingrese la información
        if (mp == null) {
            pago p = new pago();
            p.setVisible(true);
            dispose();
        } else {
            String banco;
            //Verifica si el método de pago es tarjeta o PSE
            if (mp.equals("tarjeta")) {
                //Si es tarjeta llama al método Datos_tarjeta
                banco = Datos_tarjeta();
            } else {
                //Si es PSE llama al método Datos_pse
                banco = Datos_pse();
            }
            //Se envía la información a una confirmación del pago
            confirmacion c = new confirmacion();
            String n = txtNombre.getText();
            String t = txtTotal.getText();
            c.txtNombre.setText(n);
            c.txtPago.setText(mp);
            c.txtBanco.setText(banco);
            c.txtTotal.setText(t);
            c.setVisible(true);
            dispose();
        }
    }

    //Método que consulta el nombre del banco de los datos de la tarjeta
    public String Datos_tarjeta() {
        String b = "";
        con = new conexion();
        Connection reg = con.getConection();
        //Se crea la sentencia para consultar el nombre del banco que está en los datos de la tarjeta del cliente
        String sql = "select banco from tarjeta where email='" + em + "'";
        try {
            Statement st = reg.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                b = rs.getString("banco");
            }
        } catch (SQLException ex) {
            Logger.getLogger(login.class.getName()).log(Level.SEVERE, null, ex);
        }
        //Se retorna el nombre del banco
        return b;
    }

    //Método que consulta el nombre del banco de los datos de PSE
    public String Datos_pse() {
        String b = "";
        con = new conexion();
        Connection reg = con.getConection();        
        //Se crea la sentencia para consultar el nombre del banco que está en los datos de PSE del cliente
        String sql = "select banco from pse where email='" + em + "'";
        try {
            Statement st = reg.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                b = rs.getString("banco");
            }
        } catch (SQLException ex) {
            Logger.getLogger(login.class.getName()).log(Level.SEVERE, null, ex);
        }
        //Se retorna el nombre del banco
        return b;
    }

}
