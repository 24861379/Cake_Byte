package presentacion;

import java.awt.BorderLayout;

public class RealizarPedido extends javax.swing.JPanel {

    
    private String nombreUsuario;
    
    public RealizarPedido(){
        initComponents();
        initContent();
    }
    
    public RealizarPedido(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
        initComponents();
        initContent();
        // Mostrar el nombre de usuario en algún componente (si es necesario)
        jLabel2.setText("<html>" +
                "<div style='font-family: Arial, sans-serif; color: #333; padding: 15px; text-align: justify;'>" +
                "<h2 style='color: #FF6347;'>Bienvenido, " + this.nombreUsuario + "</h2>" +
                "<p style= 'font-size: 10px;'>Para realizar un pedido, sigue estos pasos:</p>" +
                "<ol style='margin-left: 10px; font-size: 10px; padding: 5px;'>" +
                "   <li>Selecciona una imagen que será la <b>base</b> de tu torta.</li>" +
                "   <li>Selecciona una imagen para el <b>sabor</b> de tu torta.</li>" +
                "   <li>Selecciona una imagen para la <b>decoración</b> de tu torta.</li>" +
                "</ol>" +
                "<p style= 'font-size: 10px;'>Una vez que hayas elegido estos tres elementos, presiona el botón <b>Enviar</b> y tu pedido será enviado a nuestra repostería <b>Cake Byte</b>, donde será preparado con mucho cariño.</p>" +
                "</div>" +
                "</html>");
    
    }
    private void initContent(){
        RealizarPedido3 RP3= new RealizarPedido3();
        RP3.setSize(440,306);
        RP3.setLocation(0,0);
        
        Content.removeAll();
        Content.add(RP3, BorderLayout.CENTER);
        Content.revalidate();
        Content.repaint();
    }
    
 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jProgressBar1 = new javax.swing.JProgressBar();
        BackRealizarPedido = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        Content = new javax.swing.JPanel();

        BackRealizarPedido.setBackground(new java.awt.Color(255, 255, 255));

        jPanel1.setBackground(new java.awt.Color(255, 250, 227));

        jLabel1.setText("<html><h1 style='font-family: Arial, sans-serif; color: #FF6347;'>Personaliza tu torta</h1></html>");
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(220, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 315, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(218, 218, 218))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 88, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout ContentLayout = new javax.swing.GroupLayout(Content);
        Content.setLayout(ContentLayout);
        ContentLayout.setHorizontalGroup(
            ContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        ContentLayout.setVerticalGroup(
            ContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout BackRealizarPedidoLayout = new javax.swing.GroupLayout(BackRealizarPedido);
        BackRealizarPedido.setLayout(BackRealizarPedidoLayout);
        BackRealizarPedidoLayout.setHorizontalGroup(
            BackRealizarPedidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BackRealizarPedidoLayout.createSequentialGroup()
                .addGroup(BackRealizarPedidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(BackRealizarPedidoLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 295, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Content, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        BackRealizarPedidoLayout.setVerticalGroup(
            BackRealizarPedidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BackRealizarPedidoLayout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(BackRealizarPedidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 306, Short.MAX_VALUE)
                    .addComponent(Content, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(BackRealizarPedido, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(BackRealizarPedido, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents
    


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel BackRealizarPedido;
    private javax.swing.JPanel Content;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JProgressBar jProgressBar1;
    // End of variables declaration//GEN-END:variables
}
