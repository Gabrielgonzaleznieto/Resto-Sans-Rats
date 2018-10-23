package proyecto_restaurante.Formularios.Vistas;

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
import proyecto_restaurante.Formularios.Empleados;   //Aca importo el Formulario de Empleados.

/**
 *
 * @author gabriel gonzalez
 */
public class RegistroEmpleados extends javax.swing.JFrame {

    DefaultTableModel modeloTabla;
    boolean opc = true;
    Empleados f = new Empleados();

    public RegistroEmpleados() {

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
        TableColumn.setPreferredWidth(20);
        TableColumn TableColumn1 = jTable1.getColumnModel().getColumn(1);
        TableColumn1.setPreferredWidth(100);
        TableColumn TableColumn2 = jTable1.getColumnModel().getColumn(2);
        TableColumn2.setPreferredWidth(50);
        TableColumn TableColumn3 = jTable1.getColumnModel().getColumn(3);
        TableColumn3.setPreferredWidth(50);
        
    }

    private void cerrar_ventana() {

        String botones[] = {"ACEPTAR", "CANCELAR"};
        int eleccion = JOptionPane.showOptionDialog(this, "¿DESEA ELIMINAR EL REGISTRO?",null, 0, 0, null, botones, this);
        if (eleccion == JOptionPane.YES_OPTION) {       
        } else if (eleccion == JOptionPane.NO_OPTION) {
            System.out.println("Se cancelo el cierre");
        }
         
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnAgregarEmpleado = new javax.swing.JButton();
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

        btnAgregarEmpleado.setFont(new java.awt.Font("Segoe UI Black", 1, 20)); // NOI18N
        btnAgregarEmpleado.setText("NUEVO");
        btnAgregarEmpleado.setBorder(javax.swing.BorderFactory.createEtchedBorder(java.awt.Color.black, null));
        btnAgregarEmpleado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarEmpleadoActionPerformed(evt);
            }
        });
        getContentPane().add(btnAgregarEmpleado, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 150, 190, 40));

        btnBuscar.setFont(new java.awt.Font("Segoe UI Black", 1, 20)); // NOI18N
        btnBuscar.setText("BUSCAR");
        btnBuscar.setBorder(javax.swing.BorderFactory.createEtchedBorder(java.awt.Color.black, null));
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });
        getContentPane().add(btnBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 150, 190, 40));

        btnEliminar.setFont(new java.awt.Font("Segoe UI Black", 1, 20)); // NOI18N
        btnEliminar.setText("ELIMINAR ");
        btnEliminar.setBorder(javax.swing.BorderFactory.createEtchedBorder(java.awt.Color.black, null));
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });
        getContentPane().add(btnEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 150, 190, 40));

        btnActualizar.setFont(new java.awt.Font("Segoe UI Black", 1, 20)); // NOI18N
        btnActualizar.setText("ACTUALIZAR");
        btnActualizar.setBorder(javax.swing.BorderFactory.createEtchedBorder(java.awt.Color.black, null));
        btnActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarActionPerformed(evt);
            }
        });
        getContentPane().add(btnActualizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 150, 190, 40));

        btbSalir.setFont(new java.awt.Font("Segoe UI Black", 1, 20)); // NOI18N
        btbSalir.setText("SALIR");
        btbSalir.setBorder(javax.swing.BorderFactory.createEtchedBorder(java.awt.Color.black, null));
        btbSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btbSalirActionPerformed(evt);
            }
        });
        getContentPane().add(btbSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 150, 190, 40));

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

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 220, 1030, 220));

        jLabel2.setFont(new java.awt.Font("Segoe Script", 1, 35)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(102, 102, 102));
        jLabel2.setText("REGISTRO DE EMPLEADOS:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 60, 570, 40));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Fondoproye.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1100, 580));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAgregarEmpleadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarEmpleadoActionPerformed

        if (opc == true) {
            f.setVisible(true);
            opc = false;
        } else {
            f.dispose();
            opc = true;
            f.setVisible(true);
        }
        tabla();
    }//GEN-LAST:event_btnAgregarEmpleadoActionPerformed

    private void btbSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btbSalirActionPerformed
        dispose();
    }//GEN-LAST:event_btbSalirActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed

        Connection conn;
        conn = conexion.getConnection();
        int valor = Integer.parseInt(JOptionPane.showInputDialog(this, "Introduce el numero de empleado "));

        String mostrar = "SELECT * FROM empleados WHERE id_empleado = " + valor + "";
        String[] Titulos = {"Id_empleado", "Nombre", "Dni", "Edad", "Referencias", "Sueldo", "Contraseña", "Mesas","telefono","e_mail"};
        String[] Datos = new String[10];
        modeloTabla = new DefaultTableModel(null, Titulos);
        try {
            Statement sqls = conn.prepareStatement(mostrar);
            ResultSet rs = sqls.executeQuery(mostrar);
            while (rs.next()) {
                Datos[0] = rs.getString("id_empleado");
                Datos[1] = rs.getString("nombre");
                Datos[2] = rs.getString("dni");
                Datos[3] = rs.getString("edad");
                Datos[4] = rs.getString("referencias");
                Datos[5] = rs.getString("sueldo");
                Datos[6] = rs.getString("contraseña");
                Datos[7] = rs.getString("mesas");
                Datos[8] = rs.getString("telefono");
                Datos[9] = rs.getString("e_mail");
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

        String sql = "DELETE FROM empleados where id_empleado=?";
        try {
            Connection cn = conexion.getConnection();
            PreparedStatement ps = cn.prepareStatement(sql);
            ps.setString(1, id);
            int n = ps.executeUpdate();
            cn.close();
            ps.close();
            if (n > 0) {
                JOptionPane.showMessageDialog(this, "Empleado Eliminado");
            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
            result = e.getMessage();
        }

        tabla();
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
            java.util.logging.Logger.getLogger(RegistroEmpleados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RegistroEmpleados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RegistroEmpleados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RegistroEmpleados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RegistroEmpleados().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btbSalir;
    private javax.swing.JButton btnActualizar;
    private javax.swing.JButton btnAgregarEmpleado;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables

    private void tabla() {

        DefaultTableModel modelotabla = new DefaultTableModel();
        ResultSet rs = conexion.getTabla("SELECT * FROM empleados");
        modelotabla.setColumnIdentifiers(new Object[]{"id_empleado", "Nombre", "Dni", "Edad", "Referencias", "Sueldo", "Contraseña", "Mesas","rango","telefono","e_mail"});
        try {
            while (rs.next()) {
                modelotabla.addRow(new Object[]{rs.getString("id_empleado"), rs.getString("nombre"), rs.getString("dni"), rs.getString("edad"), rs.getString("referencias"), rs.getString("sueldo"), rs.getString("contraseña"), rs.getString("mesas"),  rs.getString("rango"),  rs.getString("telefono"),  rs.getString("e_mail")});
            }
            jTable1.setModel(modelotabla);
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
