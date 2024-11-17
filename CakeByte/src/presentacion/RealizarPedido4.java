package presentacion;

import java.awt.BorderLayout;

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
        lblDeco3 = new javax.swing.JLabel();
        lblDeco4 = new javax.swing.JLabel();
        lblDeco5 = new javax.swing.JLabel();
        lblDeco6 = new javax.swing.JLabel();

        BackDecoracion.setBackground(new java.awt.Color(204, 255, 255));

        jPanel2.setBackground(new java.awt.Color(204, 204, 255));

        jLabel3.setText("<html><h1 style='font-family: Arial, sans-serif; color: #FF6347;'>Elije la decoración</h1></html>");
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(81, 81, 81))
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

        lblDeco2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/presentacion/Iconos/Decoracion-2.png"))); // NOI18N
        lblDeco2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        lblDeco3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/presentacion/Iconos/Decoracion-3.png"))); // NOI18N
        lblDeco3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        lblDeco4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/presentacion/Iconos/Decoracion-4.png"))); // NOI18N
        lblDeco4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        lblDeco5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/presentacion/Iconos/Decoracion-5.png"))); // NOI18N
        lblDeco5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        lblDeco6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/presentacion/Iconos/Decoracion-6.png"))); // NOI18N
        lblDeco6.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        javax.swing.GroupLayout BackDecoracionLayout = new javax.swing.GroupLayout(BackDecoracion);
        BackDecoracion.setLayout(BackDecoracionLayout);
        BackDecoracionLayout.setHorizontalGroup(
            BackDecoracionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(BackDecoracionLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(BackDecoracionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblDeco1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAtras))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(BackDecoracionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblDeco6)
                    .addComponent(lblDeco2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(BackDecoracionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(BackDecoracionLayout.createSequentialGroup()
                        .addComponent(lblDeco3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblDeco4))
                    .addComponent(lblDeco5))
                .addContainerGap(16, Short.MAX_VALUE))
        );
        BackDecoracionLayout.setVerticalGroup(
            BackDecoracionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BackDecoracionLayout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(BackDecoracionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblDeco4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblDeco3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblDeco2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblDeco1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(BackDecoracionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(BackDecoracionLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnAtras))
                    .addGroup(BackDecoracionLayout.createSequentialGroup()
                        .addGroup(BackDecoracionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblDeco5, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblDeco6, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 16, Short.MAX_VALUE)))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 440, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(BackDecoracion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 306, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(BackDecoracion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnAtrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtrasActionPerformed
        RealizarPedido2 RP2 = new RealizarPedido2();
        RP2.setSize(440,306);
        RP2.setLocation(0,0);
        
        BackDecoracion.removeAll();
        BackDecoracion.add(RP2, BorderLayout.CENTER);
        BackDecoracion.revalidate();
        BackDecoracion.repaint();
    }//GEN-LAST:event_btnAtrasActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel BackDecoracion;
    private javax.swing.JButton btnAtras;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lblDeco1;
    private javax.swing.JLabel lblDeco2;
    private javax.swing.JLabel lblDeco3;
    private javax.swing.JLabel lblDeco4;
    private javax.swing.JLabel lblDeco5;
    private javax.swing.JLabel lblDeco6;
    // End of variables declaration//GEN-END:variables
}
