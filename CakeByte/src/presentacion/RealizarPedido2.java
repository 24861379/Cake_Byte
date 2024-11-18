package presentacion;

import java.awt.BorderLayout;

public class RealizarPedido2 extends javax.swing.JPanel {

    
    public RealizarPedido2() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        BackSabor = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        lblSaborVainilla = new javax.swing.JLabel();
        lblSaborFresa = new javax.swing.JLabel();
        lblSaborChocolate = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        btnAtras = new javax.swing.JButton();

        BackSabor.setBackground(new java.awt.Color(204, 255, 255));

        jPanel1.setBackground(new java.awt.Color(204, 204, 255));

        jLabel1.setText("<html><h1 style='font-family: Arial, sans-serif; color: #FF6347;'>Elije el sabor</h1></html>");
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(108, 108, 108)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 58, Short.MAX_VALUE)
                .addContainerGap())
        );

        lblSaborVainilla.setIcon(new javax.swing.ImageIcon(getClass().getResource("/presentacion/Iconos/SaborVainilla.png"))); // NOI18N
        lblSaborVainilla.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblSaborVainilla.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblSaborVainillaMouseClicked(evt);
            }
        });

        lblSaborFresa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/presentacion/Iconos/SaborFresa.png"))); // NOI18N
        lblSaborFresa.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblSaborFresa.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblSaborFresaMouseClicked(evt);
            }
        });

        lblSaborChocolate.setIcon(new javax.swing.ImageIcon(getClass().getResource("/presentacion/Iconos/SaborChocolate.png"))); // NOI18N
        lblSaborChocolate.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblSaborChocolate.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblSaborChocolateMouseClicked(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        jLabel2.setText("Sabor Vainilla");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        jLabel3.setText("Sabor Fresa");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        jLabel4.setText("Sabor Chocolate");

        btnAtras.setBackground(new java.awt.Color(204, 255, 255));
        btnAtras.setText("Atras");
        btnAtras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAtrasActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout BackSaborLayout = new javax.swing.GroupLayout(BackSabor);
        BackSabor.setLayout(BackSaborLayout);
        BackSaborLayout.setHorizontalGroup(
            BackSaborLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(BackSaborLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(BackSaborLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblSaborVainilla, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(BackSaborLayout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jLabel2)))
                .addGroup(BackSaborLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(BackSaborLayout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addComponent(lblSaborFresa, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(BackSaborLayout.createSequentialGroup()
                        .addGap(52, 52, 52)
                        .addComponent(jLabel3)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 40, Short.MAX_VALUE)
                .addGroup(BackSaborLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(lblSaborChocolate, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(37, 37, 37))
            .addGroup(BackSaborLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnAtras)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        BackSaborLayout.setVerticalGroup(
            BackSaborLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BackSaborLayout.createSequentialGroup()
                .addGroup(BackSaborLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblSaborFresa)
                    .addGroup(BackSaborLayout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(BackSaborLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(BackSaborLayout.createSequentialGroup()
                                .addGap(33, 33, 33)
                                .addComponent(lblSaborVainilla))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, BackSaborLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblSaborChocolate)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(BackSaborLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 50, Short.MAX_VALUE)
                .addComponent(btnAtras)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(BackSabor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(BackSabor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnAtrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtrasActionPerformed
        RealizarPedido3 RP2 = new RealizarPedido3();
        RP2.setSize(440,306);
        RP2.setLocation(0,0);
        
        BackSabor.removeAll();
        BackSabor.add(RP2, BorderLayout.CENTER);
        BackSabor.revalidate();
        BackSabor.repaint();
    }//GEN-LAST:event_btnAtrasActionPerformed

    private void lblSaborVainillaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblSaborVainillaMouseClicked
        RealizarPedido4 RP2 = new RealizarPedido4();
        RP2.setSize(440,306);
        RP2.setLocation(0,0);

        BackSabor.removeAll();
        BackSabor.add(RP2, BorderLayout.CENTER);
        BackSabor.revalidate();
        BackSabor.repaint();
    }//GEN-LAST:event_lblSaborVainillaMouseClicked

    private void lblSaborFresaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblSaborFresaMouseClicked
        RealizarPedido4 RP2 = new RealizarPedido4();
        RP2.setSize(440,306);
        RP2.setLocation(0,0);

        BackSabor.removeAll();
        BackSabor.add(RP2, BorderLayout.CENTER);
        BackSabor.revalidate();
        BackSabor.repaint();     
    }//GEN-LAST:event_lblSaborFresaMouseClicked

    private void lblSaborChocolateMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblSaborChocolateMouseClicked
        RealizarPedido4 RP2 = new RealizarPedido4();
        RP2.setSize(440,306);
        RP2.setLocation(0,0);

        BackSabor.removeAll();
        BackSabor.add(RP2, BorderLayout.CENTER);
        BackSabor.revalidate();
        BackSabor.repaint();
    }//GEN-LAST:event_lblSaborChocolateMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel BackSabor;
    private javax.swing.JButton btnAtras;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblSaborChocolate;
    private javax.swing.JLabel lblSaborFresa;
    private javax.swing.JLabel lblSaborVainilla;
    // End of variables declaration//GEN-END:variables
}