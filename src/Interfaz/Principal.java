/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaz;

import javax.swing.JOptionPane;

/**
 *
 * @author hp 14
 */
public class Principal extends javax.swing.JFrame {

    /**
     * Creates new form Principal
     */
    public Principal() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtSueldo = new javax.swing.JTextField();
        cmbEjecutar = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtdescuento1 = new javax.swing.JTextField();
        txtDescuento4 = new javax.swing.JTextField();
        txtDescuento3 = new javax.swing.JTextField();
        txtdescuento2 = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtTotal = new javax.swing.JTextField();
        cmbNuevo = new javax.swing.JToggleButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel1.setText("Descuentos A Su Sueldo");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 280, 40));

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel2.setText("Ingrese Su Sueldo ");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, -1, -1));

        txtSueldo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtSueldoKeyTyped(evt);
            }
        });
        jPanel1.add(txtSueldo, new org.netbeans.lib.awtextra.AbsoluteConstraints(139, 50, 120, -1));

        cmbEjecutar.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        cmbEjecutar.setText("Consultar");
        cmbEjecutar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbEjecutarActionPerformed(evt);
            }
        });
        jPanel1.add(cmbEjecutar, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 90, -1, -1));

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel3.setText("Descuento Por Ley de Politica Pública ");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 130, 210, -1));

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel4.setText("Descuento Por Seguro Social");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 180, 180, -1));

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel5.setText("Descuento Por Seguro Forzoso ");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 230, 170, -1));

        jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel6.setText("Descuento Por  Caja De Ahorro ");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 280, -1, -1));

        txtdescuento1.setEditable(false);
        jPanel1.add(txtdescuento1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 150, 120, -1));

        txtDescuento4.setEditable(false);
        jPanel1.add(txtDescuento4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 300, 120, -1));

        txtDescuento3.setEditable(false);
        txtDescuento3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDescuento3ActionPerformed(evt);
            }
        });
        jPanel1.add(txtDescuento3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 250, 120, -1));

        txtdescuento2.setEditable(false);
        jPanel1.add(txtdescuento2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 200, 120, -1));

        jLabel7.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel7.setText("Sueldo Total ");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 200, -1, -1));

        txtTotal.setEditable(false);
        jPanel1.add(txtTotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 230, 100, -1));

        cmbNuevo.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        cmbNuevo.setText("Nueva Consulta");
        cmbNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbNuevoActionPerformed(evt);
            }
        });
        jPanel1.add(cmbNuevo, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 300, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cmbEjecutarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbEjecutarActionPerformed
        String descuento1,descuento2,descuento3,descuento4,montoT;
        int sueldo,descu1,descu2,descu4;
        if (txtSueldo.getText().trim().isEmpty()){
         JOptionPane.showMessageDialog(this,"Digite Su Sueldo ","error", JOptionPane.ERROR_MESSAGE);
         txtSueldo.requestFocusInWindow();}
        sueldo=Integer.parseInt(txtSueldo.getText());
        descu1=(sueldo/100);
        descu2=((sueldo*4)/100);
        double descu3=((sueldo*0.5)/100);
        descu4=((sueldo*5)/100);
        
        descuento1=String.valueOf(descu1);
        txtdescuento1.setText("-"+"$"+descuento1);
        
        descuento2=String.valueOf(descu2);
        txtdescuento2.setText("-"+"$"+descuento2);
        
        descuento3=String.valueOf(descu3);
        txtDescuento3.setText("-"+"$"+descuento3);
        
        descuento4=String.valueOf(descu4);
        txtDescuento4.setText("-"+"$"+descuento4);
        
        double total=sueldo-((sueldo*10.5)/100);
        montoT=String.valueOf(total);
        txtTotal.setText("$"+montoT);
     
    }//GEN-LAST:event_cmbEjecutarActionPerformed

    private void txtDescuento3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDescuento3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDescuento3ActionPerformed

    private void txtSueldoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSueldoKeyTyped
        char c=evt.getKeyChar(); 
             
         
          if(Character.isLetter(c)) { 
              getToolkit().beep(); 
              evt.consume();}
    }//GEN-LAST:event_txtSueldoKeyTyped

    private void cmbNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbNuevoActionPerformed
        txtSueldo.setText("");
     txtdescuento1.setText("");
     txtdescuento2.setText("");
     txtDescuento3.setText("");
     txtDescuento4.setText("");
     txtTotal.setText("");
     
     txtSueldo.requestFocusInWindow();
    }//GEN-LAST:event_cmbNuevoActionPerformed

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
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cmbEjecutar;
    private javax.swing.JToggleButton cmbNuevo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField txtDescuento3;
    private javax.swing.JTextField txtDescuento4;
    private javax.swing.JTextField txtSueldo;
    private javax.swing.JTextField txtTotal;
    private javax.swing.JTextField txtdescuento1;
    private javax.swing.JTextField txtdescuento2;
    // End of variables declaration//GEN-END:variables
}
