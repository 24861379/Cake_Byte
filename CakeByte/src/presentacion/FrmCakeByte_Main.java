package presentacion;

import java.awt.BorderLayout;
import java.util.Locale;

public class FrmCakeByte_Main extends javax.swing.JFrame {

    
    public FrmCakeByte_Main() {
        initComponents();
        initContent();
    }
    
    private void initContent(){
        Principal pl = new Principal();
        pl.setSize(759,430);
        pl.setLocation(0,0);
        
        Content.removeAll();
        Content.add(pl, BorderLayout.CENTER);
        Content.revalidate();
        Content.repaint();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        BackGround = new javax.swing.JPanel();
        Dashboard = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        Inicio = new javax.swing.JButton();
        IniciarSeccion = new javax.swing.JButton();
        RealizarPedido = new javax.swing.JButton();
        VerPedido = new javax.swing.JButton();
        VerClientes = new javax.swing.JButton();
        VerEmpleados = new javax.swing.JButton();
        VerHistorial = new javax.swing.JButton();
        Heard = new javax.swing.JPanel();
        lblNombreHeard = new javax.swing.JLabel();
        Content = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        BackGround.setBackground(new java.awt.Color(255, 255, 255));

        Dashboard.setBackground(new java.awt.Color(255, 204, 204));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/presentacion/Iconos/Logo1 (1).png"))); // NOI18N
        jLabel1.setMaximumSize(new java.awt.Dimension(37, 10));

        Inicio.setBorderPainted(false);
        Inicio.setBackground(new java.awt.Color(255, 182, 193)); // Color pastel para adaptarse al tema de pastelería
        Inicio.setForeground(new java.awt.Color(102, 51, 0)); // Color marrón para el texto, simulando tonos de chocolate
        Inicio.setFont(new java.awt.Font("Segoe UI", java.awt.Font.BOLD, 16)); // Fuente moderna

        // Quitar bordes y darle un diseño plano
        Inicio.setFocusPainted(false);
        Inicio.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Inicio.setForeground(new java.awt.Color(215, 125, 59));
        Inicio.setText("Inicio");
        Inicio.setBorder(null);
        Inicio.setBorderPainted(false);
        Inicio.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Inicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                InicioActionPerformed(evt);
            }
        });

        IniciarSeccion.setBorderPainted(false);
        IniciarSeccion.setBackground(new java.awt.Color(255, 182, 193)); // Color pastel para adaptarse al tema de pastelería
        IniciarSeccion.setForeground(new java.awt.Color(102, 51, 0)); // Color marrón para el texto, simulando tonos de chocolate
        IniciarSeccion.setFont(new java.awt.Font("Segoe UI", java.awt.Font.BOLD, 16)); // Fuente moderna

        // Quitar bordes y darle un diseño plano
        IniciarSeccion.setFocusPainted(false);
        IniciarSeccion.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        IniciarSeccion.setForeground(new java.awt.Color(215, 125, 59));
        IniciarSeccion.setText("Iniciar Sesión");
        IniciarSeccion.setBorder(null);
        IniciarSeccion.setBorderPainted(false);
        IniciarSeccion.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        IniciarSeccion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IniciarSeccionActionPerformed(evt);
            }
        });

        RealizarPedido.setBorderPainted(false);
        RealizarPedido.setBackground(new java.awt.Color(255, 182, 193)); // Color pastel para adaptarse al tema de pastelería
        RealizarPedido.setForeground(new java.awt.Color(102, 51, 0)); // Color marrón para el texto, simulando tonos de chocolate
        RealizarPedido.setFont(new java.awt.Font("Segoe UI", java.awt.Font.BOLD, 16)); // Fuente moderna

        // Quitar bordes y darle un diseño plano
        RealizarPedido.setFocusPainted(false);
        RealizarPedido.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        RealizarPedido.setForeground(new java.awt.Color(215, 125, 59));
        RealizarPedido.setText("Realizar Pedido");
        RealizarPedido.setBorder(null);
        RealizarPedido.setBorderPainted(false);
        RealizarPedido.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        RealizarPedido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RealizarPedidoActionPerformed(evt);
            }
        });

        VerPedido.setBorderPainted(false);
        VerPedido.setBackground(new java.awt.Color(255, 182, 193)); // Color pastel para adaptarse al tema de pastelería
        VerPedido.setForeground(new java.awt.Color(102, 51, 0)); // Color marrón para el texto, simulando tonos de chocolate
        VerPedido.setFont(new java.awt.Font("Segoe UI", java.awt.Font.BOLD, 16)); // Fuente moderna

        // Quitar bordes y darle un diseño plano
        RealizarPedido.setFocusPainted(false);
        RealizarPedido.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        VerPedido.setForeground(new java.awt.Color(215, 125, 59));
        VerPedido.setText("Ver Pedido");
        VerPedido.setBorder(null);
        VerPedido.setBorderPainted(false);
        VerPedido.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        VerPedido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VerPedidoActionPerformed(evt);
            }
        });

        VerClientes.setBorderPainted(false);
        VerClientes.setBackground(new java.awt.Color(255, 182, 193)); // Color pastel para adaptarse al tema de pastelería
        VerClientes.setForeground(new java.awt.Color(102, 51, 0)); // Color marrón para el texto, simulando tonos de chocolate
        VerClientes.setFont(new java.awt.Font("Segoe UI", java.awt.Font.BOLD, 16)); // Fuente moderna

        // Quitar bordes y darle un diseño plano
        VerClientes.setFocusPainted(false);
        VerClientes.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        VerClientes.setForeground(new java.awt.Color(215, 125, 59));
        VerClientes.setText("Ver Clientes");
        VerClientes.setBorder(null);
        VerClientes.setBorderPainted(false);
        VerClientes.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        VerClientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VerClientesActionPerformed(evt);
            }
        });

        VerEmpleados .setBorderPainted(false);
        VerEmpleados .setBackground(new java.awt.Color(255, 182, 193)); // Color pastel para adaptarse al tema de pastelería
        VerEmpleados .setForeground(new java.awt.Color(102, 51, 0)); // Color marrón para el texto, simulando tonos de chocolate
        VerEmpleados .setFont(new java.awt.Font("Segoe UI", java.awt.Font.BOLD, 16)); // Fuente moderna

        // Quitar bordes y darle un diseño plano
        VerEmpleados.setFocusPainted(false);
        VerEmpleados.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        VerEmpleados.setForeground(new java.awt.Color(215, 125, 59));
        VerEmpleados.setText("Ver Empleados");
        VerEmpleados.setBorder(null);
        VerEmpleados.setBorderPainted(false);
        VerEmpleados.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        VerEmpleados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VerEmpleadosActionPerformed(evt);
            }
        });

        VerHistorial.setBorderPainted(false);
        VerHistorial.setBackground(new java.awt.Color(255, 182, 193)); // Color pastel para adaptarse al tema de pastelería
        VerHistorial.setForeground(new java.awt.Color(102, 51, 0)); // Color marrón para el texto, simulando tonos de chocolate
        VerHistorial.setFont(new java.awt.Font("Segoe UI", java.awt.Font.BOLD, 16)); // Fuente moderna

        // Quitar bordes y darle un diseño plano
        VerHistorial.setFocusPainted(false);
        VerHistorial.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        VerHistorial.setForeground(new java.awt.Color(215, 125, 59));
        VerHistorial.setText("Ver Historial");
        VerHistorial.setBorder(null);
        VerHistorial.setBorderPainted(false);
        VerHistorial.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        VerHistorial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VerHistorialActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout DashboardLayout = new javax.swing.GroupLayout(Dashboard);
        Dashboard.setLayout(DashboardLayout);
        DashboardLayout.setHorizontalGroup(
            DashboardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(DashboardLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(DashboardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Inicio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(IniciarSeccion, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(RealizarPedido, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(VerPedido, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(VerClientes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(VerEmpleados, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(VerHistorial, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        DashboardLayout.setVerticalGroup(
            DashboardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(DashboardLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Inicio, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(IniciarSeccion, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(RealizarPedido, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(VerPedido, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(VerClientes, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(VerEmpleados, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(VerHistorial, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        Heard.setBackground(new java.awt.Color(204, 255, 255));

        // Definir el texto HTML para el título y el eslogan
        String descripcion = "<html>"
        + "<div style='text-align: center;'>"
        + "<h1 style='color: #FFB6C1; font-size: 28px; font-family: Arial;'>Cake Byte</h1>" // Título en rosa pastel
        + "<p style='color: #808080; font-size: 16px; font-family: Arial;'>Tu postre favorito, a un click de distancia</p>" // Eslogan en gris suave
        + "</div>"
        + "</html>";

        // Configurar alineación en el centro
        lblNombreHeard.setHorizontalAlignment(javax.swing.JLabel.CENTER);
        lblNombreHeard.setText(descripcion);

        javax.swing.GroupLayout HeardLayout = new javax.swing.GroupLayout(Heard);
        Heard.setLayout(HeardLayout);
        HeardLayout.setHorizontalGroup(
            HeardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(HeardLayout.createSequentialGroup()
                .addGap(203, 203, 203)
                .addComponent(lblNombreHeard, javax.swing.GroupLayout.DEFAULT_SIZE, 389, Short.MAX_VALUE)
                .addGap(167, 167, 167))
        );
        HeardLayout.setVerticalGroup(
            HeardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblNombreHeard, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        Content.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout ContentLayout = new javax.swing.GroupLayout(Content);
        Content.setLayout(ContentLayout);
        ContentLayout.setHorizontalGroup(
            ContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        ContentLayout.setVerticalGroup(
            ContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 432, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout BackGroundLayout = new javax.swing.GroupLayout(BackGround);
        BackGround.setLayout(BackGroundLayout);
        BackGroundLayout.setHorizontalGroup(
            BackGroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BackGroundLayout.createSequentialGroup()
                .addComponent(Dashboard, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(BackGroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(BackGroundLayout.createSequentialGroup()
                        .addComponent(Heard, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addComponent(Content, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        BackGroundLayout.setVerticalGroup(
            BackGroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Dashboard, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(BackGroundLayout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(Heard, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Content, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(BackGround, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(BackGround, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void InicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_InicioActionPerformed
        Principal pl = new Principal();
        pl.setSize(759,430);
        pl.setLocation(0,0);
        
        Content.removeAll();
        Content.add(pl, BorderLayout.CENTER);
        Content.revalidate();
        Content.repaint();
    }//GEN-LAST:event_InicioActionPerformed

    private void IniciarSeccionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IniciarSeccionActionPerformed
        IniciarSeccion IS = new IniciarSeccion();
        IS.setSize(759,430);
        IS.setLocation(0, 0); 
        
        Content.removeAll();
        Content.add(IS, BorderLayout.CENTER);
        Content.revalidate();
        Content.repaint();
    }//GEN-LAST:event_IniciarSeccionActionPerformed

    private void VerPedidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VerPedidoActionPerformed

       VerPedido VP = new VerPedido();
       VP.setSize(759,430);
       VP.setLocation(0, 0);
        
       Content.removeAll();
       Content.add(VP, BorderLayout.CENTER);
       Content.revalidate();
       Content.repaint();
    }//GEN-LAST:event_VerPedidoActionPerformed

    private void VerClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VerClientesActionPerformed
        verCliente vc = new verCliente();
        vc.setSize(759,430);
        vc.setLocation(0,0);

        Content.removeAll();
        Content.add(vc, BorderLayout.CENTER);
        Content.revalidate();
        Content.repaint();
    }//GEN-LAST:event_VerClientesActionPerformed

    private void VerEmpleadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VerEmpleadosActionPerformed
        verEmpleado ve = new verEmpleado();
        ve.setSize(759,430);
        ve.setLocation(0,0);
        
        Content.removeAll();
        Content.add(ve, BorderLayout.CENTER);
        Content.revalidate();
        Content.repaint();
    }//GEN-LAST:event_VerEmpleadosActionPerformed

    private void VerHistorialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VerHistorialActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_VerHistorialActionPerformed

    private void RealizarPedidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RealizarPedidoActionPerformed
        RealizarPedido RP = new RealizarPedido();
        RP.setSize(759,430);
        RP.setLocation(0,0);

        Content.removeAll();
        Content.add(RP, BorderLayout.CENTER);
        Content.revalidate();
        Content.repaint();
    }//GEN-LAST:event_RealizarPedidoActionPerformed

    public static void main(String args[]) {
        
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
            java.util.logging.Logger.getLogger(FrmCakeByte_Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmCakeByte_Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmCakeByte_Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmCakeByte_Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmCakeByte_Main().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel BackGround;
    private javax.swing.JPanel Content;
    private javax.swing.JPanel Dashboard;
    private javax.swing.JPanel Heard;
    private javax.swing.JButton IniciarSeccion;
    private javax.swing.JButton Inicio;
    private javax.swing.JButton RealizarPedido;
    private javax.swing.JButton VerClientes;
    private javax.swing.JButton VerEmpleados;
    private javax.swing.JButton VerHistorial;
    private javax.swing.JButton VerPedido;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lblNombreHeard;
    // End of variables declaration//GEN-END:variables

}
