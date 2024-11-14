package presentacion;

import javax.swing.JLabel;

public class Principal extends javax.swing.JPanel {

    public Principal() {
        jlImagen1 = new JLabel();
        jlImagen1.setBounds(50, 50, 200, 200);
        add(jlImagen1);
    }

    // Método getter público para acceder al JLabel
    public JLabel getjlImagen1() {
        return jlImagen1;
    }
    
    @SuppressWarnings("")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jpPrincipal = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jlImagen1 = new javax.swing.JLabel();

        jpPrincipal.setBackground(new java.awt.Color(255, 255, 255));

        String descriptionText = "<html>"
        + "<div style='font-family: Arial; font-size: 10px; color: #2C3E50; text-align: justify;'>"

        // Título de Cake Byte
        + "<h2 style='color: #E67E22; font-size: 14px'>¿Que es Cake Byte?</h2>"

        // Descripción de Cake Byte
        + "<p><b>Cake Byte</b> es un sistema innovador para la personalización y pedido de pasteles online. "
        + "Ofrecemos una plataforma sencilla y moderna que permite a los usuarios crear sus postres ideales "
        + "con solo unos clics, brindando una experiencia de compra rápida, personalizada y segura.</p>"

        // Título de Quiénes somos
        + "<h3 style='color: #E67E22; font-size: 14px'>¿Quiénes somos?</h3>"

        // Descripción de Quiénes somos
        + "<p>En <b>Cake Byte</b>, somos un equipo comprometido con modernizar la experiencia de pedidos de pastelería. "
        + "Nos dedicamos a facilitar la personalización de pasteles, permitiendo a nuestros clientes crear sus postres ideales de forma rápida y sencilla. "
        + "Nuestro objetivo es combinar tecnología y tradición pastelera, acercando la repostería personalizada a un solo clic de distancia.</p>"

        + "</div>"
        + "</html>";
        jLabel4.setText(descriptionText);
        jLabel4.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        javax.swing.GroupLayout jpPrincipalLayout = new javax.swing.GroupLayout(jpPrincipal);
        jpPrincipal.setLayout(jpPrincipalLayout);
        jpPrincipalLayout.setHorizontalGroup(
            jpPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpPrincipalLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 423, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                .addComponent(jlImagen1, javax.swing.GroupLayout.PREFERRED_SIZE, 313, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19))
        );
        jpPrincipalLayout.setVerticalGroup(
            jpPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpPrincipalLayout.createSequentialGroup()
                .addContainerGap(26, Short.MAX_VALUE)
                .addGroup(jpPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpPrincipalLayout.createSequentialGroup()
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 428, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(17, 17, 17))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpPrincipalLayout.createSequentialGroup()
                        .addComponent(jlImagen1, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(99, 99, 99))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jlImagen1;
    private javax.swing.JPanel jpPrincipal;
    // End of variables declaration//GEN-END:variables
}
