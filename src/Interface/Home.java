
package Interface;
import Codes.DBconnect;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.Calendar;
import java.util.GregorianCalendar;
import javax.swing.JOptionPane;

public class Home extends javax.swing.JFrame {

    Connection conn = null;
    
    PreparedStatement  pst;
    
    
    
    public Home() {
        initComponents();
        
        conn = DBconnect.connect();
        CurrentDeta();
    }

  public void CurrentDeta()
    {
        Calendar cal = new GregorianCalendar();
        int month = cal.get(Calendar.MONTH);
        int year = cal.get(Calendar.YEAR);
        int day = cal.get(Calendar.DAY_OF_MONTH);
        txttime.setText(year+"-"+(month+1)+"-"+day);
        
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        storebtn = new javax.swing.JButton();
        sellingbtn = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        txttime = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        sellingbtn1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Water Bottle Management System");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(0, 102, 102));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(51, 102, 255));
        jButton1.setText("Customers Details");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 80, 200, 40));

        jButton3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton3.setForeground(new java.awt.Color(51, 102, 255));
        jButton3.setText("Selling Report");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 170, 200, 40));

        jButton4.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jButton4.setForeground(new java.awt.Color(102, 0, 153));
        jButton4.setText("Purchase");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, 190, 40));

        jPanel2.setBackground(new java.awt.Color(0, 204, 102));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setBackground(new java.awt.Color(0, 153, 51));
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Interface/pngwing.com.png"))); // NOI18N
        jLabel2.setText("jLabel2");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 250, 220));

        storebtn.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        storebtn.setForeground(new java.awt.Color(0, 0, 255));
        storebtn.setText("Store");
        storebtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                storebtnActionPerformed(evt);
            }
        });
        jPanel2.add(storebtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 220, 190, 40));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 80, 250, 270));

        sellingbtn.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        sellingbtn.setForeground(new java.awt.Color(102, 0, 153));
        sellingbtn.setText("Add Customer");
        sellingbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sellingbtnActionPerformed(evt);
            }
        });
        jPanel1.add(sellingbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 170, 190, 40));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 0, 0));
        jLabel1.setText("WELCOME");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 10, 260, -1));

        txttime.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        txttime.setForeground(new java.awt.Color(255, 51, 0));
        txttime.setText("Time");
        jPanel1.add(txttime, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 10, -1, -1));

        jButton2.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jButton2.setForeground(new java.awt.Color(102, 0, 153));
        jButton2.setText("Selling");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 260, 190, 40));

        sellingbtn1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        sellingbtn1.setForeground(new java.awt.Color(51, 102, 255));
        sellingbtn1.setText("selling history");
        sellingbtn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sellingbtn1ActionPerformed(evt);
            }
        });
        jPanel1.add(sellingbtn1, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 260, 200, 40));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 680, 360));

        setSize(new java.awt.Dimension(695, 397));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void sellingbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sellingbtnActionPerformed

        
        Selling objectselling = new Selling();
        objectselling.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_sellingbtnActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        // TODO add your handling code here:
        Selling2 objectSelling2 = new Selling2();
        objectSelling2.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed

        // TODO add your handling code here:
        Selling4 objectSelling4 = new Selling4();
        objectSelling4.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void storebtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_storebtnActionPerformed

        Store objectstore = new Store();
        objectstore.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_storebtnActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
         purchase objectpurchase = new purchase();
            objectpurchase.setVisible(true);
            this.dispose();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
         Selling3 objectselling3 = new Selling3();
        objectselling3.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void sellingbtn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sellingbtn1ActionPerformed
        // TODO add your handling code here:
                 sellinghistory objectSellinghistory = new sellinghistory();
        objectSellinghistory.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_sellingbtn1ActionPerformed

  
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Home().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JButton sellingbtn;
    private javax.swing.JButton sellingbtn1;
    private javax.swing.JButton storebtn;
    private javax.swing.JLabel txttime;
    // End of variables declaration//GEN-END:variables
}
