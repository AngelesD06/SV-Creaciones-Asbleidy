package creaciones_asbleidy;


import java.io.*;
import java.sql.*;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;

public class modificar_producto extends javax.swing.JFrame {

    conexion cc = new conexion();
    Connection cn = cc.getConection();

    public modificar_producto() {
        //Para quitar los botones de cerrar, minimizar y maximizar
        this.setUndecorated(true);
        initComponents();
        //Para centrar la ventana
        this.setLocationRelativeTo(this);
     
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDesktopPane1 = new javax.swing.JDesktopPane();
        pnlPrincipal = new javax.swing.JPanel();
        Separador = new javax.swing.JSeparator();
        lblLogo = new javax.swing.JLabel();
        btnCerrar = new javax.swing.JButton();
        lblModificar = new javax.swing.JLabel();
        lblCodigo = new javax.swing.JLabel();
        lblNombre = new javax.swing.JLabel();
        txtNombre = new rojeru_san.RSMTextFull();
        lblPrecio = new javax.swing.JLabel();
        txtPrecio = new rojeru_san.RSMTextFull();
        lblImagen = new javax.swing.JLabel();
        btnBuscar = new javax.swing.JButton();
        btnModificar = new javax.swing.JButton();
        lblLinea2 = new javax.swing.JLabel();
        txtCodigo = new javax.swing.JTextField();
        lblLinea3 = new javax.swing.JLabel();
        txtImagen = new javax.swing.JTextField();

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        pnlPrincipal.setBackground(new java.awt.Color(255, 255, 255));
        pnlPrincipal.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
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

        lblModificar.setFont(new java.awt.Font("Pristina", 0, 55)); // NOI18N
        lblModificar.setText("Modificar producto");
        pnlPrincipal.add(lblModificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(27, 120, 350, 76));

        lblCodigo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/codigo.png"))); // NOI18N
        pnlPrincipal.add(lblCodigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 220, 30, 30));

        lblNombre.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/nombre.png"))); // NOI18N
        pnlPrincipal.add(lblNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 280, 30, 30));

        txtNombre.setForeground(new java.awt.Color(0, 0, 0));
        txtNombre.setToolTipText("");
        txtNombre.setBordeColorFocus(new java.awt.Color(221, 98, 34));
        txtNombre.setBordeColorNoFocus(new java.awt.Color(221, 98, 34));
        txtNombre.setBotonColor(new java.awt.Color(221, 98, 34));
        txtNombre.setDisabledTextColor(new java.awt.Color(221, 98, 34));
        txtNombre.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        txtNombre.setModoMaterial(true);
        txtNombre.setPlaceholder("Nombre");
        pnlPrincipal.add(txtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 270, 300, 40));

        lblPrecio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/precio.png"))); // NOI18N
        pnlPrincipal.add(lblPrecio, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 340, 30, 30));

        txtPrecio.setForeground(new java.awt.Color(0, 0, 0));
        txtPrecio.setToolTipText("");
        txtPrecio.setBordeColorFocus(new java.awt.Color(221, 98, 34));
        txtPrecio.setBordeColorNoFocus(new java.awt.Color(221, 98, 34));
        txtPrecio.setBotonColor(new java.awt.Color(221, 98, 34));
        txtPrecio.setDisabledTextColor(new java.awt.Color(221, 98, 34));
        txtPrecio.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        txtPrecio.setModoMaterial(true);
        txtPrecio.setPlaceholder("Precio");
        txtPrecio.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtPrecioKeyTyped(evt);
            }
        });
        pnlPrincipal.add(txtPrecio, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 330, 300, 40));

        lblImagen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/imagen.png"))); // NOI18N
        pnlPrincipal.add(lblImagen, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 400, 30, 30));

        btnBuscar.setBackground(new java.awt.Color(255, 255, 255));
        btnBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/buscar.png"))); // NOI18N
        btnBuscar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });
        pnlPrincipal.add(btnBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 400, 30, 30));

        btnModificar.setBackground(new java.awt.Color(221, 98, 34));
        btnModificar.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        btnModificar.setForeground(new java.awt.Color(255, 255, 255));
        btnModificar.setText("Guardar");
        btnModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarActionPerformed(evt);
            }
        });
        pnlPrincipal.add(btnModificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 460, 90, -1));

        lblLinea2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/linea.png"))); // NOI18N
        pnlPrincipal.add(lblLinea2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 240, 300, 10));

        txtCodigo.setEditable(false);
        txtCodigo.setBackground(new java.awt.Color(255, 255, 255));
        txtCodigo.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        txtCodigo.setBorder(null);
        pnlPrincipal.add(txtCodigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 210, 300, 30));

        lblLinea3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/linea.png"))); // NOI18N
        pnlPrincipal.add(lblLinea3, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 420, 260, 10));

        txtImagen.setEditable(false);
        txtImagen.setBackground(new java.awt.Color(255, 255, 255));
        txtImagen.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        txtImagen.setBorder(null);
        pnlPrincipal.add(txtImagen, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 390, 260, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, 515, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCerrarActionPerformed
        productos p = new productos();
        p.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnCerrarActionPerformed

    private void txtPrecioKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPrecioKeyTyped
        //Solo deja ingresar números en la caja de texto
        char num = evt.getKeyChar();
        if ((num < '0' || num > '9')) {
            evt.consume();
        }
    }//GEN-LAST:event_txtPrecioKeyTyped

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        //Creamos nuestra variable archivo en la cual podremos usar todos los metodos de la clase jFileChooser
        JFileChooser archivo = new JFileChooser();
        //Creamos un filtro para la selecion de archivos
        FileNameExtensionFilter filtro = new FileNameExtensionFilter("Formatos de Archivos JPEG(*.JPG;*.JPEG)", "jpg", "jpeg");
        // Agregamos el Filtro pero cuidado se mostrara despues de todos los archivos
        archivo.addChoosableFileFilter(filtro);
        // Colocamos titulo a nuestra ventana de Seleccion
        archivo.setDialogTitle("Abrir Archivo");
        //Si deseamos que muestre una carpeta predetermina usa la siguiente linea
        File ruta1 = new File("C:\\Users\\User\\Downloads\\Creaciones_Asbleidy\\src\\fotos");
        //Le implementamos a nuestro ventana de seleccion
        archivo.setCurrentDirectory(ruta1);
        //Abrimos nuestra Ventana de Selección
        int ventana = archivo.showOpenDialog(null);
        //Hacemos comparación en caso de seleccionar el boton abrir
        if (ventana == JFileChooser.APPROVE_OPTION) {
            //Se almacena la ruta de la imagen
            File file = archivo.getSelectedFile();
            //Lo imprimimos en una caja de texto para ver su ruta
            txtImagen.setText(String.valueOf(file));
        }
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void btnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarActionPerformed
        String c, n, p, i, url;
        int cod, pr;
        String s = "\\\\";
        String uno = String.valueOf(s.charAt(0));
        c = txtCodigo.getText();
        n = txtNombre.getText();
        p = txtPrecio.getText();
        i = txtImagen.getText();
        url = txtImagen.getText();
        //Se corrige la ruta de la imagen
        url = url.replace(uno, s);
        //Se verfica que las  cajas de texto no estén vacías
        if (c.equals("") || n.equals("") || p.equals("") || i.equals("")) {
            JOptionPane.showMessageDialog(this, "Debe llenar todos los campos");
        } else {
            try {
                cod = Integer.parseInt(c);
                pr = Integer.parseInt(p);
                //Se crea la sentencia para actualizar la información del producto
                String sql = "UPDATE producto SET nombre=?," + "precio=?," + "ruta=?," + "imagen=?" + " WHERE codigo='" + cod + "' ";
                PreparedStatement pst = cn.prepareStatement(sql);
                //Se ingresa la nueva información en la base de datos
                pst.setString(1, n);
                pst.setInt(2, pr);
                pst.setString(3, url);
                FileInputStream archivofoto1;
                archivofoto1 = new FileInputStream(url);
                pst.setBinaryStream(4, archivofoto1);
                pst.executeUpdate();
                //Se informa que los datos fueron actualizados correctamente
                JOptionPane.showMessageDialog(null, "Datos Actualizados");
                //Se actualiza la información de la tabla que contiene los productos
                productos.mostrar();
                productos pro = new productos();
                pro.setVisible(true);
                dispose();
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(this, "Ha ocurrido un error al actualizar los datos");
                System.out.println(ex.getMessage());
            }
        }
    }//GEN-LAST:event_btnModificarActionPerformed

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
            java.util.logging.Logger.getLogger(modificar_producto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(modificar_producto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(modificar_producto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(modificar_producto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new modificar_producto().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JSeparator Separador;
    public static javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnCerrar;
    private javax.swing.JButton btnModificar;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JLabel lblCodigo;
    private javax.swing.JLabel lblImagen;
    private javax.swing.JLabel lblLinea2;
    private javax.swing.JLabel lblLinea3;
    private javax.swing.JLabel lblLogo;
    private javax.swing.JLabel lblModificar;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JLabel lblPrecio;
    public static javax.swing.JPanel pnlPrincipal;
    public javax.swing.JTextField txtCodigo;
    public javax.swing.JTextField txtImagen;
    public rojeru_san.RSMTextFull txtNombre;
    public rojeru_san.RSMTextFull txtPrecio;
    // End of variables declaration//GEN-END:variables
}
