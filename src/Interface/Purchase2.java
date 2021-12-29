
package Interface;

import Codes.DBconnect;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;



import java.util.Calendar;
import java.util.GregorianCalendar;
import javax.swing.JOptionPane;
import net.proteanit.sql.DbUtils;


public class Purchase2 extends javax.swing.JFrame {

    Connection conn = null;
    PreparedStatement pst = null;  
    ResultSet rs1 = null;
   
    public Purchase2() {
        initComponents();
        
        
   conn = DBconnect.connect(); 
        
        CurrentDeta();
        tableload();
        
    }
    
      public void CurrentDeta()
    {
        Calendar cal = new GregorianCalendar();
        int month = cal.get(Calendar.MONTH);
        int year = cal.get(Calendar.YEAR);
        int day = cal.get(Calendar.DAY_OF_MONTH);
        jTextField1.setText(year+"-"+(month+1)+"-"+day);
        
    }

      
      public void tableload(){
        
        try {
            String sql1 = "SELECT date AS Date  ,  ml500 AS 500ml   , ml750 AS 750ml   ,   ml1000 AS 1000ml , ml1500 AS 1500ml , ml5000 AS 5000ml ,  ml7000 AS 7000ml   , l10 AS 10L , l19 AS 19L , el10 AS 10L_Empty ,  el19 AS 19L_Empty    ,dispencer ,total AS Total    FROM purchase " ;
            pst = conn.prepareStatement(sql1);
            rs1 = pst.executeQuery();
            purchasetable.setModel(DbUtils.resultSetToTableModel(rs1));
        } 
        catch (SQLException e)
        {
          JOptionPane.showMessageDialog(null, e);
        }
    }
    
       public void serch(){
        
        
        String srch = serchbox.getText();
        
        try 
        {
            String sql = "SELECT  date , total FROM purchase WHERE date LIKE '%"+srch+"%'     ";          
            pst = conn.prepareStatement(sql);
            rs1 = pst.executeQuery();
            purchasetable.setModel(DbUtils.resultSetToTableModel(rs1));
        } 
        catch (Exception e) 
        {
          JOptionPane.showMessageDialog(null, e);
        }
        
        
    }
      
     /* public void tabledeta(){
       int r =purchasetable.getSelectedRow();
       
       String date = purchasetable.getValueAt(r , 0).toString(); 
       String m500 = purchasetable.getValueAt(r , 1).toString(); 
       String m750 = purchasetable.getValueAt(r , 2).toString(); 
        String m1000 = purchasetable.getValueAt(r , 3).toString(); 
       String m1500 = purchasetable.getValueAt(r , 4).toString(); 
       String m5000 = purchasetable.getValueAt(r , 5).toString(); 
        String m7000 = purchasetable.getValueAt(r , 6).toString(); 
       String ll10 = purchasetable.getValueAt(r , 7).toString(); 
       String ll19 = purchasetable.getValueAt(r , 8).toString(); 
        String le10 = purchasetable.getValueAt(r , 9).toString(); 
       String le19 = purchasetable.getValueAt(r , 10).toString(); 
       String dispencer = purchasetable.getValueAt(r , 11).toString(); 
        String tot = purchasetable.getValueAt(r , 12).toString(); 
       
        datee.setText(date);
        ml500.setText(m500);
        ml750.setText(m750);
         ml1000.setText(m1000);
        ml1500.setText(m1500);
        ml5000.setText(m5000);
         ml7000.setText(m7000);
        l10.setText(ll10);
        l19.setText(ll19);
         el10.setText(le10);
        el19.setText(le19);
        dis.setText(dispencer);
        total.setText(tot);
       
       
     }
      
      */
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        Sum = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        purchasetable = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        serchbox = new javax.swing.JTextField();
        jButton5 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Water Bottle Management System");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(0, 102, 102));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 0, 0));
        jLabel1.setText("Purchase History");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 10, -1, -1));

        jTextField1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jTextField1.setEnabled(false);
        jPanel1.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1050, 20, 110, -1));

        Sum.setBackground(new java.awt.Color(204, 153, 255));
        Sum.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        purchasetable.setBackground(new java.awt.Color(204, 255, 204));
        purchasetable.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        purchasetable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4", "Title 5", "Title 6", "Title 7", "Title 8", "Title 9", "Title 10", "Title 11", "Title 12", "Title 13"
            }
        ));
        purchasetable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                purchasetableMouseClicked(evt);
            }
        });
        purchasetable.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                purchasetableKeyReleased(evt);
            }
        });
        jScrollPane1.setViewportView(purchasetable);

        Sum.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 1140, 370));

        jPanel3.setBackground(new java.awt.Color(102, 153, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("Search"));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        serchbox.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        serchbox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                serchboxActionPerformed(evt);
            }
        });
        serchbox.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                serchboxKeyReleased(evt);
            }
        });
        jPanel3.add(serchbox, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, 320, 30));

        jButton5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton5.setForeground(new java.awt.Color(255, 0, 0));
        jButton5.setText("Clear");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 20, -1, 30));

        Sum.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 440, 450, 60));

        jPanel1.add(Sum, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, 1160, 510));

        jButton2.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 0, 0));
        jButton2.setText("Home");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 580, 90, 30));

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 0, 0));
        jButton1.setText("Back");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 580, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1190, 650));

        setSize(new java.awt.Dimension(1200, 665));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
            Home objectHome = new Home();
            objectHome.setVisible(true);
            this.dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
            purchase objectpurchase = new purchase();
            objectpurchase.setVisible(true);
            this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void serchboxKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_serchboxKeyReleased
        // TODO add your handling code here:
        serch();
    }//GEN-LAST:event_serchboxKeyReleased

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
       
        tableload();
    }//GEN-LAST:event_jButton5ActionPerformed

    private void serchboxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_serchboxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_serchboxActionPerformed

    private void purchasetableKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_purchasetableKeyReleased
        // TODO add your handling code here:
      //  tabledeta();
    }//GEN-LAST:event_purchasetableKeyReleased

    private void purchasetableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_purchasetableMouseClicked
        // TODO add your handling code here:
       // tabledeta();
    }//GEN-LAST:event_purchasetableMouseClicked

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
            java.util.logging.Logger.getLogger(Purchase2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Purchase2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Purchase2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Purchase2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Purchase2().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Sum;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTable purchasetable;
    private javax.swing.JTextField serchbox;
    // End of variables declaration//GEN-END:variables
}
