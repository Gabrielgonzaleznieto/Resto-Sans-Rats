package proyecto_restaurante.Formularios;

import Conexion.conexion;
import java.awt.Cursor;
import java.awt.HeadlessException;
import java.awt.Point;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.Timer;
import proyecto_restaurante.Formularios.DerivadorAdmin;
import proyecto_restaurante.Formularios.DerivadorEmpleados;

/**
 *
 * @author gabriel gonzalez
 */
public class InicioLogin extends javax.swing.JFrame {


    public InicioLogin() {

        initComponents();

        this.setLocationRelativeTo(null);                                                   // CON ESTA SENTENCIA EL FRAME APARECE CENTRADO.  
        Toolkit lo = Toolkit.getDefaultToolkit();                                          //AQUI LE DOY UN ICONO AL PROGRAMA.
        setIconImage(lo.getImage(getClass().getResource("/Imagenes/Portada.jpg")));       //AQUI LE DOY UN ICONO AL PROGRAMA.

        //cursores();
    }

    /* public void cursores() {
        Cursor cursor;
        ImageIcon imagen = new ImageIcon("src\\Imagenes\\Cursor.png");
        Toolkit t = Toolkit.getDefaultToolkit();
        cursor =t.createCustomCursor(imagen.getImage(), new Point(1,1),"Cursor");
        setCursor(cursor);
    } */
 

    private void validar() {

        String contr, documento, id_empleado = null, nombre = null, dni = null, edad = null, referencias = null, sueldo = null, pass = null, mesas = null, rango = null;

        documento = txtusuario.getText();
        contr = txtcontraseña.getText();

        Connection conn;
        conn = conexion.getConnection();
        ResultSet rs;
      

        String sql = "SELECT * FROM empleados WHERE dni='" + documento + "' and contraseña='" + contr + "' ";

        if (txtcontraseña.getText().equals("")) {

            JOptionPane.showMessageDialog(null, "INTRODUCE UNA CONTRASEÑA", "Error", JOptionPane.WARNING_MESSAGE);

        } else {

            try {
                Statement stmt = conn.createStatement();
                rs = stmt.executeQuery(sql);
                rs.beforeFirst();
                rs.next();
                id_empleado = rs.getString(1);
                nombre = rs.getString(2);
                dni = rs.getString(3);
                edad = rs.getString(4);
                referencias = rs.getString(5);
                sueldo = rs.getString(6);
                pass = rs.getString(7);
                mesas = rs.getString(8);
                rango = rs.getString(9);

                if (contr.equals(pass)) {
                    switch (rango) {
                        case "EMPLEADO":
                            DerivadorEmpleados emple = new DerivadorEmpleados();
                            emple.setVisible(true);
                            setVisible(false);
                            break;
                        case "ADMINISTRADOR":
                            DerivadorAdmin adm = new DerivadorAdmin();
                            adm.setVisible(true);
                            setVisible(false);
                            break;
                        default:
                            break;
                    }

                }

               
                
            } catch (SQLException ex) {

                Logger.getLogger(CargarPedido.class.getName()).log(Level.SEVERE, null, ex);
                JOptionPane.showMessageDialog(null, "CONTRASEÑA INCORRECTA", "Error", JOptionPane.WARNING_MESSAGE);
            }

        }

        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        MINIMIZAR = new javax.swing.JLabel();
        CERRAR = new javax.swing.JLabel();
        txtusuario = new javax.swing.JTextField();
        txtcontraseña = new javax.swing.JPasswordField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);
        setSize(new java.awt.Dimension(575, 1050));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        MINIMIZAR.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        MINIMIZAR.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                MINIMIZARMouseClicked(evt);
            }
        });
        getContentPane().add(MINIMIZAR, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 240, 50, 30));

        CERRAR.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        CERRAR.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CERRARMouseClicked(evt);
            }
        });
        getContentPane().add(CERRAR, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 240, 40, 30));

        txtusuario.setBackground(new java.awt.Color(227, 227, 227));
        txtusuario.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        txtusuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtusuarioActionPerformed(evt);
            }
        });
        txtusuario.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtusuarioKeyTyped(evt);
            }
        });
        getContentPane().add(txtusuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 300, 240, 30));

        txtcontraseña.setBackground(new java.awt.Color(227, 227, 227));
        txtcontraseña.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        txtcontraseña.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtcontraseñaActionPerformed(evt);
            }
        });
        txtcontraseña.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtcontraseñaKeyPressed(evt);
            }
        });
        getContentPane().add(txtcontraseña, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 380, 240, 30));

        jLabel2.setFont(new java.awt.Font("Segoe Script", 0, 48)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(102, 102, 102));
        jLabel2.setText("RESTAURANT ");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 100, 410, 60));

        jLabel3.setFont(new java.awt.Font("Segoe Script", 1, 38)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(102, 102, 102));
        jLabel3.setText("SANS RATS");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 160, 260, 50));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/FondoLogin.png"))); // NOI18N
        jLabel1.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jLabel1MouseDragged(evt);
            }
        });
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel1MousePressed(evt);
            }
        });
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1100, 590));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MousePressed
     
    }//GEN-LAST:event_jLabel1MousePressed

    private void jLabel1MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseDragged
  
    }//GEN-LAST:event_jLabel1MouseDragged

    private void CERRARMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CERRARMouseClicked
        System.exit(0);
    }//GEN-LAST:event_CERRARMouseClicked

    private void MINIMIZARMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MINIMIZARMouseClicked
        setExtendedState(JFrame.CROSSHAIR_CURSOR);
    }//GEN-LAST:event_MINIMIZARMouseClicked

    private void txtusuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtusuarioActionPerformed
        txtusuario.transferFocus();
    }//GEN-LAST:event_txtusuarioActionPerformed

    private void txtcontraseñaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtcontraseñaKeyPressed

        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {   //ACA AL COLOCAR LA CONTRASEÑA Y PULSAR ENTER DEL TECLADO SE ACCEDE PARA ELLO DEBEMOS DECLARAR UN EVENTO.
            validar();
           
        }
    }//GEN-LAST:event_txtcontraseñaKeyPressed

    private void txtcontraseñaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtcontraseñaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtcontraseñaActionPerformed

    private void txtusuarioKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtusuarioKeyTyped

        char a = evt.getKeyChar();           //verifica que solo se ingresen NUMEROS.
        if (!Character.isDigit(a)) {
            Toolkit.getDefaultToolkit().beep();
            evt.consume();
        }
    }//GEN-LAST:event_txtusuarioKeyTyped

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
            java.util.logging.Logger.getLogger(InicioLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InicioLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InicioLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InicioLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InicioLogin().setVisible(true);
            }
        });

    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel CERRAR;
    private javax.swing.JLabel MINIMIZAR;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPasswordField txtcontraseña;
    private javax.swing.JTextField txtusuario;
    // End of variables declaration//GEN-END:variables

    private void acceder() {
        try {
            Connection conn;
            conn = conexion.getConnection();
            Statement st = null;
            ResultSet rs = null;
            System.out.println("Conectado a Base de Datos");
        } catch (HeadlessException e) {
            JOptionPane.showMessageDialog(null, "Error, Fallo Conexion con Base Datos");
        }
    }

}
