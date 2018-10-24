package proyecto_restaurante.Formularios.Vistas;

import java.awt.Toolkit;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.ImageIcon;
import proyecto_restaurante.Formularios.Reservaciones;
import proyecto_restaurante.Formularios.ConsultaMesasAcargo;
import proyecto_restaurante.Formularios.MesasDisponibles;
import proyecto_restaurante.Formularios.CancelacionReservas;

/**
 *
 * @author gabriel gonzalez
 */
public class RegistroReservaciones extends javax.swing.JFrame {

    boolean opc = true;
    ConsultaMesasAcargo mes = new ConsultaMesasAcargo();
    Reservaciones res = new Reservaciones();
    CancelacionReservas canres = new CancelacionReservas();
  
    private SimpleDateFormat f;

    public RegistroReservaciones() {

        initComponents();
        this.setLocationRelativeTo(null);
        Toolkit lo = Toolkit.getDefaultToolkit();                                          //AQUI LE DOY UN ICONO AL PROGRAMA.
        setIconImage(lo.getImage(getClass().getResource("/Imagenes/Portada.jpg")));       //AQUI LE DOY UN ICONO AL PROGRAMA.

    }

 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnReservaciones = new javax.swing.JButton();
        btnAsignarMesa = new javax.swing.JButton();
        btnMesasDisponibles = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        btnCancelacionReservas = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnReservaciones.setBackground(new java.awt.Color(227, 227, 227));
        btnReservaciones.setFont(new java.awt.Font("Segoe UI Black", 1, 20)); // NOI18N
        btnReservaciones.setText("CARGAR NUEVA RESERVA");
        btnReservaciones.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnReservaciones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReservacionesActionPerformed(evt);
            }
        });
        getContentPane().add(btnReservaciones, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 150, 380, 90));

        btnAsignarMesa.setBackground(new java.awt.Color(227, 227, 227));
        btnAsignarMesa.setFont(new java.awt.Font("Segoe UI Black", 1, 20)); // NOI18N
        btnAsignarMesa.setText("MESAS A CARGO");
        btnAsignarMesa.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnAsignarMesa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAsignarMesaActionPerformed(evt);
            }
        });
        getContentPane().add(btnAsignarMesa, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 150, 380, 90));

        btnMesasDisponibles.setBackground(new java.awt.Color(227, 227, 227));
        btnMesasDisponibles.setFont(new java.awt.Font("Segoe UI Black", 1, 20)); // NOI18N
        btnMesasDisponibles.setText("CONSULTA MESAS DISPONIBLES");
        btnMesasDisponibles.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnMesasDisponibles.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMesasDisponiblesActionPerformed(evt);
            }
        });
        getContentPane().add(btnMesasDisponibles, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 310, 380, 100));

        btnSalir.setFont(new java.awt.Font("Segoe UI Black", 1, 20)); // NOI18N
        btnSalir.setText("SALIR");
        btnSalir.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });
        getContentPane().add(btnSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 460, 300, 70));

        jLabel1.setFont(new java.awt.Font("Segoe Script", 1, 35)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(102, 102, 102));
        jLabel1.setText("RESERVACION DE MESAS:");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 60, 540, 50));

        btnCancelacionReservas.setBackground(new java.awt.Color(227, 227, 227));
        btnCancelacionReservas.setFont(new java.awt.Font("Segoe UI Black", 0, 20)); // NOI18N
        btnCancelacionReservas.setText("CANCELACION DE RESERVA");
        btnCancelacionReservas.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnCancelacionReservas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelacionReservasActionPerformed(evt);
            }
        });
        getContentPane().add(btnCancelacionReservas, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 310, 380, 100));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/FondoM.png"))); // NOI18N
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1100, 580));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
      dispose();
    }//GEN-LAST:event_btnSalirActionPerformed

    private void btnReservacionesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReservacionesActionPerformed
     
        if (opc == true) {
            res.setVisible(true);
            opc = false;
        } else {
            res.dispose();
            opc = true;
            res.setVisible(true);
        }

    }//GEN-LAST:event_btnReservacionesActionPerformed

    private void btnAsignarMesaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAsignarMesaActionPerformed
     
        if (opc == true) {
            mes.setVisible(true);
            opc = false;
        } else {
            mes.dispose();
            opc = true;
            mes.setVisible(true);
        }
    
    }//GEN-LAST:event_btnAsignarMesaActionPerformed

    private void btnMesasDisponiblesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMesasDisponiblesActionPerformed
        f = new SimpleDateFormat("yyyy-MM-dd"); //FECHA
        String b = f.format(new Date()); //depende de donde se quiera visualizar
        MesasDisponibles map = new MesasDisponibles(b);
        map.setVisible(true);
    }//GEN-LAST:event_btnMesasDisponiblesActionPerformed

    private void btnCancelacionReservasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelacionReservasActionPerformed
        
          if (opc == true) {
            canres.setVisible(true);
            opc = false;
        } else {
            canres.dispose();
            opc = true;
           canres.setVisible(true);
        }
        
    }//GEN-LAST:event_btnCancelacionReservasActionPerformed

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
            java.util.logging.Logger.getLogger(RegistroReservaciones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RegistroReservaciones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RegistroReservaciones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RegistroReservaciones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RegistroReservaciones().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAsignarMesa;
    private javax.swing.JButton btnCancelacionReservas;
    private javax.swing.JButton btnMesasDisponibles;
    private javax.swing.JButton btnReservaciones;
    private javax.swing.JButton btnSalir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    // End of variables declaration//GEN-END:variables
}
