package proyecto_restaurante.Formularios;



import proyecto_restaurante.Formularios.*;
import proyecto_restaurante.Formularios.InicioLogin;
import java.awt.Toolkit;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import proyecto_restaurante.Formularios.Vistas.RegistroPedidosRealizados;
import proyecto_restaurante.Formularios.Vistas.RegistroReservaciones;


/**
 *
 * @author gabriel gonzalez
 */
public class DerivadorEmpleados extends javax.swing.JFrame {

    boolean opc = true;
    
    RegistroPedidosRealizados ped = new RegistroPedidosRealizados();
    RegistroReservaciones res = new RegistroReservaciones();
    CasillaCorreos corre = new CasillaCorreos();

    public DerivadorEmpleados() {
        initComponents();

        this.setLocationRelativeTo(null);
        Toolkit lo = Toolkit.getDefaultToolkit();                                          //AQUI LE DOY UN ICONO AL PROGRAMA.
        setIconImage(lo.getImage(getClass().getResource("/Imagenes/Portada.jpg")));       //AQUI LE DOY UN ICONO AL PROGRAMA.

        setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);

    }

    private void cerrar_ventana() {
       
        String botones[] = {"SALIR", "CANCELAR"};
        int eleccion = JOptionPane.showOptionDialog(this, "¿ESTA SEGURO QUE DESEA SALIR DEL SISTEMA?", "SOFTWARE PROGRAMADORES 3.0 ULP SAN LUIS ARGENTINA", 0, 0, null, botones, this);
        if (eleccion == JOptionPane.YES_OPTION) {
            System.exit(0);
        } else if (eleccion == JOptionPane.NO_OPTION) {
            System.out.println("Se cancelo el cierre");
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        BotonReservaciones = new javax.swing.JButton();
        BotonPedidos = new javax.swing.JButton();
        btnSALIR = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Jefe");
        setUndecorated(true);
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        BotonReservaciones.setFont(new java.awt.Font("Segoe UI Black", 1, 25)); // NOI18N
        BotonReservaciones.setText("RESERVACIONES");
        BotonReservaciones.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.orange, java.awt.Color.orange, java.awt.Color.orange, java.awt.Color.orange));
        BotonReservaciones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonReservacionesActionPerformed(evt);
            }
        });
        getContentPane().add(BotonReservaciones, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 180, 310, 100));

        BotonPedidos.setFont(new java.awt.Font("Segoe UI Black", 1, 25)); // NOI18N
        BotonPedidos.setText("PEDIDOS");
        BotonPedidos.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.orange, java.awt.Color.orange, java.awt.Color.orange, java.awt.Color.orange));
        BotonPedidos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonPedidosActionPerformed(evt);
            }
        });
        getContentPane().add(BotonPedidos, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 180, 310, 100));

        btnSALIR.setFont(new java.awt.Font("Segoe UI Black", 1, 25)); // NOI18N
        btnSALIR.setText("SALIR DEL SISTEMA");
        btnSALIR.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.orange, java.awt.Color.orange, java.awt.Color.orange, java.awt.Color.orange));
        btnSALIR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSALIRActionPerformed(evt);
            }
        });
        getContentPane().add(btnSALIR, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 340, 310, 100));

        jLabel2.setFont(new java.awt.Font("Segoe Script", 3, 45)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(102, 102, 102));
        jLabel2.setText("¡¡¡ BIENVENIDO !!!");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 60, 480, 60));

        jLabel1.setFont(new java.awt.Font("Trebuchet MS", 1, 25)); // NOI18N
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/FondoM.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1100, 580));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BotonReservacionesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonReservacionesActionPerformed
        
        if(opc == true){    
            res.setVisible(true);
            opc=false;
        }else{
            res.dispose();
            opc=true;
            res.setVisible(true);
            }
         
    }//GEN-LAST:event_BotonReservacionesActionPerformed

    private void BotonPedidosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonPedidosActionPerformed

        if (opc == true) {
            ped.setVisible(true);
            opc = false;
        } else {
            ped.dispose();
            opc = true;
            ped.setVisible(true);
        }
    }//GEN-LAST:event_BotonPedidosActionPerformed

    private void btnSALIRActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSALIRActionPerformed
        cerrar_ventana();    // TODO add your handling code here:
    }//GEN-LAST:event_btnSALIRActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        cerrar_ventana();        // TODO add your handling code here:
    }//GEN-LAST:event_formWindowClosing

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
            java.util.logging.Logger.getLogger(DerivadorEmpleados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DerivadorEmpleados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DerivadorEmpleados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DerivadorEmpleados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DerivadorEmpleados().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotonPedidos;
    private javax.swing.JButton BotonReservaciones;
    private javax.swing.JButton btnSALIR;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    // End of variables declaration//GEN-END:variables
}
