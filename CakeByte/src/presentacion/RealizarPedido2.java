package presentacion;

import datos.SaborDAO;
import entidades.sabor;
import java.awt.BorderLayout;
import javax.swing.JOptionPane;

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
        txtSaborVainilla = new javax.swing.JTextField();
        txtSaborFresa = new javax.swing.JTextField();
        txtSaborChocolate = new javax.swing.JTextField();

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
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, BackSaborLayout.createSequentialGroup()
                .addGroup(BackSaborLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(BackSaborLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnAtras))
                    .addGroup(BackSaborLayout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addComponent(jLabel2)
                        .addGap(65, 65, 65)
                        .addComponent(jLabel3))
                    .addGroup(BackSaborLayout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addGroup(BackSaborLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtSaborVainilla)
                            .addComponent(lblSaborVainilla, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(37, 37, 37)
                        .addGroup(BackSaborLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lblSaborFresa, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtSaborFresa))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 40, Short.MAX_VALUE)
                .addGroup(BackSaborLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel4)
                    .addComponent(lblSaborChocolate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtSaborChocolate))
                .addGap(37, 37, 37))
        );
        BackSaborLayout.setVerticalGroup(
            BackSaborLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BackSaborLayout.createSequentialGroup()
                .addGroup(BackSaborLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblSaborFresa)
                    .addGroup(BackSaborLayout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(BackSaborLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(BackSaborLayout.createSequentialGroup()
                                .addGroup(BackSaborLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel4))
                                .addGap(3, 3, 3)
                                .addComponent(lblSaborVainilla))
                            .addComponent(lblSaborChocolate, javax.swing.GroupLayout.Alignment.TRAILING))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(BackSaborLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtSaborVainilla, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtSaborFresa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtSaborChocolate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 46, Short.MAX_VALUE)
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
        String Sabor1 = txtSaborVainilla.getText();
        
        if (!Sabor1.isEmpty()){
            
            SaborDAO saborDao = new SaborDAO();
            sabor nuevoSabor = new sabor(Sabor1,15000);
            
            boolean saborInsertado = saborDao.insertar(nuevoSabor);
            
            if(saborInsertado){
                JOptionPane.showMessageDialog(null, "Sabor insertado correctamente.");
                
               RealizarPedido4 RP2 = new RealizarPedido4();
               RP2.setSize(440,306);
               RP2.setLocation(0,0);

               BackSabor.removeAll();
               BackSabor.add(RP2, BorderLayout.CENTER);
               BackSabor.revalidate();
               BackSabor.repaint();   
            }else {
            // Mostrar un mensaje de error si no se insertó la figura
            JOptionPane.showMessageDialog(null, "Error al insertar el sabor.");
        }
        }else {
        // Si el campo está vacío, mostrar un mensaje de advertencia
        JOptionPane.showMessageDialog(null, "Por favor, la confirmacion del sabor!.");
    }
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
    private javax.swing.JTextField txtSaborChocolate;
    private javax.swing.JTextField txtSaborFresa;
    private javax.swing.JTextField txtSaborVainilla;
    // End of variables declaration//GEN-END:variables
}
