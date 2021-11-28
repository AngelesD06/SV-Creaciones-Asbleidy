package creaciones_asbleidy;

import com.sun.awt.AWTUtilities;
import java.awt.Image;
import java.awt.Shape;
import java.awt.geom.RoundRectangle2D;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Blob;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class inicio_usuario extends javax.swing.JFrame {

    conexion con;
    conexion cc = new conexion();
    Connection cn = cc.getConection();
    Connection reg = con.getConection();

    public inicio_usuario() {
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
        btnCerrar = new javax.swing.JButton();
        jcbColor = new javax.swing.JComboBox<>();
        jcbTalla = new javax.swing.JComboBox<>();
        lblImagen = new javax.swing.JLabel();
        btnCarrito = new javax.swing.JLabel();
        Separador = new javax.swing.JSeparator();
        lblLogo = new javax.swing.JLabel();
        txtNombre = new rojeru_san.RSMTextFull();
        btnGuardar = new javax.swing.JButton();
        txtPrecio = new rojeru_san.RSMTextFull();
        txtCantidad = new rojeru_san.RSMTextFull();
        lblNombre = new javax.swing.JLabel();
        lblProductos = new javax.swing.JLabel();
        lblPrecio = new javax.swing.JLabel();
        lblTalla = new javax.swing.JLabel();
        lblColor = new javax.swing.JLabel();
        lblCantidad = new javax.swing.JLabel();

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
        pnlPrincipal.add(jcbProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 190, 350, 30));

        btnCerrar.setBackground(new java.awt.Color(255, 255, 255));
        btnCerrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/salir.png"))); // NOI18N
        btnCerrar.setBorder(null);
        btnCerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCerrarActionPerformed(evt);
            }
        });
        pnlPrincipal.add(btnCerrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 20, -1, -1));

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
        pnlPrincipal.add(jcbColor, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 300, 180, 30));

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
        pnlPrincipal.add(jcbTalla, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 300, 180, 30));

        lblImagen.setBackground(new java.awt.Color(255, 255, 255));
        pnlPrincipal.add(lblImagen, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 190, 150, 150));

        btnCarrito.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/carrito.png"))); // NOI18N
        btnCarrito.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnCarritoMouseClicked(evt);
            }
        });
        pnlPrincipal.add(btnCarrito, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 190, -1, 30));
        pnlPrincipal.add(Separador, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, 650, 30));

        lblLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/marca.png"))); // NOI18N
        pnlPrincipal.add(lblLogo, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 180, 60));

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
        pnlPrincipal.add(txtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 110, 240, 40));

        btnGuardar.setBackground(new java.awt.Color(221, 98, 34));
        btnGuardar.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        btnGuardar.setForeground(new java.awt.Color(255, 255, 255));
        btnGuardar.setText("Guardar");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });
        pnlPrincipal.add(btnGuardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 130, 90, -1));

        txtPrecio.setEditable(false);
        txtPrecio.setBackground(new java.awt.Color(255, 255, 255));
        txtPrecio.setForeground(new java.awt.Color(0, 0, 0));
        txtPrecio.setToolTipText("");
        txtPrecio.setBordeColorFocus(new java.awt.Color(221, 98, 34));
        txtPrecio.setBordeColorNoFocus(new java.awt.Color(221, 98, 34));
        txtPrecio.setBotonColor(new java.awt.Color(255, 255, 255));
        txtPrecio.setDisabledTextColor(new java.awt.Color(221, 98, 34));
        txtPrecio.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        txtPrecio.setModoMaterial(true);
        txtPrecio.setPlaceholder("");
        txtPrecio.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtPrecioKeyTyped(evt);
            }
        });
        pnlPrincipal.add(txtPrecio, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 240, 180, 40));

        txtCantidad.setEditable(false);
        txtCantidad.setBackground(new java.awt.Color(255, 255, 255));
        txtCantidad.setForeground(new java.awt.Color(0, 0, 0));
        txtCantidad.setToolTipText("");
        txtCantidad.setBordeColorFocus(new java.awt.Color(221, 98, 34));
        txtCantidad.setBordeColorNoFocus(new java.awt.Color(221, 98, 34));
        txtCantidad.setBotonColor(new java.awt.Color(255, 255, 255));
        txtCantidad.setDisabledTextColor(new java.awt.Color(221, 98, 34));
        txtCantidad.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        txtCantidad.setModoMaterial(true);
        txtCantidad.setPlaceholder("");
        txtCantidad.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCantidadKeyTyped(evt);
            }
        });
        pnlPrincipal.add(txtCantidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 240, 180, 40));

        lblNombre.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/editar.png"))); // NOI18N
        lblNombre.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblNombreMouseClicked(evt);
            }
        });
        pnlPrincipal.add(lblNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, -1, 30));

        lblProductos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/producto.png"))); // NOI18N
        lblProductos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblProductosMouseClicked(evt);
            }
        });
        pnlPrincipal.add(lblProductos, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 190, -1, 30));

        lblPrecio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/precio.png"))); // NOI18N
        lblPrecio.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblPrecioMouseClicked(evt);
            }
        });
        pnlPrincipal.add(lblPrecio, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 250, -1, 30));

        lblTalla.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/talla.png"))); // NOI18N
        lblTalla.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblTallaMouseClicked(evt);
            }
        });
        pnlPrincipal.add(lblTalla, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 300, -1, 30));

        lblColor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/color.png"))); // NOI18N
        lblColor.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblColorMouseClicked(evt);
            }
        });
        pnlPrincipal.add(lblColor, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 300, -1, 30));

        lblCantidad.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/cantidad.png"))); // NOI18N
        lblCantidad.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblCantidadMouseClicked(evt);
            }
        });
        pnlPrincipal.add(lblCantidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 250, -1, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, 675, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(pnlPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, 370, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
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
        lista = conexion.llenar_combo_disponibles();
        for (int i = 0; i < lista.size(); i++) {
            //Se agrega cada producto guardado en la lista en un ítem del JComboBox
            jcbProducto.addItem(lista.get(i));
        }
    }

    private void jcbProductoItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jcbProductoItemStateChanged
        String pr = String.valueOf(jcbProducto.getSelectedItem());
        String fondo = "C:\\Users\\aleja_000\\Documents\\NetBeansProjects\\CafeteriaUnipamplona\\src\\Imagenes\\Fondo.png";
        String precio = "";
        Image fot;
        ImageIcon foto;
        InputStream is;
        //Se verifica que se haya seleccionado un producto
        if (pr.equals("Seleccione un producto")) {
            //Si no es así, los campos y la imagen estarán vacíos
            txtPrecio.setText("");
            txtPrecio.setText("");
            Color();
            Talla();
            fot = getToolkit().getImage(fondo);
            //Le damos dimension a nuestro label que tendra la imagen
            fot = fot.getScaledInstance(150, 150, Image.SCALE_DEFAULT);
            //Imprimimos la imagen del fondo en el JLabel
            lblImagen.setIcon(new ImageIcon(fot));
        } else {
            //Si es correcto, se obtiene la información del producto de la base de datos
            Color_d(pr);
            Talla_d(pr);
            try {
                String sql = "select precio,imagen from producto where nombre = '" + pr + "'";
                Statement st = cn.createStatement();
                ResultSet rs = st.executeQuery(sql);
                while (rs.next()) {
                    precio = rs.getString("precio");
                    //Se obtiene la imagen de la base de datos y se convierte a un ícono
                    is = rs.getBinaryStream("imagen");
                    BufferedImage bi = ImageIO.read(is);
                    foto = new ImageIcon(bi);
                    Image img = foto.getImage();
                    Image newimg = img.getScaledInstance(150, 150, java.awt.Image.SCALE_SMOOTH);
                    ImageIcon newicon = new ImageIcon(newimg);
                    //Se muestra la imagen del producto en el JLabel
                    lblImagen.setIcon(newicon);
                }
                //Se muestran el precio del producto
                txtPrecio.setText(precio);
            } catch (SQLException ex) {
                Logger.getLogger(conexion.class.getName()).log(Level.SEVERE, null, ex);
            } catch (IOException ex) {
                Logger.getLogger(inicio_usuario.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_jcbProductoItemStateChanged

    private void jcbProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbProductoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jcbProductoActionPerformed

    private void jcbProductoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jcbProductoKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_jcbProductoKeyReleased

    private void btnCerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCerrarActionPerformed
        int r = JOptionPane.showConfirmDialog(null, "¿Está seguro de cerrar sesión?", "Cerrar", JOptionPane.YES_NO_OPTION);
        if (r == JOptionPane.YES_OPTION) {
            login l = new login();
            l.setVisible(true);
            dispose();
        }
    }//GEN-LAST:event_btnCerrarActionPerformed

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

    private void btnCarritoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCarritoMouseClicked
        modificar_usuario mu = new modificar_usuario();
    }//GEN-LAST:event_btnCarritoMouseClicked

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        carrito c = new carrito();
        c.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void txtPrecioKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPrecioKeyTyped
        //Solo deja ingresar números en la caja de texto del código
        char num = evt.getKeyChar();
        if ((num < '0' || num > '9')) {
            evt.consume();
        }
    }//GEN-LAST:event_txtPrecioKeyTyped

    private void txtCantidadKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCantidadKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCantidadKeyTyped

    private void lblNombreMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblNombreMouseClicked

    }//GEN-LAST:event_lblNombreMouseClicked

    private void lblProductosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblProductosMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_lblProductosMouseClicked

    private void lblPrecioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblPrecioMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_lblPrecioMouseClicked

    private void lblTallaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblTallaMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_lblTallaMouseClicked

    private void lblColorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblColorMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_lblColorMouseClicked

    private void lblCantidadMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCantidadMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_lblCantidadMouseClicked

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
            java.util.logging.Logger.getLogger(inicio_usuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(inicio_usuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(inicio_usuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(inicio_usuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new inicio_usuario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JSeparator Separador;
    private javax.swing.JLabel btnCarrito;
    private javax.swing.JButton btnCerrar;
    private javax.swing.JButton btnGuardar;
    public static javax.swing.JComboBox<String> jcbColor;
    public static javax.swing.JComboBox<String> jcbProducto;
    public static javax.swing.JComboBox<String> jcbTalla;
    private javax.swing.JLabel lblCantidad;
    private javax.swing.JLabel lblColor;
    private javax.swing.JLabel lblImagen;
    private javax.swing.JLabel lblLogo;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JLabel lblPrecio;
    private javax.swing.JLabel lblProductos;
    private javax.swing.JLabel lblTalla;
    private javax.swing.JPanel pnlPrincipal;
    private rojeru_san.RSMTextFull txtCantidad;
    public rojeru_san.RSMTextFull txtNombre;
    private rojeru_san.RSMTextFull txtPrecio;
    // End of variables declaration//GEN-END:variables

    private void Color() {
        jcbColor.removeAllItems();
        //Se le agregan los ítems por defecto
        jcbColor.addItem("Seleccione un color");
        jcbColor.addItem("Negro");
        jcbColor.addItem("Blanco");
        jcbColor.addItem("Azul");
        jcbColor.addItem("Rojo");
        jcbColor.addItem("Café");
        jcbColor.addItem("Lila");
        jcbColor.addItem("Plateado");
        jcbColor.addItem("Verde");
        jcbColor.addItem("Gris");
        jcbColor.addItem("Rosado");
        jcbColor.addItem("Dorado");
    }

    private void Talla() {
        jcbTalla.removeAllItems();
        //Se le agregan los ítems por defecto
        jcbTalla.addItem("Seleccione una talla");
        jcbTalla.addItem("21");
        jcbTalla.addItem("22");
        jcbTalla.addItem("23");
        jcbTalla.addItem("24");
        jcbTalla.addItem("25");
        jcbTalla.addItem("26");
        jcbTalla.addItem("27");
        jcbTalla.addItem("28");
        jcbTalla.addItem("29");
        jcbTalla.addItem("30");
        jcbTalla.addItem("31");
        jcbTalla.addItem("32");
        jcbTalla.addItem("33");
        jcbTalla.addItem("34");
        jcbTalla.addItem("35");
        jcbTalla.addItem("36");
        jcbTalla.addItem("37");
        jcbTalla.addItem("38");
        jcbTalla.addItem("39");
        jcbTalla.addItem("40");
    }

    private void Color_d(String pr) {
        jcbColor.removeAllItems();
        //Se crea una lista que va a contener los nombres de todos los productos de la base de datos
        ArrayList<String> lista = new ArrayList<String>();
        //Se le agrega un ítem para informar que se debe seleccionar un producto
        jcbColor.addItem("Seleccione un color");
        //Se llama al método que llena la lista y, por lo tanto, el JComboBox
        lista = conexion.llenar_combo_color(pr);
        for (int i = 0; i < lista.size(); i++) {
            //Se agrega cada producto guardado en la lista en un ítem del JComboBox
            jcbColor.addItem(lista.get(i));
        }
    }

    private void Talla_d(String pr) {
        jcbTalla.removeAllItems();
        //Se crea una lista que va a contener los nombres de todos los productos de la base de datos
        ArrayList<String> lista = new ArrayList<String>();
        //Se le agrega un ítem para informar que se debe seleccionar un producto
        jcbTalla.addItem("Seleccione una talla");
        //Se llama al método que llena la lista y, por lo tanto, el JComboBox
        lista = conexion.llenar_combo_talla(pr);
        for (int i = 0; i < lista.size(); i++) {
            //Se agrega cada producto guardado en la lista en un ítem del JComboBox
            jcbTalla.addItem(lista.get(i));
        }
    }
}
