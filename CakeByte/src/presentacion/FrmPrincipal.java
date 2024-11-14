package presentacion;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.BorderLayout;

public class FrmPrincipal extends javax.swing.JFrame {
    
    public FrmPrincipal() {
        initComponents();
        InitContent();
        rsscalelabel.RSScaleLabel.setScaleLabel(lblImagen, "src//presentacion//Iconos//Logo1.png");
    }

    //Instacia para llamar los paneles al espacio en blanco del formulario principal
    private void InitContent(){
        // Crear una instancia del panel principal
    Principal pl = new Principal();
    
    // No es necesario llamar a setSize, ya que BorderLayout lo maneja
    // Plantea las restricciones adecuadas para el panel
    pl.setPreferredSize(new Dimension(817, 471));
    
    // Limpiar el contenido anterior
    content.removeAll();
    
    // Añadir el panel Principal al contenedor de contenido
    content.add(pl, BorderLayout.CENTER);
    
    // Llamar a revalidate() y repaint() para asegurarse de que el panel se muestre correctamente
    content.revalidate();
    content.repaint();
    }
    
    
    @SuppressWarnings("")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        background = new javax.swing.JPanel();
        menu = new javax.swing.JPanel();
        btnInicio = new javax.swing.JButton();
        btnRegistrarse = new javax.swing.JButton();
        btnIniciarSeccion = new javax.swing.JButton();
        btnRealizarPedido = new javax.swing.JButton();
        lblImagen = new javax.swing.JLabel();
        content = new javax.swing.JPanel();
        jpContenedorHeader = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Sistema de pedidos");

        background.setBackground(new java.awt.Color(255, 255, 255));

        menu.setBackground(new java.awt.Color(153, 153, 255));
        menu.setPreferredSize(new java.awt.Dimension(270, 640));

        btnInicio.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18));
        btnInicio.setText("Inicio");
        btnInicio.setBackground(new Color(153,153,255)); // Crema suave
        btnInicio.setPreferredSize(new Dimension(120, 35));
        btnInicio.setBorder(null);
        btnInicio.setBorderPainted(false);
        btnInicio.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnInicio.setFocusPainted(false);

        btnRegistrarse.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18));
        btnRegistrarse.setText("Registrarse");
        btnRegistrarse.setBackground(new Color(153,153,255)); // Crema suave
        btnRegistrarse.setPreferredSize(new Dimension(120, 35));
        btnRegistrarse.setBorder(null);

        btnRegistrarse.setBorderPainted(false);

        btnRegistrarse.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnRegistrarse.setBorder(null);
        btnRegistrarse.setBorderPainted(false);
        btnRegistrarse.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnRegistrarse.setFocusPainted(false);

        btnIniciarSeccion.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18));
        btnIniciarSeccion.setText("Iniciar Sesión");
        btnIniciarSeccion.setBackground(new Color(153,153,255)); // Crema suave
        btnIniciarSeccion.setPreferredSize(new Dimension(120, 35));
        btnIniciarSeccion.setBorder(null);
        btnIniciarSeccion.setBorder(null);
        btnIniciarSeccion.setBorder(null);
        btnIniciarSeccion.setBorderPainted(false);
        btnIniciarSeccion.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnIniciarSeccion.setFocusPainted(false);
        btnIniciarSeccion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIniciarSeccionActionPerformed(evt);
            }
        });

        btnRealizarPedido.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18));
        btnRealizarPedido.setText("Realizar Pedido");
        btnRealizarPedido.setBackground(new Color(153,153,255)); // Crema suave
        btnRealizarPedido.setPreferredSize(new Dimension(120, 35));
        btnRealizarPedido.setBorder(null);
        btnRealizarPedido.setBorder(null);
        btnRealizarPedido.setBorderPainted(false);
        btnRealizarPedido.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnRealizarPedido.setFocusPainted(false);

        lblImagen.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout menuLayout = new javax.swing.GroupLayout(menu);
        menu.setLayout(menuLayout);
        menuLayout.setHorizontalGroup(
            menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnInicio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(menuLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblImagen, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addComponent(btnRegistrarse, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnRealizarPedido, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnIniciarSeccion, javax.swing.GroupLayout.DEFAULT_SIZE, 278, Short.MAX_VALUE)
        );
        menuLayout.setVerticalGroup(
            menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menuLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblImagen, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnInicio, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnRegistrarse, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnIniciarSeccion, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnRealizarPedido, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout contentLayout = new javax.swing.GroupLayout(content);
        content.setLayout(contentLayout);
        contentLayout.setHorizontalGroup(
            contentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        contentLayout.setVerticalGroup(
            contentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 471, Short.MAX_VALUE)
        );

        jpContenedorHeader.setBackground(new java.awt.Color(204, 255, 255));

        String titleText = "<html>"
        + "<div style='text-align: center; font-family: Arial;'>"
        + "<h1 style='color: #FF6F61; font-size: 40px;'>Cake Byte</h1>"  // Color coral brillante para Cake Byte
        + "<h3 style='color: #34495E; font-size: 15px;'>Tu postre favorito, a un click de distancia</h3>"  // Color gris oscuro para el eslogan
        + "</div></html>";
        jLabel1.setText(titleText);

        javax.swing.GroupLayout jpContenedorHeaderLayout = new javax.swing.GroupLayout(jpContenedorHeader);
        jpContenedorHeader.setLayout(jpContenedorHeaderLayout);
        jpContenedorHeaderLayout.setHorizontalGroup(
            jpContenedorHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpContenedorHeaderLayout.createSequentialGroup()
                .addContainerGap(221, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 450, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(152, 152, 152))
        );
        jpContenedorHeaderLayout.setVerticalGroup(
            jpContenedorHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpContenedorHeaderLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 133, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout backgroundLayout = new javax.swing.GroupLayout(background);
        background.setLayout(backgroundLayout);
        backgroundLayout.setHorizontalGroup(
            backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(backgroundLayout.createSequentialGroup()
                .addComponent(menu, javax.swing.GroupLayout.PREFERRED_SIZE, 278, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jpContenedorHeader, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(backgroundLayout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(content, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        backgroundLayout.setVerticalGroup(
            backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addComponent(menu, javax.swing.GroupLayout.DEFAULT_SIZE, 672, Short.MAX_VALUE)
            .addGroup(backgroundLayout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(jpContenedorHeader, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(content, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(background, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(background, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnIniciarSeccionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIniciarSeccionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnIniciarSeccionActionPerformed

    
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                 FrmPrincipal frame = new FrmPrincipal();
                 frame.setVisible(true);

                // Asignar la imagen después de que la ventana esté visible
                 Principal pl = new Principal();
                 rsscalelabel.RSScaleLabel.setScaleLabel(pl.getjlImagen1(), "src//presentacion//Iconos//Imagen01.png");
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel background;
    private javax.swing.JButton btnIniciarSeccion;
    private javax.swing.JButton btnInicio;
    private javax.swing.JButton btnRealizarPedido;
    private javax.swing.JButton btnRegistrarse;
    private javax.swing.JPanel content;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jpContenedorHeader;
    private javax.swing.JLabel lblImagen;
    private javax.swing.JPanel menu;
    // End of variables declaration//GEN-END:variables

}
