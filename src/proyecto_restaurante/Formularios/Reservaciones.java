package proyecto_restaurante.Formularios;

import Conexion.conexion;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.net.URL;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.text.SimpleDateFormat;
import javax.swing.JOptionPane;
import java.util.Date;
import javax.swing.ImageIcon;
import proyecto_restaurante.Formularios.MesasDisponibles;

/**
 *
 * @author gabriel gonzalez
 */
public class Reservaciones extends javax.swing.JFrame {

    public Reservaciones() {

        initComponents();

        this.setLocationRelativeTo(null);
        Toolkit lo = Toolkit.getDefaultToolkit();                                          //AQUI LE DOY UN ICONO AL PROGRAMA.
        setIconImage(lo.getImage(getClass().getResource("/Imagenes/Portada.jpg")));       //AQUI LE DOY UN ICONO AL PROGRAMA.

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnSALIR = new javax.swing.JButton();
        txtcostoreservacion = new javax.swing.JTextField();
        btnCostoreservacion = new javax.swing.JButton();
        txtmesas = new javax.swing.JTextField();
        btnMapaMesas = new javax.swing.JButton();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        txtnumeropersonas = new javax.swing.JTextField();
        txtnombrepersonareserva = new javax.swing.JTextField();
        btnGUARDAR = new javax.swing.JButton();
        txtmail = new javax.swing.JTextField();
        txttelefono = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnSALIR.setFont(new java.awt.Font("Segoe UI Black", 1, 21)); // NOI18N
        btnSALIR.setText("REGRESAR");
        btnSALIR.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnSALIR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSALIRActionPerformed(evt);
            }
        });
        getContentPane().add(btnSALIR, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 480, 170, 50));

        txtcostoreservacion.setEditable(false);
        txtcostoreservacion.setBackground(new java.awt.Color(227, 227, 227));
        getContentPane().add(txtcostoreservacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 410, 390, 40));

        btnCostoreservacion.setFont(new java.awt.Font("Segoe Script", 1, 23)); // NOI18N
        btnCostoreservacion.setForeground(new java.awt.Color(102, 102, 102));
        btnCostoreservacion.setText("COSTO DE RESARVACION:");
        btnCostoreservacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCostoreservacionActionPerformed(evt);
            }
        });
        getContentPane().add(btnCostoreservacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 410, 370, 40));

        txtmesas.setBackground(new java.awt.Color(227, 227, 227));
        txtmesas.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        txtmesas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtmesasActionPerformed(evt);
            }
        });
        txtmesas.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtmesasKeyTyped(evt);
            }
        });
        getContentPane().add(txtmesas, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 260, 390, 40));

        btnMapaMesas.setFont(new java.awt.Font("Segoe UI Black", 1, 16)); // NOI18N
        btnMapaMesas.setText("VER MESAS");
        btnMapaMesas.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnMapaMesas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMapaMesasActionPerformed(evt);
            }
        });
        getContentPane().add(btnMapaMesas, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 210, 160, 40));

        jDateChooser1.setBackground(new java.awt.Color(227, 227, 227));
        jDateChooser1.setDateFormatString("yyyy-MM-dd");
        getContentPane().add(jDateChooser1, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 210, 220, 40));

        txtnumeropersonas.setBackground(new java.awt.Color(227, 227, 227));
        txtnumeropersonas.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        txtnumeropersonas.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtnumeropersonasKeyTyped(evt);
            }
        });
        getContentPane().add(txtnumeropersonas, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 150, 390, 40));

        txtnombrepersonareserva.setBackground(new java.awt.Color(227, 227, 227));
        txtnombrepersonareserva.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        txtnombrepersonareserva.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtnombrepersonareservaKeyTyped(evt);
            }
        });
        getContentPane().add(txtnombrepersonareserva, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 90, 390, 40));

        btnGUARDAR.setFont(new java.awt.Font("Segoe UI Black", 1, 20)); // NOI18N
        btnGUARDAR.setText("GUARDAR");
        btnGUARDAR.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnGUARDAR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGUARDARActionPerformed(evt);
            }
        });
        getContentPane().add(btnGUARDAR, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 480, 170, 50));

        txtmail.setBackground(new java.awt.Color(227, 227, 227));
        txtmail.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        getContentPane().add(txtmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 310, 390, 40));

        txttelefono.setBackground(new java.awt.Color(227, 227, 227));
        txttelefono.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        txttelefono.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txttelefonoKeyTyped(evt);
            }
        });
        getContentPane().add(txttelefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 360, 390, 40));

        jLabel7.setFont(new java.awt.Font("Segoe Script", 1, 35)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(102, 102, 102));
        jLabel7.setText("RESERVACION DE MESAS");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 20, 550, 50));

        jPanel1.setBackground(new java.awt.Color(227, 227, 227));

        jLabel4.setFont(new java.awt.Font("Segoe Script", 1, 23)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(102, 102, 102));
        jLabel4.setText("FECHA DE LA RESERVA:");
        jPanel1.add(jLabel4);

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 210, 360, 40));

        jPanel2.setBackground(new java.awt.Color(227, 227, 227));

        jLabel2.setFont(new java.awt.Font("Segoe Script", 1, 23)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(102, 102, 102));
        jLabel2.setText("RESERVA A NOMBRE DE:");
        jPanel2.add(jLabel2);

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 90, 360, 40));

        jPanel3.setBackground(new java.awt.Color(227, 227, 227));

        jLabel6.setFont(new java.awt.Font("Segoe Script", 1, 23)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(102, 102, 102));
        jLabel6.setText(" ELIJA NUMERO DE MESA:");
        jPanel3.add(jLabel6);

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 260, 360, 40));

        jPanel4.setBackground(new java.awt.Color(227, 227, 227));

        jLabel3.setFont(new java.awt.Font("Segoe Script", 1, 23)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(102, 102, 102));
        jLabel3.setText("LUGARES A RESERVAR:");
        jPanel4.add(jLabel3);

        getContentPane().add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 150, 360, 40));

        jPanel5.setBackground(new java.awt.Color(227, 227, 227));

        jLabel1.setFont(new java.awt.Font("Segoe Script", 1, 23)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(102, 102, 102));
        jLabel1.setText("CORREO ELECTRONICO:");
        jPanel5.add(jLabel1);

        getContentPane().add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 310, 360, 40));

        jPanel6.setBackground(new java.awt.Color(227, 227, 227));

        jLabel5.setFont(new java.awt.Font("Segoe Script", 1, 23)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(102, 102, 102));
        jLabel5.setText("NUMERO DE TELEFONO:");
        jPanel6.add(jLabel5);

        getContentPane().add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 360, 360, 40));

        jLabel15.setFont(new java.awt.Font("Segoe UI Black", 1, 20)); // NOI18N
        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/FondoM.png"))); // NOI18N
        getContentPane().add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1100, 580));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSALIRActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSALIRActionPerformed
        dispose();
    }//GEN-LAST:event_btnSALIRActionPerformed

    private void btnCostoreservacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCostoreservacionActionPerformed
        String b;
        int c = 0, d;
        b = txtmesas.getText();
        String numeros[] = b.split(",");
        for (String numero : numeros) {
            c = c + 1;
        }
        d = c * 60;
        txtcostoreservacion.setText(String.valueOf(d));

    }//GEN-LAST:event_btnCostoreservacionActionPerformed

    private void btnMapaMesasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMapaMesasActionPerformed

        String f1;
        Date fe;
        fe = jDateChooser1.getDate();
        String formato = jDateChooser1.getDateFormatString();
        SimpleDateFormat sdf = new SimpleDateFormat(formato);
        f1 = String.valueOf(sdf.format(fe));
        MesasDisponibles map = new MesasDisponibles(f1);
        map.setVisible(true);

    }//GEN-LAST:event_btnMapaMesasActionPerformed

    private void btnGUARDARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGUARDARActionPerformed

        String nom, f1, mes, mail, tel;
        int np;
        Date fe;
        double cost;

        nom = txtnombrepersonareserva.getText();
        np = Integer.parseInt(txtnumeropersonas.getText());
        cost = Double.parseDouble(txtcostoreservacion.getText());
        mes = txtmesas.getText();
        fe = jDateChooser1.getDate();
        mail = txtmail.getText();
        tel = txttelefono.getText();

        String formato = jDateChooser1.getDateFormatString();
        SimpleDateFormat sdf = new SimpleDateFormat(formato);

        f1 = String.valueOf(sdf.format(fe));

        Connection conn = conexion.getConnection(); //Para tener conexión a la Base de Datos.

        String sql = "INSERT INTO reservaciones(id_res,nombres,numpersonas,fecha,mesas,costo,tel,mail) VALUES (?,?,?,?,?,?,?,?)";
        try {
            PreparedStatement pst = conn.prepareStatement(sql);
            pst.setString(1, null);
            pst.setString(2, nom);
            pst.setInt(3, np);
            pst.setString(4, f1);
            pst.setString(5, mes);
            pst.setDouble(6, cost);
            pst.setString(7, tel);
            pst.setString(8, mail);

            int n = pst.executeUpdate();
            if (n > 0) {
                JOptionPane.showMessageDialog(this, "RESERVACION REALIZADA");

                txtnombrepersonareserva.setText("");
                txttelefono.setText("");
                txtmail.setText("");
                txtnumeropersonas.setText("");
                txtcostoreservacion.setText("");
                txtmesas.setText("");
                jDateChooser1.setDate(null);                //Se vacian al registrar

                this.setLocationRelativeTo(null);
            }
        } catch (Exception e) {

            JOptionPane.showMessageDialog(this, "El error es:" + e.getMessage());
        }


    }//GEN-LAST:event_btnGUARDARActionPerformed

    private void txtnombrepersonareservaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtnombrepersonareservaKeyTyped

        char a = evt.getKeyChar();          //verifica que solo se ingresen letras.
        if (Character.isDigit(a)) {
            Toolkit.getDefaultToolkit().beep();
            evt.consume();
        }
    }//GEN-LAST:event_txtnombrepersonareservaKeyTyped

    private void txtnumeropersonasKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtnumeropersonasKeyTyped

        char a = evt.getKeyChar();           //verifica que solo se ingresen NUMEROS.
        if (!Character.isDigit(a)) {
            Toolkit.getDefaultToolkit().beep();
            evt.consume();
        }
    }//GEN-LAST:event_txtnumeropersonasKeyTyped

    private void txtmesasKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtmesasKeyTyped
      /*  char a = evt.getKeyChar();           //verifica que solo se ingresen NUMEROS.
        if (!Character.isDigit(a)) {
            Toolkit.getDefaultToolkit().beep();
            evt.consume();
        }  */
    }//GEN-LAST:event_txtmesasKeyTyped

    private void txttelefonoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txttelefonoKeyTyped
        char a = evt.getKeyChar();           //verifica que solo se ingresen NUMEROS.
        if (!Character.isDigit(a)) {
            Toolkit.getDefaultToolkit().beep();
            evt.consume();
        }
    }//GEN-LAST:event_txttelefonoKeyTyped

    private void txtmesasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtmesasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtmesasActionPerformed

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
            java.util.logging.Logger.getLogger(Reservaciones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Reservaciones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Reservaciones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Reservaciones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Reservaciones().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCostoreservacion;
    private javax.swing.JButton btnGUARDAR;
    private javax.swing.JButton btnMapaMesas;
    private javax.swing.JButton btnSALIR;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JTextField txtcostoreservacion;
    private javax.swing.JTextField txtmail;
    private javax.swing.JTextField txtmesas;
    private javax.swing.JTextField txtnombrepersonareserva;
    private javax.swing.JTextField txtnumeropersonas;
    private javax.swing.JTextField txttelefono;
    // End of variables declaration//GEN-END:variables
}
