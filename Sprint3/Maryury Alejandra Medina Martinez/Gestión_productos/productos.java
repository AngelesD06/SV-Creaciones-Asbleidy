package creaciones_asbleidy;

import com.sun.awt.AWTUtilities;
import java.awt.Shape;
import java.awt.geom.RoundRectangle2D;
import java.sql.*;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class productos extends javax.swing.JFrame {

    public static DefaultTableModel modelo;

    public productos() {
        //Para quitar los botones de cerrar, minimizar y maximizar
        this.setUndecorated(true);
        initComponents();
        //Para llamar al método mostrar
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
        jScrollPane1 = new javax.swing.JScrollPane();
        tablap = new javax.swing.JTable();
        btnCrear = new javax.swing.JButton();
        btnModificar = new javax.swing.JButton();
        lblLogo = new javax.swing.JLabel();
        Separador = new javax.swing.JSeparator();
        btnCerrar = new javax.swing.JButton();
        lblBuscar = new javax.swing.JLabel();
        txtBuscar = new rojeru_san.RSMTextFull();
        lblProductos = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        pnlPrincipal.setBackground(new java.awt.Color(255, 255, 255));
        pnlPrincipal.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tablap.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        tablap.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tablap.setSelectionBackground(new java.awt.Color(221, 98, 34));
        jScrollPane1.setViewportView(tablap);

        pnlPrincipal.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 280, 710, 250));

        btnCrear.setBackground(new java.awt.Color(255, 255, 255));
        btnCrear.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        btnCrear.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/crear.png"))); // NOI18N
        btnCrear.setText("Crear");
        btnCrear.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(221, 98, 34), 2, true));
        btnCrear.setBorderPainted(false);
        btnCrear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCrearActionPerformed(evt);
            }
        });
        pnlPrincipal.add(btnCrear, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 200, 80, 40));

        btnModificar.setBackground(new java.awt.Color(255, 255, 255));
        btnModificar.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        btnModificar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/modificar.png"))); // NOI18N
        btnModificar.setText("Modificar");
        btnModificar.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(221, 98, 34), 2, true));
        btnModificar.setBorderPainted(false);
        btnModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarActionPerformed(evt);
            }
        });
        pnlPrincipal.add(btnModificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 200, 100, 40));

        lblLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/marca.png"))); // NOI18N
        pnlPrincipal.add(lblLogo, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 180, 60));
        pnlPrincipal.add(Separador, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, 730, 30));

        btnCerrar.setBackground(new java.awt.Color(255, 255, 255));
        btnCerrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/salir.png"))); // NOI18N
        btnCerrar.setBorder(null);
        btnCerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCerrarActionPerformed(evt);
            }
        });
        pnlPrincipal.add(btnCerrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 20, -1, -1));

        lblBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/buscar.png"))); // NOI18N
        pnlPrincipal.add(lblBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 190, 40, 60));

        txtBuscar.setForeground(new java.awt.Color(0, 0, 0));
        txtBuscar.setToolTipText("");
        txtBuscar.setBordeColorFocus(new java.awt.Color(221, 98, 34));
        txtBuscar.setBordeColorNoFocus(new java.awt.Color(221, 98, 34));
        txtBuscar.setBotonColor(new java.awt.Color(221, 98, 34));
        txtBuscar.setDisabledTextColor(new java.awt.Color(221, 98, 34));
        txtBuscar.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        txtBuscar.setModoMaterial(true);
        txtBuscar.setPlaceholder("Buscar");
        txtBuscar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtBuscarKeyReleased(evt);
            }
        });
        pnlPrincipal.add(txtBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 200, 240, 40));

        lblProductos.setFont(new java.awt.Font("Pristina", 0, 55)); // NOI18N
        lblProductos.setText("Productos");
        pnlPrincipal.add(lblProductos, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 120, -1, 76));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, 750, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, 550, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    //Método para llenar la tabla con los productos que están en la base de datos
    public static void mostrar() {
        modelo = new DefaultTableModel() {
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };
        ResultSet rs = conexion.getTabla("select codigo, nombre, precio, ruta FROM producto ORDER BY codigo");
        modelo.setColumnIdentifiers(new Object[]{"CÓDIGO", "NOMBRE", "PRECIO", "RUTA"});
        try {
            while (rs.next()) {
                //Se añade la información de cada producto en una fila
                modelo.addRow(new Object[]{rs.getString("codigo"), rs.getString("nombre"), rs.getString("precio"), rs.getString("ruta")});
            }
            //Se agrega el modelo a la tabla
            tablap.setModel(modelo);
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    private void btnCrearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCrearActionPerformed
        crear_producto cp = new crear_producto();
        cp.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnCrearActionPerformed

    private void btnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarActionPerformed
        modificar_producto m = new modificar_producto();
        try {
            int f = tablap.getSelectedRow();
            //Se verifica que se haya seleccionado un producto
            if (f == -1) {
                JOptionPane.showMessageDialog(null, "Debe seleccionar un producto");
            } else {
                //Se envía la información del producto seleccionado para que se modifique                
                m.txtCodigo.setText(String.valueOf(tablap.getValueAt(f, 0)));
                m.txtNombre.setText(String.valueOf(tablap.getValueAt(f, 1)));
                m.txtPrecio.setText(String.valueOf(tablap.getValueAt(f, 2)));
                String url = String.valueOf(tablap.getValueAt(f, 3));
                String s = "\\\\";
                String uno = String.valueOf(s.charAt(0));
                url = url.replace(s, uno);
                m.txtImagen.setText(url);
                m.setVisible(true);
                dispose();
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }//GEN-LAST:event_btnModificarActionPerformed

    private void btnCerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCerrarActionPerformed
        inicio_admin ia = new inicio_admin();
        ia.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnCerrarActionPerformed

    private void txtBuscarKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBuscarKeyReleased
        //Se crea un filtro para buscar un producto
        String busca = this.txtBuscar.getText();
        //Se crea otro modelo para la tabla
        DefaultTableModel modelo = new DefaultTableModel() {
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };
        //Se especifica que debe mostrar solo los productos que coincidan con lo que estoy buscando
        ResultSet rs = conexion.getTabla("select codigo, nombre, precio, ruta FROM producto WHERE (cast(codigo as varchar) LIKE'" + busca + "%' OR "
                + "nombre LIKE'" + busca + "%' OR cast(precio as varchar) LIKE'" + busca + "%') "
                + "ORDER BY codigo");
        //Se definen los nombres de las columnas
        modelo.setColumnIdentifiers(new Object[]{"CÓDIGO", "NOMBRE", "PRECIO", "RUTA"});
        try {
            while (rs.next()) {
                //Se va agregando la información de los productos en una fila de la tabla
                modelo.addRow(new Object[]{rs.getString("codigo"), rs.getString("nombre"), rs.getString("precio"), rs.getString("ruta")});
            }
            //Se muestra el nuevo modelo en la tabla
            tablap.setModel(modelo);
        } catch (Exception e) {
            System.out.println(e);
        }
    }//GEN-LAST:event_txtBuscarKeyReleased

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
            java.util.logging.Logger.getLogger(productos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(productos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(productos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(productos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new productos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JSeparator Separador;
    private javax.swing.JButton btnCerrar;
    private javax.swing.JButton btnCrear;
    private javax.swing.JButton btnModificar;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblBuscar;
    private javax.swing.JLabel lblLogo;
    private javax.swing.JLabel lblProductos;
    private javax.swing.JPanel pnlPrincipal;
    public static javax.swing.JTable tablap;
    private rojeru_san.RSMTextFull txtBuscar;
    // End of variables declaration//GEN-END:variables
}
