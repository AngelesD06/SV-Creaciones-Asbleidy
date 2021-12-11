package creaciones_asbleidy;


import java.sql.*;
import javax.swing.table.DefaultTableModel;

public class historial_e extends javax.swing.JFrame {

    public static DefaultTableModel modelo;

    public historial_e() {
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
        lblLogo = new javax.swing.JLabel();
        Separador = new javax.swing.JSeparator();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablae = new javax.swing.JTable();
        btnCerrar = new javax.swing.JButton();
        lblHistorial = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        pnlPrincipal.setBackground(new java.awt.Color(255, 255, 255));
        pnlPrincipal.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/marca.png"))); // NOI18N
        pnlPrincipal.add(lblLogo, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, -1));
        pnlPrincipal.add(Separador, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, 580, 20));

        tablae.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        tablae.setModel(new javax.swing.table.DefaultTableModel(
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
        tablae.setSelectionBackground(new java.awt.Color(221, 98, 34));
        jScrollPane1.setViewportView(tablae);

        pnlPrincipal.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 220, 560, 260));

        btnCerrar.setBackground(new java.awt.Color(255, 255, 255));
        btnCerrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/salir.png"))); // NOI18N
        btnCerrar.setBorder(null);
        btnCerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCerrarActionPerformed(evt);
            }
        });
        pnlPrincipal.add(btnCerrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 20, -1, -1));

        lblHistorial.setFont(new java.awt.Font("Pristina", 0, 55)); // NOI18N
        lblHistorial.setText("Historial de entradas");
        pnlPrincipal.add(lblHistorial, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 120, -1, 76));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, 600, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, 500, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    //Método para llenar la tabla con los registros de entradas de productos que están en la base de datos
    public static void mostrar() {
        modelo = new DefaultTableModel() {
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };
        ResultSet rs = conexion.getTabla("select e.fecha,p.nombre,i.color,i.talla,e.unidades_i from entrada e inner join inventario i on e.id_i=i.id_i "
                + "inner join producto p on i.codigo=p.codigo order by e.fecha");
        modelo.setColumnIdentifiers(new Object[]{"FECHA", "NOMBRE", "COLOR", "TALLA", "CANTIDAD"});
        try {
            while (rs.next()) {
                //Se añade la información de cada producto en una fila
                modelo.addRow(new Object[]{rs.getString("fecha"), rs.getString("nombre"), rs.getString("color"), rs.getString("talla"), rs.getString("unidades_i")});
            }
            //Se agrega el modelo a la tabla
            tablae.setModel(modelo);
        } catch (Exception e) {
            System.out.println(e);
        }
    }
    
    private void btnCerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCerrarActionPerformed
        inventario i = new inventario();
        i.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnCerrarActionPerformed
   
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
            java.util.logging.Logger.getLogger(historial_e.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(historial_e.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(historial_e.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(historial_e.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new historial_e().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JSeparator Separador;
    private javax.swing.JButton btnCerrar;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblHistorial;
    private javax.swing.JLabel lblLogo;
    private javax.swing.JPanel pnlPrincipal;
    public static javax.swing.JTable tablae;
    // End of variables declaration//GEN-END:variables

}
