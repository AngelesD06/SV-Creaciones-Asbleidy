package creaciones_asbleidy;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.*;
import java.sql.*;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class inicio_usuario extends javax.swing.JFrame {

    conexion con;
    Connection reg = con.getConection();
    public static String em = login.em;
    public static int total = 0;
    public static DefaultTableModel md;
    String Datos[][] = {};
    String Cabeza[] = {"NOMBRE", "COLOR", "TALLA", "PRECIO", "CANTIDAD", "SUBTOTAL"};

    public inicio_usuario() {
        //Para quitar los botones de cerrar, minimizar y maximizar
        this.setUndecorated(true);
        initComponents();
        //Para llamar al método mostrar
        mostrar();
        //Para centrar la ventana
        this.setLocationRelativeTo(this);
        md = new DefaultTableModel(Datos, Cabeza);
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
        btnGuardar = new javax.swing.JButton();
        txtCantidad = new rojeru_san.RSMTextFull();
        btnModificar = new javax.swing.JLabel();
        lblProductos = new javax.swing.JLabel();
        lblPrecio = new javax.swing.JLabel();
        lblTalla = new javax.swing.JLabel();
        lblColor = new javax.swing.JLabel();
        lblCantidad = new javax.swing.JLabel();
        lblLinea1 = new javax.swing.JLabel();
        txtPrecio = new javax.swing.JTextField();
        txtNombre = new javax.swing.JTextField();
        lblLinea2 = new javax.swing.JLabel();

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

        txtCantidad.setForeground(new java.awt.Color(0, 0, 0));
        txtCantidad.setToolTipText("");
        txtCantidad.setBordeColorFocus(new java.awt.Color(221, 98, 34));
        txtCantidad.setBordeColorNoFocus(new java.awt.Color(221, 98, 34));
        txtCantidad.setBotonColor(new java.awt.Color(221, 98, 34));
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

        btnModificar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/editar.png"))); // NOI18N
        btnModificar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnModificarMouseClicked(evt);
            }
        });
        pnlPrincipal.add(btnModificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, -1, 30));

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

        lblLinea1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/linea.png"))); // NOI18N
        pnlPrincipal.add(lblLinea1, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 270, 180, 10));

        txtPrecio.setEditable(false);
        txtPrecio.setBackground(new java.awt.Color(255, 255, 255));
        txtPrecio.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        txtPrecio.setBorder(null);
        pnlPrincipal.add(txtPrecio, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 240, 180, 30));

        txtNombre.setEditable(false);
        txtNombre.setBackground(new java.awt.Color(255, 255, 255));
        txtNombre.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        txtNombre.setBorder(null);
        txtNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombreActionPerformed(evt);
            }
        });
        pnlPrincipal.add(txtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 120, 240, 30));

        lblLinea2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/linea.png"))); // NOI18N
        pnlPrincipal.add(lblLinea2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 150, 240, 10));

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

    //Método para mostrar los nombres de los productos disponibles en un JComboBox
    public static void mostrar() {
        jcbProducto.removeAllItems();
        //Se crea una lista que va a contener los nombres de todos los productos de la base de datos
        ArrayList<String> lista = new ArrayList<String>();
        //Se le agrega un ítem para informar que se debe seleccionar un producto
        jcbProducto.addItem("Seleccione un producto");
        //Se llama al método que llena la lista y, por lo tanto, el JComboBox
        lista = conexion.llenar_combo_compra();
        for (int i = 0; i < lista.size(); i++) {
            //Se agrega cada producto guardado en la lista en un ítem del JComboBox
            jcbProducto.addItem(lista.get(i));
        }
    }

    //Método para obtener la fecha actual
    public static String FechaActual() {
        java.util.Date Fecha = new java.util.Date();
        SimpleDateFormat FormatoFecha = new SimpleDateFormat("YYYY-MM-dd");
        return FormatoFecha.format(Fecha);
    }

    private void jcbProductoItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jcbProductoItemStateChanged
        String pr = String.valueOf(jcbProducto.getSelectedItem());
        String fondo = "C:\\Users\\Lenovo\\Documents\\NetBeansProjects\\Creaciones_Asbleidy\\src\\imagenes\\fondo.png";
        String precio = "";
        Image fot;
        ImageIcon foto;
        InputStream is;
        //Se verifica que se haya seleccionado un producto
        if (pr.equals("Seleccione un producto")) {
            //Si no es así, los campos y la imagen estarán vacíos
            txtPrecio.setText("");
            txtPrecio.setText("");
            //Se llama al método Color
            Color();
            //Se llama al método Talla
            Talla();
            fot = getToolkit().getImage(fondo);
            //Le damos dimension a nuestro label que tendra la imagen
            fot = fot.getScaledInstance(150, 150, Image.SCALE_DEFAULT);
            //Imprimimos la imagen del fondo en el JLabel
            lblImagen.setIcon(new ImageIcon(fot));
            //Si es así, se obtiene la información del producto de la base de datos
        } else {
            //Se llama al método Color_d y se le envía el nombre del producto
            Color_d(pr);
            try {
                //Se crea la sentencia para consultar los datos del producto
                String sql = "select precio,imagen from producto where nombre = '" + pr + "'";
                Statement st = reg.createStatement();
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
                    //Se muestra el precio del producto
                    txtPrecio.setText(precio);
                }
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
        //Se verifica que se desea cerrar la sesión
        int r = JOptionPane.showConfirmDialog(null, "¿Está seguro de cerrar sesión?", "Cerrar", JOptionPane.YES_NO_OPTION);
        if (r == JOptionPane.YES_OPTION) {
            //Si la respuesta es sí, se cierra la sesión y se regresa al login
            login l = new login();
            l.setVisible(true);
            dispose();
        }
    }//GEN-LAST:event_btnCerrarActionPerformed

    private void jcbColorItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jcbColorItemStateChanged
        String pr = String.valueOf(jcbProducto.getSelectedItem());
        String col = String.valueOf(jcbColor.getSelectedItem());
        //Se verifica que se haya seleccionado un color
        if (col.equals("Seleccione un color")) {
            //Si no es así se llama al método Talla
            Talla();
        } else {
            //Sí es así se llama al método Talla_d y se le envía el nombre del producto y el color seleccionado
            Talla_d(pr, col);
        }
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
        //Se llama al método para pasar al carrito
        Carrito();
    }//GEN-LAST:event_btnCarritoMouseClicked

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        int nf = md.getRowCount();
        //Se verifica que se haya agregado por lo menos una compra al carrito
        if (nf == 0) {
            JOptionPane.showMessageDialog(this, "Debe agregar una compra al carrito");
        } else {
            String n = txtNombre.getText();
            //Se verifica que el usuario quiera terminar de comprar
            int r = JOptionPane.showConfirmDialog(null, "¿Está seguro de terminar sus compras?", "Terminar compras", JOptionPane.YES_NO_OPTION);
            if (r == JOptionPane.YES_OPTION) {
                //Si es así, se llama al método Datose y se le envía el nombre del usuario
                int de = Datose();
                if (de == 1) {
                    //Si no ha diligenciado sus datos personales se le pide al cliente que lo haga
                    JOptionPane.showMessageDialog(this, "Debe completar su información personal");
                } else {
                    //Si ya lo ha hecho se envía la información al carrito
                    carrito c = new carrito();
                    c.txtNombre.setText(n);
                    c.txtFecha.setText(FechaActual());
                    c.txtTotal.setText(String.valueOf(total));
                    total = 0;
                    c.setVisible(true);
                    dispose();
                }
            }
        }
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void txtCantidadKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCantidadKeyTyped
        //Solo deja ingresar números en la caja de texto
        char num = evt.getKeyChar();
        if ((num < '0' || num > '9')) {
            evt.consume();
        }
    }//GEN-LAST:event_txtCantidadKeyTyped

    private void btnModificarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnModificarMouseClicked
        //Se llama al método Consulta y se le envía el nombre del usuario
        Consulta();
    }//GEN-LAST:event_btnModificarMouseClicked

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

    private void txtNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombreActionPerformed

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
    private javax.swing.JLabel btnModificar;
    public static javax.swing.JComboBox<String> jcbColor;
    public static javax.swing.JComboBox<String> jcbProducto;
    public static javax.swing.JComboBox<String> jcbTalla;
    private javax.swing.JLabel lblCantidad;
    private javax.swing.JLabel lblColor;
    private javax.swing.JLabel lblImagen;
    private javax.swing.JLabel lblLinea1;
    private javax.swing.JLabel lblLinea2;
    private javax.swing.JLabel lblLogo;
    private javax.swing.JLabel lblPrecio;
    private javax.swing.JLabel lblProductos;
    private javax.swing.JLabel lblTalla;
    private javax.swing.JPanel pnlPrincipal;
    private rojeru_san.RSMTextFull txtCantidad;
    public javax.swing.JTextField txtNombre;
    public javax.swing.JTextField txtPrecio;
    // End of variables declaration//GEN-END:variables

    //Método para dejar solo el ítem por defecto en el JComboBox del color
    public void Color() {
        jcbColor.removeAllItems();
        //Se le agregan el ítem por defecto
        jcbColor.addItem("Seleccione un color");
    }

    //Método para dejar solo el ítem por defecto en el JComboBox de la talla
    public void Talla() {
        jcbTalla.removeAllItems();
        //Se le agrega el ítem por defecto
        jcbTalla.addItem("Seleccione una talla");
    }

    //Método para consultar los colores disponibles de un producto
    public void Color_d(String pr) {
        jcbColor.removeAllItems();
        //Se crea una lista que va a contener los colores
        ArrayList<String> lista = new ArrayList<String>();
        //Se le agrega un ítem para informar que se debe seleccionar un color
        jcbColor.addItem("Seleccione un color");
        //Se llama al método que llena la lista y, por lo tanto, el JComboBox
        lista = conexion.llenar_combo_color(pr);
        for (int i = 0; i < lista.size(); i++) {
            //Se agrega cada color guardado en la lista en un ítem del JComboBox
            jcbColor.addItem(lista.get(i));
        }
    }

    //Método para consultar las tallas disponibles de un producto de acuerdo al color
    public void Talla_d(String pr, String col) {
        jcbTalla.removeAllItems();
        //Se crea una lista que va a contener las tallas
        ArrayList<String> lista = new ArrayList<String>();
        //Se le agrega un ítem para informar que se debe seleccionar una talla
        jcbTalla.addItem("Seleccione una talla");
        //Se llama al método que llena la lista y, por lo tanto, el JComboBox
        lista = conexion.llenar_combo_talla(pr, col);
        for (int i = 0; i < lista.size(); i++) {
            //Se agrega cada talla guardada en la lista en un ítem del JComboBox
            jcbTalla.addItem(lista.get(i));
        }
    }

    //Método para agregar la información de las compras al carrito
    public void Carrito() {
        String np = String.valueOf(jcbProducto.getSelectedItem());
        String pr = txtPrecio.getText();
        String c = txtCantidad.getText();
        String col = String.valueOf(jcbColor.getSelectedItem());
        String ta = String.valueOf(jcbTalla.getSelectedItem());
        int ca;
        String fondo = "C:\\Users\\Lenovo\\Documents\\NetBeansProjects\\Creaciones_Asbleidy\\src\\imagenes\\fondo.png";
        //Se verifica que los campos estén completos
        if (np.equals("Seleccione un producto") || pr.equals("") || c.equals("") || col.equals("Seleccione un color") || ta.equals("Seleccione una talla")) {
            JOptionPane.showMessageDialog(this, "Debe llenar todos los campos");
        } else {
            ca = Integer.parseInt(txtCantidad.getText());
            //Se verifica que se la cantidad ingresada no sea cero
            if (ca == 0) {
                JOptionPane.showMessageDialog(this, "Cantidad no válida, ingrese una diferente");
                //Se limpia la caja de texto de la cantidad
                txtCantidad.setText("");
            } else {
                //Se llama al método Consulta_cod y se le envía el nombre del producto
                int cp = Consulta_cod(np);
                int talla = Integer.parseInt(ta);
                //Se llama al método Consultau y se le envía el código, color y talla del producto
                int ud = Consultau(cp, col, talla);
                if (ca > ud) {
                    //Si la cantidad a comprar supera la cantidad de unidades disponibles se informa que debe cambiarla
                    JOptionPane.showMessageDialog(this, "La cantidad de unidades disponibles de este producto es " + ud + ". Ingrese una cantidad igual o menor a esta");
                } else {
                    int nf = md.getRowCount();
                    //Si es la primera compra se agrega directamente
                    if (nf == 0) {
                        //Se llama al método Guardar_datos y se le envía la información de la compra
                        Guardar_datos(ca, np, col, ta, fondo);
                    } else {
                        //Si ya hay alguna compra se compara la información para que no se dupliquen productos
                        int pe = 0;
                        for (int i = 0; i < nf; i++) {
                            //Si la información coincide con la de alguna compra guardada se asigna el valor de 1
                            if (md.getValueAt(i, 0).equals(np) && md.getValueAt(i, 1).equals(col) && md.getValueAt(i, 2).equals(ta)) {
                                pe = 1;
                            }
                        }
                        //Se informa al cliente que ya se encuentra el producto guardado en el carrito
                        if (pe == 1) {
                            JOptionPane.showMessageDialog(this, "Este producto ya se encuentra en su carrito");
                            //Si la información no coincide con la de alguna compra guardada entonces se puede agregar al carrito
                        } else {
                            //Se llama al método Guardar_datos y se le envía la información de la compra
                            Guardar_datos(ca, np, col, ta, fondo);
                        }
                    }
                }
            }
        }
    }

    //Método para consultar el código de un producto
    public int Consulta_cod(String np) {
        int cod = 0;
        con = new conexion();
        //Se crea la sentencia para consultar el código de acuerdo al nombre del producto
        String sql = "select codigo from producto where nombre='" + np + "'";
        try {
            Statement st = reg.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                cod = rs.getInt("codigo");
            }
        } catch (SQLException ex) {
            Logger.getLogger(inicio_usuario.class.getName()).log(Level.SEVERE, null, ex);
        }
        //Se retorna el código
        return cod;
    }

    //Método para consultar el número de unidades disponibles de un producto
    public int Consultau(int cp, String col, int ta) {
        int u = 0;
        //Se crea la sentencia para consultar las unidades disponibles del producto de acuerdo al color y la talla
        String sql = "select unidades_d from inventario where codigo='" + cp + "' and color='" + col + "' and talla='" + ta + "'";
        try {
            Statement st = reg.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                u = rs.getInt("unidades_d");
            }
        } catch (SQLException ex) {
            Logger.getLogger(login.class.getName()).log(Level.SEVERE, null, ex);
        }
        //Se retorna el número de unidades disponibles
        return u;
    }

    //Método para guardar la información de una compra en el carrito
    public void Guardar_datos(int ca, String np, String col, String ta, String fondo) {
        try {
            int p = Integer.parseInt(txtPrecio.getText());
            //Se calcula el total por el producto
            int subt = ca * p;
            //Se va acumulando el total a pagar
            total = total + subt;
            //Se llena un array con la información de la compra
            Object datos[] = {np, col, ta, p, ca, subt};
            //Se agrega a una fila del modelo de la tabla de la factura
            md.addRow(datos);
            JOptionPane.showMessageDialog(this, "Compra agregada");
        } catch (Exception e) {
            System.out.println(e);
        }
        //Se le asignan los valores por defecto al JComboBox y a los JTextField
        jcbProducto.setSelectedItem("Seleccione un producto");
        txtPrecio.setText("");
        txtCantidad.setText("");
        Image foto = getToolkit().getImage(fondo);
        //Le damos dimension a nuestro label que tendra la imagen
        foto = foto.getScaledInstance(150, 150, Image.SCALE_DEFAULT);
        //Imprimimos la imagen del fondo en el JLabel
        lblImagen.setIcon(new ImageIcon(foto));
    }

    //Método para consultar los datos personales del usuario
    public int Datose() {
        int de = 0;
        String direccion = "", ciudad = "", telefono = "";
        con = new conexion();
        //Se crea la sentencia para consultar la información de acuerdo al email del usuario
        String sql = "select direccion,ciudad,telefono from usuario where email='" + em + "'";
        try {
            Statement st = reg.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                direccion = rs.getString("direccion");
                ciudad = rs.getString("ciudad");
                telefono = rs.getString("telefono");
            }
        } catch (SQLException ex) {
            Logger.getLogger(login.class.getName()).log(Level.SEVERE, null, ex);
        }
        //Si no tiene información guardada se le asigna el valor de 1
        if (direccion == null || ciudad == null || telefono == null) {
            de = 1;
        }
        //Se retorna el valor obtenido
        return de;
    }

    //Método para consultar los datos personales del usuario
    public void Consulta() {
        String us = txtNombre.getText();
        modificar_usuario mu = new modificar_usuario();
        String direccion = "", ciudad = "", telefono = "";
        con = new conexion();
        //Se crea la sentencia para consultar la información de acuerdo al email del usuario
        String sql = "select direccion,ciudad,telefono from usuario where email='" + em + "'";
        try {
            Statement st = reg.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                direccion = rs.getString("direccion");
                ciudad = rs.getString("ciudad");
                telefono = rs.getString("telefono");
            }
        } catch (SQLException ex) {
            Logger.getLogger(login.class.getName()).log(Level.SEVERE, null, ex);
        }
        //Si no tiene información guardada solo se muestra el nombre y debe ingresar los datos
        if (direccion == null || ciudad == null || telefono == null) {
            mu.txtNombre.setText(us);
            mu.setVisible(true);
            dispose();
        } else {
            //Si tiene información se le muestran los datos por si desea actualizarlos
            mu.txtNombre.setText(us);
            mu.txtDireccion.setText(direccion);
            mu.txtCiudad.setText(ciudad);
            mu.txtTelefono.setText(telefono);
            mu.setVisible(true);
            dispose();
        }
    }

}
