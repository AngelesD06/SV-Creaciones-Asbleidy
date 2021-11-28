package creaciones_asbleidy;

import com.sun.awt.AWTUtilities;
import java.awt.Shape;
import java.awt.geom.RoundRectangle2D;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class entrada_productos extends javax.swing.JFrame {

    conexion con;
    conexion cc = new conexion();
    Connection cn = cc.getConection();
    Connection reg = con.getConection();

    public entrada_productos() {
        //Para quitar los botones de cerrar, minimizar y maximizar
        this.setUndecorated(true);
        initComponents();
        mostrar();
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
        jcbProducto = new javax.swing.JComboBox<>();
        jcbColor = new javax.swing.JComboBox<>();
        jcbTalla = new javax.swing.JComboBox<>();
        txtCantidad = new rojeru_san.RSMTextFull();
        txtFecha = new rojeru_san.RSMTextFull();
        Separador = new javax.swing.JSeparator();
        lblLogo = new javax.swing.JLabel();
        btnCerrar = new javax.swing.JButton();
        lblTalla = new javax.swing.JLabel();
        lblFecha = new javax.swing.JLabel();
        lblProducto = new javax.swing.JLabel();
        lblCantidad = new javax.swing.JLabel();
        lblColor = new javax.swing.JLabel();
        lblEntrada = new javax.swing.JLabel();
        btnGuardar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        pnlPrincipal.setBackground(new java.awt.Color(255, 255, 255));
        pnlPrincipal.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jcbProducto.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        jcbProducto.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "", "Item 1", "Item 2", "Item 3", "Item 4" }));
        jcbProducto.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jcbProductoItemStateChanged(evt);
            }
        });
        jcbProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcbProductoActionPerformed(evt);
            }
        });
        jcbProducto.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jcbProductoKeyReleased(evt);
            }
        });
        pnlPrincipal.add(jcbProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 280, 300, 30));

        jcbColor.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        jcbColor.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione un color", "Negro", "Blanco", "Azul", "Rojo", "Café", "Lila", "Plateado", "Verde", "Gris", "Rosado", "Dorado" }));
        jcbColor.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jcbColorItemStateChanged(evt);
            }
        });
        jcbColor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcbColorActionPerformed(evt);
            }
        });
        jcbColor.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jcbColorKeyReleased(evt);
            }
        });
        pnlPrincipal.add(jcbColor, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 400, 300, 30));

        jcbTalla.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        jcbTalla.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione una talla", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31", "32", "33", "34", "35", "36", "37", "38", "39", "40" }));
        jcbTalla.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jcbTallaItemStateChanged(evt);
            }
        });
        jcbTalla.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcbTallaActionPerformed(evt);
            }
        });
        jcbTalla.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jcbTallaKeyReleased(evt);
            }
        });
        pnlPrincipal.add(jcbTalla, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 460, 300, 30));

        txtCantidad.setForeground(new java.awt.Color(0, 0, 0));
        txtCantidad.setToolTipText("");
        txtCantidad.setBordeColorFocus(new java.awt.Color(221, 98, 34));
        txtCantidad.setBordeColorNoFocus(new java.awt.Color(221, 98, 34));
        txtCantidad.setBotonColor(new java.awt.Color(0, 0, 0));
        txtCantidad.setDisabledTextColor(new java.awt.Color(221, 98, 34));
        txtCantidad.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        txtCantidad.setModoMaterial(true);
        txtCantidad.setPlaceholder("Cantidad");
        txtCantidad.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCantidadKeyTyped(evt);
            }
        });
        pnlPrincipal.add(txtCantidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 330, 300, 40));

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
        txtFecha.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtFechaKeyTyped(evt);
            }
        });
        pnlPrincipal.add(txtFecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 210, 300, 40));
        pnlPrincipal.add(Separador, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, 380, 30));

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

        lblTalla.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/talla.png"))); // NOI18N
        pnlPrincipal.add(lblTalla, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 460, 30, 30));

        lblFecha.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/fecha.png"))); // NOI18N
        pnlPrincipal.add(lblFecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 220, 30, 30));

        lblProducto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/producto.png"))); // NOI18N
        pnlPrincipal.add(lblProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 280, 30, 30));

        lblCantidad.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/cantidad.png"))); // NOI18N
        pnlPrincipal.add(lblCantidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 340, 30, 30));

        lblColor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/color.png"))); // NOI18N
        pnlPrincipal.add(lblColor, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 400, 30, 30));

        lblEntrada.setFont(new java.awt.Font("Pristina", 0, 55)); // NOI18N
        lblEntrada.setText("Entrada de producto");
        pnlPrincipal.add(lblEntrada, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, -1, 76));

        btnGuardar.setBackground(new java.awt.Color(221, 98, 34));
        btnGuardar.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        btnGuardar.setForeground(new java.awt.Color(255, 255, 255));
        btnGuardar.setText("Guardar");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });
        pnlPrincipal.add(btnGuardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 520, 90, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, 570, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public static void mostrar() {
        jcbProducto.removeAllItems();
        //Se crea una lista que va a contener los nombres de todos los productos de la base de datos
        ArrayList<String> lista = new ArrayList<String>();
        //Se le agrega un ítem para informar que se debe seleccionar un producto
        jcbProducto.addItem("Seleccione un producto");
        //Se llama al método que llena la lista y, por lo tanto, el JComboBox
        lista = conexion.llenar_combo_productos();
        for (int i = 0; i < lista.size(); i++) {
            //Se agrega cada producto guardado en la lista en un ítem del JComboBox
            jcbProducto.addItem(lista.get(i));
        }
    }

    private void jcbProductoItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jcbProductoItemStateChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_jcbProductoItemStateChanged

    private void jcbProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbProductoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jcbProductoActionPerformed

    private void jcbProductoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jcbProductoKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_jcbProductoKeyReleased

    private void jcbColorItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jcbColorItemStateChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_jcbColorItemStateChanged

    private void jcbColorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbColorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jcbColorActionPerformed

    private void jcbColorKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jcbColorKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_jcbColorKeyReleased

    private void jcbTallaItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jcbTallaItemStateChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_jcbTallaItemStateChanged

    private void jcbTallaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbTallaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jcbTallaActionPerformed

    private void jcbTallaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jcbTallaKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_jcbTallaKeyReleased

    private void txtCantidadKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCantidadKeyTyped
        //Solo deja ingresar números en la caja de texto del código
        char num = evt.getKeyChar();
        if ((num < '0' || num > '9')) {
            evt.consume();
        }
    }//GEN-LAST:event_txtCantidadKeyTyped

    private void txtFechaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtFechaKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFechaKeyTyped

    private void btnCerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCerrarActionPerformed
        inventario i = new inventario();
        i.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnCerrarActionPerformed

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        String f, pr, c, col, t;
        int ca;
        f = txtFecha.getText();
        pr = String.valueOf(jcbProducto.getSelectedItem());
        c = txtCantidad.getText();
        col = String.valueOf(jcbColor.getSelectedItem());
        t = String.valueOf(jcbTalla.getSelectedItem());
        if (pr.equals("Seleccione un producto") || c.equals("") || col.equals("Seleccione un color") || t.equals("Seleccione una talla")) {
            JOptionPane.showMessageDialog(this, "Debe llenar todos los campos");
        } else {
            ca = Integer.parseInt(c);
            if (ca == 0) {
                JOptionPane.showMessageDialog(this, "Cantidad no válida");
            } else {
                int cp = Consultacp(pr);
                int ta = Integer.parseInt(t);
                con = new conexion();
                Connection reg = con.getConection();
                String sql = "";
                sql = "insert into inventario (codigo,unidades_d,color,talla) VALUES (?, ?, ?, ?)";
                try {
                    //Se ingresa la información en la base de datos
                    PreparedStatement pst = reg.prepareStatement(sql);
                    pst.setInt(1, cp);
                    pst.setInt(2, ca);
                    pst.setString(3, col);
                    pst.setInt(4, ta);
                    pst.executeUpdate();
                    int ci = Consultaci();
                    Entrada(ci, f, ca);
                    JOptionPane.showMessageDialog(this, "Registro de entrada de productos guardado");
                    Formatear();
                } catch (SQLException ex) {
                    Logger.getLogger(inicio_admin.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
    }//GEN-LAST:event_btnGuardarActionPerformed

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
            java.util.logging.Logger.getLogger(entrada_productos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(entrada_productos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(entrada_productos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(entrada_productos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new entrada_productos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JSeparator Separador;
    private javax.swing.JButton btnCerrar;
    private javax.swing.JButton btnGuardar;
    public static javax.swing.JComboBox<String> jcbColor;
    public static javax.swing.JComboBox<String> jcbProducto;
    public static javax.swing.JComboBox<String> jcbTalla;
    private javax.swing.JLabel lblCantidad;
    private javax.swing.JLabel lblColor;
    private javax.swing.JLabel lblEntrada;
    private javax.swing.JLabel lblFecha;
    private javax.swing.JLabel lblLogo;
    private javax.swing.JLabel lblProducto;
    private javax.swing.JLabel lblTalla;
    private javax.swing.JPanel pnlPrincipal;
    private rojeru_san.RSMTextFull txtCantidad;
    public rojeru_san.RSMTextFull txtFecha;
    // End of variables declaration//GEN-END:variables

    public int Consultacp(String producto) {
        int cp = 0;
        con = new conexion();
        Connection reg = con.getConection();
        String sql = "select codigo from producto where nombre='" + producto + "'";
        try {
            Statement st = reg.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                cp = rs.getInt("codigo");
            }
        } catch (SQLException ex) {
            Logger.getLogger(login.class.getName()).log(Level.SEVERE, null, ex);
        }
        return cp;
    }

    public int Consultaci() {
        int ci = 0;
        String sql = "";
        sql = "select id_i from inventario order by id_i desc limit 1";
        try {
            Statement st = reg.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                ci = rs.getInt("id_i");
            }
        } catch (SQLException ex) {
            Logger.getLogger(login.class.getName()).log(Level.SEVERE, null, ex);
        }
        return ci;
    }

    private void Entrada(int ci, String f, int ui) {
        con = new conexion();
        Connection reg = con.getConection();
        String sql = "";
        sql = "insert into entrada (id_i,fecha,unidades_i) VALUES (?, ?, ?)";
        try {
            java.sql.Date fecha = java.sql.Date.valueOf(f);
            //Se ingresa la información en la base de datos
            PreparedStatement pst = reg.prepareStatement(sql);
            pst.setInt(1, ci);
            pst.setDate(2, fecha);
            pst.setInt(3, ui);
            pst.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(inicio_admin.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void Formatear() {
        jcbProducto.setSelectedItem("Seleccione un producto");
        jcbColor.setSelectedItem("Seleccione un color");
        jcbTalla.setSelectedItem("Seleccione una talla");
        txtCantidad.setText("");
    }

}
