package creaciones_asbleidy;


import java.sql.*;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class entrada_productos extends javax.swing.JFrame {

    conexion cc = new conexion();
    Connection reg = cc.getConection();

    public entrada_productos() {
        //Para quitar los botones de cerrar, minimizar y maximizar
        this.setUndecorated(true);
        initComponents();
        //Para llamar al método mostrar
        mostrar();
        //Para centrar la ventana
        this.setLocationRelativeTo(this);
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlPrincipal = new javax.swing.JPanel();
        jcbProducto = new javax.swing.JComboBox<>();
        jcbColor = new javax.swing.JComboBox<>();
        jcbTalla = new javax.swing.JComboBox<>();
        txtCantidad = new rojeru_san.RSMTextFull();
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
        txtFecha = new javax.swing.JTextField();
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
        txtCantidad.setBotonColor(new java.awt.Color(221, 98, 34));
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

        txtFecha.setEditable(false);
        txtFecha.setBackground(new java.awt.Color(255, 255, 255));
        txtFecha.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        txtFecha.setBorder(null);
        pnlPrincipal.add(txtFecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 210, 300, 30));

        lblLinea2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/linea.png"))); // NOI18N
        pnlPrincipal.add(lblLinea2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 240, 300, -1));

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

    //Método que muestra todos los productos en un JComboBox
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
        //Solo deja ingresar números en la caja de texto
        char num = evt.getKeyChar();
        if ((num < '0' || num > '9')) {
            evt.consume();
        }
    }//GEN-LAST:event_txtCantidadKeyTyped

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
        //Se verifica que se hayan llenado todos los campos
        if (pr.equals("Seleccione un producto") || c.equals("") || col.equals("Seleccione un color") || t.equals("Seleccione una talla")) {
            JOptionPane.showMessageDialog(this, "Debe llenar todos los campos");
        } else {
            //Si es así, se verifica que la cantidad sea diferente a cero
            ca = Integer.parseInt(c);            
            if (ca == 0) {
                JOptionPane.showMessageDialog(this, "Cantidad no válida");
            } else {
                //Se llama al método Consultacp y se le envía el nombre del producto
                int cp = Consultacp(pr);                
                int ta = Integer.parseInt(t);
                //Se llama al método Consultai y se le envía el código, color y talla del producoto
                int e = Consultai(cp, col, ta);
                //Si ya existe un registro con esos datos en el inventario entonces se actualiza
                if (e == 1) {
                    //Se llama al método Actualizar y se le envía la información necesaria
                    Actualizar(cp, ca, col, ta, f);
                //Si no existe un registro entonces se crea con dichos datos
                } else {    
                    //Se llama al método Inventario y se le envía la información necesaria
                    Inventario(cp, ca, col, ta, f);
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
    private javax.swing.JLabel lblLinea2;
    private javax.swing.JLabel lblLogo;
    private javax.swing.JLabel lblProducto;
    private javax.swing.JLabel lblTalla;
    private javax.swing.JPanel pnlPrincipal;
    private rojeru_san.RSMTextFull txtCantidad;
    public javax.swing.JTextField txtFecha;
    // End of variables declaration//GEN-END:variables

    //Método para consultar el código de un producto
    public int Consultacp(String producto) {
        int cp = 0;
        //Se crea la sentencia para consultar el código mediante el nombre del producto
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
        //Se retorna el código del producto
        return cp;
    }
    
    //Método para consultar si existe un registro en el inventario
    public int Consultai(int cp, String col, int ta) {
        int e;
        boolean b = false;
        //Se crea la sentencia para verificar si existe un registro con ese código, color y talla del producto
        String sql = "select exists (select codigo,color,talla from inventario where codigo='" + cp + "' and color='" + col + "' and talla='" + ta + "')";
        try {
            Statement st = reg.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                b = rs.getBoolean("exists");
            }
        } catch (SQLException ex) {
            Logger.getLogger(login.class.getName()).log(Level.SEVERE, null, ex);
        }
        //Si ya existe se le asigna el valor de 1 y si no el valor de 0
        if (b == true) {
            e = 1;
        } else {
            e = 0;
        }
        //Se retorna el valor
        return e;
    }

    //Método para actualizar un registro en el inventario
    public void Actualizar(int cp, int ca, String col, int ta, String f) {
        //Se llama al método Consultau y se le envía el código, color y talla del producto
        int ud = Consultau(cp, col, ta);
        //Se calculan las unidades actuales sumando las unidades disponibles más la cantidad ingresada
        int ua = ud + ca;
        try {
            //Se crea la sentencia para actualizar las unidades disponibles de acuerdo al código, talla y color del producto
            String sql = "update inventario set unidades_d=? where codigo='" + cp + "' and color='" + col + "' and talla='" + ta + "'";
            PreparedStatement pst = reg.prepareStatement(sql);
            //Se ingresa la nueva información en la base de datos
            pst.setInt(1, ua);
            pst.executeUpdate();
            //Se llama al método Consultacodi y se le envía el código, color y talla del producto
            int ci = Consultacodi(cp, col, ta);
            //Se llama al método Entrada y se le envía el código del registro en el inventario, la fecha actual y la cantidad
            Entrada(ci, f, ca);
            JOptionPane.showMessageDialog(this, "Registro de entrada de productos guardado");
            //Se llama al método formatear
            Formatear();
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, "Ha ocurrido un error al actualizar los datos");
            System.out.println(ex.getMessage());
        }
    }
    
    //Método para consultar el número de unidades disponibles de un producto
    public int Consultau(int cp, String col, int ta) {
        int u = 0;
        //Se crea la sentencia para consultar las unidades disponibles de acuerdo al código, color y talla del producto
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

    //Método para consultar el código de un registro en el inventario
    public int Consultacodi(int cp, String col, int ta) {
        int ci = 0;
        //Se crea la sentencia para consultar el id de acuerdo al código, color y talla del producto
        String sql = "select id_i from inventario where codigo='" + cp + "' and color='" + col + "' and talla='" + ta + "'";
        try {
            Statement st = reg.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                ci = rs.getInt("id_i");
            }
        } catch (SQLException ex) {
            Logger.getLogger(login.class.getName()).log(Level.SEVERE, null, ex);
        }
        //Se retorna el código del registro
        return ci;
    }
    
    //Método para registrar una nueva entrada de productos
    public void Entrada(int ci, String f, int ui) {
        //Se crea la sentencia para ingresarla entrada con la información necesaria
        String sql = "insert into entrada (id_i,fecha,unidades_i) VALUES (?, ?, ?)";
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
    
    //Método para formatear los JComboBox y los JTextField
    public void Formatear() {
        //Se les asignan sus valores por defecto por si se desea ingresar una nueva entrada de productos
        jcbProducto.setSelectedItem("Seleccione un producto");
        jcbColor.setSelectedItem("Seleccione un color");
        jcbTalla.setSelectedItem("Seleccione una talla");
        txtCantidad.setText("");
    }
    
    //Método para crear un nuevo registro en el inventario
    public void Inventario(int cp, int ca, String col, int ta, String f) {
        //Se crea la sentencia para insertar la información
        String sql = "insert into inventario (codigo,unidades_d,color,talla) VALUES (?, ?, ?, ?)";
        try {
            //Se ingresa la información en la base de datos
            PreparedStatement pst = reg.prepareStatement(sql);
            pst.setInt(1, cp);
            pst.setInt(2, ca);
            pst.setString(3, col);
            pst.setInt(4, ta);
            pst.executeUpdate();
            //Se llama al método Consultaci
            int ci = Consultaci();
            //Se llama al método Entrada y se le envía el código del registro en el inventario, la fecha actual y la cantidad
            Entrada(ci, f, ca);
            JOptionPane.showMessageDialog(this, "Registro de entrada de productos guardado");
            //Se llama al método Formatear
            Formatear();
        } catch (SQLException ex) {
            Logger.getLogger(inicio_admin.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    //Método para consultar el código de un registro en el inventario
    public int Consultaci() {
        int ci = 0;
        //Se crea la sentencia para consultar el id del último registro creado en el inventario
        String sql = "select id_i from inventario order by id_i desc limit 1";
        try {
            Statement st = reg.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                ci = rs.getInt("id_i");
            }
        } catch (SQLException ex) {
            Logger.getLogger(login.class.getName()).log(Level.SEVERE, null, ex);
        }
        //Se retorna el código del registro en el inventario
        return ci;
    }
              
}
