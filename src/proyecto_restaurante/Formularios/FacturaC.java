package proyecto_restaurante.Formularios;

import proyecto_restaurante.Formularios.Vistas.*;
import Conexion.conexion;
import java.awt.Color;
import java.awt.Font;
import java.awt.Toolkit;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.table.DefaultTableModel;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.TableColumn;
import proyecto_restaurante.Formularios.CargarPedido;  //ACA IMPORTO EL FORMULARIO DE PEDIDOS

/**
 *
 * @author gabriel gonzalez
 */
public class FacturaC extends javax.swing.JFrame {

    DefaultTableModel modeloTabla;
    private SimpleDateFormat d; //FECHA.

    boolean opc = true;
    CargarPedido f = new CargarPedido();

    public FacturaC() {

        initComponents();
        this.setLocationRelativeTo(null);
        Toolkit lo = Toolkit.getDefaultToolkit();                                          //AQUI LE DOY UN ICONO AL PROGRAMA.
        setIconImage(lo.getImage(getClass().getResource("/Imagenes/Portada.jpg")));       //AQUI LE DOY UN ICONO AL PROGRAMA.

        d = new SimpleDateFormat("yyyy-MM-dd"); //FECHA.
        FECHA.setText(d.format(new Date()));//FECHA.

        tabla();

        //ACA SE HACE TRANSPARENTE EL JTABLE.
        jTable2.setBackground(new Color(0, 0, 0, 0));
        ((DefaultTableCellRenderer) jTable2.getDefaultRenderer(Object.class)).setBackground(new Color(0, 0, 0, 0));
        jTable2.setGridColor(Color.DARK_GRAY);
        jTable2.setForeground(Color.DARK_GRAY);
        jScrollPane2.setBackground(new Color(0, 0, 0, 0));
        jScrollPane2.setOpaque(false);
        jTable2.setOpaque(false);
        ((DefaultTableCellRenderer) jTable2.getDefaultRenderer(Object.class)).setOpaque(false);
        // jScrollPane2.getViewport().setOpaque(false);
        jTable2.setShowGrid(true);

        //ACA CAMBIO LA LETRA Y EL TAMAÑO Y TAMBIEN AGRANDO O ACHICO LAS COLUMNAS DE LA TABLA.
        jTable2.setFont(new Font("Tahoma", 1, 13));
        TableColumn TableColumn = jTable2.getColumnModel().getColumn(0);
        TableColumn.setPreferredWidth(130);
        TableColumn TableColumn1 = jTable2.getColumnModel().getColumn(1);
        TableColumn1.setPreferredWidth(30);
        TableColumn TableColumn2 = jTable2.getColumnModel().getColumn(2);
        TableColumn2.setPreferredWidth(30);
        TableColumn TableColumn5 = jTable2.getColumnModel().getColumn(5);
        TableColumn5.setPreferredWidth(30);
        TableColumn TableColumn6 = jTable2.getColumnModel().getColumn(6);
        TableColumn6.setPreferredWidth(30);
    }

    private void cerrar_ventana() {

        String botones[] = {"ACEPTAR", "CANCELAR"};
        int eleccion = JOptionPane.showOptionDialog(this, "¿DESEA IMPRIMIR LA FACTURA?", null, 0, 0, null, botones, this);
        if (eleccion == JOptionPane.YES_OPTION) {
        } else if (eleccion == JOptionPane.NO_OPTION) {
            System.out.println("Se cancelo el cierre");
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        BtnSELECCIONAR = new javax.swing.JButton();
        BtnSalir = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        FECHA = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        btnBUSCAR = new javax.swing.JButton();
        btnImprimir = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        BtnSELECCIONAR.setFont(new java.awt.Font("Segoe UI Black", 1, 20)); // NOI18N
        BtnSELECCIONAR.setText("SELECCIONAR");
        BtnSELECCIONAR.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        BtnSELECCIONAR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnSELECCIONARActionPerformed(evt);
            }
        });
        getContentPane().add(BtnSELECCIONAR, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 290, 180, 40));

        BtnSalir.setFont(new java.awt.Font("Segoe UI Black", 1, 20)); // NOI18N
        BtnSalir.setText("SALIR");
        BtnSalir.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        BtnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnSalirActionPerformed(evt);
            }
        });
        getContentPane().add(BtnSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 290, 180, 40));

        jTable2.setForeground(new java.awt.Color(204, 102, 0));
        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane2.setViewportView(jTable2);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 350, 820, 330));

        jLabel1.setText("CUIT:XXXXXXXXXXXXXXXXXXXXXXXXXXXXXX");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 150, 210, -1));

        jLabel2.setText("INGRESOS BRUTOS:XXXXXXXXXXXXXXXXXX");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 170, -1, -1));

        jLabel3.setText("INICIO DE ACTIVIDAD:XXXXXXXXXXXXXXXX");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 190, 210, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 25)); // NOI18N
        jLabel4.setText("FACTURA N°");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 50, -1, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jLabel5.setText("FECHA");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 100, -1, 30));

        FECHA.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        getContentPane().add(FECHA, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 100, 90, 30));

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 40)); // NOI18N
        jLabel6.setText("RESTAURANT ");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 50, -1, -1));

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 40)); // NOI18N
        jLabel7.setText("SANS RATS");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 90, -1, -1));

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        jLabel8.setText("AVENIDA EL SOÑADOR N° 1313");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 160, -1, 30));

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        jLabel9.setText("TELEFONO/FAX: 2664-5554313");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 180, 190, 30));

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 78)); // NOI18N
        jLabel10.setText("C");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 40, 60, -1));

        btnBUSCAR.setFont(new java.awt.Font("Segoe UI Black", 1, 20)); // NOI18N
        btnBUSCAR.setText("BUSCAR");
        btnBUSCAR.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnBUSCAR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBUSCARActionPerformed(evt);
            }
        });
        getContentPane().add(btnBUSCAR, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 290, 190, 40));

        btnImprimir.setFont(new java.awt.Font("Segoe UI Black", 1, 20)); // NOI18N
        btnImprimir.setText("IMPRIMIR");
        btnImprimir.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnImprimir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnImprimirActionPerformed(evt);
            }
        });
        getContentPane().add(btnImprimir, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 290, 180, 40));

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/FACTURA.jpg"))); // NOI18N
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 900, 700));

        pack();
    }// </editor-fold>//GEN-END:initComponents


    private void BtnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnSalirActionPerformed
        dispose();
    }//GEN-LAST:event_BtnSalirActionPerformed

    private void BtnSELECCIONARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnSELECCIONARActionPerformed
        Connection conn;
        conn = conexion.getConnection();
       
        int valor = Integer.parseInt(JOptionPane.showInputDialog(this, "Introduzca su DNI"));                
        String mostrar = "SELECT * FROM pedidos WHERE DNI_Mesero = " + valor + "";
        String[] Titulos = {"Id_Pedido","Producto", "Codigo", "Cantidad", "Precio", "Total","Nombre_Mesero","DNI_Mesero"};
        String[] Datos = new String[8];
        modeloTabla = new DefaultTableModel(null, Titulos);
        try {
            Statement sqls = conn.prepareStatement(mostrar);
            ResultSet rs = sqls.executeQuery(mostrar);
            while (rs.next()) {
                Datos[0] = rs.getString("id_pedido");
                Datos[1] = rs.getString("producto");
                Datos[2] = rs.getString("codigo");
                Datos[3] = rs.getString("cantidad");
                Datos[4] = rs.getString("precio");
                Datos[5] = rs.getString("total");
                Datos[6] = rs.getString("nombre_mesero");
                Datos[7] = rs.getString("DNI_Mesero");

                modeloTabla.addRow(Datos);
            }
            jTable2.setModel(modeloTabla);
        } catch (Exception e) {
            System.out.print(e.getMessage());
        }
            
    }//GEN-LAST:event_BtnSELECCIONARActionPerformed

    private void btnBUSCARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBUSCARActionPerformed
       
        Connection conn;
        conn = conexion.getConnection();
        int valor = Integer.parseInt(JOptionPane.showInputDialog(this, "Introduzca el numero de pedido "));

        String mostrar = "SELECT * FROM pedidos WHERE id_pedido = " + valor + "";
        String[] Titulos = {"Id_Pedido", "Producto", "Codigo", "Cantidad", "Precio", "Total"};
        String[] Datos = new String[6];
        modeloTabla = new DefaultTableModel(null, Titulos);
        try {
            Statement sqls = conn.prepareStatement(mostrar);
            ResultSet rs = sqls.executeQuery(mostrar);
            while (rs.next()) {
                Datos[0] = rs.getString("id_pedido");
                Datos[1] = rs.getString("producto");
                Datos[2] = rs.getString("codigo");
                Datos[3] = rs.getString("cantidad");
                Datos[4] = rs.getString("precio");
                Datos[5] = rs.getString("total");

                modeloTabla.addRow(Datos);
            }
            jTable2.setModel(modeloTabla);
        } catch (Exception e) {
            System.out.print(e.getMessage());
        }
                              
        
    }//GEN-LAST:event_btnBUSCARActionPerformed

    private void btnImprimirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnImprimirActionPerformed
        
         cerrar_ventana();  
    }//GEN-LAST:event_btnImprimirActionPerformed

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
            java.util.logging.Logger.getLogger(FacturaC.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FacturaC.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FacturaC.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FacturaC.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
                new FacturaC().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnSELECCIONAR;
    private javax.swing.JButton BtnSalir;
    private javax.swing.JLabel FECHA;
    private javax.swing.JButton btnBUSCAR;
    private javax.swing.JButton btnImprimir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable2;
    // End of variables declaration//GEN-END:variables

    private void tabla() {

        DefaultTableModel modelotabla = new DefaultTableModel();
        ResultSet rs = conexion.getTabla("SELECT * FROM pedidos");
        modelotabla.setColumnIdentifiers(new Object[]{"Producto", "Cantidad", "Precio", "Total","Nombre_Mesero", "DNI_Mesero", "id_pedido"});
        try {
            while (rs.next()) {
                modelotabla.addRow(new Object[]{rs.getString("producto"), rs.getString("cantidad"), rs.getString("precio"), rs.getString("total"),rs.getString("Nombre_Mesero"), rs.getString("DNI_Mesero"), rs.getString("id_pedido")});
            }
            jTable2.setModel(modelotabla);
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
