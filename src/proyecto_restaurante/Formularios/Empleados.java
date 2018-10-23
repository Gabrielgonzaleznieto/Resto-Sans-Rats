package proyecto_restaurante.Formularios;

import Conexion.conexion;
import java.awt.Toolkit;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author gabriel gonzalez
 */
public class Empleados extends javax.swing.JFrame {

    public Empleados() {

        initComponents();
        this.setLocationRelativeTo(null);
        Toolkit lo = Toolkit.getDefaultToolkit();                                          //AQUI LE DOY UN ICONO AL PROGRAMA.
        setIconImage(lo.getImage(getClass().getResource("/Imagenes/Portada.jpg")));       //AQUI LE DOY UN ICONO AL PROGRAMA.

        Connection conn;
        conn = conexion.getConnection(); //Para tener conexión a la Base de Datos. 
        txt_idempleado.setEnabled(false);
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
        jLabel1 = new javax.swing.JLabel();
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
        jLabel9 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnSalir.setFont(new java.awt.Font("Segoe UI Black", 1, 20)); // NOI18N
        btnSalir.setText("REGRESAR");
        btnSalir.setBorder(javax.swing.BorderFactory.createEtchedBorder(java.awt.Color.black, null));
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });
        getContentPane().add(btnSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 490, 160, 50));

        btnAgregar.setFont(new java.awt.Font("Segoe UI Black", 1, 20)); // NOI18N
        btnAgregar.setText("AGREGAR");
        btnAgregar.setBorder(javax.swing.BorderFactory.createEtchedBorder(java.awt.Color.black, null));
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });
        getContentPane().add(btnAgregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 490, 160, 50));

        txtAreaReferencias.setBackground(new java.awt.Color(227, 227, 227));
        txtAreaReferencias.setColumns(20);
        txtAreaReferencias.setRows(5);
        jScrollPane1.setViewportView(txtAreaReferencias);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 310, 250, 140));

        txtSueldo.setBackground(new java.awt.Color(227, 227, 227));
        txtSueldo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtSueldoKeyTyped(evt);
            }
        });
        getContentPane().add(txtSueldo, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 250, 270, 40));

        txtContraseña.setBackground(new java.awt.Color(227, 227, 227));
        getContentPane().add(txtContraseña, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 370, 240, 40));

        txtEdad.setBackground(new java.awt.Color(227, 227, 227));
        txtEdad.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtEdadKeyTyped(evt);
            }
        });
        getContentPane().add(txtEdad, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 310, 240, 40));

        txtDni.setBackground(new java.awt.Color(227, 227, 227));
        txtDni.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtDniKeyTyped(evt);
            }
        });
        getContentPane().add(txtDni, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 250, 240, 40));

        txtNombre.setBackground(new java.awt.Color(227, 227, 227));
        txtNombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNombreKeyTyped(evt);
            }
        });
        getContentPane().add(txtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 190, 240, 40));

        jLabel1.setFont(new java.awt.Font("Segoe Script", 1, 35)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(102, 102, 102));
        jLabel1.setText("REGISTRE UN NUEVO EMPLEADO:");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 40, 700, 50));

        txt_idempleado.setBackground(new java.awt.Color(227, 227, 227));
        getContentPane().add(txt_idempleado, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 130, 70, 40));

        txtMesasAsignadas.setBackground(new java.awt.Color(227, 227, 227));
        txtMesasAsignadas.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtMesasAsignadasKeyTyped(evt);
            }
        });
        getContentPane().add(txtMesasAsignadas, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 430, 240, 40));

        jPanel1.setBackground(new java.awt.Color(227, 227, 227));

        jLabel6.setFont(new java.awt.Font("Segoe Script", 1, 23)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(102, 102, 102));
        jLabel6.setText("ID_EMPLEADO");
        jPanel1.add(jLabel6);

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 130, 280, 40));

        jPanel2.setBackground(new java.awt.Color(227, 227, 227));

        jLabel2.setFont(new java.awt.Font("Segoe Script", 1, 21)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(102, 102, 102));
        jLabel2.setText("NOMBRE Y APELLIDO");
        jPanel2.add(jLabel2);

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 190, 280, 40));

        jPanel3.setBackground(new java.awt.Color(227, 227, 227));

        jLabel5.setFont(new java.awt.Font("Segoe Script", 1, 23)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(102, 102, 102));
        jLabel5.setText("REFERENCIAS");
        jPanel3.add(jLabel5);

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 370, 190, 40));

        jPanel4.setBackground(new java.awt.Color(227, 227, 227));

        jLabel3.setFont(new java.awt.Font("Segoe Script", 1, 21)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(102, 102, 102));
        jLabel3.setText("NUMERO DOCUMENTO");
        jPanel4.add(jLabel3);

        getContentPane().add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 250, 280, 40));

        jPanel5.setBackground(new java.awt.Color(227, 227, 227));
        jPanel5.setForeground(new java.awt.Color(102, 102, 102));

        jLabel7.setFont(new java.awt.Font("Segoe Script", 1, 23)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(102, 102, 102));
        jLabel7.setText("SUELDO");
        jPanel5.add(jLabel7);

        getContentPane().add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 250, 140, 40));

        jPanel6.setBackground(new java.awt.Color(227, 227, 227));

        jLabel4.setFont(new java.awt.Font("Segoe Script", 1, 23)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(102, 102, 102));
        jLabel4.setText("EDAD");
        jPanel6.add(jLabel4);

        getContentPane().add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 310, 280, 40));

        jPanel7.setBackground(new java.awt.Color(227, 227, 227));

        jLabel10.setFont(new java.awt.Font("Segoe Script", 1, 23)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(102, 102, 102));
        jLabel10.setText("MESAS ASIGNADAS");
        jPanel7.add(jLabel10);

        getContentPane().add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 430, 280, 40));

        jPanel8.setBackground(new java.awt.Color(227, 227, 227));

        jLabel8.setFont(new java.awt.Font("Segoe Script", 1, 23)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(102, 102, 102));
        jLabel8.setText("CONTRASEÑA");
        jPanel8.add(jLabel8);

        getContentPane().add(jPanel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 370, 280, 40));

        jPanel9.setBackground(new java.awt.Color(227, 227, 227));

        jLabel11.setFont(new java.awt.Font("Segoe Script", 1, 23)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(102, 102, 102));
        jLabel11.setText("RANGO");
        jPanel9.add(jLabel11);

        getContentPane().add(jPanel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 190, 140, 40));

        txtrango.setBackground(new java.awt.Color(227, 227, 227));
        txtrango.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtrangoKeyTyped(evt);
            }
        });
        getContentPane().add(txtrango, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 190, 270, 40));

        jPanel10.setBackground(new java.awt.Color(227, 227, 227));

        jLabel13.setFont(new java.awt.Font("Segoe Script", 1, 23)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(102, 102, 102));
        jLabel13.setText("E_MAIL");
        jPanel10.add(jLabel13);

        getContentPane().add(jPanel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 130, 140, 40));

        jPanel11.setBackground(new java.awt.Color(227, 227, 227));

        jLabel12.setFont(new java.awt.Font("Segoe Script", 1, 23)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(102, 102, 102));
        jLabel12.setText("NUMERO TELEFONO");
        jPanel11.add(jLabel12);

        getContentPane().add(jPanel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(28, 490, 280, 40));

        txtTelefono.setBackground(new java.awt.Color(227, 227, 227));
        getContentPane().add(txtTelefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 490, 240, 40));

        txtMail.setBackground(new java.awt.Color(227, 227, 227));
        getContentPane().add(txtMail, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 130, 270, 40));

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Fondoproye.png"))); // NOI18N
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
            java.util.logging.Logger.getLogger(Empleados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Empleados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Empleados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Empleados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Empleados().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnSalir;
    private javax.swing.JLabel jLabel1;
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
}
