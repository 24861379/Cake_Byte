package presentacion;

import datos.ClienteDAO;
import datos.EmpleadoDAO;
import datos.UsuarioDAO;
import entidades.cliente;
import entidades.empleado;
import entidades.usuario;
import java.awt.BorderLayout;
import javax.swing.JOptionPane;

public class Registrarse extends javax.swing.JPanel {

    private String usuario;
    private String password;
    

    public Registrarse() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        BackRegistrarse = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        lblNombre = new javax.swing.JTextField();
        lblApellido = new javax.swing.JTextField();
        lblAddress = new javax.swing.JTextField();
        lblEmail = new javax.swing.JTextField();
        lblTelefono = new javax.swing.JTextField();
        btnRegistrar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        lblUsuarioName = new javax.swing.JTextField();
        lblPassword = new javax.swing.JTextField();

        BackRegistrarse.setBackground(new java.awt.Color(255, 255, 255));

        jPanel2.setBackground(new java.awt.Color(255, 250, 227));

        jLabel8.setText("<html><h1 style='font-family: Arial, sans-serif; color: #FF6347;'>Registrarse</h1></html>");
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(247, Short.MAX_VALUE)
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(243, 243, 243))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, 88, Short.MAX_VALUE)
                .addContainerGap())
        );

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        jLabel2.setText("Nombre");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        jLabel3.setText("Apellido");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        jLabel4.setText("Dirección");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        jLabel5.setText("Correo");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        jLabel6.setText("Télefono");

        btnRegistrar.setBackground(new java.awt.Color(204, 255, 204));
        btnRegistrar.setText("Registrarme");
        btnRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarActionPerformed(evt);
            }
        });

        btnCancelar.setBackground(new java.awt.Color(255, 102, 102));
        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        jLabel7.setText("Rol");

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecciona tu rol", "Cliente", "Empleado", " " }));
        jComboBox1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        jLabel9.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        jLabel9.setText("Nombre de usuario");

        jLabel10.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        jLabel10.setText("Contraseña");

        javax.swing.GroupLayout BackRegistrarseLayout = new javax.swing.GroupLayout(BackRegistrarse);
        BackRegistrarse.setLayout(BackRegistrarseLayout);
        BackRegistrarseLayout.setHorizontalGroup(
            BackRegistrarseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BackRegistrarseLayout.createSequentialGroup()
                .addGap(66, 66, 66)
                .addGroup(BackRegistrarseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(BackRegistrarseLayout.createSequentialGroup()
                        .addGroup(BackRegistrarseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(80, 80, 80)
                        .addGroup(BackRegistrarseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(BackRegistrarseLayout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addGap(18, 18, 18)
                        .addComponent(lblUsuarioName, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(BackRegistrarseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(BackRegistrarseLayout.createSequentialGroup()
                        .addGroup(BackRegistrarseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(32, 32, 32))
                    .addGroup(BackRegistrarseLayout.createSequentialGroup()
                        .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(18, 18, 18)))
                .addGroup(BackRegistrarseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(lblPassword)
                    .addComponent(lblApellido)
                    .addComponent(lblAddress)
                    .addComponent(jComboBox1, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(160, 160, 160))
            .addGroup(BackRegistrarseLayout.createSequentialGroup()
                .addGap(256, 256, 256)
                .addComponent(btnRegistrar)
                .addGap(18, 18, 18)
                .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(BackRegistrarseLayout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 19, Short.MAX_VALUE))
        );
        BackRegistrarseLayout.setVerticalGroup(
            BackRegistrarseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BackRegistrarseLayout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addGroup(BackRegistrarseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(BackRegistrarseLayout.createSequentialGroup()
                        .addGroup(BackRegistrarseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(lblNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addGap(18, 18, 18)
                        .addGroup(BackRegistrarseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5)
                            .addComponent(jLabel4))
                        .addGap(18, 18, 18)
                        .addGroup(BackRegistrarseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(lblTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(BackRegistrarseLayout.createSequentialGroup()
                        .addComponent(lblApellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(lblAddress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(BackRegistrarseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7))))
                .addGap(18, 18, 18)
                .addGroup(BackRegistrarseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(lblUsuarioName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 80, Short.MAX_VALUE)
                .addGroup(BackRegistrarseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnRegistrar)
                    .addComponent(btnCancelar))
                .addGap(53, 53, 53))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(BackRegistrarse, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(BackRegistrarse, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        Principal pl = new Principal();
        pl.setSize(759,430);
        pl.setLocation(0,0);
        
        BackRegistrarse.removeAll();
        BackRegistrarse.add(pl, BorderLayout.CENTER);
        BackRegistrarse.revalidate();
        BackRegistrarse.repaint();
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarActionPerformed
         
    String nombre = lblNombre.getText();
    String apellido = lblApellido.getText();
    String direccion = lblAddress.getText();
    String correo = lblEmail.getText();
    int telefono = Integer.parseInt(lblTelefono.getText());
    usuario = lblUsuarioName.getText();
    password = lblPassword.getText();
    String rol = (String) jComboBox1.getSelectedItem(); // Selección del rol
    
//    if (nombre.isEmpty() || apellido.isEmpty() || direccion.isEmpty() || correo.isEmpty() || telefono == 0 || usuario.isEmpty() || password.isEmpty() || rol.equals("Seleccione un rol")) {
//    JOptionPane.showMessageDialog(this, "Por favor, complete todos los campos.");
//    return; // Sale del método si alguna validación falla
//    }
    
    // Si el rol seleccionado es "Cliente", insertar en tb_cliente y tb_usuario
    if (rol.equals("Cliente")) {
        ClienteDAO clienteDAO = new ClienteDAO();
        cliente nuevoCliente = new cliente(nombre, apellido, direccion, correo, telefono);
        
        // Insertar cliente en la tabla tb_cliente
        boolean clienteInsertado = clienteDAO.insertar(nuevoCliente);
        
        if (clienteInsertado) {
            // Si el cliente se inserta con éxito, insertar también en tb_usuario
            UsuarioDAO usuarioDAO = new UsuarioDAO();
            usuario nuevoUsuario = new usuario(usuario, password, rol);  // Asegúrate de tener esta clase Usuario definida
            boolean usuarioInsertado = usuarioDAO.insertar(nuevoUsuario);
            
            if (usuarioInsertado) {
                JOptionPane.showMessageDialog(this, "¡Cliente registrado con exito!");
                
            IniciarSeccion pl = new IniciarSeccion();
            pl.setSize(759,430);
            pl.setLocation(0,0);
        
            BackRegistrarse.removeAll();
            BackRegistrarse.add(pl, BorderLayout.CENTER);
            BackRegistrarse.revalidate();
            BackRegistrarse.repaint();
            
            
            } else {
                JOptionPane.showMessageDialog(this, "Error al registrar el usuario.");
            }
        } else {
            JOptionPane.showMessageDialog(this, "Error al registrar el cliente.");
        }
    }
    // Si el rol seleccionado es "Empleado", insertar en tb_empleado y tb_usuario
    else if (rol.equals("Empleado")) {
    EmpleadoDAO empleadoDAO = new EmpleadoDAO();
    empleado nuevoEmpleado = new empleado(nombre, apellido,correo, telefono);
    
    // Insertar empleado en la tabla tb_empleado
    boolean empleadoInsertado = empleadoDAO.insertar(nuevoEmpleado);
    
    if (empleadoInsertado) {
        // Si el empleado se inserta con éxito, insertar también en tb_usuario
        UsuarioDAO usuarioDAO = new UsuarioDAO();
        usuario nuevoUsuario = new usuario(usuario, password, rol);  // Asegúrate de tener esta clase Usuario definida
        boolean usuarioInsertado = usuarioDAO.insertar(nuevoUsuario);
        
        if (usuarioInsertado) {
            JOptionPane.showMessageDialog(this, "¡Empleado registrado con exito!");
            
        // Mostrar el siguiente formulario
        IniciarSeccion pl = new IniciarSeccion();
        pl.setSize(759,430);
        pl.setLocation(0,0);
        
        BackRegistrarse.removeAll();
        BackRegistrarse.add(pl, BorderLayout.CENTER);
        BackRegistrarse.revalidate();
        BackRegistrarse.repaint();
        
        } else {
            JOptionPane.showMessageDialog(this, "Error al registrar el usuario del empleado.");
        }
    } else {
        JOptionPane.showMessageDialog(this, "Error al registrar el empleado.");
    }
    }
    }//GEN-LAST:event_btnRegistrarActionPerformed
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel BackRegistrarse;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnRegistrar;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField lblAddress;
    private javax.swing.JTextField lblApellido;
    private javax.swing.JTextField lblEmail;
    private javax.swing.JTextField lblNombre;
    private javax.swing.JTextField lblPassword;
    private javax.swing.JTextField lblTelefono;
    private javax.swing.JTextField lblUsuarioName;
    // End of variables declaration//GEN-END:variables
}
