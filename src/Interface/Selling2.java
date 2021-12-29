package Interface;

import Codes.DBconnect;
import java.math.BigDecimal;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import net.proteanit.sql.DbUtils;

public final class Selling2 extends javax.swing.JFrame {

    Connection conn = null;
    PreparedStatement pst = null;
    ResultSet rs1 = null;

    public Selling2() {
        initComponents();
        conn = DBconnect.connect();

        tableload();
    }

    public void tableload() {

        try {
            String sql2 = "SELECT id_new AS id, c_date AS Date  ,c_invoice  AS Coustomer_ID   , c_name AS Customer_Name , c_address AS Customer_Address , c_phone AS Customer_Phone_Number FROM customer ";
            pst = conn.prepareStatement(sql2);
            rs1 = pst.executeQuery();
            cdetailstable.setModel(DbUtils.resultSetToTableModel(rs1));
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }

    }

    public void tabledeta() {
        int r = cdetailstable.getSelectedRow();

        String id = cdetailstable.getValueAt(r, 0).toString();
        String newdate = cdetailstable.getValueAt(r, 1).toString();
        String newcid = cdetailstable.getValueAt(r, 2).toString();
        String newname = cdetailstable.getValueAt(r, 3).toString();
        String newaddress = cdetailstable.getValueAt(r, 4).toString();
        String newphone = cdetailstable.getValueAt(r, 5).toString();

        idd.setText(id);
        date.setText(newdate);
        cid.setText(newcid);
        name.setText(newname);
        address.setText(newaddress);
        phone.setText(newphone);

    }

    public void update() {
        int newid = Integer.parseInt(idd.getText());

        String newdate = date.getText();
        String newcid = cid.getText();
        String newname = name.getText();
        String newaddress = address.getText();

        int newphone = Integer.parseInt(phone.getText());

        try {
            String sql = " UPDATE customer SET c_invoice='" + newcid + "' , c_date='" + newdate + "'  ,  c_name='"+newname+"'  , c_address='"+newaddress +"' , c_phone='"+newphone+"'         WHERE id_new='" + newid + "'    ";
            pst = conn.prepareStatement(sql);
            pst.execute();
            JOptionPane.showMessageDialog(null, "Updated");

            //   
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "error");
        }
    }

    public void clear() {
        date.setText("");
        cid.setText("");
        name.setText("");
        address.setText("");
        phone.setText("");

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jButton2 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        cdetailstable = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        date = new javax.swing.JTextField();
        cid = new javax.swing.JTextField();
        name = new javax.swing.JTextField();
        address = new javax.swing.JTextField();
        phone = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jButton5 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        idd = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Water Bottle Management System");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(0, 102, 102));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 0, 0));
        jLabel1.setText("Customers Details");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 0, -1, 40));

        jPanel5.setBackground(new java.awt.Color(204, 153, 255));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton2.setForeground(new java.awt.Color(204, 0, 0));
        jButton2.setText("Next");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel5.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 460, 70, -1));

        cdetailstable.setBackground(new java.awt.Color(204, 255, 204));
        cdetailstable.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        cdetailstable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Invoice Number", "Date", "Name", "Address", "Telephone "
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        cdetailstable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cdetailstableMouseClicked(evt);
            }
        });
        cdetailstable.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                cdetailstableKeyReleased(evt);
            }
        });
        jScrollPane1.setViewportView(cdetailstable);

        jPanel5.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 820, 300));

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 0, 0));
        jButton1.setText("Selling Report");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel5.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 460, -1, -1));

        jButton3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton3.setForeground(new java.awt.Color(204, 0, 51));
        jButton3.setText("Home");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel5.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 460, -1, -1));

        jButton4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton4.setForeground(new java.awt.Color(204, 0, 0));
        jButton4.setText("Back");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel5.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 460, 70, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setText("Coustomer ID");
        jPanel5.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 360, -1, 40));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel4.setText("Customer Name");
        jPanel5.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 410, -1, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel5.setText("Customer Address");
        jPanel5.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 330, -1, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel6.setText("Customer Telephone");
        jPanel5.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 370, -1, 30));

        date.setBackground(new java.awt.Color(255, 204, 204));
        date.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jPanel5.add(date, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 330, 190, -1));

        cid.setBackground(new java.awt.Color(255, 204, 204));
        cid.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jPanel5.add(cid, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 370, 190, -1));

        name.setBackground(new java.awt.Color(255, 204, 204));
        name.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jPanel5.add(name, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 410, 190, -1));

        address.setBackground(new java.awt.Color(255, 204, 204));
        address.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jPanel5.add(address, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 330, 230, -1));

        phone.setBackground(new java.awt.Color(255, 204, 204));
        phone.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jPanel5.add(phone, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 370, 230, -1));

        jPanel2.setBackground(new java.awt.Color(153, 153, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton5.setForeground(new java.awt.Color(0, 0, 204));
        jButton5.setText("Update");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 90, 100, 30));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setText("Date");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        jPanel5.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 320, 820, 130));

        idd.setEditable(false);
        idd.setFont(new java.awt.Font("Tahoma", 0, 1)); // NOI18N
        idd.setForeground(new java.awt.Color(240, 240, 240));
        idd.setBorder(null);
        idd.setEnabled(false);
        jPanel5.add(idd, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 290, 10, 10));

        jPanel1.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 840, 490));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 870, 550));

        setSize(new java.awt.Dimension(878, 586));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed

        Selling3 objectSelling3 = new Selling3();
        objectSelling3.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        Selling4 objectSelling4 = new Selling4();
        objectSelling4.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        Home objectHome = new Home();
        objectHome.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        Selling objectselling = new Selling();
        objectselling.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void cdetailstableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cdetailstableMouseClicked
        // TODO add your handling code here:
        tabledeta();
    }//GEN-LAST:event_cdetailstableMouseClicked

    private void cdetailstableKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cdetailstableKeyReleased
        // TODO add your handling code here:
        tabledeta();
    }//GEN-LAST:event_cdetailstableKeyReleased

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
        update();
        tableload();
        clear();

    }//GEN-LAST:event_jButton5ActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(() -> {
            new Selling2().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField address;
    private javax.swing.JTable cdetailstable;
    private javax.swing.JTextField cid;
    private javax.swing.JTextField date;
    private javax.swing.JTextField idd;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField name;
    private javax.swing.JTextField phone;
    // End of variables declaration//GEN-END:variables
}
