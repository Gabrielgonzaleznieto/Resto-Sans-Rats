package proyecto_restaurante.Formularios;



import proyecto_restaurante.Formularios.*;
import Conexion.conexion;
import java.awt.Color;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;

/**
 *
 * @author gabriel gonzalez
 */
public class ModificarEmpleados extends javax.swing.JFrame {
    
    DefaultTableModel modeloTabla;
    boolean opc = true;
    Empleados f = new Empleados();
    
    public ModificarEmpleados() {

        initComponents();
        this.setLocationRelativeTo(null);
        Toolkit lo = Toolkit.getDefaultToolkit();                                          //AQUI LE DOY UN ICONO AL PROGRAMA.
        setIconImage(lo.getImage(getClass().getResource("/Imagenes/Portada.jpg")));       //AQUI LE DOY UN ICONO AL PROGRAMA.

        Connection conn;
        conn = conexion.getConnection(); //Para tener conexión a la Base de Datos. 
        txt_idempleado.setEnabled(false);
        tabla(); //ACA LLAMO A LA TABLA PARA QUE ME REFLEJE LA INFORMACION ALMACENADA EN LA BASE DE DATOS-
        
         //ACA SE HACE TRANSPARENTE EL JTABLE.
        jTable1.setBackground(new Color(0, 0, 0, 0));
        ((DefaultTableCellRenderer) jTable1.getDefaultRenderer(Object.class)).setBackground(new Color(0, 0, 0, 0));
        jTable1.setGridColor(Color.DARK_GRAY);
        jTable1.setForeground(Color.DARK_GRAY);
        jScrollPane1.setBackground(new Color(0, 0, 0, 0));
        jScrollPane1.setOpaque(false);
        jTable1.setOpaque(false);
        ((DefaultTableCellRenderer) jTable1.getDefaultRenderer(Object.class)).setOpaque(false);
        // jScrollPane1.getViewport().setOpaque(false);
        jTable1.setShowGrid(true);

        //ACA CAMBIO LA LETRA Y EL TAMAÑO Y TAMBIEN AGRANDO O ACHICO LAS COLUMNAS DE LA TABLA.
        jTable1.setFont(new Font("Tahoma", 1, 13));
        TableColumn TableColumn = jTable1.getColumnModel().getColumn(0);
        TableColumn.setPreferredWidth(20);
        TableColumn TableColumn1 = jTable1.getColumnModel().getColumn(1);
        TableColumn1.setPreferredWidth(100);
        TableColumn TableColumn2 = jTable1.getColumnModel().getColumn(2);
        TableColumn2.setPreferredWidth(50);
        TableColumn TableColumn3 = jTable1.getColumnModel().getColumn(3);
        TableColumn3.setPreferredWidth(50);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnSalir = new javax.swing.JButton();
        btnAgregar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtAreaReferencias = new javax.swing.JTextArea();
        txtSueldo = new javax.swing.JTextField();
        txtContraseña = new javax.swing.JTextField();
        txtEdad = new javax.swing.JTextField();
        txtDni = new javax.swing.JTextField();
        txtNombre = new javax.swing.JTextField();
        txt_idempleado = new javax.swing.JTextField();
        txtMesasAsignadas = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jPanel9 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        txtrango = new javax.swing.JTextField();
        jPanel10 = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        jPanel11 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        txtTelefono = new javax.swing.JTextField();
        txtMail = new javax.swing.JTextField();
        btnMODIFICAR = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        btnACTUALIZAR = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnSalir.setFont(new java.awt.Font("Segoe UI Black", 1, 20)); // NOI18N
        btnSalir.setText("REGRESAR");
        btnSalir.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });
        getContentPane().add(btnSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 340, 260, 40));

        btnAgregar.setFont(new java.awt.Font("Segoe UI Black", 1, 20)); // NOI18N
        btnAgregar.setText("AGREGAR");
        btnAgregar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });
        getContentPane().add(btnAgregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 340, 250, 40));

        txtAreaReferencias.setBackground(new java.awt.Color(227, 227, 227));
        txtAreaReferencias.setColumns(20);
        txtAreaReferencias.setRows(5);
        jScrollPane1.setViewportView(txtAreaReferencias);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 230, 250, 80));

        txtSueldo.setBackground(new java.awt.Color(227, 227, 227));
        txtSueldo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtSueldoKeyTyped(evt);
            }
        });
        getContentPane().add(txtSueldo, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 180, 260, 40));

        txtContraseña.setBackground(new java.awt.Color(227, 227, 227));
        getContentPane().add(txtContraseña, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 230, 240, 40));

        txtEdad.setBackground(new java.awt.Color(227, 227, 227));
        txtEdad.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtEdadKeyTyped(evt);
            }
        });
        getContentPane().add(txtEdad, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 180, 240, 40));

        txtDni.setBackground(new java.awt.Color(227, 227, 227));
        txtDni.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtDniKeyTyped(evt);
            }
        });
        getContentPane().add(txtDni, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 130, 240, 40));

        txtNombre.setBackground(new java.awt.Color(227, 227, 227));
        txtNombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNombreKeyTyped(evt);
            }
        });
        getContentPane().add(txtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 80, 240, 40));

        txt_idempleado.setBackground(new java.awt.Color(227, 227, 227));
        getContentPane().add(txt_idempleado, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 30, 70, 40));

        txtMesasAsignadas.setBackground(new java.awt.Color(227, 227, 227));
        txtMesasAsignadas.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtMesasAsignadasKeyTyped(evt);
            }
        });
        getContentPane().add(txtMesasAsignadas, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 280, 240, 40));

        jPanel1.setBackground(new java.awt.Color(227, 227, 227));

        jLabel6.setFont(new java.awt.Font("Segoe Script", 1, 23)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(102, 102, 102));
        jLabel6.setText("ID_EMPLEADO");
        jPanel1.add(jLabel6);

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, 280, 40));

        jPanel2.setBackground(new java.awt.Color(227, 227, 227));

        jLabel2.setFont(new java.awt.Font("Segoe Script", 1, 21)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(102, 102, 102));
        jLabel2.setText("NOMBRE Y APELLIDO");
        jPanel2.add(jLabel2);

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 80, 280, 40));

        jPanel3.setBackground(new java.awt.Color(227, 227, 227));

        jLabel5.setFont(new java.awt.Font("Segoe Script", 1, 23)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(102, 102, 102));
        jLabel5.setText("REFERENCIAS");
        jPanel3.add(jLabel5);

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 250, 190, 40));

        jPanel4.setBackground(new java.awt.Color(227, 227, 227));

        jLabel3.setFont(new java.awt.Font("Segoe Script", 1, 21)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(102, 102, 102));
        jLabel3.setText("NUMERO DOCUMENTO");
        jPanel4.add(jLabel3);

        getContentPane().add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 130, 280, 40));

        jPanel5.setBackground(new java.awt.Color(227, 227, 227));
        jPanel5.setForeground(new java.awt.Color(102, 102, 102));

        jLabel7.setFont(new java.awt.Font("Segoe Script", 1, 23)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(102, 102, 102));
        jLabel7.setText("SUELDO");
        jPanel5.add(jLabel7);

        getContentPane().add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 180, 150, 40));

        jPanel6.setBackground(new java.awt.Color(227, 227, 227));

        jLabel4.setFont(new java.awt.Font("Segoe Script", 1, 23)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(102, 102, 102));
        jLabel4.setText("EDAD");
        jPanel6.add(jLabel4);

        getContentPane().add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 180, 280, 40));

        jPanel7.setBackground(new java.awt.Color(227, 227, 227));

        jLabel10.setFont(new java.awt.Font("Segoe Script", 1, 23)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(102, 102, 102));
        jLabel10.setText("MESAS ASIGNADAS");
        jPanel7.add(jLabel10);

        getContentPane().add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 280, 280, 40));

        jPanel8.setBackground(new java.awt.Color(227, 227, 227));

        jLabel8.setFont(new java.awt.Font("Segoe Script", 1, 23)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(102, 102, 102));
        jLabel8.setText("CONTRASEÑA");
        jPanel8.add(jLabel8);

        getContentPane().add(jPanel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 230, 280, 40));

        jPanel9.setBackground(new java.awt.Color(227, 227, 227));

        jLabel11.setFont(new java.awt.Font("Segoe Script", 1, 23)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(102, 102, 102));
        jLabel11.setText("RANGO");
        jPanel9.add(jLabel11);

        getContentPane().add(jPanel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 130, 150, 40));

        txtrango.setBackground(new java.awt.Color(227, 227, 227));
        txtrango.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtrangoKeyTyped(evt);
            }
        });
        getContentPane().add(txtrango, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 130, 260, 40));

        jPanel10.setBackground(new java.awt.Color(227, 227, 227));

        jLabel13.setFont(new java.awt.Font("Segoe Script", 1, 23)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(102, 102, 102));
        jLabel13.setText("E_MAIL");
        jPanel10.add(jLabel13);

        getContentPane().add(jPanel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 80, 150, 40));

        jPanel11.setBackground(new java.awt.Color(227, 227, 227));

        jLabel12.setFont(new java.awt.Font("Segoe Script", 1, 23)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(102, 102, 102));
        jLabel12.setText("TELEFONO");
        jPanel11.add(jLabel12);

        getContentPane().add(jPanel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 30, 150, 40));

        txtTelefono.setBackground(new java.awt.Color(227, 227, 227));
        getContentPane().add(txtTelefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 30, 260, 40));

        txtMail.setBackground(new java.awt.Color(227, 227, 227));
        getContentPane().add(txtMail, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 80, 260, 40));

        btnMODIFICAR.setFont(new java.awt.Font("Segoe UI Black", 1, 20)); // NOI18N
        btnMODIFICAR.setText("MODIFICAR");
        btnMODIFICAR.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnMODIFICAR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMODIFICARActionPerformed(evt);
            }
        });
        getContentPane().add(btnMODIFICAR, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 340, 260, 40));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane2.setViewportView(jTable1);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 380, 1020, 170));

        btnACTUALIZAR.setFont(new java.awt.Font("Segoe UI Black", 1, 20)); // NOI18N
        btnACTUALIZAR.setText("ACTUALIZAR");
        btnACTUALIZAR.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(btnACTUALIZAR, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 340, 250, 40));

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/FondoM.png"))); // NOI18N
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1100, 580));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        dispose();
    }//GEN-LAST:event_btnSalirActionPerformed

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed

        String nomb, ref, contr, mesas,rango, tel, mail;
        int dni, edad;
        double sueld;

        nomb = txtNombre.getText();
        dni = Integer.parseInt(txtDni.getText());
        edad = Integer.parseInt(txtEdad.getText());
        ref = txtAreaReferencias.getText();
        sueld = Double.parseDouble(txtSueldo.getText());
        contr = txtContraseña.getText();
        mesas = txtMesasAsignadas.getText();
        rango = txtrango.getText();
        tel = txtTelefono.getText();
        mail = txtMail.getText();

        Connection conn = conexion.getConnection(); //Para tener conexión a la Base de Datos.

        String sql = "INSERT INTO empleados(id_empleado,nombre,dni,edad,referencias,sueldo,contraseña,mesas,rango,telefono,e_mail) VALUES (?,?,?,?,?,?,?,?,?,?,?)";

        try {
            PreparedStatement pst = conn.prepareStatement(sql);
            pst.setString(1, null);
            pst.setString(2, nomb);
            pst.setInt(3, dni);
            pst.setInt(4, edad);
            pst.setString(5, ref);
            pst.setDouble(6, sueld);
            pst.setString(7, contr);
            pst.setString(8, mesas);
            pst.setString(9, rango);
            pst.setString(10, tel);
            pst.setString(11, mail);

            int n = pst.executeUpdate();

            if (n > 0) {
                JOptionPane.showMessageDialog(this, "Empleado registrado");
                txtNombre.setText("");
                txtDni.setText("");
                txtEdad.setText("");
                txtSueldo.setText("");
                txtAreaReferencias.setText("");
                txtContraseña.setText("");
                txtMesasAsignadas.setText("");
                txtrango.setText("");
                txtTelefono.setText("");
                txtMail.setText("");         
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "El error es:" + e.getMessage());
        }

    }//GEN-LAST:event_btnAgregarActionPerformed

    private void txtNombreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNombreKeyTyped

        char a = evt.getKeyChar();                               //VALIDACION SOLO LETRAS.
        if (Character.isDigit(a)) {
            Toolkit.getDefaultToolkit().beep();
            evt.consume();
        }
    }//GEN-LAST:event_txtNombreKeyTyped

    private void txtDniKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDniKeyTyped

        char a = evt.getKeyChar();           //VALIDACION SOLO NUMEROS.
        if (!Character.isDigit(a)) {
            Toolkit.getDefaultToolkit().beep();
            evt.consume();
        }
    }//GEN-LAST:event_txtDniKeyTyped

    private void txtEdadKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtEdadKeyTyped

        char a = evt.getKeyChar();           //VALIDACION SOLO NUMEROS.
        if (!Character.isDigit(a)) {
            Toolkit.getDefaultToolkit().beep();
            evt.consume();
        }
    }//GEN-LAST:event_txtEdadKeyTyped

    private void txtSueldoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSueldoKeyTyped

        char a = evt.getKeyChar();           //VALIDACION SOLO NUMEROS.
        if (!Character.isDigit(a)) {
            Toolkit.getDefaultToolkit().beep();
            evt.consume();
        }
    }//GEN-LAST:event_txtSueldoKeyTyped

    private void txtMesasAsignadasKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtMesasAsignadasKeyTyped
/*
        char a = evt.getKeyChar();           //VALIDACION SOLO NUMEROS.
        if (!Character.isDigit(a)) {
            Toolkit.getDefaultToolkit().beep();
            evt.consume();
        }  */
    }//GEN-LAST:event_txtMesasAsignadasKeyTyped

    private void txtrangoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtrangoKeyTyped
      
        char a = evt.getKeyChar();                               //VALIDACION SOLO LETRAS.
        if (Character.isDigit(a)) {
            Toolkit.getDefaultToolkit().beep();
            evt.consume();
        }
        char c = evt.getKeyChar();
        if(Character.isLowerCase(c)){                      //VALIDACION SOLO LETRAS EN MAYUSCULAS.
            String cad=(""+c).toUpperCase();
            c=cad.charAt(0);
            evt.setKeyChar(c);
        }     
        
    }//GEN-LAST:event_txtrangoKeyTyped

    private void btnMODIFICARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMODIFICARActionPerformed
       
        int Fila = jTable1.getSelectedRow(); // ACA SELECCIONO LA FILA A MODIFICAR PERTENECIENTE A LA TABLA.

        if (Fila >= 0) {

            txtNombre.setText(jTable1.getValueAt(Fila, 1).toString());
            txtDni.setText(jTable1.getValueAt(Fila, 2).toString());
            txtEdad.setText(jTable1.getValueAt(Fila, 3).toString());
            txtAreaReferencias.setText(jTable1.getValueAt(Fila, 4).toString());
            txtSueldo.setText(jTable1.getValueAt(Fila, 5).toString());
            txtContraseña.setText(jTable1.getValueAt(Fila, 6).toString());
            txtMesasAsignadas.setText(jTable1.getValueAt(Fila, 7).toString());
            txtrango.setText(jTable1.getValueAt(Fila, 8).toString());
            txtTelefono.setText(jTable1.getValueAt(Fila, 9).toString());
            txtMail.setText(jTable1.getValueAt(Fila, 10).toString());

        } else{}
              
        
    }//GEN-LAST:event_btnMODIFICARActionPerformed

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
            java.util.logging.Logger.getLogger(ModificarEmpleados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ModificarEmpleados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ModificarEmpleados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ModificarEmpleados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ModificarEmpleados().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnACTUALIZAR;
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnMODIFICAR;
    private javax.swing.JButton btnSalir;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextArea txtAreaReferencias;
    private javax.swing.JTextField txtContraseña;
    private javax.swing.JTextField txtDni;
    private javax.swing.JTextField txtEdad;
    private javax.swing.JTextField txtMail;
    private javax.swing.JTextField txtMesasAsignadas;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtSueldo;
    private javax.swing.JTextField txtTelefono;
    private javax.swing.JTextField txt_idempleado;
    private javax.swing.JTextField txtrango;
    // End of variables declaration//GEN-END:variables
 private void tabla() {

        DefaultTableModel modelotabla = new DefaultTableModel();
        ResultSet rs = conexion.getTabla("SELECT * FROM empleados");
        modelotabla.setColumnIdentifiers(new Object[]{"id_empleado", "Nombre", "Dni", "Edad", "Referencias", "Sueldo", "Contraseña", "Mesas", "rango", "telefono", "e_mail"});
        try {
            while (rs.next()) {
                modelotabla.addRow(new Object[]{rs.getString("id_empleado"), rs.getString("nombre"), rs.getString("dni"), rs.getString("edad"), rs.getString("referencias"), rs.getString("sueldo"), rs.getString("contraseña"), rs.getString("mesas"), rs.getString("rango"), rs.getString("telefono"), rs.getString("e_mail")});
            }
            jTable1.setModel(modelotabla);
        } catch (Exception e) {
            System.out.println(e);
        }
    }

}

