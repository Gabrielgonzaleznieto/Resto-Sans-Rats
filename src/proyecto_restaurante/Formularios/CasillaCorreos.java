package proyecto_restaurante.Formularios;

import Conexion.conexion;
import Correo.Correo;
import Correo.ControladorCorreo;
import java.awt.Toolkit;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.Date;
import java.text.SimpleDateFormat;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author gabriel gonzalez
 */
public class CasillaCorreos extends javax.swing.JFrame {

    Correo c = new Correo();

    public CasillaCorreos() {

        initComponents();

        this.setLocationRelativeTo(null); // CON ESTA SENTENCIA EL FRAME APARECE CENTRADO.
        Toolkit lo = Toolkit.getDefaultToolkit();                                          //AQUI LE DOY UN ICONO AL PROGRAMA.
        setIconImage(lo.getImage(getClass().getResource("/Imagenes/Portada.jpg")));       //AQUI LE DOY UN ICONO AL PROGRAMA.
   
        
        
    }

     public void enviarCorreo() {
        c.setContrasenia("vdgvygfhnuielehh");
        c.setUsuarioCorreo("restaurantsansrats@gmail.com");
        c.setAsunto(txtasunto.getText());
        c.setMensaje(txtmensaje.getText());
        c.setDestino(txtdestino.getText().trim());

        ControladorCorreo co = new ControladorCorreo();
        if (co.enviarCorreo(c)) {
            JOptionPane.showMessageDialog(null, "MENSAJE ENVIADO");
        } else {
            JOptionPane.showMessageDialog(null, "ERROR DE ENVIO");
        }

        txtdestino.setText("");
        txtasunto.setText("");
        txtmensaje.setText("");
    }

     
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btonENVIAR = new javax.swing.JButton();
        txtdestino = new javax.swing.JTextField();
        txtasunto = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtmensaje = new javax.swing.JTextArea();
        btnSALIR = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btonENVIAR.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        btonENVIAR.setForeground(new java.awt.Color(51, 51, 51));
        btonENVIAR.setText("ENVIAR");
        btonENVIAR.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btonENVIAR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btonENVIARActionPerformed(evt);
            }
        });
        getContentPane().add(btonENVIAR, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 380, 120, 40));

        txtdestino.setBackground(new java.awt.Color(227, 227, 227));
        txtdestino.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtdestinoActionPerformed(evt);
            }
        });
        getContentPane().add(txtdestino, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 150, 520, 50));

        txtasunto.setBackground(new java.awt.Color(227, 227, 227));
        txtasunto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtasuntoActionPerformed(evt);
            }
        });
        getContentPane().add(txtasunto, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 230, 520, 50));

        txtmensaje.setBackground(new java.awt.Color(227, 227, 227));
        txtmensaje.setColumns(20);
        txtmensaje.setRows(5);
        jScrollPane1.setViewportView(txtmensaje);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 300, 520, 230));

        btnSALIR.setFont(new java.awt.Font("Segoe UI Black", 1, 19)); // NOI18N
        btnSALIR.setForeground(new java.awt.Color(51, 51, 51));
        btnSALIR.setText("SALIR");
        btnSALIR.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnSALIR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSALIRActionPerformed(evt);
            }
        });
        getContentPane().add(btnSALIR, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 490, 120, 40));

        jLabel4.setFont(new java.awt.Font("Segoe Script", 3, 35)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(102, 102, 102));
        jLabel4.setText("CASILLA DE CORREOS ");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 60, 480, -1));

        jPanel1.setBackground(new java.awt.Color(227, 227, 227));

        jLabel3.setFont(new java.awt.Font("Segoe Script", 1, 23)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(102, 102, 102));
        jLabel3.setText("ASUNTO");
        jPanel1.add(jLabel3);

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 240, -1, 40));

        jPanel2.setBackground(new java.awt.Color(227, 227, 227));

        jLabel2.setFont(new java.awt.Font("Segoe Script", 1, 23)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(102, 102, 102));
        jLabel2.setText("DESTINATARIO");
        jPanel2.add(jLabel2);

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 160, 210, 40));

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/FondoM.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1100, 580));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btonENVIARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btonENVIARActionPerformed
       
        enviarCorreo();            // TODO add your handling code here:
             
    }//GEN-LAST:event_btonENVIARActionPerformed

    private void btnSALIRActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSALIRActionPerformed
        dispose();        // TODO add your handling code here:
    }//GEN-LAST:event_btnSALIRActionPerformed

    private void txtdestinoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtdestinoActionPerformed
        txtdestino.transferFocus();        // TODO add your handling code here:
    }//GEN-LAST:event_txtdestinoActionPerformed

    private void txtasuntoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtasuntoActionPerformed
        txtasunto.transferFocus();        // TODO add your handling code here:
    }//GEN-LAST:event_txtasuntoActionPerformed

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
            java.util.logging.Logger.getLogger(CasillaCorreos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CasillaCorreos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CasillaCorreos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CasillaCorreos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CasillaCorreos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSALIR;
    private javax.swing.JButton btonENVIAR;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField txtasunto;
    private javax.swing.JTextField txtdestino;
    private javax.swing.JTextArea txtmensaje;
    // End of variables declaration//GEN-END:variables
}
