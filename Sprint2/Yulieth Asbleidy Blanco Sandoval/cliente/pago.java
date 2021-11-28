package creaciones_asbleidy;

import com.sun.awt.AWTUtilities;
import java.awt.Shape;
import java.awt.geom.RoundRectangle2D;
import javax.swing.JOptionPane;

public class pago extends javax.swing.JFrame {

    public pago() {
        //Para quitar los botones de cerrar, minimizar y maximizar
        this.setUndecorated(true);
        initComponents();
        //Para centrar la ventana
        this.setLocationRelativeTo(this);
        //Para redondear las esquinas
        Shape forma = new RoundRectangle2D.Double(0, 0, this.getBounds().width, this.getBounds().height, 27, 27);
        AWTUtilities.setWindowShape(this, forma);
        pnlTarjetas.setVisible(false);
        pnlPSE.setVisible(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlPrincipal = new javax.swing.JPanel();
        pnlPSE = new javax.swing.JPanel();
        jcbTipo2 = new javax.swing.JComboBox<>();
        lblBanco2 = new javax.swing.JLabel();
        txtUsuario = new rojeru_san.RSMTextFull();
        lblUsuario = new javax.swing.JLabel();
        lblClave = new javax.swing.JLabel();
        txtContra = new rojeru_san.RSMPassView();
        btnGuardar2 = new javax.swing.JButton();
        pnlTarjetas = new javax.swing.JPanel();
        txtNombre = new rojeru_san.RSMTextFull();
        lblNombre = new javax.swing.JLabel();
        txtNumero = new rojeru_san.RSMTextFull();
        lblNTarjeta = new javax.swing.JLabel();
        lblFecha = new javax.swing.JLabel();
        txtFecha = new rojeru_san.RSMTextFull();
        jcbTipo1 = new javax.swing.JComboBox<>();
        lblBanco1 = new javax.swing.JLabel();
        txtCvv = new rojeru_san.RSMTextFull();
        lblCvv = new javax.swing.JLabel();
        btnGuardar1 = new javax.swing.JButton();
        lblLogo = new javax.swing.JLabel();
        Separador = new javax.swing.JSeparator();
        btnCerrar = new javax.swing.JButton();
        lblTipo = new javax.swing.JLabel();
        jcbTipo = new javax.swing.JComboBox<>();
        lblNumero = new javax.swing.JLabel();
        txtCedula = new rojeru_san.RSMTextFull();
        lblPago = new javax.swing.JLabel();
        btnPSE = new javax.swing.JButton();
        btnTarjetas = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        pnlPrincipal.setBackground(new java.awt.Color(255, 255, 255));
        pnlPrincipal.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pnlPSE.setBackground(new java.awt.Color(255, 255, 255));
        pnlPSE.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jcbTipo2.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        jcbTipo2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione el banco", "Bancolombia", "BBVA", "Davivienda", "Banco agrario", "Banco popular" }));
        jcbTipo2.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jcbTipo2ItemStateChanged(evt);
            }
        });
        jcbTipo2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcbTipo2ActionPerformed(evt);
            }
        });
        jcbTipo2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jcbTipo2KeyReleased(evt);
            }
        });
        pnlPSE.add(jcbTipo2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 20, 300, 30));

        lblBanco2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/banco.png"))); // NOI18N
        pnlPSE.add(lblBanco2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 30, 30));

        txtUsuario.setForeground(new java.awt.Color(0, 0, 0));
        txtUsuario.setToolTipText("");
        txtUsuario.setBordeColorFocus(new java.awt.Color(221, 98, 34));
        txtUsuario.setBordeColorNoFocus(new java.awt.Color(221, 98, 34));
        txtUsuario.setBotonColor(new java.awt.Color(0, 0, 0));
        txtUsuario.setDisabledTextColor(new java.awt.Color(221, 98, 34));
        txtUsuario.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        txtUsuario.setModoMaterial(true);
        txtUsuario.setPlaceholder("Ingrese su usuario");
        txtUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUsuarioActionPerformed(evt);
            }
        });
        txtUsuario.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtUsuarioKeyTyped(evt);
            }
        });
        pnlPSE.add(txtUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 70, 300, 40));

        lblUsuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/usuario.png"))); // NOI18N
        pnlPSE.add(lblUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, 30, 30));

        lblClave.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/clave.png"))); // NOI18N
        pnlPSE.add(lblClave, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, 30, 30));

        txtContra.setForeground(new java.awt.Color(0, 0, 0));
        txtContra.setBordeColorFocus(new java.awt.Color(221, 98, 34));
        txtContra.setBordeColorNoFocus(new java.awt.Color(221, 98, 34));
        txtContra.setBotonColor(new java.awt.Color(0, 0, 0));
        txtContra.setDisabledTextColor(new java.awt.Color(221, 98, 34));
        txtContra.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        txtContra.setModoMaterial(true);
        txtContra.setPlaceholder("Ingrese su clave");
        pnlPSE.add(txtContra, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 130, 300, 40));

        btnGuardar2.setBackground(new java.awt.Color(255, 255, 255));
        btnGuardar2.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        btnGuardar2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/guardar.png"))); // NOI18N
        btnGuardar2.setText("Guardar");
        btnGuardar2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnGuardar2.setBorderPainted(false);
        btnGuardar2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardar2ActionPerformed(evt);
            }
        });
        pnlPSE.add(btnGuardar2, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 190, 100, 40));

        pnlPrincipal.add(pnlPSE, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 300, 380, 350));

        pnlTarjetas.setBackground(new java.awt.Color(255, 255, 255));
        pnlTarjetas.setDoubleBuffered(false);
        pnlTarjetas.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtNombre.setForeground(new java.awt.Color(0, 0, 0));
        txtNombre.setToolTipText("");
        txtNombre.setBordeColorFocus(new java.awt.Color(221, 98, 34));
        txtNombre.setBordeColorNoFocus(new java.awt.Color(221, 98, 34));
        txtNombre.setBotonColor(new java.awt.Color(0, 0, 0));
        txtNombre.setDisabledTextColor(new java.awt.Color(221, 98, 34));
        txtNombre.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        txtNombre.setModoMaterial(true);
        txtNombre.setPlaceholder("Ingrese el nombre del titular");
        txtNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombreActionPerformed(evt);
            }
        });
        txtNombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNombreKeyTyped(evt);
            }
        });
        pnlTarjetas.add(txtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 10, 300, 40));

        lblNombre.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/usuario.png"))); // NOI18N
        pnlTarjetas.add(lblNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 30, 30));

        txtNumero.setForeground(new java.awt.Color(0, 0, 0));
        txtNumero.setToolTipText("");
        txtNumero.setBordeColorFocus(new java.awt.Color(221, 98, 34));
        txtNumero.setBordeColorNoFocus(new java.awt.Color(221, 98, 34));
        txtNumero.setBotonColor(new java.awt.Color(0, 0, 0));
        txtNumero.setDisabledTextColor(new java.awt.Color(221, 98, 34));
        txtNumero.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        txtNumero.setModoMaterial(true);
        txtNumero.setPlaceholder("Ingrese el número de la tarjeta");
        txtNumero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNumeroActionPerformed(evt);
            }
        });
        txtNumero.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNumeroKeyTyped(evt);
            }
        });
        pnlTarjetas.add(txtNumero, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 70, 300, 40));

        lblNTarjeta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/tarjeta.png"))); // NOI18N
        pnlTarjetas.add(lblNTarjeta, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, 30, 30));

        lblFecha.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/fecha.png"))); // NOI18N
        pnlTarjetas.add(lblFecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, 30, 30));

        txtFecha.setForeground(new java.awt.Color(0, 0, 0));
        txtFecha.setToolTipText("");
        txtFecha.setBordeColorFocus(new java.awt.Color(221, 98, 34));
        txtFecha.setBordeColorNoFocus(new java.awt.Color(221, 98, 34));
        txtFecha.setBotonColor(new java.awt.Color(0, 0, 0));
        txtFecha.setDisabledTextColor(new java.awt.Color(221, 98, 34));
        txtFecha.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        txtFecha.setModoMaterial(true);
        txtFecha.setPlaceholder("Ingrese la fecha de caducidad");
        txtFecha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFechaActionPerformed(evt);
            }
        });
        txtFecha.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtFechaKeyTyped(evt);
            }
        });
        pnlTarjetas.add(txtFecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 130, 300, 40));

        jcbTipo1.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        jcbTipo1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione el banco", "Bancolombia", "BBVA", "Davivienda", "Banco agrario", "Banco popular" }));
        jcbTipo1.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jcbTipo1ItemStateChanged(evt);
            }
        });
        jcbTipo1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcbTipo1ActionPerformed(evt);
            }
        });
        jcbTipo1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jcbTipo1KeyReleased(evt);
            }
        });
        pnlTarjetas.add(jcbTipo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 190, 300, 30));

        lblBanco1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/banco.png"))); // NOI18N
        pnlTarjetas.add(lblBanco1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 190, 30, 30));

        txtCvv.setForeground(new java.awt.Color(0, 0, 0));
        txtCvv.setToolTipText("");
        txtCvv.setBordeColorFocus(new java.awt.Color(221, 98, 34));
        txtCvv.setBordeColorNoFocus(new java.awt.Color(221, 98, 34));
        txtCvv.setBotonColor(new java.awt.Color(0, 0, 0));
        txtCvv.setDisabledTextColor(new java.awt.Color(221, 98, 34));
        txtCvv.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        txtCvv.setModoMaterial(true);
        txtCvv.setPlaceholder("Ingrese el cvv");
        txtCvv.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCvvActionPerformed(evt);
            }
        });
        txtCvv.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCvvKeyTyped(evt);
            }
        });
        pnlTarjetas.add(txtCvv, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 240, 300, 40));

        lblCvv.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/codigo.png"))); // NOI18N
        pnlTarjetas.add(lblCvv, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 250, 30, 30));

        btnGuardar1.setBackground(new java.awt.Color(255, 255, 255));
        btnGuardar1.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        btnGuardar1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/guardar.png"))); // NOI18N
        btnGuardar1.setText("Guardar");
        btnGuardar1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnGuardar1.setBorderPainted(false);
        btnGuardar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardar1ActionPerformed(evt);
            }
        });
        pnlTarjetas.add(btnGuardar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 300, 100, 40));

        pnlPrincipal.add(pnlTarjetas, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 300, 380, 350));

        lblLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/marca.png"))); // NOI18N
        pnlPrincipal.add(lblLogo, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, -1));
        pnlPrincipal.add(Separador, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, 380, 20));

        btnCerrar.setBackground(new java.awt.Color(255, 255, 255));
        btnCerrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/salir.png"))); // NOI18N
        btnCerrar.setBorder(null);
        btnCerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCerrarActionPerformed(evt);
            }
        });
        pnlPrincipal.add(btnCerrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 20, -1, -1));

        lblTipo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/tipod.png"))); // NOI18N
        pnlPrincipal.add(lblTipo, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 130, 30, 30));

        jcbTipo.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        jcbTipo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione su tipo de documento", "Cédula de ciudadanía", "Cédula de extranjería", "Pasaporte" }));
        jcbTipo.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jcbTipoItemStateChanged(evt);
            }
        });
        jcbTipo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcbTipoActionPerformed(evt);
            }
        });
        jcbTipo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jcbTipoKeyReleased(evt);
            }
        });
        pnlPrincipal.add(jcbTipo, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 130, 300, 30));

        lblNumero.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/numerod.png"))); // NOI18N
        pnlPrincipal.add(lblNumero, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 180, 30, 30));

        txtCedula.setForeground(new java.awt.Color(0, 0, 0));
        txtCedula.setToolTipText("");
        txtCedula.setBordeColorFocus(new java.awt.Color(221, 98, 34));
        txtCedula.setBordeColorNoFocus(new java.awt.Color(221, 98, 34));
        txtCedula.setBotonColor(new java.awt.Color(0, 0, 0));
        txtCedula.setDisabledTextColor(new java.awt.Color(221, 98, 34));
        txtCedula.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        txtCedula.setModoMaterial(true);
        txtCedula.setPlaceholder("Ingrese su número de documento");
        txtCedula.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCedulaActionPerformed(evt);
            }
        });
        txtCedula.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCedulaKeyTyped(evt);
            }
        });
        pnlPrincipal.add(txtCedula, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 170, 300, 40));

        lblPago.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        lblPago.setText("Seleccione el método de pago");
        pnlPrincipal.add(lblPago, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 230, -1, -1));

        btnPSE.setBackground(new java.awt.Color(255, 255, 255));
        btnPSE.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        btnPSE.setText("PSE");
        btnPSE.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnPSE.setBorderPainted(false);
        btnPSE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPSEActionPerformed(evt);
            }
        });
        pnlPrincipal.add(btnPSE, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 260, 40, 40));

        btnTarjetas.setBackground(new java.awt.Color(255, 255, 255));
        btnTarjetas.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        btnTarjetas.setText("Tarjeta débito o crédito");
        btnTarjetas.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnTarjetas.setBorderPainted(false);
        btnTarjetas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTarjetasActionPerformed(evt);
            }
        });
        pnlPrincipal.add(btnTarjetas, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 260, 160, 40));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlPrincipal, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCerrarActionPerformed
        int r = JOptionPane.showConfirmDialog(null, "¿Está seguro de cancelar la compra", "Cancelar", JOptionPane.YES_NO_OPTION);
        if (r == JOptionPane.YES_OPTION) {
            inicio_usuario iu = new inicio_usuario();
            iu.setVisible(true);
            dispose();
        }
    }//GEN-LAST:event_btnCerrarActionPerformed

    private void jcbTipoItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jcbTipoItemStateChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_jcbTipoItemStateChanged

    private void jcbTipoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbTipoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jcbTipoActionPerformed

    private void jcbTipoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jcbTipoKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_jcbTipoKeyReleased

    private void txtCedulaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCedulaKeyTyped
        //Solo deja ingresar números en la caja de texto del código
        char num = evt.getKeyChar();
        if ((num < '0' || num > '9')) {
            evt.consume();
        }
    }//GEN-LAST:event_txtCedulaKeyTyped

    private void txtCedulaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCedulaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCedulaActionPerformed

    private void btnGuardar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardar1ActionPerformed

    }//GEN-LAST:event_btnGuardar1ActionPerformed

    private void txtCvvKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCvvKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCvvKeyTyped

    private void txtCvvActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCvvActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCvvActionPerformed

    private void jcbTipo1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jcbTipo1KeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_jcbTipo1KeyReleased

    private void jcbTipo1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbTipo1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jcbTipo1ActionPerformed

    private void jcbTipo1ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jcbTipo1ItemStateChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_jcbTipo1ItemStateChanged

    private void txtFechaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtFechaKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFechaKeyTyped

    private void txtFechaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFechaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFechaActionPerformed

    private void txtNumeroKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNumeroKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNumeroKeyTyped

    private void txtNumeroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNumeroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNumeroActionPerformed

    private void txtNombreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNombreKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombreKeyTyped

    private void txtNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombreActionPerformed

    private void txtUsuarioKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtUsuarioKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUsuarioKeyTyped

    private void txtUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUsuarioActionPerformed

    private void jcbTipo2KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jcbTipo2KeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_jcbTipo2KeyReleased

    private void jcbTipo2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbTipo2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jcbTipo2ActionPerformed

    private void jcbTipo2ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jcbTipo2ItemStateChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_jcbTipo2ItemStateChanged

    private void btnTarjetasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTarjetasActionPerformed
        pnlPSE.setVisible(false);
        pnlTarjetas.setVisible(true);
    }//GEN-LAST:event_btnTarjetasActionPerformed

    private void btnPSEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPSEActionPerformed
        pnlTarjetas.setVisible(false);
        pnlPSE.setVisible(true);
    }//GEN-LAST:event_btnPSEActionPerformed

    private void btnGuardar2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardar2ActionPerformed
        confirmacion c = new confirmacion();
        c.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnGuardar2ActionPerformed

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
            java.util.logging.Logger.getLogger(pago.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(pago.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(pago.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(pago.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new pago().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JSeparator Separador;
    private javax.swing.JButton btnCerrar;
    private javax.swing.JButton btnGuardar1;
    private javax.swing.JButton btnGuardar2;
    private javax.swing.JButton btnPSE;
    private javax.swing.JButton btnTarjetas;
    public static javax.swing.JComboBox<String> jcbTipo;
    public static javax.swing.JComboBox<String> jcbTipo1;
    public static javax.swing.JComboBox<String> jcbTipo2;
    private javax.swing.JLabel lblBanco1;
    private javax.swing.JLabel lblBanco2;
    private javax.swing.JLabel lblClave;
    private javax.swing.JLabel lblCvv;
    private javax.swing.JLabel lblFecha;
    private javax.swing.JLabel lblLogo;
    private javax.swing.JLabel lblNTarjeta;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JLabel lblNumero;
    private javax.swing.JLabel lblPago;
    private javax.swing.JLabel lblTipo;
    private javax.swing.JLabel lblUsuario;
    private javax.swing.JPanel pnlPSE;
    private javax.swing.JPanel pnlPrincipal;
    private javax.swing.JPanel pnlTarjetas;
    private rojeru_san.RSMTextFull txtCedula;
    private rojeru_san.RSMPassView txtContra;
    private rojeru_san.RSMTextFull txtCvv;
    private rojeru_san.RSMTextFull txtFecha;
    private rojeru_san.RSMTextFull txtNombre;
    private rojeru_san.RSMTextFull txtNumero;
    private rojeru_san.RSMTextFull txtUsuario;
    // End of variables declaration//GEN-END:variables
}
