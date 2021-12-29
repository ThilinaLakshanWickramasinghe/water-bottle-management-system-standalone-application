
package Interface;

import Codes.DBconnect;
import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Calendar;
import java.util.GregorianCalendar;
import javax.swing.JOptionPane;



public final class Selling extends javax.swing.JFrame {

    Connection conn = null;
    PreparedStatement pst;
    
   
    
     
   
    public Selling() {
        initComponents();
      
        CurrentDeta();
      
         conn = DBconnect.connect();
    }

     
    
    
    
    public void CurrentDeta()
    {
        Calendar cal = new GregorianCalendar();
        int month = cal.get(Calendar.MONTH);
        int year = cal.get(Calendar.YEAR);
        int day = cal.get(Calendar.DAY_OF_MONTH);
        datetxt.setText(year+"-"+(month+1)+"-"+day);
        
    }
    
    
    public void clear()
     {
         cinvoicetxt.setText("");
         cnametxt.setText("");
         caddresstxt.setText("");
         ctelephonetxt.setText("");
                 
     }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel8 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        ctelephonetxt = new javax.swing.JTextField();
        caddresstxt = new javax.swing.JTextField();
        cnametxt = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        datetxt = new javax.swing.JTextField();
        cinvoicetxt = new javax.swing.JTextField();
        insertcustomer = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();

        jLabel8.setText("jLabel8");

        jTextField3.setText("jTextField3");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Water Bottle Management System");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(0, 102, 102));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 0, 0));
        jLabel1.setText("Selling");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 0, -1, 60));

        jButton1.setBackground(new java.awt.Color(153, 153, 153));
        jButton1.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jButton1.setForeground(new java.awt.Color(204, 0, 0));
        jButton1.setText("Customers Details");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 500, 200, 30));

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(204, 102, 255));
        jLabel10.setText("Customer Details");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 50, -1, -1));

        jPanel2.setBackground(new java.awt.Color(0, 204, 153));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel4.setText("Customer Name");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 160, -1, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel5.setText("Customer Address");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 230, -1, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel6.setText("Customer Telephone");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 302, -1, 30));

        ctelephonetxt.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jPanel2.add(ctelephonetxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 300, 410, 30));

        caddresstxt.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jPanel2.add(caddresstxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 230, 410, 30));

        cnametxt.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jPanel2.add(cnametxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 160, 410, 30));

        jPanel3.setBackground(new java.awt.Color(102, 153, 255));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setText("Coustomer ID");
        jPanel3.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, -1, 30));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setText("Date");
        jPanel3.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, -1, -1));

        jPanel2.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 210, 320));

        jPanel4.setBackground(new java.awt.Color(102, 102, 255));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        datetxt.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        datetxt.setEnabled(false);
        datetxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                datetxtActionPerformed(evt);
            }
        });
        jPanel4.add(datetxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 120, 30));
        jPanel4.add(cinvoicetxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, 410, 30));

        jPanel2.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 20, 440, 320));

        insertcustomer.setBackground(new java.awt.Color(153, 153, 153));
        insertcustomer.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        insertcustomer.setForeground(new java.awt.Color(204, 0, 0));
        insertcustomer.setText("Insert");
        insertcustomer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                insertcustomerActionPerformed(evt);
            }
        });
        jPanel2.add(insertcustomer, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 350, 100, -1));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 90, 720, 390));

        jButton2.setBackground(new java.awt.Color(153, 153, 153));
        jButton2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton2.setForeground(new java.awt.Color(204, 0, 0));
        jButton2.setText("Next");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 500, 80, 30));

        jButton3.setBackground(new java.awt.Color(153, 153, 153));
        jButton3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton3.setForeground(new java.awt.Color(204, 0, 0));
        jButton3.setText("HOME");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 500, 80, 30));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 870, 550));

        setSize(new java.awt.Dimension(880, 586));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        
// TODO add your handling code here:
            Selling2 objectSelling2 = new Selling2();
            objectSelling2.setVisible(true);
            this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:

            Selling3 objectSelling3 = new Selling3();
            objectSelling3.setVisible(true);
            this.dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
            Home objectHome = new Home();
            objectHome.setVisible(true);
            this.dispose();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void insertcustomerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_insertcustomerActionPerformed
    
      
       
        
       
        String invoice = cinvoicetxt.getText();
        String date = datetxt.getText();
        String name = cnametxt.getText();
        String address = caddresstxt.getText();
        int telephone = Integer.parseInt(ctelephonetxt.getText());
        
        try 
        {
            String sql = "INSERT INTO customer (c_invoice , c_date , c_name , c_address , c_phone )VALUES ('"+invoice+"', '"+date+"','"+name+"','"+address+"','"+telephone+"') " ;
            
            pst = conn.prepareStatement(sql);
            pst.execute();
            JOptionPane.showMessageDialog(null,"Inserted!");
        } 
        catch (HeadlessException | SQLException e) 
        {
            JOptionPane.showMessageDialog(null,e);
        }
    
        clear();
        
    }//GEN-LAST:event_insertcustomerActionPerformed

    private void datetxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_datetxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_datetxtActionPerformed

    
    public static void main(String args[]) {
        
      
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Selling().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField caddresstxt;
    private javax.swing.JTextField cinvoicetxt;
    private javax.swing.JTextField cnametxt;
    private javax.swing.JTextField ctelephonetxt;
    private javax.swing.JTextField datetxt;
    private javax.swing.JButton insertcustomer;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JTextField jTextField3;
    // End of variables declaration//GEN-END:variables
}
