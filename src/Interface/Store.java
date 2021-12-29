
package Interface;

import Codes.DBconnect;
import java.math.BigDecimal;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Calendar;
import java.util.GregorianCalendar;
import javax.swing.JOptionPane;
import net.proteanit.sql.DbUtils;


public class Store extends javax.swing.JFrame {

    Connection conn = null;
    PreparedStatement pst;
    ResultSet rs = null;
    
    
     public void CurrentDeta()
    {
        Calendar cal = new GregorianCalendar();
        int month = cal.get(Calendar.MONTH);
        int year = cal.get(Calendar.YEAR);
        int day = cal.get(Calendar.DAY_OF_MONTH);
        date.setText(year+"-"+(month+1)+"-"+day);
        
    }
    
    
    
    
    public Store() {
        initComponents();
        
         conn = DBconnect.connect();
         tableload();
         CurrentDeta();
    }

     public void tableload(){
        
        try {
            String sql1 = "SELECT id AS ID  ,  category AS Category   ,  qts AS Qts   ,   price_per_one    ,   total_price AS Total_Price    FROM store" ;
            pst = conn.prepareStatement(sql1);
            rs = pst.executeQuery();
            storetable.setModel(DbUtils.resultSetToTableModel(rs));
        } 
        catch (SQLException e)
        {
          JOptionPane.showMessageDialog(null, e);
        }
    }
    
     
     
     public void tabledeta(){
       int r =storetable.getSelectedRow();
       
       String id = storetable.getValueAt(r , 0).toString(); 
       String category = storetable.getValueAt(r , 1).toString(); 
       String qts = storetable.getValueAt(r , 2).toString(); 
       String price = storetable.getValueAt(r , 3).toString(); 
       String total = storetable.getValueAt(r , 4).toString(); 
    
       idbox.setText(id);
       pricebox.setText(price);
       qtsbox.setText(qts);
       categorybox.setText(category);
       
    }
    
     
     
     public void updatestore()
     {  
         String id = idbox.getText();
         String category =categorybox.getText();
         
         BigDecimal qts = new BigDecimal(qtsbox.getText());
         BigDecimal price =new BigDecimal(pricebox.getText());
         BigDecimal totalbox ;
         
         
         totalbox = qts.multiply(price) ;
         
         
         
         try 
         {
           String sql = " UPDATE store SET category='"+category+"', qts='"+qts+"',  price_per_one='"+price+"', total_price='"+totalbox+"'  WHERE id='"+id+"' " ; 
           pst = conn.prepareStatement(sql);
           pst.execute();
           JOptionPane.showMessageDialog(null, "Updated");
         
         
         } 
         catch (Exception e) 
         {
            JOptionPane.showMessageDialog(null, "error"); 
         }
     }
     
     public void clear()
     {
         idbox.setText("ID");
         categorybox.setText("");
         qtsbox.setText("");
         pricebox.setText("");
                 
     }
         
         
         
         
         
     
    
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        storetable = new javax.swing.JTable();
        jPanel4 = new javax.swing.JPanel();
        btnupdate = new javax.swing.JButton();
        btninsert = new javax.swing.JButton();
        btndelete = new javax.swing.JButton();
        btnclear = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        categorybox = new javax.swing.JTextField();
        qtsbox = new javax.swing.JTextField();
        pricebox = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        idbox = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        date = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Water Bottle Management System");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(0, 102, 102));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 40)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 0, 51));
        jLabel4.setText("Store ");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 0, -1, 50));

        jPanel3.setBackground(new java.awt.Color(204, 153, 255));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        storetable.setBackground(new java.awt.Color(204, 255, 204));
        storetable.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        storetable.setForeground(new java.awt.Color(0, 0, 102));
        storetable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Id", "Category", "Qts", "Price Per One", "Total"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.Integer.class, java.lang.Double.class, java.lang.Double.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        storetable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                storetableMouseClicked(evt);
            }
        });
        storetable.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                storetableKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                storetableKeyReleased(evt);
            }
        });
        jScrollPane1.setViewportView(storetable);

        jPanel3.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 10, 500, 440));

        jPanel4.setBackground(new java.awt.Color(102, 153, 255));
        jPanel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnupdate.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        btnupdate.setForeground(new java.awt.Color(255, 0, 0));
        btnupdate.setText("Update");
        btnupdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnupdateActionPerformed(evt);
            }
        });
        jPanel4.add(btnupdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 50, -1, 40));

        btninsert.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        btninsert.setForeground(new java.awt.Color(255, 0, 0));
        btninsert.setText("Insert");
        btninsert.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btninsertActionPerformed(evt);
            }
        });
        jPanel4.add(btninsert, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, 120, 40));

        btndelete.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        btndelete.setForeground(new java.awt.Color(255, 0, 0));
        btndelete.setText("Delete");
        btndelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btndeleteActionPerformed(evt);
            }
        });
        jPanel4.add(btndelete, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, 120, 40));

        btnclear.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        btnclear.setForeground(new java.awt.Color(255, 0, 0));
        btnclear.setText("Clear");
        btnclear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnclearActionPerformed(evt);
            }
        });
        jPanel4.add(btnclear, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 140, 120, 40));

        jPanel3.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 230, 310, 220));

        jPanel2.setBackground(new java.awt.Color(153, 153, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("Category");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, -1, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setText("Qts");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, -1, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setText("Price Per One");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 160, -1, -1));

        categorybox.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jPanel2.add(categorybox, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 60, 150, -1));

        qtsbox.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jPanel2.add(qtsbox, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 110, 150, -1));

        pricebox.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jPanel2.add(pricebox, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 160, 150, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(153, 153, 255));
        jLabel5.setText("ID");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, -1, -1));

        idbox.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        idbox.setForeground(new java.awt.Color(153, 153, 255));
        idbox.setText("(ID)");
        jPanel2.add(idbox, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 40, -1, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(204, 0, 51));
        jLabel6.setText("Input Details");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 10, 170, -1));

        jPanel3.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 310, 210));

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 0, 0));
        jButton1.setText("Home");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(757, 455, -1, 30));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 840, 490));

        date.setBackground(new java.awt.Color(240, 240, 240));
        date.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        date.setForeground(new java.awt.Color(255, 0, 0));
        date.setEnabled(false);
        jPanel1.add(date, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 10, 100, 30));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 860, 550));

        setSize(new java.awt.Dimension(881, 586));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnupdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnupdateActionPerformed
        // TODO add your handling code here:
     int check = JOptionPane.showConfirmDialog(null, "Do You Want To Update Store");
        
     if(check==0)
      {    
           updatestore();
      }     
             tableload();
           clear();
         
    }//GEN-LAST:event_btnupdateActionPerformed

    private void storetableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_storetableMouseClicked
        // TODO add your handling code here:
        tabledeta();
    }//GEN-LAST:event_storetableMouseClicked

    private void storetableKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_storetableKeyPressed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_storetableKeyPressed

    private void storetableKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_storetableKeyReleased
        // TODO add your handling code here:
        tabledeta();
    }//GEN-LAST:event_storetableKeyReleased

    private void btninsertActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btninsertActionPerformed


       
 int check = JOptionPane.showConfirmDialog(null, "Do You Want To Insert Deta");
        
 if(check==0)
 {
        String category;
        BigDecimal qts;
        BigDecimal price;
        BigDecimal total;
        
        
        category = categorybox.getText();
        qts = new BigDecimal(qtsbox.getText());
        price = new BigDecimal(pricebox.getText().toString());
        
        total = price.multiply(qts);//(qts * price) ;
        
        try {
            String sql = "INSERT INTO store(category,qts,price_per_one,total_price)VALUES ('"+category+"','"+qts+"','"+price+"','"+total+"')   ";
            pst = conn.prepareStatement(sql);
            pst.execute();
            JOptionPane.showMessageDialog(null,"Inserted!");
            
        } 
        catch (SQLException e) 
        {
            JOptionPane.showMessageDialog(null,e);
        }
 }     
         tableload();
         clear();
    }//GEN-LAST:event_btninsertActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
            Home objectHome = new Home();
            objectHome.setVisible(true);
            this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btndeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btndeleteActionPerformed
        // TODO add your handling code here:
        int check = JOptionPane.showConfirmDialog(null, "Do You Want To Delete");
        
                if(check==0)
                {
                    String id = idbox.getText();
                    
                    try 
                    {
                      String sql = "DELETE FROM store WHERE id='"+id+"' ";
                      pst = conn.prepareStatement(sql);
                      pst.execute();
                      JOptionPane.showMessageDialog(null, "Deleted");
                    }
                    catch (Exception e) 
                    {
                      JOptionPane.showMessageDialog(null, "Error");  
                    }
                }
        tableload();
        clear();
    }//GEN-LAST:event_btndeleteActionPerformed

    private void btnclearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnclearActionPerformed
        // TODO add your handling code here:
        clear();
    }//GEN-LAST:event_btnclearActionPerformed

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
            java.util.logging.Logger.getLogger(Store.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Store.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Store.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Store.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Store().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnclear;
    private javax.swing.JButton btndelete;
    private javax.swing.JButton btninsert;
    private javax.swing.JButton btnupdate;
    private javax.swing.JTextField categorybox;
    private javax.swing.JTextField date;
    private javax.swing.JLabel idbox;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField pricebox;
    private javax.swing.JTextField qtsbox;
    private javax.swing.JTable storetable;
    // End of variables declaration//GEN-END:variables
}
