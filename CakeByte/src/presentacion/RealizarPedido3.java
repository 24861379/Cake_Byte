package presentacion;

import datos.FiguraDAO1;
import entidades.figura;
import java.awt.BorderLayout;
import javax.swing.JOptionPane;

public class RealizarPedido3 extends javax.swing.JPanel {

    
    public RealizarPedido3() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        BackBase = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        lblTortaRedonda = new javax.swing.JLabel();
        lblTortaCuadrada = new javax.swing.JLabel();
        lblTortaRectangular = new javax.swing.JLabel();
        txtTortaRedonda = new javax.swing.JTextField();
        txtTortaCuadrada = new javax.swing.JTextField();
        txtTortaRectangular = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        BackBase.setBackground(new java.awt.Color(204, 255, 255));

        jPanel2.setBackground(new java.awt.Color(204, 204, 255));

        jLabel1.setText("<html><h1 style='font-family: Arial, sans-serif; color: #FF6347;'>Selecciona la base</h1></html>");
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(74, 74, 74)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 287, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 58, Short.MAX_VALUE)
                .addContainerGap())
        );

        lblTortaRedonda.setIcon(new javax.swing.ImageIcon(getClass().getResource("/presentacion/Iconos/Tortra-Redonda.png"))); // NOI18N
        lblTortaRedonda.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblTortaRedonda.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblTortaRedondaMouseClicked(evt);
            }
        });

        lblTortaCuadrada.setIcon(new javax.swing.ImageIcon(getClass().getResource("/presentacion/Iconos/Tortra-Cuadrada.png"))); // NOI18N
        lblTortaCuadrada.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblTortaCuadrada.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblTortaCuadradaMouseClicked(evt);
            }
        });

        lblTortaRectangular.setIcon(new javax.swing.ImageIcon(getClass().getResource("/presentacion/Iconos/Tortra-Rectangular.png"))); // NOI18N
        lblTortaRectangular.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblTortaRectangular.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblTortaRectangularMouseClicked(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        jLabel2.setText("''Base Circular''");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        jLabel3.setText("''Base Cuadrada''");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        jLabel4.setText("''Base Rectangular''");

        javax.swing.GroupLayout BackBaseLayout = new javax.swing.GroupLayout(BackBase);
        BackBase.setLayout(BackBaseLayout);
        BackBaseLayout.setHorizontalGroup(
            BackBaseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(BackBaseLayout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(BackBaseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtTortaRedonda)
                    .addComponent(lblTortaRedonda, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 36, Short.MAX_VALUE)
                .addGroup(BackBaseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblTortaCuadrada, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtTortaCuadrada))
                .addGap(35, 35, 35)
                .addGroup(BackBaseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(BackBaseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(lblTortaRectangular, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtTortaRectangular, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel4))
                .addGap(23, 23, 23))
        );
        BackBaseLayout.setVerticalGroup(
            BackBaseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BackBaseLayout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addGroup(BackBaseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(BackBaseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblTortaRedonda)
                    .addComponent(lblTortaRectangular, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblTortaCuadrada, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(BackBaseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtTortaRedonda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtTortaCuadrada, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtTortaRectangular, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 49, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(BackBase, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(BackBase, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void lblTortaRedondaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblTortaRedondaMouseClicked

    String BaseTorta1 = txtTortaRedonda.getText();
    
    // Verificar si el campo no está vacío
    if (!BaseTorta1.isEmpty()) {
        
        FiguraDAO1 figuraDAO = new FiguraDAO1();
        figura nuevaFigura = new figura(BaseTorta1, 35000);  // Supongo que el precio adicional es 10.0, ajusta según sea necesario
        
        boolean figuraInsertada = figuraDAO.insertar(nuevaFigura);
        
        // Verificar si la figura fue insertada correctamente
        if (figuraInsertada) {
            // Mostrar un mensaje de éxito
            JOptionPane.showMessageDialog(null, "Base agregada correctamente.");
            
            RealizarPedido2 RP2 = new RealizarPedido2();
            RP2.setSize(440,306);
            RP2.setLocation(0,0);
        
            BackBase.removeAll();
            BackBase.add(RP2, BorderLayout.CENTER);
            BackBase.revalidate();
            BackBase.repaint();
            
        } else {
            // Mostrar un mensaje de error si no se insertó la figura
            JOptionPane.showMessageDialog(null, "Error al agregar la base.");
        }
    } else {
        // Si el campo está vacío, mostrar un mensaje de advertencia
        JOptionPane.showMessageDialog(null, "Por favor, ingrese la confirmacion de la base");
    }
    }//GEN-LAST:event_lblTortaRedondaMouseClicked

    private void lblTortaCuadradaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblTortaCuadradaMouseClicked
        String BaseTorta2 = txtTortaCuadrada.getText();
    
    // Verificar si el campo no está vacío
    if (!BaseTorta2.isEmpty()) {
        
        FiguraDAO1 figuraDAO = new FiguraDAO1();
        figura nuevaFigura = new figura(BaseTorta2, 35000);  // Supongo que el precio adicional es 10.0, ajusta según sea necesario
        
        boolean figuraInsertada = figuraDAO.insertar(nuevaFigura);
        
        // Verificar si la figura fue insertada correctamente
        if (figuraInsertada) {
            // Mostrar un mensaje de éxito
            JOptionPane.showMessageDialog(null, "Base agregada correctamente.");
            
            RealizarPedido2 RP2 = new RealizarPedido2();
            RP2.setSize(440,306);
            RP2.setLocation(0,0);
        
            BackBase.removeAll();
            BackBase.add(RP2, BorderLayout.CENTER);
            BackBase.revalidate();
            BackBase.repaint();
            
        } else {
            // Mostrar un mensaje de error si no se insertó la figura
            JOptionPane.showMessageDialog(null, "Error al agregar la base.");
        }
    } else {
        // Si el campo está vacío, mostrar un mensaje de advertencia
        JOptionPane.showMessageDialog(null, "Por favor, ingrese la confirmacion de la base");
    }
    }//GEN-LAST:event_lblTortaCuadradaMouseClicked

    private void lblTortaRectangularMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblTortaRectangularMouseClicked
      String BaseTorta3 = txtTortaRectangular.getText();
    
    // Verificar si el campo no está vacío
    if (!BaseTorta3.isEmpty()) {
        
        FiguraDAO1 figuraDAO = new FiguraDAO1();
        figura nuevaFigura = new figura(BaseTorta3, 35000);  // Supongo que el precio adicional es 10.0, ajusta según sea necesario
        
        boolean figuraInsertada = figuraDAO.insertar(nuevaFigura);
        
        // Verificar si la figura fue insertada correctamente
        if (figuraInsertada) {
            // Mostrar un mensaje de éxito
            JOptionPane.showMessageDialog(null, "Base agregada correctamente.");
            
            RealizarPedido2 RP2 = new RealizarPedido2();
            RP2.setSize(440,306);
            RP2.setLocation(0,0);
        
            BackBase.removeAll();
            BackBase.add(RP2, BorderLayout.CENTER);
            BackBase.revalidate();
            BackBase.repaint();
            
        } else {
            // Mostrar un mensaje de error si no se insertó la figura
            JOptionPane.showMessageDialog(null, "Error al agregar la base.");
        }
    } else {
        // Si el campo está vacío, mostrar un mensaje de advertencia
        JOptionPane.showMessageDialog(null, "Por favor, ingrese la confirmacion de la base.");
    }  
    }//GEN-LAST:event_lblTortaRectangularMouseClicked

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel BackBase;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lblTortaCuadrada;
    private javax.swing.JLabel lblTortaRectangular;
    private javax.swing.JLabel lblTortaRedonda;
    private javax.swing.JTextField txtTortaCuadrada;
    private javax.swing.JTextField txtTortaRectangular;
    private javax.swing.JTextField txtTortaRedonda;
    // End of variables declaration//GEN-END:variables
}
