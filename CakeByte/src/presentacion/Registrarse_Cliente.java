package presentacion;

<<<<<<< HEAD
import datos.ClienteDAO;
import entidades.cliente;



public class Registrarse_Cliente extends javax.swing.JPanel {
    
    private final ClienteDAO DATOS;


=======

public class Registrarse_Cliente extends javax.swing.JPanel {

    
>>>>>>> e8afadd62e2d9a2fb846e20bef921d6b1e03fbac
    public Registrarse_Cliente() {
        initComponents();
        this.DATOS = new ClienteDAO();
    }
    
    public void insertar(ClienteDAO CB){
        String nombreC=LBL_CNombre.getText();
        String ApellidoC=LBL_CApellido.getText();
        String DireccionC=LBL_CAddress.getText();
        String CorreoC=LBL_CEmail.getText();
        int TelefonoC= Integer.parseInt(LBL_CTelefono.getText());
        
        cliente obj = new cliente(nombreC, ApellidoC, DireccionC, CorreoC, TelefonoC);
        CB.insertar(obj); 
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        JPBackRC = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        LBL_CNombre = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        LBL_CAddress = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        LBL_CApellido = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        LBL_CEmail = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        LBL_CTelefono = new javax.swing.JTextField();
        BtnRegistrarC = new javax.swing.JButton();
        BtnCancelarC = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();

        JPBackRC.setBackground(new java.awt.Color(255, 255, 255));

        jPanel1.setBackground(new java.awt.Color(255, 250, 227));

        jLabel1.setBackground(new java.awt.Color(0, 0, 0));
        jLabel1.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel1.setText("Ingresa tus datos");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(306, 306, 306)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(311, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(24, Short.MAX_VALUE))
        );

        jLabel2.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel2.setText("Nombre");

        jLabel3.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel3.setText("Apellido");

        jLabel4.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel4.setText("Dirección");

        jLabel5.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel5.setText("Correo");

        LBL_CEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LBL_CEmailActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel6.setText("Télefono");

        LBL_CTelefono.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LBL_CTelefonoActionPerformed(evt);
            }
        });

        BtnRegistrarC.setBackground(new java.awt.Color(102, 255, 51));
        BtnRegistrarC.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
<<<<<<< HEAD
        BtnRegistrarC.setForeground(new java.awt.Color(0, 0, 0));
        BtnRegistrarC.setText("Iniciar sesión");
=======
        BtnRegistrarC.setText("Registrar");
>>>>>>> e8afadd62e2d9a2fb846e20bef921d6b1e03fbac
        BtnRegistrarC.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BtnRegistrarC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnRegistrarCActionPerformed(evt);
            }
        });

        BtnCancelarC.setBackground(new java.awt.Color(255, 51, 51));
        BtnCancelarC.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        BtnCancelarC.setText("Cancelar");
        BtnCancelarC.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/presentacion/Iconos/Pastel (1).gif"))); // NOI18N

        javax.swing.GroupLayout JPBackRCLayout = new javax.swing.GroupLayout(JPBackRC);
        JPBackRC.setLayout(JPBackRCLayout);
        JPBackRCLayout.setHorizontalGroup(
            JPBackRCLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JPBackRCLayout.createSequentialGroup()
<<<<<<< HEAD
                .addGap(135, 135, 135)
                .addGroup(JPBackRCLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(jLabel6)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addGroup(JPBackRCLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(JPBackRCLayout.createSequentialGroup()
                        .addGroup(JPBackRCLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(LBL_CNombre)
                            .addComponent(LBL_CTelefono)
                            .addComponent(LBL_CApellido, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(69, 69, 69)
                        .addGroup(JPBackRCLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5))
                        .addGap(18, 18, 18)
                        .addGroup(JPBackRCLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(LBL_CAddress)
                            .addComponent(LBL_CEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(JPBackRCLayout.createSequentialGroup()
                        .addComponent(BtnRegistrarC, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(101, 101, 101)
                        .addComponent(BtnCancelarC, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(166, Short.MAX_VALUE))
=======
                .addGroup(JPBackRCLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(JPBackRCLayout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addComponent(BtnRegistrarC, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(BtnCancelarC, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(JPBackRCLayout.createSequentialGroup()
                        .addGap(55, 55, 55)
                        .addGroup(JPBackRCLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(JPBackRCLayout.createSequentialGroup()
                                .addGroup(JPBackRCLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel2))
                                .addGap(18, 18, Short.MAX_VALUE)
                                .addGroup(JPBackRCLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(LBL_CApellido, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(LBL_CEmail1, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(LBL_CNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(JPBackRCLayout.createSequentialGroup()
                                .addGroup(JPBackRCLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel5))
                                .addGap(18, 18, 18)
                                .addGroup(JPBackRCLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(LBL_CAddress)
                                    .addComponent(LBL_CEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40))
            .addGroup(JPBackRCLayout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(19, Short.MAX_VALUE))
>>>>>>> e8afadd62e2d9a2fb846e20bef921d6b1e03fbac
        );
        JPBackRCLayout.setVerticalGroup(
            JPBackRCLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JPBackRCLayout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
<<<<<<< HEAD
                .addGap(40, 40, 40)
=======
>>>>>>> e8afadd62e2d9a2fb846e20bef921d6b1e03fbac
                .addGroup(JPBackRCLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(JPBackRCLayout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addGroup(JPBackRCLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(LBL_CNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(JPBackRCLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(LBL_CApellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(JPBackRCLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(LBL_CEmail1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(JPBackRCLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(LBL_CAddress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(JPBackRCLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
<<<<<<< HEAD
                            .addComponent(LBL_CEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addGroup(JPBackRCLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(LBL_CTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(65, 65, 65)
                .addGroup(JPBackRCLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BtnRegistrarC, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BtnCancelarC, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 111, Short.MAX_VALUE))
=======
                            .addComponent(LBL_CEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(49, 49, 49)
                        .addGroup(JPBackRCLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(BtnRegistrarC, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(BtnCancelarC, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(JPBackRCLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(51, Short.MAX_VALUE))
>>>>>>> e8afadd62e2d9a2fb846e20bef921d6b1e03fbac
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(JPBackRC, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(JPBackRC, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void LBL_CEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LBL_CEmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_LBL_CEmailActionPerformed

    private void LBL_CTelefonoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LBL_CTelefonoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_LBL_CTelefonoActionPerformed

    private void BtnRegistrarCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnRegistrarCActionPerformed
        // TODO add your handling code here:
        insertar(DATOS);
    }//GEN-LAST:event_BtnRegistrarCActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnCancelarC;
    private javax.swing.JButton BtnRegistrarC;
    private javax.swing.JPanel JPBackRC;
    private javax.swing.JTextField LBL_CAddress;
    private javax.swing.JTextField LBL_CApellido;
    private javax.swing.JTextField LBL_CEmail;
    private javax.swing.JTextField LBL_CNombre;
    private javax.swing.JTextField LBL_CTelefono;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
