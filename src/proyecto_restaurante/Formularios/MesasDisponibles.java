package proyecto_restaurante.Formularios;

import Conexion.conexion;
import java.awt.Toolkit;
import java.net.URL;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.ImageIcon;

/**
 *
 * @author gabriel gonzalez
 */
public class MesasDisponibles extends javax.swing.JFrame {

    URL url = getClass().getResource("/Imagenes/MesaOcupada.png");
    ImageIcon img = new ImageIcon(url);
   
    URL urll = getClass().getResource("/Imagenes/MesaLibre.png");
        
            
    ImageIcon im = new ImageIcon(urll);



    public MesasDisponibles(String fecha) {

        initComponents();

        mesasv();

        this.setLocationRelativeTo(null);
        Toolkit lo = Toolkit.getDefaultToolkit();                                          //AQUI LE DOY UN ICONO AL PROGRAMA.
        setIconImage(lo.getImage(getClass().getResource("/Imagenes/Portada.jpg")));       //AQUI LE DOY UN ICONO AL PROGRAMA.

    
        Connection conn = conexion.getConnection(); //Para tener conexión a la Base de Datos.
        ResultSet rs;

        String sql = "SELECT mesas FROM reservaciones";
        try {
            Statement stmt = conn.createStatement();
            rs = stmt.executeQuery(sql);
            while (rs.next()) {
                String b = rs.getString(1);
                String mesaarray[] = b.split(",");
                for (String mesa : mesaarray) {
                    switch (mesa) {
                        case "1":
                            mesa1();
                            break;
                        case "2":
                            mesa2();
                            break;
                        case "3":
                            mesa3();
                            break;
                        case "4":
                            mesa4();
                            break;
                        case "5":
                            mesa5();
                            break;
                        case "6":
                            mesa6();
                            break;
                        case "7":
                            mesa7();
                            break;
                        case "8":
                            mesa8();
                            break;
                        case "9":
                            mesa9();
                            break;
                        case "10":
                            mesa10();
                            break;
                        case "11":
                            mesa11();
                            break;
                        case "12":
                            mesa12();
                            break;
                        case "13":
                            mesa13();
                            break;
                        case "14":
                            mesa14();
                            break;
                        case "15":
                            mesa15();
                            break;
                        default:
                            break;
                    }

                }
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        mesa1 = new javax.swing.JLabel();
        mesa2 = new javax.swing.JLabel();
        mesa3 = new javax.swing.JLabel();
        mesa4 = new javax.swing.JLabel();
        mesa5 = new javax.swing.JLabel();
        mesa6 = new javax.swing.JLabel();
        mesa7 = new javax.swing.JLabel();
        mesa8 = new javax.swing.JLabel();
        mesa9 = new javax.swing.JLabel();
        mesa10 = new javax.swing.JLabel();
        mesa11 = new javax.swing.JLabel();
        mesa12 = new javax.swing.JLabel();
        mesa13 = new javax.swing.JLabel();
        mesa14 = new javax.swing.JLabel();
        mesa15 = new javax.swing.JLabel();
        btnSALIR = new javax.swing.JButton();
        jLabel19 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Mapa de mesas");
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe Script", 1, 28)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(102, 102, 102));
        jLabel1.setText("MESAS LIBRES");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 90, 250, 50));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/MesaLibre.png"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 70, 100, 90));

        jLabel3.setFont(new java.awt.Font("Segoe Script", 1, 26)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(102, 102, 102));
        jLabel3.setText("MESAS OCUPADAS");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 100, 300, 30));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/MesaOcupada.png"))); // NOI18N
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 70, 100, 80));

        jLabel5.setFont(new java.awt.Font("Segoe UI Black", 1, 16)); // NOI18N
        jLabel5.setText("MESA 1");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 240, 70, 30));

        jLabel6.setFont(new java.awt.Font("Segoe UI Black", 1, 16)); // NOI18N
        jLabel6.setText("MESA 2");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 240, 80, 30));

        jLabel7.setFont(new java.awt.Font("Segoe UI Black", 1, 16)); // NOI18N
        jLabel7.setText("MESA 3");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 240, 70, 30));

        jLabel8.setFont(new java.awt.Font("Segoe UI Black", 1, 16)); // NOI18N
        jLabel8.setText("MESA 4");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 240, 70, 30));

        jLabel9.setFont(new java.awt.Font("Segoe UI Black", 1, 16)); // NOI18N
        jLabel9.setText("MESA 5");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 240, 80, 30));

        jLabel10.setFont(new java.awt.Font("Segoe UI Black", 1, 16)); // NOI18N
        jLabel10.setText("MESA 6");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 370, 70, -1));

        jLabel11.setFont(new java.awt.Font("Segoe UI Black", 1, 16)); // NOI18N
        jLabel11.setText("MESA 7");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 370, -1, -1));

        jLabel12.setFont(new java.awt.Font("Segoe UI Black", 1, 16)); // NOI18N
        jLabel12.setText("MESA 8");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 370, 70, -1));

        jLabel13.setFont(new java.awt.Font("Segoe UI Black", 1, 16)); // NOI18N
        jLabel13.setText("MESA 9");
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 370, -1, -1));

        jLabel14.setFont(new java.awt.Font("Segoe UI Black", 1, 16)); // NOI18N
        jLabel14.setText("MESA 10");
        getContentPane().add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 370, -1, -1));

        jLabel15.setFont(new java.awt.Font("Segoe UI Black", 1, 16)); // NOI18N
        jLabel15.setText("MESA 11");
        getContentPane().add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 500, -1, -1));

        jLabel16.setFont(new java.awt.Font("Segoe UI Black", 1, 16)); // NOI18N
        jLabel16.setText("MESA 12");
        getContentPane().add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 500, -1, -1));

        jLabel17.setFont(new java.awt.Font("Segoe UI Black", 1, 16)); // NOI18N
        jLabel17.setText("MESA 13");
        getContentPane().add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 490, -1, -1));

        jLabel18.setFont(new java.awt.Font("Segoe UI Black", 1, 16)); // NOI18N
        jLabel18.setText("MESA 14");
        getContentPane().add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 490, -1, -1));

        jLabel20.setFont(new java.awt.Font("Segoe UI Black", 1, 16)); // NOI18N
        jLabel20.setText("MESA 15");
        getContentPane().add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 490, -1, -1));

        mesa1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/MesaLibre.png"))); // NOI18N
        mesa1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        getContentPane().add(mesa1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 210, 100, 80));

        mesa2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/MesaLibre.png"))); // NOI18N
        mesa2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        getContentPane().add(mesa2, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 210, 100, 80));

        mesa3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/MesaLibre.png"))); // NOI18N
        mesa3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        getContentPane().add(mesa3, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 210, 100, 80));

        mesa4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/MesaLibre.png"))); // NOI18N
        mesa4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        getContentPane().add(mesa4, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 210, 100, 80));

        mesa5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/MesaLibre.png"))); // NOI18N
        mesa5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        getContentPane().add(mesa5, new org.netbeans.lib.awtextra.AbsoluteConstraints(950, 210, 100, 80));

        mesa6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/MesaLibre.png"))); // NOI18N
        mesa6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        getContentPane().add(mesa6, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 340, 100, 80));

        mesa7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/MesaLibre.png"))); // NOI18N
        mesa7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        getContentPane().add(mesa7, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 340, -1, 80));

        mesa8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/MesaLibre.png"))); // NOI18N
        mesa8.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        getContentPane().add(mesa8, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 330, 100, 100));

        mesa9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/MesaLibre.png"))); // NOI18N
        mesa9.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        getContentPane().add(mesa9, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 340, 100, 80));

        mesa10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/MesaLibre.png"))); // NOI18N
        mesa10.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        getContentPane().add(mesa10, new org.netbeans.lib.awtextra.AbsoluteConstraints(950, 340, -1, 80));

        mesa11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/MesaLibre.png"))); // NOI18N
        mesa11.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        getContentPane().add(mesa11, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 470, 100, 80));

        mesa12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/MesaLibre.png"))); // NOI18N
        mesa12.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        getContentPane().add(mesa12, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 470, 100, 80));

        mesa13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/MesaLibre.png"))); // NOI18N
        mesa13.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        getContentPane().add(mesa13, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 470, 100, 80));

        mesa14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/MesaLibre.png"))); // NOI18N
        mesa14.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        getContentPane().add(mesa14, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 470, 100, 80));

        mesa15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/MesaLibre.png"))); // NOI18N
        mesa15.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        getContentPane().add(mesa15, new org.netbeans.lib.awtextra.AbsoluteConstraints(950, 470, -1, -1));

        btnSALIR.setFont(new java.awt.Font("Segoe UI Black", 1, 20)); // NOI18N
        btnSALIR.setText("REGRESAR");
        btnSALIR.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnSALIR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSALIRActionPerformed(evt);
            }
        });
        getContentPane().add(btnSALIR, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 80, 140, 40));

        jLabel19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/FondoM.png"))); // NOI18N
        getContentPane().add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1100, 580));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSALIRActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSALIRActionPerformed
      dispose();  // TODO add your handling code here:
    }//GEN-LAST:event_btnSALIRActionPerformed

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
            java.util.logging.Logger.getLogger(MesasDisponibles.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MesasDisponibles.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MesasDisponibles.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MesasDisponibles.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {

            }
        });
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSALIR;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel mesa1;
    private javax.swing.JLabel mesa10;
    private javax.swing.JLabel mesa11;
    private javax.swing.JLabel mesa12;
    private javax.swing.JLabel mesa13;
    private javax.swing.JLabel mesa14;
    private javax.swing.JLabel mesa15;
    private javax.swing.JLabel mesa2;
    private javax.swing.JLabel mesa3;
    private javax.swing.JLabel mesa4;
    private javax.swing.JLabel mesa5;
    private javax.swing.JLabel mesa6;
    private javax.swing.JLabel mesa7;
    private javax.swing.JLabel mesa8;
    private javax.swing.JLabel mesa9;
    // End of variables declaration//GEN-END:variables

    private void mesa1() {
        mesa1.setIcon(img);

    }

    private void mesa2() {
        mesa2.setIcon(img);
    }

    private void mesa3() {
        mesa3.setIcon(img);
    }

    private void mesa4() {
        mesa4.setIcon(img);
    }

    private void mesa5() {
        mesa5.setIcon(img);

    }

    private void mesa6() {
        mesa6.setIcon(img);
    }

    private void mesa7() {
        mesa7.setIcon(img);
    }

    private void mesa8() {
        mesa8.setIcon(img);
    }

    private void mesa9() {
        mesa9.setIcon(img);
    }

    private void mesa10() {
        mesa10.setIcon(img);
    }

    private void mesa11() {
        mesa11.setIcon(img);
    }

    private void mesa12() {
        mesa12.setIcon(img);
    }

    private void mesa13() {
        mesa13.setIcon(img);
    }

    private void mesa14() {
        mesa14.setIcon(img);
    }

    private void mesa15() {
        mesa15.setIcon(img);
    }
    
     private void mesasv() {
        mesa1.setIcon(im);
        mesa2.setIcon(im);
        mesa3.setIcon(im);
        mesa4.setIcon(im);
        mesa5.setIcon(im);
        mesa6.setIcon(im);
    }
}
