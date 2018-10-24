package proyecto_restaurante.Formularios;

import Conexion.conexion;
import java.awt.Color;
import java.awt.Font;
import java.awt.Toolkit;
import java.net.URL;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;

/**
 *
 * @author gabriel gonzalez
 */
public class ConsultaMesasAcargo extends javax.swing.JFrame {

    DefaultTableModel modeloTabla;

    public ConsultaMesasAcargo() {

        initComponents();

        mostrar();

        setLocationRelativeTo(null);
        Toolkit lo = Toolkit.getDefaultToolkit();                                          //AQUI LE DOY UN ICONO AL PROGRAMA.
        setIconImage(lo.getImage(getClass().getResource("/Imagenes/Portada.jpg")));       //AQUI LE DOY UN ICONO AL PROGRAMA.

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
        jTable1.setFont(new Font("Tahoma",1,13));
        TableColumn TableColumn = jTable1.getColumnModel().getColumn(0);
        TableColumn.setPreferredWidth(80);
        TableColumn TableColumn1 = jTable1.getColumnModel().getColumn(1);
        TableColumn1.setPreferredWidth(30);
        TableColumn TableColumn2 = jTable1.getColumnModel().getColumn(2);
        TableColumn2.setPreferredWidth(20);
        TableColumn TableColumn3 = jTable1.getColumnModel().getColumn(3);
        TableColumn3.setPreferredWidth(100);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        btnSALIR = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTable1.setBackground(new java.awt.Color(227, 227, 227));
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(jTable1);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 120, 730, 350));

        btnSALIR.setFont(new java.awt.Font("Segoe UI Black", 1, 20)); // NOI18N
        btnSALIR.setText("REGRESAR");
        btnSALIR.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnSALIR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSALIRActionPerformed(evt);
            }
        });
        getContentPane().add(btnSALIR, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 490, 150, 40));

        jLabel2.setFont(new java.awt.Font("Segoe Script", 1, 35)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(102, 102, 102));
        jLabel2.setText("ATENCION DE MESAS ASIGNADAS");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 50, 690, 40));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/FondoM.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1100, 580));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSALIRActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSALIRActionPerformed
        dispose();
    }//GEN-LAST:event_btnSALIRActionPerformed

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
            java.util.logging.Logger.getLogger(ConsultaMesasAcargo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ConsultaMesasAcargo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ConsultaMesasAcargo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ConsultaMesasAcargo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ConsultaMesasAcargo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSALIR;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables

    private void mostrar() {

        DefaultTableModel modelotabla = new DefaultTableModel();
        ResultSet rs = conexion.getTabla("SELECT * FROM empleados");
        modelotabla.setColumnIdentifiers(new Object[]{"Nombre", "Mesas", "Telefono", "E_mail", "Rango"}); //ASI FIGURAN EN LA JTABLE.
        try {
            while (rs.next()) {
                modelotabla.addRow(new Object[]{rs.getString("nombre"), rs.getString("mesas"),rs.getString("telefono"), rs.getString("e_mail"), rs.getString("rango")});
            }
            jTable1.setModel(modelotabla);
        } catch (Exception e) {
            System.out.println(e);
        }

    }
}
