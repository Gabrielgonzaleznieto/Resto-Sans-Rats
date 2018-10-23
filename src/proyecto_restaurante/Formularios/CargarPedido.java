package proyecto_restaurante.Formularios;

import Conexion.conexion;
import java.awt.Toolkit;
import java.net.URL;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;


/**
 *
 * @author gabriel gonzalez
 */
public class CargarPedido extends javax.swing.JFrame {
    
 
    

    public CargarPedido() {
        initComponents();

        this.setLocationRelativeTo(null);
        Toolkit lo = Toolkit.getDefaultToolkit();                                          //AQUI LE DOY UN ICONO AL PROGRAMA.
        setIconImage(lo.getImage(getClass().getResource("/Imagenes/Portada.jpg")));       //AQUI LE DOY UN ICONO AL PROGRAMA.

        Connection conn;
        conn = conexion.getConnection(); //Para tener conexión a la Base de Datos. 
        txtIdpedido.setEnabled(false); //ACA SE ANULA EL TEXFIELD DEL ID.
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        BtnAgregar = new javax.swing.JButton();
        txtCantidad = new javax.swing.JTextField();
        txtPrecio = new javax.swing.JTextField();
        txtTotal = new javax.swing.JTextField();
        BtnTotal = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        BtnSalir = new javax.swing.JButton();
        txtProducto = new javax.swing.JTextField();
        txtCodigo = new javax.swing.JTextField();
        txtIdpedido = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        txtnombremesero = new javax.swing.JTextField();
        jPanel4 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        txtdnimesero = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setBackground(new java.awt.Color(204, 51, 0));
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        BtnAgregar.setFont(new java.awt.Font("Segoe UI Black", 1, 20)); // NOI18N
        BtnAgregar.setText("AGREGAR");
        BtnAgregar.setBorder(javax.swing.BorderFactory.createEtchedBorder(java.awt.Color.black, null));
        BtnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnAgregarActionPerformed(evt);
            }
        });
        getContentPane().add(BtnAgregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 370, 190, 50));

        txtCantidad.setBackground(new java.awt.Color(227, 227, 227));
        txtCantidad.setFont(new java.awt.Font("Tahoma", 0, 22)); // NOI18N
        txtCantidad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCantidadActionPerformed(evt);
            }
        });
        txtCantidad.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCantidadKeyTyped(evt);
            }
        });
        getContentPane().add(txtCantidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 340, 420, 40));

        txtPrecio.setBackground(new java.awt.Color(227, 227, 227));
        txtPrecio.setFont(new java.awt.Font("Tahoma", 0, 22)); // NOI18N
        txtPrecio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPrecioActionPerformed(evt);
            }
        });
        txtPrecio.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtPrecioKeyTyped(evt);
            }
        });
        getContentPane().add(txtPrecio, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 400, 420, 40));

        txtTotal.setBackground(new java.awt.Color(227, 227, 227));
        txtTotal.setFont(new java.awt.Font("Tahoma", 0, 30)); // NOI18N
        getContentPane().add(txtTotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 470, 140, 40));

        BtnTotal.setFont(new java.awt.Font("Trebuchet MS", 1, 16)); // NOI18N
        BtnTotal.setText("TOTAL");
        BtnTotal.setBorder(javax.swing.BorderFactory.createEtchedBorder(java.awt.Color.black, null));
        BtnTotal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnTotalActionPerformed(evt);
            }
        });
        getContentPane().add(BtnTotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 470, 100, 40));

        jLabel3.setFont(new java.awt.Font("Segoe Script", 1, 35)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(102, 102, 102));
        jLabel3.setText("CARGUE SU PEDIDO:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 70, 480, 50));

        BtnSalir.setFont(new java.awt.Font("Segoe UI Black", 1, 20)); // NOI18N
        BtnSalir.setText("REGRESAR");
        BtnSalir.setBorder(javax.swing.BorderFactory.createEtchedBorder(java.awt.Color.black, null));
        BtnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnSalirActionPerformed(evt);
            }
        });
        getContentPane().add(BtnSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 460, 190, 50));

        txtProducto.setBackground(new java.awt.Color(227, 227, 227));
        txtProducto.setFont(new java.awt.Font("Tahoma", 0, 22)); // NOI18N
        txtProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtProductoActionPerformed(evt);
            }
        });
        txtProducto.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtProductoKeyTyped(evt);
            }
        });
        getContentPane().add(txtProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 220, 420, 40));

        txtCodigo.setBackground(new java.awt.Color(227, 227, 227));
        txtCodigo.setFont(new java.awt.Font("Tahoma", 0, 22)); // NOI18N
        txtCodigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCodigoActionPerformed(evt);
            }
        });
        txtCodigo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCodigoKeyTyped(evt);
            }
        });
        getContentPane().add(txtCodigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 280, 380, 40));

        txtIdpedido.setBackground(new java.awt.Color(227, 227, 227));
        getContentPane().add(txtIdpedido, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 280, 40, 40));

        jPanel1.setBackground(new java.awt.Color(227, 227, 227));

        jLabel1.setFont(new java.awt.Font("Segoe Script", 1, 21)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(102, 102, 102));
        jLabel1.setText(" NOMBRE MESERO");
        jPanel1.add(jLabel1);

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(127, 160, -1, 40));

        jPanel2.setBackground(new java.awt.Color(227, 227, 227));

        jLabel7.setFont(new java.awt.Font("Segoe Script", 1, 23)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(102, 102, 102));
        jLabel7.setText("PRODUCTO");
        jPanel2.add(jLabel7);

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 220, 220, 40));

        jPanel3.setBackground(new java.awt.Color(227, 227, 227));

        jLabel4.setFont(new java.awt.Font("Segoe Script", 1, 23)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(102, 102, 102));
        jLabel4.setText("CODIGO");
        jPanel3.add(jLabel4);

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 280, 220, 40));

        jPanel6.setBackground(new java.awt.Color(227, 227, 227));

        jLabel2.setFont(new java.awt.Font("Segoe Script", 1, 23)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(102, 102, 102));
        jLabel2.setText("CANTIDAD");
        jPanel6.add(jLabel2);

        getContentPane().add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 340, 220, 40));

        jPanel7.setBackground(new java.awt.Color(227, 227, 227));

        jLabel6.setFont(new java.awt.Font("Segoe Script", 1, 23)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(102, 102, 102));
        jLabel6.setText("PRECIO/Unid");
        jPanel7.add(jLabel6);

        getContentPane().add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 400, 220, 40));

        txtnombremesero.setBackground(new java.awt.Color(227, 227, 227));
        txtnombremesero.setFont(new java.awt.Font("Tahoma", 0, 22)); // NOI18N
        txtnombremesero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtnombremeseroActionPerformed(evt);
            }
        });
        getContentPane().add(txtnombremesero, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 160, 420, 40));

        jPanel4.setBackground(new java.awt.Color(227, 227, 227));

        jLabel5.setFont(new java.awt.Font("Segoe Script", 1, 23)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(102, 102, 102));
        jLabel5.setText("D.N.I MESERO");
        jPanel4.add(jLabel5);

        getContentPane().add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 470, 220, 40));

        txtdnimesero.setBackground(new java.awt.Color(227, 227, 227));
        txtdnimesero.setFont(new java.awt.Font("Tahoma", 0, 22)); // NOI18N
        txtdnimesero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtdnimeseroActionPerformed(evt);
            }
        });
        txtdnimesero.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtdnimeseroKeyTyped(evt);
            }
        });
        getContentPane().add(txtdnimesero, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 470, 150, 40));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Fondoproye.png"))); // NOI18N
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1100, 580));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BtnTotalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnTotalActionPerformed

        double a, b, c;
        a = Double.parseDouble(txtCantidad.getText());
        b = Double.parseDouble(txtPrecio.getText());

        c = a * b;
        String d = Double.toString(c);
        txtTotal.setText(d);
    }//GEN-LAST:event_BtnTotalActionPerformed

    private void BtnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnAgregarActionPerformed

        String id_pedido, cod, prod, nombre;
        int cant, dni;
        double prec, tot;                       //Declaracion variables

        id_pedido = txtIdpedido.getText();
        prod = txtProducto.getText();
        cod = txtCodigo.getText();
        cant = Integer.parseInt(txtCantidad.getText());
        prec = Double.parseDouble(txtPrecio.getText());
        tot = Double.parseDouble(txtTotal.getText());
        nombre =  txtnombremesero.getText();
        dni = Integer.parseInt(txtdnimesero.getText());

        Connection conn = conexion.getConnection(); //Para tener conexión a la Base de Datos.
        
        String sql = "INSERT INTO pedidos(Id_Pedido,Producto,Codigo,Cantidad,Precio,Total,Nombre_Mesero,DNI_Mesero) VALUES (?,?,?,?,?,?,?,?)";
        
        try {
            PreparedStatement pst = conn.prepareStatement(sql);
           
            pst.setString(1, null);
            pst.setString(2, prod);
            pst.setString(3, cod);
            pst.setInt(4, cant);
            pst.setDouble(5, prec);
            pst.setDouble(6, tot);
            pst.setString(7, nombre);
            pst.setInt(8, dni);
             
            int n = pst.executeUpdate();
            
            if (n > 0) {
                JOptionPane.showMessageDialog(this, "SU PEDIDO SE HA REGISTRADO CORRECTAMENTE");
                txtIdpedido.setText("");
                txtProducto.setText("");
                txtCodigo.setText("");
                txtCantidad.setText("");
                txtPrecio.setText("");
                txtTotal.setText("");
                txtnombremesero.setText("");
                txtdnimesero.setText("");
            }
        } catch (Exception e) {

            JOptionPane.showMessageDialog(this, "ERROR NO SE GUARDÓ EL PEDIDO. El error es:" + e.getMessage());
        }
        
    }//GEN-LAST:event_BtnAgregarActionPerformed

    private void txtCantidadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCantidadActionPerformed
        txtCantidad.transferFocus();        // TODO add your handling code here:
    }//GEN-LAST:event_txtCantidadActionPerformed

    private void BtnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnSalirActionPerformed
        dispose(); // TODO add your handling code here:
    }//GEN-LAST:event_BtnSalirActionPerformed

    private void txtProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtProductoActionPerformed
        txtProducto.transferFocus();
    }//GEN-LAST:event_txtProductoActionPerformed

    private void txtProductoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtProductoKeyTyped
     
        char a = evt.getKeyChar();                               //verifica que solo se ingresen letras.
        if (Character.isDigit(a)) {
            Toolkit.getDefaultToolkit().beep();
            evt.consume();
        }
    }//GEN-LAST:event_txtProductoKeyTyped

    private void txtCodigoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCodigoKeyTyped
      
          char a = evt.getKeyChar();           //verifica que solo se ingresen NUMEROS.
        if (!Character.isDigit(a)) {
            Toolkit.getDefaultToolkit().beep();
            evt.consume();
        }
    }//GEN-LAST:event_txtCodigoKeyTyped

    private void txtCantidadKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCantidadKeyTyped
       
          char a = evt.getKeyChar();           //verifica que solo se ingresen NUMEROS.
        if (!Character.isDigit(a)) {
            Toolkit.getDefaultToolkit().beep();
            evt.consume();
        }
        
    }//GEN-LAST:event_txtCantidadKeyTyped

    private void txtPrecioKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPrecioKeyTyped
        
          char a = evt.getKeyChar();           //verifica que solo se ingresen NUMEROS.
        if (!Character.isDigit(a)) {
            Toolkit.getDefaultToolkit().beep();
            evt.consume();
        }
    }//GEN-LAST:event_txtPrecioKeyTyped

    private void txtnombremeseroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtnombremeseroActionPerformed
       txtnombremesero.transferFocus();  // TODO add your handling code here:
    }//GEN-LAST:event_txtnombremeseroActionPerformed

    private void txtCodigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCodigoActionPerformed
         txtCodigo.transferFocus();// TODO add your handling code here:
    }//GEN-LAST:event_txtCodigoActionPerformed

    private void txtPrecioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPrecioActionPerformed
         txtPrecio.transferFocus();// TODO add your handling code here:
    }//GEN-LAST:event_txtPrecioActionPerformed

    private void txtdnimeseroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtdnimeseroActionPerformed
            
        txtdnimesero.transferFocus(); // TODO add your handling code here:      
    }//GEN-LAST:event_txtdnimeseroActionPerformed

    private void txtdnimeseroKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtdnimeseroKeyTyped
        char a = evt.getKeyChar();           //verifica que solo se ingresen NUMEROS.
        if (!Character.isDigit(a)) {
            Toolkit.getDefaultToolkit().beep();
            evt.consume();
        }
       
    }//GEN-LAST:event_txtdnimeseroKeyTyped

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
            java.util.logging.Logger.getLogger(CargarPedido.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CargarPedido.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CargarPedido.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CargarPedido.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
                new CargarPedido().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnAgregar;
    private javax.swing.JButton BtnSalir;
    private javax.swing.JButton BtnTotal;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JTextField txtCantidad;
    private javax.swing.JTextField txtCodigo;
    private javax.swing.JTextField txtIdpedido;
    private javax.swing.JTextField txtPrecio;
    private javax.swing.JTextField txtProducto;
    private javax.swing.JTextField txtTotal;
    private javax.swing.JTextField txtdnimesero;
    private javax.swing.JTextField txtnombremesero;
    // End of variables declaration//GEN-END:variables


}
