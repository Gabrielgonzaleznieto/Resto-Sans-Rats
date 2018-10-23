package proyecto_restaurante.Formularios;

import proyecto_restaurante.Formularios.Vistas.*;
import Conexion.conexion;
import java.awt.Color;
import java.awt.Font;
import java.awt.Toolkit;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;

/**
 *
 * @author gabriel gonzalez
 */
public class CancelacionReservas extends javax.swing.JFrame {

    DefaultTableModel modeloTabla;
    boolean opc = true;
   

    public CancelacionReservas() {

        initComponents();

     
        this.setLocationRelativeTo(null);
        Toolkit lo = Toolkit.getDefaultToolkit();                                          //AQUI LE DOY UN ICONO AL PROGRAMA.
        setIconImage(lo.getImage(getClass().getResource("/Imagenes/Portada.jpg")));       //AQUI LE DOY UN ICONO AL PROGRAMA.

        tabla();

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
        TableColumn.setPreferredWidth(10);
        TableColumn TableColumn1 = jTable1.getColumnModel().getColumn(1);
        TableColumn1.setPreferredWidth(80);
        TableColumn TableColumn2 = jTable1.getColumnModel().getColumn(2);
        TableColumn2.setPreferredWidth(50);
        TableColumn TableColumn3 = jTable1.getColumnModel().getColumn(3);
        TableColumn3.setPreferredWidth(20);
        TableColumn TableColumn4 = jTable1.getColumnModel().getColumn(4);
        TableColumn4.setPreferredWidth(20);
        TableColumn TableColumn5 = jTable1.getColumnModel().getColumn(5);
        TableColumn5.setPreferredWidth(20);
        TableColumn TableColumn6 = jTable1.getColumnModel().getColumn(6);
        TableColumn6.setPreferredWidth(20);
        
    }

    private void cerrar_ventana() {

        String botones[] = {"ACEPTAR", "CANCELAR"};
        int eleccion = JOptionPane.showOptionDialog(this, "¿DESEA ELIMINAR EL REGISTRO?", null, 0, 0, null, botones, this);
        if (eleccion == JOptionPane.YES_OPTION) {
        } else if (eleccion == JOptionPane.NO_OPTION) {
            System.out.println("Se cancelo el cierre");
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnBuscar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        btnActualizar = new javax.swing.JButton();
        btbSalir = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnBuscar.setFont(new java.awt.Font("Segoe UI Black", 1, 20)); // NOI18N
        btnBuscar.setText("BUSCAR");
        btnBuscar.setBorder(javax.swing.BorderFactory.createEtchedBorder(java.awt.Color.black, null));
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });
        getContentPane().add(btnBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 130, 190, 40));

        btnEliminar.setFont(new java.awt.Font("Segoe UI Black", 1, 20)); // NOI18N
        btnEliminar.setText("ELIMINAR");
        btnEliminar.setBorder(javax.swing.BorderFactory.createEtchedBorder(java.awt.Color.black, null));
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });
        getContentPane().add(btnEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 130, 200, 40));

        btnActualizar.setFont(new java.awt.Font("Segoe UI Black", 1, 20)); // NOI18N
        btnActualizar.setText("ACTUALIZAR");
        btnActualizar.setBorder(javax.swing.BorderFactory.createEtchedBorder(java.awt.Color.black, null));
        btnActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarActionPerformed(evt);
            }
        });
        getContentPane().add(btnActualizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 130, 200, 40));

        btbSalir.setFont(new java.awt.Font("Segoe UI Black", 1, 20)); // NOI18N
        btbSalir.setText("SALIR");
        btbSalir.setBorder(javax.swing.BorderFactory.createEtchedBorder(java.awt.Color.black, null));
        btbSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btbSalirActionPerformed(evt);
            }
        });
        getContentPane().add(btbSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 130, 190, 40));

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

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 180, 970, 350));

        jLabel2.setFont(new java.awt.Font("Segoe Script", 0, 35)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(102, 102, 102));
        jLabel2.setText("CANCELACION DE RESERVAS");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 50, 600, 40));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Fondoproye.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1100, 580));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btbSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btbSalirActionPerformed
        dispose();
    }//GEN-LAST:event_btbSalirActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        Connection conn;
        conn = conexion.getConnection();
        int valor = Integer.parseInt(JOptionPane.showInputDialog(this, "Introduzca el numero de reserva "));

        String mostrar = "SELECT * FROM reservaciones WHERE id_res = " + valor + "";
        String[] Titulos = {"id_res", "nombres", "numpersonas", "fecha", "mesas", "costo", "tel","mail"};
        String[] Datos = new String[8];
        modeloTabla = new DefaultTableModel(null, Titulos);
        try {
            Statement sqls = conn.prepareStatement(mostrar);
            ResultSet rs = sqls.executeQuery(mostrar);

            while (rs.next()) {
                Datos[0] = rs.getString("id_res");
                Datos[1] = rs.getString("nombres");
                Datos[2] = rs.getString("numpersonas");
                Datos[3] = rs.getString("fecha");
                Datos[4] = rs.getString("mesas");
                Datos[5] = rs.getString("costo");
                Datos[6] = rs.getString("tel");
                Datos[7] = rs.getString("mail");
             

                modeloTabla.addRow(Datos);
            }
            jTable1.setModel(modeloTabla);
        } catch (Exception e) {
            System.out.print(e.getMessage());
        }
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed

        cerrar_ventana();

        int row = jTable1.getSelectedRow();
        String id = jTable1.getValueAt(row, 0).toString();
        String result = null;
        Connection conn = conexion.getConnection(); //Para tener conexión a la Base de Datos.

        String sql = "DELETE FROM reservaciones WHERE id_res=?";
        try {
            Connection cn = conexion.getConnection();
            PreparedStatement ps = cn.prepareStatement(sql);
            ps.setString(1, id);
            int n = ps.executeUpdate();
            cn.close();
            ps.close();
            if (n > 0) {
                JOptionPane.showMessageDialog(this, "Reserva Eliminada");
            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
            result = e.getMessage();
        }
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarActionPerformed
        tabla();
    }//GEN-LAST:event_btnActualizarActionPerformed

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
            java.util.logging.Logger.getLogger(CancelacionReservas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CancelacionReservas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CancelacionReservas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CancelacionReservas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
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
                new CancelacionReservas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btbSalir;
    private javax.swing.JButton btnActualizar;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables

    private void tabla() {
        DefaultTableModel modelotabla = new DefaultTableModel();
        ResultSet rs = conexion.getTabla("SELECT * FROM reservaciones");
        modelotabla.setColumnIdentifiers(new Object[]{"id_reservacion", "Nombre", "Numero_personas", "Fecha", "Mesas", "Costo", "Telefono", "Mail"});
        try {
            while (rs.next()) {
                modelotabla.addRow(new Object[]{rs.getString("id_res"), rs.getString("nombres"), rs.getString("numpersonas"), rs.getString("fecha"), rs.getString("mesas"), rs.getString("costo"), rs.getString("tel"), rs.getString("mail")});
            }
            jTable1.setModel(modelotabla);
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
