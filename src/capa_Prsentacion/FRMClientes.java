package capa_Prsentacion;

import capa_Datos.Cliente;
import capa_Negocio.Ctrl_Cliente;
import java.text.DecimalFormat;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author mikey
 */
public class FRMClientes extends javax.swing.JFrame {
// PROBANDOOOOOOOOOO
    private String accion = "guardar";
    
    public FRMClientes() {
        initComponents();
        mostrar("");
        inhabilitarCampos();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        txtApellidos = new javax.swing.JTextField();
        txtDNI = new javax.swing.JTextField();
        txtRUC = new javax.swing.JTextField();
        txtTelefono = new javax.swing.JTextField();
        txtDireccion = new javax.swing.JTextField();
        txtEdad = new javax.swing.JTextField();
        txtIDCliente = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        cboSexo = new javax.swing.JComboBox<>();
        jPanel2 = new javax.swing.JPanel();
        btnEditar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();
        btnGuardar = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        txtBuscarDNI = new javax.swing.JTextField();
        btnBuscar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblClientes = new javax.swing.JTable();
        lblAtras = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(102, 255, 102));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(41, 43, 45)), "Datos", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 0, 14), new java.awt.Color(0, 0, 0))); // NOI18N
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setBackground(new java.awt.Color(102, 255, 102));
        jLabel1.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel1.setText("Nombre:");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, 80, -1));

        jLabel2.setBackground(new java.awt.Color(102, 255, 102));
        jLabel2.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel2.setText("Apellidos:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 140, 80, -1));

        jLabel3.setBackground(new java.awt.Color(102, 255, 102));
        jLabel3.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel3.setText("Edad:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 190, 80, -1));

        jLabel4.setBackground(new java.awt.Color(102, 255, 102));
        jLabel4.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel4.setText("RUC:");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 90, 50, -1));

        jLabel5.setBackground(new java.awt.Color(102, 255, 102));
        jLabel5.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel5.setText("DNI:");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 40, 40, -1));

        jLabel6.setBackground(new java.awt.Color(102, 255, 102));
        jLabel6.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel6.setText("Sexo:");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 190, 50, -1));

        jLabel7.setBackground(new java.awt.Color(102, 255, 102));
        jLabel7.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel7.setText("Teléfono:");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 140, 80, -1));

        jLabel8.setBackground(new java.awt.Color(102, 255, 102));
        jLabel8.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 0, 0));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel8.setText("ID:");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, 80, -1));

        txtNombre.setBackground(new java.awt.Color(255, 255, 255));
        txtNombre.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        txtNombre.setForeground(new java.awt.Color(0, 0, 0));
        txtNombre.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel1.add(txtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 90, 130, 30));

        txtApellidos.setBackground(new java.awt.Color(255, 255, 255));
        txtApellidos.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        txtApellidos.setForeground(new java.awt.Color(0, 0, 0));
        txtApellidos.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel1.add(txtApellidos, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 140, 130, 30));

        txtDNI.setBackground(new java.awt.Color(255, 255, 255));
        txtDNI.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        txtDNI.setForeground(new java.awt.Color(0, 0, 0));
        txtDNI.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel1.add(txtDNI, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 40, 130, 30));

        txtRUC.setBackground(new java.awt.Color(255, 255, 255));
        txtRUC.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        txtRUC.setForeground(new java.awt.Color(0, 0, 0));
        txtRUC.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel1.add(txtRUC, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 90, 130, 30));

        txtTelefono.setBackground(new java.awt.Color(255, 255, 255));
        txtTelefono.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        txtTelefono.setForeground(new java.awt.Color(0, 0, 0));
        txtTelefono.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel1.add(txtTelefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 140, 130, 30));

        txtDireccion.setBackground(new java.awt.Color(255, 255, 255));
        txtDireccion.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        txtDireccion.setForeground(new java.awt.Color(0, 0, 0));
        txtDireccion.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel1.add(txtDireccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 190, 130, 30));

        txtEdad.setBackground(new java.awt.Color(255, 255, 255));
        txtEdad.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        txtEdad.setForeground(new java.awt.Color(0, 0, 0));
        txtEdad.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel1.add(txtEdad, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 190, 70, 30));

        txtIDCliente.setBackground(new java.awt.Color(255, 255, 255));
        txtIDCliente.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        txtIDCliente.setForeground(new java.awt.Color(0, 0, 0));
        txtIDCliente.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel1.add(txtIDCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 40, 130, 30));

        jLabel10.setBackground(new java.awt.Color(102, 255, 102));
        jLabel10.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 0, 0));
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel10.setText("Dirección:");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 190, 80, -1));

        cboSexo.setBackground(new java.awt.Color(255, 255, 255));
        cboSexo.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        cboSexo.setForeground(new java.awt.Color(0, 0, 0));
        cboSexo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "M", "F" }));
        jPanel1.add(cboSexo, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 190, 50, 30));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 550, 250));

        jPanel2.setBackground(new java.awt.Color(102, 255, 102));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(41, 43, 45)), "Opciones", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 0, 14), new java.awt.Color(0, 0, 0))); // NOI18N
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnEditar.setBackground(new java.awt.Color(102, 102, 255));
        btnEditar.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        btnEditar.setForeground(new java.awt.Color(255, 255, 255));
        btnEditar.setText("Editar");
        btnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarActionPerformed(evt);
            }
        });
        jPanel2.add(btnEditar, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 80, 100, 35));

        btnEliminar.setBackground(new java.awt.Color(255, 0, 0));
        btnEliminar.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        btnEliminar.setForeground(new java.awt.Color(255, 255, 255));
        btnEliminar.setText("Eliminar");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });
        jPanel2.add(btnEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 130, 100, 35));

        btnSalir.setBackground(new java.awt.Color(0, 0, 255));
        btnSalir.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        btnSalir.setForeground(new java.awt.Color(0, 0, 0));
        btnSalir.setText("Salir");
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });
        jPanel2.add(btnSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 180, 100, 35));

        btnGuardar.setBackground(new java.awt.Color(51, 255, 255));
        btnGuardar.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        btnGuardar.setForeground(new java.awt.Color(255, 255, 255));
        btnGuardar.setText("Guardar");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });
        jPanel2.add(btnGuardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, 100, 35));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 20, 160, 250));

        jLabel9.setBackground(new java.awt.Color(102, 255, 102));
        jLabel9.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 0, 0));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel9.setText("Buscar DNI:");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 300, 110, -1));

        txtBuscarDNI.setBackground(new java.awt.Color(255, 255, 255));
        txtBuscarDNI.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        txtBuscarDNI.setForeground(new java.awt.Color(0, 0, 0));
        txtBuscarDNI.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtBuscarDNI.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        getContentPane().add(txtBuscarDNI, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 300, 130, 30));

        btnBuscar.setBackground(new java.awt.Color(255, 255, 0));
        btnBuscar.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        btnBuscar.setForeground(new java.awt.Color(255, 255, 255));
        btnBuscar.setText("Buscar");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });
        getContentPane().add(btnBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 300, 100, 35));

        tblClientes.setBackground(new java.awt.Color(255, 255, 255));
        tblClientes.setFont(new java.awt.Font("Arial", 0, 115)); // NOI18N
        tblClientes.setForeground(new java.awt.Color(0, 0, 0));
        tblClientes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tblClientes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblClientesMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblClientes);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 350, 670, 240));

        lblAtras.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/fondo4_SV.png"))); // NOI18N
        getContentPane().add(lblAtras, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 600));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
        accion = "guardar";
        btnGuardar.setText("Guardar");
        limpiarCampos();
        habilitarCampos();
        generateID();
    }//GEN-LAST:event_btnEditarActionPerformed

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        if (txtNombre.getText().length() == 0) {
            JOptionPane.showInternalConfirmDialog(rootPane, "Ingrese el nombre del Cliente");
            txtNombre.requestFocus();
            return;
        }
        
        if (txtApellidos.getText().length() == 0) {
            JOptionPane.showInternalConfirmDialog(rootPane, "Ingrese los apellidos del Cliente");
            txtApellidos.requestFocus();
            return;
        }
        
        if (txtEdad.getText().length() == 0) {
            JOptionPane.showInternalConfirmDialog(rootPane, "Ingrese la edad del Cliente");
            txtEdad.requestFocus();
            return;
        }
        
        if (txtDNI.getText().length() == 0) {
            JOptionPane.showInternalConfirmDialog(rootPane, "Ingrese el DNI del Cliente");
            txtDNI.requestFocus();
            return;
        }
        
        if (txtDireccion.getText().length() == 0) {
            JOptionPane.showInternalConfirmDialog(rootPane, "Ingrese la direccion del Cliente");
            txtDireccion.requestFocus();
            return;
        }
        
        Cliente cliente = new Cliente();
        Ctrl_Cliente controladorCliente = new Ctrl_Cliente();
        
        cliente.setID(txtIDCliente.getText());
        cliente.setNombre(txtNombre.getText());
        cliente.setApellidos(txtApellidos.getText());
        cliente.setDni(txtDNI.getText());
        cliente.setRuc(txtRUC.getText());
        cliente.setEdad(Integer.parseInt(txtEdad.getText()));
        int cboSelrccionado = cboSexo.getSelectedIndex();
        cliente.setSexo((String) cboSexo.getItemAt(cboSelrccionado));
        cliente.setTelefono(txtTelefono.getText());
        cliente.setDireccion(txtDireccion.getText());
        
        if (accion.equals("guardar")) {
            if (controladorCliente.insertarCliente(cliente)) {
                JOptionPane.showConfirmDialog(rootPane, "Cliente se Guardo con Exito");
                mostrar("");
                limpiarCampos();
                inhabilitarCampos();
            }
        }else if (accion.equals("editar")){
            if (controladorCliente.editarCliente(cliente)) {
                JOptionPane.showConfirmDialog(rootPane, "Cliente se Edito con Exito");
                mostrar("");
                limpiarCampos();
                inhabilitarCampos();
            }
        }
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        Cliente cliente = new Cliente();
        Ctrl_Cliente controladorCliente = new Ctrl_Cliente();
        
        if (!txtIDCliente.getText().equals("")) {
            int confirmar = JOptionPane.showConfirmDialog(rootPane, "Desea Eliminar el Cliente", "Confirmarmación", 2);
            if (confirmar == 0) {
                cliente.setID(txtIDCliente.getText());
                controladorCliente.eliminarCliente(cliente);
                mostrar("");
                inhabilitarCampos();
            }
        }
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        dispose();
    }//GEN-LAST:event_btnSalirActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        mostrar(txtBuscarDNI.getText());
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void tblClientesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblClientesMouseClicked
        btnGuardar.setText("Editar");
        habilitarCampos();
        btnEliminar.setEnabled(true);
        accion = "editar";
        
        int fila = tblClientes.rowAtPoint(evt.getPoint());
        txtIDCliente.setText(tblClientes.getValueAt(fila, 0).toString());
        txtNombre.setText(tblClientes.getValueAt(fila, 1).toString());
        txtApellidos.setText(tblClientes.getValueAt(fila, 2).toString());
        txtDNI.setText(tblClientes.getValueAt(fila, 3).toString());
        txtRUC.setText(tblClientes.getValueAt(fila, 4).toString());
        txtEdad.setText(tblClientes.getValueAt(fila, 5).toString());
        cboSexo.setSelectedItem(tblClientes.getValueAt(fila, 6).toString());
        txtTelefono.setText(tblClientes.getValueAt(fila, 7).toString());
        txtDireccion.setText(tblClientes.getValueAt(fila, 8).toString());
        
    }//GEN-LAST:event_tblClientesMouseClicked
    
    public void mostrar(String buscar){
        try {
            DefaultTableModel dtm;
            Ctrl_Cliente cliente = new Ctrl_Cliente();
            dtm = cliente.mostrarEnLaTabla(buscar);
            tblClientes.setModel(dtm);
        } catch (Exception e) {
            JOptionPane.showConfirmDialog(rootPane, e);
        }
    }
    
    private void generateID(){
        Ctrl_Cliente cliente = new Ctrl_Cliente();
        DecimalFormat formato = new DecimalFormat("0000");
        txtIDCliente.setText(formato.format(cliente.generarIDCliente()));
    }
    
    public void inhabilitarCampos(){
        txtIDCliente.setEnabled(false);
        txtNombre.setEnabled(false);
        txtApellidos.setEnabled(false);
        txtRUC.setEnabled(false);
        txtDNI.setEnabled(false);
        txtEdad.setEnabled(false);
        cboSexo.setEnabled(false);
        txtTelefono.setEnabled(false);
        txtDireccion.setEnabled(false);
        txtBuscarDNI.setEnabled(false);
        btnGuardar.setEnabled(false);
        btnEditar.setEnabled(true);
        btnEliminar.setEnabled(false);
        btnBuscar.setEnabled(false);
        btnSalir.setEnabled(true);
    }
    
        public void habilitarCampos(){
        txtIDCliente.setEnabled(true);
        txtNombre.setEnabled(true);
        txtApellidos.setEnabled(true);
        txtRUC.setEnabled(true);
        txtDNI.setEnabled(true);
        txtEdad.setEnabled(true);
        cboSexo.setEnabled(true);
        txtTelefono.setEnabled(true);
        txtDireccion.setEnabled(true);
        txtBuscarDNI.setEnabled(true);
        btnGuardar.setEnabled(true);
        btnEliminar.setEnabled(true);
        btnBuscar.setEnabled(true);
    }
        
    public void limpiarCampos(){
        txtIDCliente.setText("");
        txtNombre.setText("");
        txtApellidos.setText("");
        txtEdad.setText("");
        cboSexo.setSelectedIndex(0);
        txtRUC.setText("");
        txtDNI.setText("");
        txtTelefono.setText("");
        txtDireccion.setText("");
    }    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
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
            java.util.logging.Logger.getLogger(FRMClientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FRMClientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FRMClientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FRMClientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FRMClientes().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnSalir;
    private javax.swing.JComboBox<String> cboSexo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblAtras;
    private javax.swing.JTable tblClientes;
    private javax.swing.JTextField txtApellidos;
    private javax.swing.JTextField txtBuscarDNI;
    private javax.swing.JTextField txtDNI;
    private javax.swing.JTextField txtDireccion;
    private javax.swing.JTextField txtEdad;
    private javax.swing.JTextField txtIDCliente;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtRUC;
    private javax.swing.JTextField txtTelefono;
    // End of variables declaration//GEN-END:variables
}
