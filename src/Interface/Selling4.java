package Interface;

import Codes.DBconnect;
import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import net.proteanit.sql.DbUtils;

public class Selling4 extends javax.swing.JFrame {

    Connection conn = null;
    PreparedStatement pst;
    ResultSet rs = null;

    public Selling4() {
        initComponents();
        conn = DBconnect.connect();
        tableload();
       
    }

    public void tableload() {

        try {
            String sql1 = "SELECT date AS Date ,invoice_number AS ID,name, bill_number AS Bill_Number  ,  ml500 AS 500ml   , ml750 AS 750ml   ,   ml1000 AS 1000ml , ml1500 AS 1500ml , ml5000 AS 5000ml ,  ml7000 AS 7000ml   , l10 AS 10L , l19 AS 19L , el10 AS 10L_Empty ,  el19 AS 19L_Empty    ,dispencer ,total AS Total ,profit   FROM customerbill ";
            pst = conn.prepareStatement(sql1);
            rs = pst.executeQuery();
            sellingtable.setModel(DbUtils.resultSetToTableModel(rs));
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }

    public void serch() {

        String srch = serchbox.getText();

        try {
            String sql = "SELECT date, invoice_number AS Coustomer_ID ,name ,  bill_number AS Bill_Number , ml500 AS 500ml   , ml750 AS 750ml   ,   ml1000 AS 1000ml , ml1500 AS 1500ml , ml5000 AS 5000ml ,  ml7000 AS 7000ml   , l10 AS 10L , l19 AS 19L , total, profit  FROM customerbill WHERE date LIKE '%" + srch + "%' OR invoice_number LIKE '%" + srch + "%' OR name LIKE '%" + srch + "%' OR bill_number LIKE '%" + srch + "%'  ";
            pst = conn.prepareStatement(sql);
            rs = pst.executeQuery();
            sellingtable.setModel(DbUtils.resultSetToTableModel(rs));
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }

    }
    
  

    public void clear() {
        serchbox.setText("");

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        sellingtable = new javax.swing.JTable();
        jPanel4 = new javax.swing.JPanel();
        totalbot = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        serchbox = new javax.swing.JTextField();
        jButton5 = new javax.swing.JButton();
        l10 = new javax.swing.JTextField();
        ml7000 = new javax.swing.JTextField();
        tot = new javax.swing.JTextField();
        ml1500 = new javax.swing.JTextField();
        prof = new javax.swing.JTextField();
        ml5000 = new javax.swing.JTextField();
        dispe = new javax.swing.JTextField();
        ml750 = new javax.swing.JTextField();
        ml1000 = new javax.swing.JTextField();
        ml500 = new javax.swing.JTextField();
        l19 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Water Bottle Management System");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(0, 102, 102));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 0, 0));
        jLabel1.setText("Selling Report");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 0, -1, 50));

        jPanel2.setBackground(new java.awt.Color(204, 153, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        sellingtable.setBackground(new java.awt.Color(204, 255, 204));
        sellingtable.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        sellingtable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Invoice Number", "500 ml", "750 ml", "1000 ml", "1500 ml", "5000 ml", "7000 ml", "10 L", "19 L", "10 L Empty", "19 L Empty", "Dispencers", "total", "Title 14", "Title 15", "Title 16", "Title 17"
            }
        ));
        sellingtable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                sellingtableMouseClicked(evt);
            }
        });
        sellingtable.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                sellingtableKeyReleased(evt);
            }
        });
        jScrollPane1.setViewportView(sellingtable);

        jPanel2.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 1230, 400));

        jPanel4.setBackground(new java.awt.Color(153, 153, 255));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        totalbot.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        totalbot.setForeground(new java.awt.Color(255, 51, 51));
        totalbot.setText("Total Bottle");
        totalbot.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                totalbotActionPerformed(evt);
            }
        });
        jPanel4.add(totalbot, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 20, 140, 60));

        jPanel3.setBackground(new java.awt.Color(102, 153, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("Search"));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        serchbox.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        serchbox.setForeground(new java.awt.Color(255, 51, 51));
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
        jButton5.setForeground(new java.awt.Color(255, 51, 51));
        jButton5.setText("Clear");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 20, 90, 30));

        jPanel4.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 20, 460, 60));

        jPanel2.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 420, 1230, 110));

        l10.setEditable(false);
        l10.setBackground(new java.awt.Color(153, 153, 255));
        l10.setFont(new java.awt.Font("Tahoma", 0, 1)); // NOI18N
        l10.setForeground(new java.awt.Color(153, 153, 255));
        l10.setBorder(null);
        l10.setEnabled(false);
        jPanel2.add(l10, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 510, 10, 10));

        ml7000.setEditable(false);
        ml7000.setBackground(new java.awt.Color(153, 153, 255));
        ml7000.setFont(new java.awt.Font("Tahoma", 0, 1)); // NOI18N
        ml7000.setForeground(new java.awt.Color(153, 153, 255));
        ml7000.setBorder(null);
        ml7000.setEnabled(false);
        jPanel2.add(ml7000, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 500, 10, 10));

        tot.setEditable(false);
        tot.setBackground(new java.awt.Color(153, 153, 255));
        tot.setFont(new java.awt.Font("Tahoma", 0, 1)); // NOI18N
        tot.setForeground(new java.awt.Color(153, 153, 255));
        tot.setBorder(null);
        tot.setEnabled(false);
        jPanel2.add(tot, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 480, 10, 10));

        ml1500.setEditable(false);
        ml1500.setBackground(new java.awt.Color(153, 153, 255));
        ml1500.setFont(new java.awt.Font("Tahoma", 0, 1)); // NOI18N
        ml1500.setForeground(new java.awt.Color(153, 153, 255));
        ml1500.setBorder(null);
        ml1500.setEnabled(false);
        jPanel2.add(ml1500, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 450, 10, 10));

        prof.setEditable(false);
        prof.setBackground(new java.awt.Color(153, 153, 255));
        prof.setFont(new java.awt.Font("Tahoma", 0, 1)); // NOI18N
        prof.setForeground(new java.awt.Color(153, 153, 255));
        prof.setBorder(null);
        prof.setEnabled(false);
        jPanel2.add(prof, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 440, 10, 10));

        ml5000.setEditable(false);
        ml5000.setBackground(new java.awt.Color(153, 153, 255));
        ml5000.setFont(new java.awt.Font("Tahoma", 0, 1)); // NOI18N
        ml5000.setForeground(new java.awt.Color(153, 153, 255));
        ml5000.setBorder(null);
        ml5000.setEnabled(false);
        jPanel2.add(ml5000, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 430, 10, 10));

        dispe.setEditable(false);
        dispe.setBackground(new java.awt.Color(153, 153, 255));
        dispe.setFont(new java.awt.Font("Tahoma", 0, 1)); // NOI18N
        dispe.setForeground(new java.awt.Color(153, 153, 255));
        dispe.setBorder(null);
        dispe.setEnabled(false);
        jPanel2.add(dispe, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 460, 10, 10));

        ml750.setEditable(false);
        ml750.setBackground(new java.awt.Color(153, 153, 255));
        ml750.setFont(new java.awt.Font("Tahoma", 0, 1)); // NOI18N
        ml750.setForeground(new java.awt.Color(153, 153, 255));
        ml750.setBorder(null);
        ml750.setEnabled(false);
        jPanel2.add(ml750, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 470, 10, 10));

        ml1000.setEditable(false);
        ml1000.setBackground(new java.awt.Color(153, 153, 255));
        ml1000.setFont(new java.awt.Font("Tahoma", 0, 1)); // NOI18N
        ml1000.setForeground(new java.awt.Color(153, 153, 255));
        ml1000.setBorder(null);
        ml1000.setEnabled(false);
        jPanel2.add(ml1000, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 490, 10, 10));

        ml500.setEditable(false);
        ml500.setBackground(new java.awt.Color(153, 153, 255));
        ml500.setFont(new java.awt.Font("Tahoma", 0, 1)); // NOI18N
        ml500.setForeground(new java.awt.Color(153, 153, 255));
        ml500.setBorder(null);
        ml500.setEnabled(false);
        jPanel2.add(ml500, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 420, 10, 10));

        l19.setEditable(false);
        l19.setBackground(new java.awt.Color(153, 153, 255));
        l19.setFont(new java.awt.Font("Tahoma", 0, 1)); // NOI18N
        l19.setForeground(new java.awt.Color(153, 153, 255));
        l19.setBorder(null);
        l19.setEnabled(false);
        jPanel2.add(l19, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 518, 10, 10));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, 1240, 540));

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(204, 0, 0));
        jButton1.setText("Store");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1170, 601, 90, 30));

        jButton3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton3.setForeground(new java.awt.Color(204, 0, 0));
        jButton3.setText("HOME");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 600, 80, 30));

        jButton2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton2.setForeground(new java.awt.Color(204, 0, 0));
        jButton2.setText("Selling");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1060, 600, 100, 30));

        jButton4.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jButton4.setForeground(new java.awt.Color(204, 0, 0));
        jButton4.setText("Customers Details");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 600, 190, 30));

        jButton6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton6.setForeground(new java.awt.Color(204, 0, 0));
        jButton6.setText("Back");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 600, 110, 30));

        jButton7.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton7.setForeground(new java.awt.Color(204, 0, 0));
        jButton7.setText("Selling History");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton7, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 600, -1, 30));

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 1)); // NOI18N
        jLabel11.setText("Profit");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(1180, 520, -1, -1));

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 1)); // NOI18N
        jLabel10.setText("Total");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(1120, 520, -1, -1));

        jLabel2.setBackground(new java.awt.Color(204, 153, 255));
        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 1)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(204, 153, 255));
        jLabel2.setText("500 ml");
        jLabel2.setEnabled(false);
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 460, 10, 10));

        jLabel3.setBackground(new java.awt.Color(204, 153, 255));
        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 1)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(204, 153, 255));
        jLabel3.setText("750 ml");
        jLabel3.setEnabled(false);
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 460, 10, 10));

        jLabel4.setBackground(new java.awt.Color(204, 153, 255));
        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 1)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(204, 153, 255));
        jLabel4.setText("1000 ml");
        jLabel4.setEnabled(false);
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 460, 10, 10));

        jLabel5.setBackground(new java.awt.Color(204, 153, 255));
        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 1)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(204, 153, 255));
        jLabel5.setText("1500 ml");
        jLabel5.setEnabled(false);
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 460, 10, 10));

        jLabel6.setBackground(new java.awt.Color(204, 153, 255));
        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 1)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(204, 153, 255));
        jLabel6.setText("5000 ml");
        jLabel6.setEnabled(false);
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 460, 10, 10));

        jLabel7.setBackground(new java.awt.Color(204, 153, 255));
        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 1)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(204, 153, 255));
        jLabel7.setText("7000 ml");
        jLabel7.setEnabled(false);
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 460, 10, 10));

        jLabel8.setBackground(new java.awt.Color(204, 153, 255));
        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 1)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(204, 153, 255));
        jLabel8.setText("10 L");
        jLabel8.setEnabled(false);
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(1020, 430, 10, 10));

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 3)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(102, 102, 102));
        jLabel9.setText("19 L");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(1156, 550, -1, 20));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1280, 650));

        setSize(new java.awt.Dimension(1295, 685));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        Store objectstore = new Store();
        objectstore.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        Home objectHome = new Home();
        objectHome.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed

        // TODO add your handling code here:
        Selling objectSelling = new Selling();
        objectSelling.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        Selling2 objectSelling2 = new Selling2();
        objectSelling2.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void serchboxKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_serchboxKeyReleased
        // TODO add your handling code here:
        serch();
    }//GEN-LAST:event_serchboxKeyReleased

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
        clear();
        tableload();
    }//GEN-LAST:event_jButton5ActionPerformed

    private void serchboxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_serchboxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_serchboxActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
        Selling3 objectSelling3 = new Selling3();
        objectSelling3.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton6ActionPerformed

    private void sellingtableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sellingtableMouseClicked
        // TODO add your handling code here:
       // tabledeta();
    }//GEN-LAST:event_sellingtableMouseClicked

    private void sellingtableKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_sellingtableKeyReleased

        // TODO add your handling code here:
       // tabledeta();
    }//GEN-LAST:event_sellingtableKeyReleased

    private void totalbotActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_totalbotActionPerformed
        // TODO add your handling code here:
        // 
        
        String srch = serchbox.getText();
       
        
        
        

        try {
            String sql = "SELECT SUM(ml500) FROM customerbill WHERE date LIKE '%"+ srch +"%'  ";
            pst = conn.prepareStatement(sql);
            rs = pst.executeQuery();
            if(rs.next())
            {
                String sum = rs.getString("SUM(ml500)");
                ml500.setText(sum);
            }
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        
        try {
            String sql = "SELECT SUM(ml750) FROM customerbill WHERE date LIKE '%"+ srch +"%'  ";
            pst = conn.prepareStatement(sql);
            rs = pst.executeQuery();
            if(rs.next())
            {
                String sum1 = rs.getString("SUM(ml750)");
                ml750.setText(sum1);
            }
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        
        try {
            String sql = "SELECT SUM(ml1000) FROM customerbill WHERE date LIKE '%"+ srch +"%'  ";
            pst = conn.prepareStatement(sql);
            rs = pst.executeQuery();
            if(rs.next())
            {
                String sum2 = rs.getString("SUM(ml1000)");
                ml1000.setText(sum2);
            }
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        
        try {
            String sql = "SELECT SUM(ml1500) FROM customerbill WHERE date LIKE '%"+ srch +"%'  ";
            pst = conn.prepareStatement(sql);
            rs = pst.executeQuery();
            if(rs.next())
            {
                String sum3 = rs.getString("SUM(ml1500)");
                ml1500.setText(sum3);
            }
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        
        try {
            String sql = "SELECT SUM(ml5000) FROM customerbill WHERE date LIKE '%"+ srch +"%'  ";
            pst = conn.prepareStatement(sql);
            rs = pst.executeQuery();
            if(rs.next())
            {
                String sum4 = rs.getString("SUM(ml5000)");
                ml5000.setText(sum4);
            }
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        
        try {
            String sql = "SELECT SUM(ml7000) FROM customerbill WHERE date LIKE '%"+ srch +"%'  ";
            pst = conn.prepareStatement(sql);
            rs = pst.executeQuery();
            if(rs.next())
            {
                String sum5 = rs.getString("SUM(ml7000)");
                ml7000.setText(sum5);
            }
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        
        try {
            String sql = "SELECT SUM(l10) FROM customerbill WHERE date LIKE '%"+ srch +"%'  ";
            pst = conn.prepareStatement(sql);
            rs = pst.executeQuery();
            if(rs.next())
            {
                String sum6 = rs.getString("SUM(l10)");
                l10.setText(sum6);
            }
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        
        
        try {
            String sql = "SELECT SUM(l19) FROM customerbill WHERE date LIKE '%"+ srch +"%'  ";
            pst = conn.prepareStatement(sql);
            rs = pst.executeQuery();
            if(rs.next())
            {
                String sum6 = rs.getString("SUM(l19)");
                l19.setText(sum6);
            }
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        
        
        try {
            String sql = "SELECT SUM(dispencer) FROM customerbill WHERE date LIKE '%"+ srch +"%'  ";
            pst = conn.prepareStatement(sql);
            rs = pst.executeQuery();
            if(rs.next())
            {
                String sum6 = rs.getString("SUM(dispencer)");
                dispe.setText(sum6);
            }
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        
          
        try {
            String sql = "SELECT SUM(total) FROM customerbill WHERE date LIKE '%"+ srch +"%'  ";
            pst = conn.prepareStatement(sql);
            rs = pst.executeQuery();
            if(rs.next())
            {
                String sum6 = rs.getString("SUM(total)");
                tot.setText(sum6);
            }
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        
        
        try {
            String sql = "SELECT SUM(profit) FROM customerbill WHERE date LIKE '%"+ srch +"%'  ";
            pst = conn.prepareStatement(sql);
            rs = pst.executeQuery();
            if(rs.next())
            {
                String sum6 = rs.getString("SUM(profit)");
                prof.setText(sum6);
            }
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
         
        
         
        String newml500 = ml500.getText();
         String  newml750 = ml750.getText();
         String newml1000 = ml1000.getText();
         String newml1500 = ml1500.getText();
         String newml5000 = ml5000.getText();
         String newml7000 = ml7000.getText();
         String newl10 = l10.getText();
         String newl19 = l19.getText();
         
         String dispencer = dispe.getText();
         String total = tot.getText();
         String profit = prof.getText();
         
         
         
         
        
         try 
        {
            String sql;
             sql = "INSERT INTO selling_history ( month , 500ml , 750ml ,1000ml , 1500ml  , 5000ml , 7000ml , 10L ,19L , dispencer , total ,profit )VALUES( '"+srch+"'   , '"+newml500+"' ,'"+newml750+"','"+newml1000+"','"+newml1500+"','"+newml5000+"', '"+newml7000+"','"+newl10+"','"+newl19+"' ,'"+dispencer+"','"+total+"','"+profit+"' )";
            
            pst = conn.prepareStatement(sql);
            pst.execute();
            JOptionPane.showMessageDialog(null,"Inserted!");
        } 
        catch (HeadlessException | SQLException e) 
        {
            JOptionPane.showMessageDialog(null,e);
        }
       
        
    }//GEN-LAST:event_totalbotActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        // TODO add your handling code here:
         sellinghistory objectSellinghistory = new sellinghistory();
        objectSellinghistory.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton7ActionPerformed

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
            java.util.logging.Logger.getLogger(Selling4.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Selling4.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Selling4.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Selling4.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Selling4().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField dispe;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
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
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField l10;
    private javax.swing.JTextField l19;
    private javax.swing.JTextField ml1000;
    private javax.swing.JTextField ml1500;
    private javax.swing.JTextField ml500;
    private javax.swing.JTextField ml5000;
    private javax.swing.JTextField ml7000;
    private javax.swing.JTextField ml750;
    private javax.swing.JTextField prof;
    private javax.swing.JTable sellingtable;
    private javax.swing.JTextField serchbox;
    private javax.swing.JTextField tot;
    private javax.swing.JButton totalbot;
    // End of variables declaration//GEN-END:variables
}
