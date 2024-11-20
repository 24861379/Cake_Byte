package presentacion;

import datos.DecoracionDAO;
import entidades.decoracion;
import java.awt.BorderLayout;
import javax.swing.JOptionPane;

public class RealizarPedido4 extends javax.swing.JPanel {

    
    public RealizarPedido4() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        BackDecoracion = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        btnAtras = new javax.swing.JButton();
        lblDeco1 = new javax.swing.JLabel();
        lblDeco2 = new javax.swing.JLabel();
        lblDeco5 = new javax.swing.JLabel();
        lblDeco6 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtVeranoFrio = new javax.swing.JTextField();
        txtParaPrincesas = new javax.swing.JTextField();
        txtCasualMora = new javax.swing.JTextField();
        txtCumpleanos = new javax.swing.JTextField();

        BackDecoracion.setBackground(new java.awt.Color(204, 255, 255));

        jPanel2.setBackground(new java.awt.Color(204, 204, 255));

        jLabel3.setText("<html><h1 style='font-family: Arial, sans-serif; color: #FF6347;'>Selecciona la decoración</h1></html>");
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(68, 68, 68)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE)
                .addContainerGap())
        );

        btnAtras.setBackground(new java.awt.Color(204, 255, 255));
        btnAtras.setText("Atras");
        btnAtras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAtrasActionPerformed(evt);
            }
        });

        lblDeco1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/presentacion/Iconos/Decoracion-1.png"))); // NOI18N
        lblDeco1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblDeco1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblDeco1MouseClicked(evt);
            }
        });

        lblDeco2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/presentacion/Iconos/Decoracion-2.png"))); // NOI18N
        lblDeco2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblDeco2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblDeco2MouseClicked(evt);
            }
        });

        lblDeco5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/presentacion/Iconos/Decoracion-5.png"))); // NOI18N
        lblDeco5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblDeco5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblDeco5MouseClicked(evt);
            }
        });

        lblDeco6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/presentacion/Iconos/Decoracion-6.png"))); // NOI18N
        lblDeco6.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblDeco6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblDeco6MouseClicked(evt);
            }
        });

        jLabel1.setText("''Verano-Frio''");

        jLabel2.setText("''Para Princesas''");

        jLabel4.setText("''Casual-Mora''");

        jLabel5.setText("''Cumpleaños''");

        javax.swing.GroupLayout BackDecoracionLayout = new javax.swing.GroupLayout(BackDecoracion);
        BackDecoracion.setLayout(BackDecoracionLayout);
        BackDecoracionLayout.setHorizontalGroup(
            BackDecoracionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(BackDecoracionLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(BackDecoracionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(BackDecoracionLayout.createSequentialGroup()
                        .addComponent(txtVeranoFrio, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtParaPrincesas))
                    .addComponent(btnAtras)
                    .addGroup(BackDecoracionLayout.createSequentialGroup()
                        .addGroup(BackDecoracionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblDeco1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(BackDecoracionLayout.createSequentialGroup()
                                .addGap(9, 9, 9)
                                .addComponent(jLabel1)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(BackDecoracionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel2)
                            .addComponent(lblDeco6))))
                .addGap(6, 6, 6)
                .addGroup(BackDecoracionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(BackDecoracionLayout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addComponent(jLabel4)
                        .addGap(29, 29, 29)
                        .addComponent(jLabel5)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(BackDecoracionLayout.createSequentialGroup()
                        .addGroup(BackDecoracionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtCasualMora, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblDeco2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(BackDecoracionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtCumpleanos)
                            .addGroup(BackDecoracionLayout.createSequentialGroup()
                                .addComponent(lblDeco5)
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addGap(15, 15, 15))))
        );
        BackDecoracionLayout.setVerticalGroup(
            BackDecoracionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BackDecoracionLayout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(BackDecoracionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(BackDecoracionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblDeco2)
                    .addComponent(lblDeco5, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblDeco6, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblDeco1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 16, Short.MAX_VALUE)
                .addGroup(BackDecoracionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtVeranoFrio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtParaPrincesas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCasualMora, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCumpleanos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnAtras)
                .addGap(15, 15, 15))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 439, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addComponent(BackDecoracion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGap(0, 0, 0)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 306, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(BackDecoracion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnAtrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtrasActionPerformed
        RealizarPedido2 ac = new RealizarPedido2();
        ac.setSize(440,306);
        ac.setLocation(0,0);
        
        BackDecoracion.removeAll();
        BackDecoracion.add(ac, BorderLayout.CENTER);
        BackDecoracion.revalidate();
        BackDecoracion.repaint();
    }//GEN-LAST:event_btnAtrasActionPerformed

    private void lblDeco1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblDeco1MouseClicked
        String Deco1 = txtVeranoFrio.getText();
        
        if (!Deco1.isEmpty()) {
        
        DecoracionDAO DecoDAO = new DecoracionDAO();
        decoracion nuevaDeco = new decoracion(Deco1, 60000);  // Supongo que el precio adicional es 10.0, ajusta según sea necesario
        
        boolean DecoInsertada = DecoDAO.insertar(nuevaDeco);
        
        // Verificar si la figura fue insertada correctamente
        if (DecoInsertada) {
            // Mostrar un mensaje de éxito
            JOptionPane.showMessageDialog(null, "Decoracion agregada correctamente.");
            
//            VerPedido RP2 = new VerPedido();
//            RP2.setSize(759,430);
//            RP2.setLocation(0,0);
//        
//            BackDecoracion.removeAll();
//            BackDecoracion.add(RP2, BorderLayout.CENTER);
//            BackDecoracion.revalidate();
//            BackDecoracion.repaint();
            
        } else {
            // Mostrar un mensaje de error si no se insertó la figura
            JOptionPane.showMessageDialog(null, "Error al agregar la decoracion.");
        }
    } else {
        // Si el campo está vacío, mostrar un mensaje de advertencia
        JOptionPane.showMessageDialog(null, "Por favor, ingrese la confirmacion de la decoracion.");
    }
    }//GEN-LAST:event_lblDeco1MouseClicked

    private void lblDeco6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblDeco6MouseClicked
        String Deco2 = txtParaPrincesas.getText();
        
        if (!Deco2.isEmpty()) {
        
        DecoracionDAO DecoDAO = new DecoracionDAO();
        decoracion nuevaDeco = new decoracion(Deco2, 40000);  // Supongo que el precio adicional es 10.0, ajusta según sea necesario
        
        boolean DecoInsertada = DecoDAO.insertar(nuevaDeco);
        
        // Verificar si la figura fue insertada correctamente
        if (DecoInsertada) {
            // Mostrar un mensaje de éxito
            JOptionPane.showMessageDialog(null, "Decoracion agregada correctamente.");
            
//            RealizarPedido2 RP2 = new RealizarPedido2();
//            RP2.setSize(440,306);
//            RP2.setLocation(0,0);
//        
//            BackBase.removeAll();
//            BackBase.add(RP2, BorderLayout.CENTER);
//            BackBase.revalidate();
//            BackBase.repaint();
            
        } else {
            // Mostrar un mensaje de error si no se insertó la figura
            JOptionPane.showMessageDialog(null, "Error al agregar la decoracion.");
        }
    } else {
        // Si el campo está vacío, mostrar un mensaje de advertencia
        JOptionPane.showMessageDialog(null, "Por favor, ingrese la confirmacion de la decoracion.");
    }
    }//GEN-LAST:event_lblDeco6MouseClicked

    private void lblDeco2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblDeco2MouseClicked
        String Deco3 = txtCasualMora.getText();
        
        if (!Deco3.isEmpty()) {
        
        DecoracionDAO DecoDAO = new DecoracionDAO();
        decoracion nuevaDeco = new decoracion(Deco3, 35000);  // Supongo que el precio adicional es 10.0, ajusta según sea necesario
        
        boolean DecoInsertada = DecoDAO.insertar(nuevaDeco);
        
        // Verificar si la figura fue insertada correctamente
        if (DecoInsertada) {
            // Mostrar un mensaje de éxito
            JOptionPane.showMessageDialog(null, "Decoracion agregada correctamente.");
            
//            RealizarPedido2 RP2 = new RealizarPedido2();
//            RP2.setSize(440,306);
//            RP2.setLocation(0,0);
//        
//            BackBase.removeAll();
//            BackBase.add(RP2, BorderLayout.CENTER);
//            BackBase.revalidate();
//            BackBase.repaint();
            
        } else {
            // Mostrar un mensaje de error si no se insertó la figura
            JOptionPane.showMessageDialog(null, "Error al agregar la decoracion.");
        }
    } else {
        // Si el campo está vacío, mostrar un mensaje de advertencia
        JOptionPane.showMessageDialog(null, "Por favor, ingrese la confirmacion de la decoracion.");
    }
    }//GEN-LAST:event_lblDeco2MouseClicked

    private void lblDeco5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblDeco5MouseClicked
        String Deco4 = txtCumpleanos.getText();
        
        if (!Deco4.isEmpty()) {
        
        DecoracionDAO DecoDAO = new DecoracionDAO();
        decoracion nuevaDeco = new decoracion(Deco4, 80000);  // Supongo que el precio adicional es 10.0, ajusta según sea necesario
        
        boolean DecoInsertada = DecoDAO.insertar(nuevaDeco);
        
        // Verificar si la figura fue insertada correctamente
        if (DecoInsertada) {
            // Mostrar un mensaje de éxito
            JOptionPane.showMessageDialog(null, "Decoracion agregada correctamente.");
            
//            RealizarPedido2 RP2 = new RealizarPedido2();
//            RP2.setSize(440,306);
//            RP2.setLocation(0,0);
//        
//            BackBase.removeAll();
//            BackBase.add(RP2, BorderLayout.CENTER);
//            BackBase.revalidate();
//            BackBase.repaint();
            
        } else {
            // Mostrar un mensaje de error si no se insertó la figura
            JOptionPane.showMessageDialog(null, "Error al agregar la decoracion.");
        }
    } else {
        // Si el campo está vacío, mostrar un mensaje de advertencia
        JOptionPane.showMessageDialog(null, "Por favor, ingrese la confirmacion de la decoracion.");
    }
    }//GEN-LAST:event_lblDeco5MouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel BackDecoracion;
    private javax.swing.JButton btnAtras;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lblDeco1;
    private javax.swing.JLabel lblDeco2;
    private javax.swing.JLabel lblDeco5;
    private javax.swing.JLabel lblDeco6;
    private javax.swing.JTextField txtCasualMora;
    private javax.swing.JTextField txtCumpleanos;
    private javax.swing.JTextField txtParaPrincesas;
    private javax.swing.JTextField txtVeranoFrio;
    // End of variables declaration//GEN-END:variables
}
