
package Interface;

import Codes.DBconnect;
import java.awt.HeadlessException;
import java.math.BigDecimal;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Calendar;
import java.util.GregorianCalendar;
import javax.swing.JOptionPane;
import net.proteanit.sql.DbUtils;


public class purchase extends javax.swing.JFrame {
    
    Connection conn = null;
    PreparedStatement pst = null;  
     ResultSet rs1 = null;

    public purchase() {
        initComponents();
        
          conn = DBconnect.connect(); 
        
        
        CurrentDeta();
         CurrentDeta2();
         
         
        tableload3();
        tabledeta3();
        
        
        tableload6();
        tabledeta6();
        
        
        tableload7();
        tabledeta7();
        
    }

     public void CurrentDeta()
    {
        Calendar cal = new GregorianCalendar();
        int month = cal.get(Calendar.MONTH);
        int year = cal.get(Calendar.YEAR);
        int day = cal.get(Calendar.DAY_OF_MONTH);
        dat.setText(year+"-"+(month+1)+"-"+day);
        datex.setText(year+"-"+(month+1)+"-"+day);
        
    }
    
      public void CurrentDeta2()
    {
        Calendar cal = new GregorianCalendar();
        int month = cal.get(Calendar.MONTH);
        int year = cal.get(Calendar.YEAR);
        
        monthtxt.setText(year+"-"+(month+1));
        
    }
     
      public void clear()
     {
        
        purch500qts.setText("");
        purch750qts.setText("");
        purch1000qts.setText("");
        purch1500qts.setText("");
        purch5000qts.setText("");
        purch7000qts.setText("");
        purch10lqts.setText("");
        purch19lqts.setText("");
        purch10elqts.setText("");
        purch19elqts.setText("");
        purchdisqts.setText("");
        
        purch500price.setText("");
        purch750price.setText("");
        purch1000price.setText("");
        purch1500price.setText("");
        purch5000price.setText("");
        purch7000price.setText("");
        purch10lprice.setText("");
        purch19lprice.setText("");
        purch10elprice.setText("");
        purch19elprice.setText("");
        purchdisprice.setText("");
                                                
   
     }
     
     
      public void tableload3()
   {
       try 
       {
         String sql2  = "SELECT qts  FROM store  " ;
         pst = conn.prepareStatement(sql2);
        rs1 = pst.executeQuery();         
           jTable1.setModel(DbUtils.resultSetToTableModel(rs1));
        } 
        catch (SQLException e)
        {
          JOptionPane.showMessageDialog(null, e);
        }
    }
   
   //qts set for varible
     
   public void tabledeta3(){
      // int r =pricepertable.getValueAt(r , 0);
       
       String qtsml500 = jTable1.getValueAt(0 , 0).toString(); 
       String qtsml750 = jTable1.getValueAt( 1, 0).toString(); 
       String qtsml1000 = jTable1.getValueAt(2 , 0).toString(); 
       String qtsml1500 = jTable1.getValueAt(3 , 0).toString(); 
       String qtsml5000 =jTable1.getValueAt(4 , 0).toString(); 
       String qtsml7000 = jTable1.getValueAt(5 , 0).toString(); 
       
       String qtsl10 = jTable1.getValueAt( 6, 0).toString(); 
       String qtsl19 = jTable1.getValueAt(7 , 0).toString(); 
       String qtsel10 =jTable1.getValueAt(8 , 0).toString(); 
       String qtsel19 =jTable1.getValueAt(9 , 0).toString(); 
       
        String qtsdiss =jTable1.getValueAt(10 , 0).toString(); 
    
       qts500.setText(qtsml500);
       qts750.setText(qtsml750);
       qts1000.setText(qtsml1000);
       qts1500.setText(qtsml1500);
       qts5000.setText(qtsml5000);
       qts7000.setText(qtsml7000);
       
       qts10l.setText(qtsl10);
       qts19l.setText(qtsl19);
       qts10el.setText(qtsel10);
       qts19el.setText(qtsel19);
       
       qtsdis.setText(qtsdiss);
     
    }
   
   
   
    public void tableload6()
   {
       try 
       {
         String sql  = "SELECT total_price  FROM store  " ;
         pst = conn.prepareStatement(sql);
        rs1 = pst.executeQuery();         
           total.setModel(DbUtils.resultSetToTableModel(rs1));
        } 
        catch (SQLException e)
        {
          JOptionPane.showMessageDialog(null, e);
        }
    }
      
      
        public void tabledeta6()
      {
      // int r =pricepertable.getValueAt(r , 0);
       
       String sellingto500 =  total.getValueAt(0 , 0).toString(); 
       String sellingto750 =  total.getValueAt( 1, 0).toString(); 
       String sellingto1000 = total.getValueAt(2 , 0).toString(); 
       String sellingto1500 =  total.getValueAt(3 , 0).toString(); 
       String sellingto5000 =  total.getValueAt(4 , 0).toString(); 
       String sellingto7000 =  total.getValueAt(5 , 0).toString(); 
       
       String sellingto10l =  total.getValueAt( 6, 0).toString(); 
       String sellingto19l =  total.getValueAt(7 , 0).toString(); 
       String sellingto10el =total.getValueAt(8 , 0).toString(); 
       String sellingto19el = total.getValueAt(9 , 0).toString(); 
       
        String sellingtodiss = total.getValueAt(10 , 0).toString(); 
    
       total500.setText(sellingto500);
       total750.setText(sellingto750);
       total1000.setText(sellingto1000);
       total1500.setText(sellingto1500);
       total5000.setText(sellingto5000);
       total7000.setText(sellingto7000);
       
       total10l.setText(sellingto10l);
       total19l.setText(sellingto19l);
       total10el.setText(sellingto10el);
       total19el.setText(sellingto19el);
       
       totaldis.setText(sellingtodiss);
     
    } 
        
        
        
        
      public void tableload7()
   {
       try 
       {
         String sql2  = "SELECT price_per_one  FROM store  " ;
         pst = conn.prepareStatement(sql2);
        rs1 = pst.executeQuery();         
           jTable2.setModel(DbUtils.resultSetToTableModel(rs1));
        } 
        catch (SQLException e)
        {
          JOptionPane.showMessageDialog(null, e);
        }
    }
   
   //qts set for varible
     
   public void tabledeta7(){
      // int r =pricepertable.getValueAt(r , 0);
       
       String priceml500 = jTable2.getValueAt(0 , 0).toString(); 
       String priceml750 = jTable2.getValueAt( 1, 0).toString(); 
       String priceml1000 = jTable2.getValueAt(2 , 0).toString(); 
       String priceml1500 = jTable2.getValueAt(3 , 0).toString(); 
       String priceml5000 =jTable2.getValueAt(4 , 0).toString(); 
       String priceml7000 = jTable2.getValueAt(5 , 0).toString(); 
       
       String pricel10 = jTable2.getValueAt( 6, 0).toString(); 
       String pricel19 = jTable2.getValueAt(7 , 0).toString(); 
       String priceel10 =jTable2.getValueAt(8 , 0).toString(); 
       String priceel19 =jTable2.getValueAt(9 , 0).toString(); 
       
        String pricediss =jTable2.getValueAt(10 , 0).toString(); 
    
       purch500price.setText(priceml500);
       purch750price.setText(priceml750);
       purch1000price.setText(priceml1000);
       purch1500price.setText(priceml1500);
       purch5000price.setText(priceml5000);
       purch7000price.setText(priceml7000);
       
       purch10lprice.setText(pricel10);
       purch19lprice.setText(pricel19);
       purch10elprice.setText(priceel10);
       purch19elprice.setText(priceel19);
       
       purchdisprice.setText(pricediss);
     
    }
    
   
   
   
   
   
   
   
   
   
   
     
    public void updatestore()    
     { 
         
       BigDecimal qts500old  = new BigDecimal(qts500.getText());
       BigDecimal qts750old  = new BigDecimal(qts750.getText());
       BigDecimal qts1000old = new BigDecimal(qts1000.getText());
       BigDecimal qts1500old = new BigDecimal(qts1500.getText());
       BigDecimal qts5000old = new BigDecimal(qts5000.getText());
       BigDecimal qts7000old = new BigDecimal(qts7000.getText());
       BigDecimal qts10lold  = new BigDecimal(qts10l.getText());
       BigDecimal qts19lold  = new BigDecimal(qts19l.getText());
       BigDecimal qts10elold = new BigDecimal(qts10el.getText());
       BigDecimal qts19elold = new BigDecimal(qts19el.getText());
       BigDecimal qtsdisold  = new BigDecimal(qtsdis.getText());
       
       
       BigDecimal purchase500qts = new BigDecimal(purch500qts.getText());
       BigDecimal purchase750qts = new BigDecimal(purch750qts.getText());
       BigDecimal purchase1000qts = new BigDecimal(purch1000qts.getText());
       BigDecimal purchase1500qts = new BigDecimal(purch1500qts.getText());
       BigDecimal purchase5000qts = new BigDecimal(purch5000qts.getText());
       BigDecimal purchase7000qts = new BigDecimal(purch7000qts.getText());
       BigDecimal purchase10lqts = new BigDecimal(purch10lqts.getText());
       BigDecimal purchase19lqts = new BigDecimal(purch19lqts.getText());
       BigDecimal purchase10elqts = new BigDecimal(purch10elqts.getText());
       BigDecimal purchase19elqts = new BigDecimal(purch19elqts.getText());
       BigDecimal purchasedisqts = new BigDecimal(purchdisqts.getText());
       
       
       
       BigDecimal newqts500 = qts500old.add(purchase500qts) ;
       BigDecimal newqts750 = qts750old.add(purchase750qts) ;
       BigDecimal newqts1000 = qts1000old.add(purchase1000qts) ;
       BigDecimal newqts1500 = qts1500old.add(purchase1500qts) ;
       BigDecimal newqts5000 = qts5000old.add(purchase5000qts) ;
       BigDecimal newqts7000 = qts7000old.add(purchase7000qts) ;
       BigDecimal newqts10l = qts10lold.add(purchase10lqts) ;
       BigDecimal newqts19l = qts19lold.add(purchase19lqts) ;
       BigDecimal newqts10el = qts10elold.subtract(purchase10elqts) ;
       BigDecimal newqts19el = qts19elold.subtract(purchase19elqts) ;
       BigDecimal newqtsdis = qtsdisold.add(purchasedisqts) ;
       
       
       
       
       
       
       BigDecimal purchase500price = new BigDecimal(purch500price.getText());
      BigDecimal purchase750price = new BigDecimal(purch750price.getText());
       BigDecimal purchase1000price = new BigDecimal(purch1000price.getText());
       BigDecimal purchase1500price = new BigDecimal(purch1500price.getText());
       BigDecimal purchase5000price = new BigDecimal(purch5000price.getText());
       BigDecimal purchase7000price = new BigDecimal(purch7000price.getText());
      BigDecimal purchase10lprice = new BigDecimal(purch10lprice.getText());
       BigDecimal purchase19lprice = new BigDecimal(purch19lprice.getText());
       BigDecimal purchase10elprice = new BigDecimal(purch10elprice.getText());
       BigDecimal purchase19elprice = new BigDecimal(purch19elprice.getText());
       BigDecimal purchasedisprice = new BigDecimal(purchdisprice.getText());
       
       
       BigDecimal purchtotal500 = purchase500qts.multiply(purchase500price );
       BigDecimal purchtotal750 = purchase750qts.multiply(purchase750price );
       BigDecimal purchtotal1000 = purchase1000qts.multiply(purchase1000price) ;
       BigDecimal purchtotal1500 = purchase1500qts.multiply(purchase1500price );
       BigDecimal purchtotal5000 = purchase5000qts.multiply(purchase5000price );
       BigDecimal purchtotal7000 = purchase7000qts.multiply(purchase7000price );
       BigDecimal purchtotal10l = purchase10lqts.multiply(purchase10lprice );
       BigDecimal purchtotal19l = purchase19lqts.multiply(purchase19lprice );
       BigDecimal purchtotal10el = purchase10elqts.multiply(purchase10elprice) ;
       BigDecimal purchtotal19el = purchase19elqts.multiply(purchase19elprice );
       BigDecimal purchtotaldis = purchasedisqts.multiply(purchasedisprice );
       
      
       BigDecimal total500ol  = new BigDecimal(total500.getText());
       BigDecimal total750ol  = new BigDecimal(total750.getText());
       BigDecimal total1000ol = new BigDecimal(total1000.getText());
       BigDecimal total1500ol = new BigDecimal(total1500.getText());
       BigDecimal total5000ol = new BigDecimal(total5000.getText());
       BigDecimal total7000ol = new BigDecimal(total7000.getText());
       BigDecimal total10lol  = new BigDecimal(total10l.getText());
       BigDecimal total19lol  = new BigDecimal(total19l.getText());
       BigDecimal total10elol = new BigDecimal(total10el.getText());
       BigDecimal total19elol = new BigDecimal(total19el.getText());
       BigDecimal totaldisol  = new BigDecimal(totaldis.getText()); 
         
         
        BigDecimal newtotal500 =  purchtotal500.add(total500ol ) ;
        BigDecimal newtotal750 =  purchtotal750.add(total750ol ) ;
        BigDecimal newtotal1000 =  purchtotal1000.add(total1000ol ) ;
        BigDecimal newtotal1500 =  purchtotal1500.add(total1500ol ) ;
        BigDecimal newtotal5000 =  purchtotal5000.add(total5000ol ) ;
        BigDecimal newtotal7000 =  purchtotal7000.add(total7000ol ) ;
        BigDecimal newtotal10l =  purchtotal10l.add(total10lol ) ;
        BigDecimal newtotal19l =  purchtotal19l.add(total19lol ) ;
        BigDecimal newtotal10el =  purchtotal10el.add(total10elol ) ;
        BigDecimal newtotal19el =  purchtotal19el.add(total19elol ) ;
        BigDecimal newtotaldis =  purchtotaldis.add(totaldisol ) ;
                  
         
         
         
         
         
         try 
         {
           String sql = " UPDATE store SET  qts ='"+newqts500+"', price_per_one ='"+purchase500price+"' ,total_price='"+newtotal500+"'   WHERE id='"+1+"' " ; 
           pst = conn.prepareStatement(sql);
           pst.execute();
         } 
         catch (SQLException e) 
         {
            JOptionPane.showMessageDialog(null, "error"); 
         }
         
         try 
         {
           String sql = " UPDATE store SET  qts ='"+newqts750+"', price_per_one ='"+purchase750price+"' ,total_price='"+newtotal750+"'   WHERE id='"+2+"' " ; 
           pst = conn.prepareStatement(sql);
           pst.execute();
         } 
         catch (SQLException e) 
         {
            JOptionPane.showMessageDialog(null, "error"); 
         }
         
         
          try 
         {
           String sql = " UPDATE store SET  qts ='"+newqts1000+"', price_per_one ='"+purchase1000price+"' ,total_price='"+newtotal1000+"'   WHERE id='"+3+"' " ; 
           pst = conn.prepareStatement(sql);
           pst.execute();
         } 
         catch (SQLException e) 
         {
            JOptionPane.showMessageDialog(null, "error"); 
         }
         
                  try 
         {
           String sql = " UPDATE store SET  qts ='"+newqts1500+"', price_per_one ='"+purchase1500price+"' ,total_price='"+newtotal1500+"'   WHERE id='"+4+"' " ; 
           pst = conn.prepareStatement(sql);
           pst.execute();
         } 
         catch (SQLException e) 
         {
            JOptionPane.showMessageDialog(null, "error"); 
         }
                  
                  
                  try 
         {
           String sql = " UPDATE store SET  qts ='"+newqts5000+"', price_per_one ='"+purchase5000price+"' ,total_price='"+newtotal5000+"'   WHERE id='"+5+"' " ; 
           pst = conn.prepareStatement(sql);
           pst.execute();
         } 
         catch (SQLException e) 
         {
            JOptionPane.showMessageDialog(null, "error"); 
         } 
          
          
          
                  try 
         {
           String sql = " UPDATE store SET  qts ='"+newqts7000+"', price_per_one ='"+purchase7000price+"' ,total_price='"+newtotal7000+"'   WHERE id='"+6+"' " ; 
           pst = conn.prepareStatement(sql);
           pst.execute();
         } 
         catch (SQLException e) 
         {
            JOptionPane.showMessageDialog(null, "error"); 
         }         
                  
                  
                  
                   try 
         {
           String sql = " UPDATE store SET  qts ='"+newqts10l+"', price_per_one ='"+purchase10lprice+"' ,total_price='"+newtotal10l+"'   WHERE id='"+7+"' " ; 
           pst = conn.prepareStatement(sql);
           pst.execute();
         } 
         catch (SQLException e) 
         {
            JOptionPane.showMessageDialog(null, "error"); 
         }        
                  
                  
                  
                  try 
         {
           String sql = " UPDATE store SET  qts ='"+newqts19l+"', price_per_one ='"+purchase19lprice+"' ,total_price='"+newtotal19l+"'   WHERE id='"+8+"' " ; 
           pst = conn.prepareStatement(sql);
           pst.execute();
         } 
         catch (SQLException e) 
         {
            JOptionPane.showMessageDialog(null, "error"); 
         }         
                  
                  
                   try 
         {
           String sql = " UPDATE store SET  qts ='"+newqts10el+"', price_per_one ='"+purchase10elprice+"' ,total_price='"+newtotal10el+"'   WHERE id='"+9+"' " ; 
           pst = conn.prepareStatement(sql);
           pst.execute();
         } 
         catch (SQLException e) 
         {
            JOptionPane.showMessageDialog(null, "error"); 
         }        
                  
                  
                  
                   try 
         {
           String sql = " UPDATE store SET  qts ='"+newqts19el+"', price_per_one ='"+purchase19elprice+"' ,total_price='"+newtotal19el+"'   WHERE id='"+10+"' " ; 
           pst = conn.prepareStatement(sql);
           pst.execute();
         } 
         catch (SQLException e) 
         {
            JOptionPane.showMessageDialog(null, "error"); 
         }        
                  
                  
                  
                  
                   try 
         {
           String sql = " UPDATE store SET  qts ='"+newqtsdis+"', price_per_one ='"+purchasedisprice+"' ,total_price='"+newtotaldis+"'   WHERE id='"+11+"' " ; 
           pst = conn.prepareStatement(sql);
           pst.execute();
         } 
         catch (SQLException e) 
         {
            JOptionPane.showMessageDialog(null, "error"); 
         }        
                  
          
     }
   
   
   
   
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel17 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        purch500qts = new javax.swing.JTextField();
        purch750qts = new javax.swing.JTextField();
        purch1000qts = new javax.swing.JTextField();
        purch1500qts = new javax.swing.JTextField();
        purch5000qts = new javax.swing.JTextField();
        purch7000qts = new javax.swing.JTextField();
        purch500price = new javax.swing.JTextField();
        purch750price = new javax.swing.JTextField();
        purch1000price = new javax.swing.JTextField();
        purch1500price = new javax.swing.JTextField();
        purch5000price = new javax.swing.JTextField();
        purch7000price = new javax.swing.JTextField();
        jPanel7 = new javax.swing.JPanel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        purch10lqts = new javax.swing.JTextField();
        purch19lqts = new javax.swing.JTextField();
        purch10lprice = new javax.swing.JTextField();
        purch19lprice = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        purch10elqts = new javax.swing.JTextField();
        purch19elqts = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        purch10elprice = new javax.swing.JTextField();
        purch19elprice = new javax.swing.JTextField();
        jPanel9 = new javax.swing.JPanel();
        jLabel21 = new javax.swing.JLabel();
        purchdisqts = new javax.swing.JTextField();
        purchdisprice = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel16 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        datex = new javax.swing.JTextField();
        jLabel23 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        qts500 = new javax.swing.JTextField();
        qts750 = new javax.swing.JTextField();
        qts1000 = new javax.swing.JTextField();
        qts1500 = new javax.swing.JTextField();
        qts5000 = new javax.swing.JTextField();
        qts7000 = new javax.swing.JTextField();
        qts10l = new javax.swing.JTextField();
        qts19l = new javax.swing.JTextField();
        qts10el = new javax.swing.JTextField();
        qts19el = new javax.swing.JTextField();
        qtsdis = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        total = new javax.swing.JTable();
        total500 = new javax.swing.JTextField();
        total750 = new javax.swing.JTextField();
        total1000 = new javax.swing.JTextField();
        total1500 = new javax.swing.JTextField();
        total5000 = new javax.swing.JTextField();
        total7000 = new javax.swing.JTextField();
        total10l = new javax.swing.JTextField();
        total19l = new javax.swing.JTextField();
        total10el = new javax.swing.JTextField();
        total19el = new javax.swing.JTextField();
        totaldis = new javax.swing.JTextField();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        monthtxt = new javax.swing.JTextField();
        dat = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        jTextField6 = new javax.swing.JTextField();
        jTextField7 = new javax.swing.JTextField();
        jTextField8 = new javax.swing.JTextField();
        jTextField9 = new javax.swing.JTextField();
        jTextField10 = new javax.swing.JTextField();
        jTextField11 = new javax.swing.JTextField();
        jTextField12 = new javax.swing.JTextField();
        jTextField13 = new javax.swing.JTextField();
        jTextField14 = new javax.swing.JTextField();
        jTextField15 = new javax.swing.JTextField();
        jTextField16 = new javax.swing.JTextField();
        jTextField17 = new javax.swing.JTextField();
        jTextField18 = new javax.swing.JTextField();
        jTextField19 = new javax.swing.JTextField();
        jTextField20 = new javax.swing.JTextField();
        jTextField21 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Water Bottle Management System");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(0, 102, 102));
        jPanel1.setForeground(new java.awt.Color(204, 153, 255));
        jPanel1.setEnabled(false);
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 0, 0));
        jLabel1.setText("purchase");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, -6, -1, 60));

        jPanel2.setBackground(new java.awt.Color(204, 153, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel17.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(0, 0, 153));
        jLabel17.setText("Category");
        jPanel2.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 20, -1, -1));

        jPanel3.setBackground(new java.awt.Color(153, 153, 255));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 0, 153));
        jLabel8.setText("Bottles");
        jPanel3.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 190, -1, -1));

        jPanel5.setBackground(new java.awt.Color(153, 204, 255));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setText("7000 ml");
        jPanel5.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 210, -1, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setText("1000 ml");
        jPanel5.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 90, -1, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("750 ml");
        jPanel5.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 50, -1, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setText("1500 ml");
        jPanel5.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 130, -1, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setText("5000 ml");
        jPanel5.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 170, -1, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("500 ml");
        jPanel5.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, -1, -1));

        purch500qts.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        purch500qts.setText("0");
        jPanel5.add(purch500qts, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 10, 90, -1));

        purch750qts.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        purch750qts.setText("0");
        jPanel5.add(purch750qts, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 50, 90, -1));

        purch1000qts.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        purch1000qts.setText("0");
        jPanel5.add(purch1000qts, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 90, 90, -1));

        purch1500qts.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        purch1500qts.setText("0");
        jPanel5.add(purch1500qts, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 130, 90, -1));

        purch5000qts.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        purch5000qts.setText("0");
        jPanel5.add(purch5000qts, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 170, 90, -1));

        purch7000qts.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        purch7000qts.setText("0");
        jPanel5.add(purch7000qts, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 210, 90, -1));

        purch500price.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        purch500price.setText("0");
        jPanel5.add(purch500price, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 10, 70, -1));

        purch750price.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        purch750price.setText("0");
        jPanel5.add(purch750price, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 50, 70, -1));

        purch1000price.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        purch1000price.setText("0");
        jPanel5.add(purch1000price, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 90, 70, -1));

        purch1500price.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        purch1500price.setText("0");
        jPanel5.add(purch1500price, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 130, 70, -1));

        purch5000price.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        purch5000price.setText("0");
        jPanel5.add(purch5000price, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 170, 70, -1));

        purch7000price.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        purch7000price.setText("0");
        jPanel5.add(purch7000price, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 210, 70, -1));

        jPanel3.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 40, 300, 250));

        jPanel7.setBackground(new java.awt.Color(51, 51, 255));
        jPanel7.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel19.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel19.setText("19 L");
        jPanel7.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 190, -1, -1));

        jLabel20.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel20.setText("10 L");
        jPanel7.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 150, -1, -1));

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel11.setText("19 L");
        jPanel7.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 60, -1, 20));

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel10.setText("10 L");
        jPanel7.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 20, -1, 20));

        purch10lqts.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        purch10lqts.setText("0");
        jPanel7.add(purch10lqts, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 20, 90, -1));

        purch19lqts.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        purch19lqts.setText("0");
        jPanel7.add(purch19lqts, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 60, 90, -1));

        purch10lprice.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        purch10lprice.setText("0");
        jPanel7.add(purch10lprice, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 20, 70, -1));

        purch19lprice.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        purch19lprice.setText("0");
        jPanel7.add(purch19lprice, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 60, 70, -1));

        jPanel3.add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 290, 300, 100));

        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(0, 0, 153));
        jLabel15.setText("Qts");
        jPanel3.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 10, -1, -1));

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(0, 0, 153));
        jLabel14.setText("Price");
        jPanel3.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 10, -1, -1));

        jPanel2.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 380, 390));

        jPanel4.setBackground(new java.awt.Color(153, 153, 255));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel6.setBackground(new java.awt.Color(0, 153, 102));
        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        purch10elqts.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        purch10elqts.setText("0");
        jPanel6.add(purch10elqts, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 50, 90, -1));

        purch19elqts.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        purch19elqts.setText("0");
        jPanel6.add(purch19elqts, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 90, 90, -1));

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 0, 153));
        jLabel9.setText("Empty Bottles");
        jPanel6.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, -1, -1));

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel13.setText("10 L Empty");
        jPanel6.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 50, -1, -1));

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel12.setText("19 L Empty");
        jPanel6.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 90, -1, -1));

        purch10elprice.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        purch10elprice.setText("0");
        jPanel6.add(purch10elprice, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 50, 70, -1));

        purch19elprice.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        purch19elprice.setText("0");
        jPanel6.add(purch19elprice, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 90, 70, -1));

        jPanel4.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 410, 120));

        jPanel9.setBackground(new java.awt.Color(255, 204, 204));
        jPanel9.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel21.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(0, 0, 153));
        jLabel21.setText("Dispencers");
        jPanel9.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, -1, -1));

        purchdisqts.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        purchdisqts.setText("0");
        jPanel9.add(purchdisqts, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 30, 90, -1));

        purchdisprice.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        purchdisprice.setText("0");
        jPanel9.add(purchdisprice, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 30, 70, -1));

        jPanel4.add(jPanel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 160, 410, 80));

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 0, 0));
        jButton1.setText("purchase");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel4.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 320, 170, 50));

        jLabel16.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(0, 0, 153));
        jLabel16.setText("Qts");
        jPanel4.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 10, -1, -1));

        jLabel22.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(0, 0, 153));
        jLabel22.setText("Price");
        jPanel4.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 10, -1, -1));

        jLabel18.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(0, 0, 153));
        jLabel18.setText("Category");
        jPanel4.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 10, -1, -1));

        datex.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jPanel4.add(datex, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 263, 260, 30));

        jLabel23.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel23.setText("Date");
        jPanel4.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 270, -1, -1));

        jPanel2.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 10, 410, 390));

        jButton2.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 0, 0));
        jButton2.setText("Home");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 420, 100, 30));

        jButton3.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jButton3.setForeground(new java.awt.Color(255, 0, 0));
        jButton3.setText("Purchase History");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 420, 180, 30));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, 830, 470));

        jScrollPane1.setBackground(new java.awt.Color(204, 153, 255));
        jScrollPane1.setBorder(null);
        jScrollPane1.setForeground(new java.awt.Color(204, 153, 255));
        jScrollPane1.setEnabled(false);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jTable1.setEnabled(false);
        jScrollPane1.setViewportView(jTable1);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, 10, 10));

        qts500.setEditable(false);
        qts500.setBackground(new java.awt.Color(204, 153, 255));
        qts500.setFont(new java.awt.Font("Tahoma", 0, 1)); // NOI18N
        qts500.setForeground(new java.awt.Color(204, 153, 255));
        qts500.setBorder(null);
        qts500.setEnabled(false);
        jPanel1.add(qts500, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, 10, 10));

        qts750.setEditable(false);
        qts750.setBackground(new java.awt.Color(204, 153, 255));
        qts750.setFont(new java.awt.Font("Tahoma", 0, 1)); // NOI18N
        qts750.setForeground(new java.awt.Color(204, 153, 255));
        qts750.setBorder(null);
        qts750.setEnabled(false);
        jPanel1.add(qts750, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, 10, 10));

        qts1000.setEditable(false);
        qts1000.setBackground(new java.awt.Color(204, 153, 255));
        qts1000.setFont(new java.awt.Font("Tahoma", 0, 1)); // NOI18N
        qts1000.setForeground(new java.awt.Color(204, 153, 255));
        qts1000.setBorder(null);
        qts1000.setEnabled(false);
        jPanel1.add(qts1000, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, 10, 10));

        qts1500.setEditable(false);
        qts1500.setBackground(new java.awt.Color(204, 153, 255));
        qts1500.setFont(new java.awt.Font("Tahoma", 0, 1)); // NOI18N
        qts1500.setForeground(new java.awt.Color(204, 153, 255));
        qts1500.setBorder(null);
        qts1500.setEnabled(false);
        jPanel1.add(qts1500, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, 10, 10));

        qts5000.setEditable(false);
        qts5000.setBackground(new java.awt.Color(204, 153, 255));
        qts5000.setFont(new java.awt.Font("Tahoma", 0, 1)); // NOI18N
        qts5000.setForeground(new java.awt.Color(204, 153, 255));
        qts5000.setBorder(null);
        qts5000.setEnabled(false);
        jPanel1.add(qts5000, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, 10, 10));

        qts7000.setEditable(false);
        qts7000.setBackground(new java.awt.Color(204, 153, 255));
        qts7000.setFont(new java.awt.Font("Tahoma", 0, 1)); // NOI18N
        qts7000.setForeground(new java.awt.Color(204, 153, 255));
        qts7000.setBorder(null);
        qts7000.setEnabled(false);
        jPanel1.add(qts7000, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 150, 10, 10));

        qts10l.setEditable(false);
        qts10l.setBackground(new java.awt.Color(204, 153, 255));
        qts10l.setFont(new java.awt.Font("Tahoma", 0, 1)); // NOI18N
        qts10l.setForeground(new java.awt.Color(204, 153, 255));
        qts10l.setBorder(null);
        qts10l.setEnabled(false);
        jPanel1.add(qts10l, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 160, 10, 10));

        qts19l.setEditable(false);
        qts19l.setBackground(new java.awt.Color(204, 153, 255));
        qts19l.setFont(new java.awt.Font("Tahoma", 0, 1)); // NOI18N
        qts19l.setForeground(new java.awt.Color(204, 153, 255));
        qts19l.setBorder(null);
        qts19l.setEnabled(false);
        jPanel1.add(qts19l, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 170, 10, 10));

        qts10el.setEditable(false);
        qts10el.setBackground(new java.awt.Color(204, 153, 255));
        qts10el.setFont(new java.awt.Font("Tahoma", 0, 1)); // NOI18N
        qts10el.setForeground(new java.awt.Color(204, 153, 255));
        qts10el.setBorder(null);
        qts10el.setEnabled(false);
        jPanel1.add(qts10el, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 180, 10, 10));

        qts19el.setEditable(false);
        qts19el.setBackground(new java.awt.Color(204, 153, 255));
        qts19el.setFont(new java.awt.Font("Tahoma", 0, 1)); // NOI18N
        qts19el.setForeground(new java.awt.Color(204, 153, 255));
        qts19el.setBorder(null);
        qts19el.setEnabled(false);
        jPanel1.add(qts19el, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 190, 10, 10));

        qtsdis.setEditable(false);
        qtsdis.setBackground(new java.awt.Color(204, 153, 255));
        qtsdis.setFont(new java.awt.Font("Tahoma", 0, 1)); // NOI18N
        qtsdis.setForeground(new java.awt.Color(204, 153, 255));
        qtsdis.setBorder(null);
        qtsdis.setEnabled(false);
        jPanel1.add(qtsdis, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 200, 10, 10));

        jScrollPane2.setBackground(new java.awt.Color(204, 153, 255));
        jScrollPane2.setBorder(null);
        jScrollPane2.setForeground(new java.awt.Color(204, 153, 255));
        jScrollPane2.setEnabled(false);

        total.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        total.setEnabled(false);
        jScrollPane2.setViewportView(total);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, 10, 10));

        total500.setEditable(false);
        total500.setBackground(new java.awt.Color(204, 153, 255));
        total500.setFont(new java.awt.Font("Tahoma", 0, 1)); // NOI18N
        total500.setForeground(new java.awt.Color(204, 153, 255));
        total500.setBorder(null);
        total500.setEnabled(false);
        jPanel1.add(total500, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 210, 10, 10));

        total750.setEditable(false);
        total750.setBackground(new java.awt.Color(204, 153, 255));
        total750.setFont(new java.awt.Font("Tahoma", 0, 1)); // NOI18N
        total750.setForeground(new java.awt.Color(204, 153, 255));
        total750.setBorder(null);
        total750.setEnabled(false);
        jPanel1.add(total750, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 220, 10, 10));

        total1000.setEditable(false);
        total1000.setBackground(new java.awt.Color(204, 153, 255));
        total1000.setFont(new java.awt.Font("Tahoma", 0, 1)); // NOI18N
        total1000.setForeground(new java.awt.Color(204, 153, 255));
        total1000.setBorder(null);
        total1000.setEnabled(false);
        jPanel1.add(total1000, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 230, 10, 10));

        total1500.setEditable(false);
        total1500.setBackground(new java.awt.Color(204, 153, 255));
        total1500.setFont(new java.awt.Font("Tahoma", 0, 1)); // NOI18N
        total1500.setForeground(new java.awt.Color(204, 153, 255));
        total1500.setBorder(null);
        total1500.setEnabled(false);
        jPanel1.add(total1500, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 240, 10, 10));

        total5000.setEditable(false);
        total5000.setBackground(new java.awt.Color(204, 153, 255));
        total5000.setFont(new java.awt.Font("Tahoma", 0, 1)); // NOI18N
        total5000.setForeground(new java.awt.Color(204, 153, 255));
        total5000.setBorder(null);
        total5000.setEnabled(false);
        jPanel1.add(total5000, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 250, 10, 10));

        total7000.setEditable(false);
        total7000.setBackground(new java.awt.Color(204, 153, 255));
        total7000.setFont(new java.awt.Font("Tahoma", 0, 1)); // NOI18N
        total7000.setForeground(new java.awt.Color(204, 153, 255));
        total7000.setBorder(null);
        total7000.setEnabled(false);
        jPanel1.add(total7000, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 260, 10, 10));

        total10l.setEditable(false);
        total10l.setBackground(new java.awt.Color(204, 153, 255));
        total10l.setFont(new java.awt.Font("Tahoma", 0, 1)); // NOI18N
        total10l.setForeground(new java.awt.Color(204, 153, 255));
        total10l.setBorder(null);
        total10l.setEnabled(false);
        jPanel1.add(total10l, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 270, 10, 10));

        total19l.setEditable(false);
        total19l.setBackground(new java.awt.Color(204, 153, 255));
        total19l.setFont(new java.awt.Font("Tahoma", 0, 1)); // NOI18N
        total19l.setForeground(new java.awt.Color(204, 153, 255));
        total19l.setBorder(null);
        total19l.setEnabled(false);
        jPanel1.add(total19l, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 280, 10, 10));

        total10el.setEditable(false);
        total10el.setBackground(new java.awt.Color(204, 153, 255));
        total10el.setFont(new java.awt.Font("Tahoma", 0, 1)); // NOI18N
        total10el.setForeground(new java.awt.Color(204, 153, 255));
        total10el.setBorder(null);
        total10el.setEnabled(false);
        jPanel1.add(total10el, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 290, 10, 10));

        total19el.setEditable(false);
        total19el.setBackground(new java.awt.Color(204, 153, 255));
        total19el.setFont(new java.awt.Font("Tahoma", 0, 1)); // NOI18N
        total19el.setForeground(new java.awt.Color(204, 153, 255));
        total19el.setBorder(null);
        total19el.setEnabled(false);
        jPanel1.add(total19el, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 300, 10, 10));

        totaldis.setEditable(false);
        totaldis.setBackground(new java.awt.Color(204, 153, 255));
        totaldis.setFont(new java.awt.Font("Tahoma", 0, 1)); // NOI18N
        totaldis.setForeground(new java.awt.Color(204, 153, 255));
        totaldis.setBorder(null);
        totaldis.setEnabled(false);
        jPanel1.add(totaldis, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 310, 10, 10));

        jScrollPane3.setBackground(new java.awt.Color(204, 153, 255));
        jScrollPane3.setBorder(null);
        jScrollPane3.setForeground(new java.awt.Color(204, 153, 255));
        jScrollPane3.setEnabled(false);

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jTable2.setEnabled(false);
        jScrollPane3.setViewportView(jTable2);

        jPanel1.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, 10, 10));

        monthtxt.setEditable(false);
        monthtxt.setBackground(new java.awt.Color(204, 153, 255));
        monthtxt.setFont(new java.awt.Font("Tahoma", 0, 1)); // NOI18N
        monthtxt.setForeground(new java.awt.Color(204, 153, 255));
        monthtxt.setBorder(null);
        monthtxt.setEnabled(false);
        jPanel1.add(monthtxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, 10, 10));

        dat.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        dat.setForeground(new java.awt.Color(255, 102, 102));
        dat.setText("Date");
        jPanel1.add(dat, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 10, 70, -1));

        jTextField1.setEditable(false);
        jTextField1.setBackground(new java.awt.Color(204, 153, 255));
        jTextField1.setFont(new java.awt.Font("Tahoma", 0, 1)); // NOI18N
        jTextField1.setForeground(new java.awt.Color(204, 153, 255));
        jTextField1.setBorder(null);
        jTextField1.setEnabled(false);
        jPanel1.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 510, 10, 10));

        jTextField2.setEditable(false);
        jTextField2.setBackground(new java.awt.Color(204, 153, 255));
        jTextField2.setFont(new java.awt.Font("Tahoma", 0, 1)); // NOI18N
        jTextField2.setForeground(new java.awt.Color(204, 153, 255));
        jTextField2.setBorder(null);
        jTextField2.setEnabled(false);
        jPanel1.add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 320, 10, 10));

        jTextField3.setEditable(false);
        jTextField3.setBackground(new java.awt.Color(204, 153, 255));
        jTextField3.setFont(new java.awt.Font("Tahoma", 0, 1)); // NOI18N
        jTextField3.setForeground(new java.awt.Color(204, 153, 255));
        jTextField3.setBorder(null);
        jTextField3.setEnabled(false);
        jPanel1.add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 330, 10, 10));

        jTextField4.setEditable(false);
        jTextField4.setBackground(new java.awt.Color(204, 153, 255));
        jTextField4.setFont(new java.awt.Font("Tahoma", 0, 1)); // NOI18N
        jTextField4.setForeground(new java.awt.Color(204, 153, 255));
        jTextField4.setBorder(null);
        jTextField4.setEnabled(false);
        jPanel1.add(jTextField4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 340, 10, 10));

        jTextField5.setEditable(false);
        jTextField5.setBackground(new java.awt.Color(204, 153, 255));
        jTextField5.setFont(new java.awt.Font("Tahoma", 0, 1)); // NOI18N
        jTextField5.setForeground(new java.awt.Color(204, 153, 255));
        jTextField5.setBorder(null);
        jTextField5.setEnabled(false);
        jPanel1.add(jTextField5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 350, 10, 10));

        jTextField6.setEditable(false);
        jTextField6.setBackground(new java.awt.Color(204, 153, 255));
        jTextField6.setFont(new java.awt.Font("Tahoma", 0, 1)); // NOI18N
        jTextField6.setForeground(new java.awt.Color(204, 153, 255));
        jTextField6.setBorder(null);
        jTextField6.setEnabled(false);
        jPanel1.add(jTextField6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 360, 10, 10));

        jTextField7.setEditable(false);
        jTextField7.setBackground(new java.awt.Color(204, 153, 255));
        jTextField7.setFont(new java.awt.Font("Tahoma", 0, 1)); // NOI18N
        jTextField7.setForeground(new java.awt.Color(204, 153, 255));
        jTextField7.setBorder(null);
        jTextField7.setEnabled(false);
        jPanel1.add(jTextField7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 370, 10, 10));

        jTextField8.setEditable(false);
        jTextField8.setBackground(new java.awt.Color(204, 153, 255));
        jTextField8.setFont(new java.awt.Font("Tahoma", 0, 1)); // NOI18N
        jTextField8.setForeground(new java.awt.Color(204, 153, 255));
        jTextField8.setBorder(null);
        jTextField8.setEnabled(false);
        jPanel1.add(jTextField8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 380, 10, 10));

        jTextField9.setEditable(false);
        jTextField9.setBackground(new java.awt.Color(204, 153, 255));
        jTextField9.setFont(new java.awt.Font("Tahoma", 0, 1)); // NOI18N
        jTextField9.setForeground(new java.awt.Color(204, 153, 255));
        jTextField9.setBorder(null);
        jTextField9.setEnabled(false);
        jPanel1.add(jTextField9, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 390, 10, 10));

        jTextField10.setEditable(false);
        jTextField10.setBackground(new java.awt.Color(204, 153, 255));
        jTextField10.setFont(new java.awt.Font("Tahoma", 0, 1)); // NOI18N
        jTextField10.setForeground(new java.awt.Color(204, 153, 255));
        jTextField10.setBorder(null);
        jTextField10.setEnabled(false);
        jPanel1.add(jTextField10, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 400, 10, 10));

        jTextField11.setEditable(false);
        jTextField11.setBackground(new java.awt.Color(204, 153, 255));
        jTextField11.setFont(new java.awt.Font("Tahoma", 0, 1)); // NOI18N
        jTextField11.setForeground(new java.awt.Color(204, 153, 255));
        jTextField11.setBorder(null);
        jTextField11.setEnabled(false);
        jPanel1.add(jTextField11, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 410, 10, 10));

        jTextField12.setEditable(false);
        jTextField12.setBackground(new java.awt.Color(204, 153, 255));
        jTextField12.setFont(new java.awt.Font("Tahoma", 0, 1)); // NOI18N
        jTextField12.setForeground(new java.awt.Color(204, 153, 255));
        jTextField12.setBorder(null);
        jTextField12.setEnabled(false);
        jPanel1.add(jTextField12, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 420, 10, 10));

        jTextField13.setEditable(false);
        jTextField13.setBackground(new java.awt.Color(204, 153, 255));
        jTextField13.setFont(new java.awt.Font("Tahoma", 0, 1)); // NOI18N
        jTextField13.setForeground(new java.awt.Color(204, 153, 255));
        jTextField13.setBorder(null);
        jTextField13.setEnabled(false);
        jPanel1.add(jTextField13, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 430, 10, 10));

        jTextField14.setEditable(false);
        jTextField14.setBackground(new java.awt.Color(204, 153, 255));
        jTextField14.setFont(new java.awt.Font("Tahoma", 0, 1)); // NOI18N
        jTextField14.setForeground(new java.awt.Color(204, 153, 255));
        jTextField14.setBorder(null);
        jTextField14.setEnabled(false);
        jPanel1.add(jTextField14, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 440, 10, 10));

        jTextField15.setEditable(false);
        jTextField15.setBackground(new java.awt.Color(204, 153, 255));
        jTextField15.setFont(new java.awt.Font("Tahoma", 0, 1)); // NOI18N
        jTextField15.setForeground(new java.awt.Color(204, 153, 255));
        jTextField15.setBorder(null);
        jTextField15.setEnabled(false);
        jPanel1.add(jTextField15, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 450, 10, 10));

        jTextField16.setEditable(false);
        jTextField16.setBackground(new java.awt.Color(204, 153, 255));
        jTextField16.setFont(new java.awt.Font("Tahoma", 0, 1)); // NOI18N
        jTextField16.setForeground(new java.awt.Color(204, 153, 255));
        jTextField16.setBorder(null);
        jTextField16.setEnabled(false);
        jPanel1.add(jTextField16, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 460, 10, 10));

        jTextField17.setEditable(false);
        jTextField17.setBackground(new java.awt.Color(204, 153, 255));
        jTextField17.setFont(new java.awt.Font("Tahoma", 0, 1)); // NOI18N
        jTextField17.setForeground(new java.awt.Color(204, 153, 255));
        jTextField17.setBorder(null);
        jTextField17.setEnabled(false);
        jPanel1.add(jTextField17, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 470, 10, 10));

        jTextField18.setEditable(false);
        jTextField18.setBackground(new java.awt.Color(204, 153, 255));
        jTextField18.setFont(new java.awt.Font("Tahoma", 0, 1)); // NOI18N
        jTextField18.setForeground(new java.awt.Color(204, 153, 255));
        jTextField18.setBorder(null);
        jTextField18.setEnabled(false);
        jPanel1.add(jTextField18, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 480, 10, 10));

        jTextField19.setEditable(false);
        jTextField19.setBackground(new java.awt.Color(204, 153, 255));
        jTextField19.setFont(new java.awt.Font("Tahoma", 0, 1)); // NOI18N
        jTextField19.setForeground(new java.awt.Color(204, 153, 255));
        jTextField19.setBorder(null);
        jTextField19.setEnabled(false);
        jPanel1.add(jTextField19, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 490, 10, 10));

        jTextField20.setEditable(false);
        jTextField20.setBackground(new java.awt.Color(204, 153, 255));
        jTextField20.setFont(new java.awt.Font("Tahoma", 0, 1)); // NOI18N
        jTextField20.setForeground(new java.awt.Color(204, 153, 255));
        jTextField20.setBorder(null);
        jTextField20.setEnabled(false);
        jPanel1.add(jTextField20, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 500, 10, 10));

        jTextField21.setEditable(false);
        jTextField21.setBackground(new java.awt.Color(204, 153, 255));
        jTextField21.setFont(new java.awt.Font("Tahoma", 0, 1)); // NOI18N
        jTextField21.setForeground(new java.awt.Color(204, 153, 255));
        jTextField21.setBorder(null);
        jTextField21.setEnabled(false);
        jPanel1.add(jTextField21, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 520, 10, 10));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 880, 550));

        setSize(new java.awt.Dimension(888, 585));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        
        
        
        String date = datex.getText();
       
        
        BigDecimal purchase500qts = new BigDecimal(purch500qts.getText());
        BigDecimal purchase750qts = new BigDecimal(purch750qts.getText());
        BigDecimal purchase1000qts = new BigDecimal(purch1000qts.getText());
        BigDecimal purchase1500qts = new BigDecimal(purch1500qts.getText());
        BigDecimal purchase5000qts = new BigDecimal(purch5000qts.getText());
        BigDecimal purchase7000qts = new BigDecimal(purch7000qts.getText());
        BigDecimal purchase10lqts = new BigDecimal(purch10lqts.getText());
        BigDecimal purchase19lqts = new BigDecimal(purch19lqts.getText());
        BigDecimal purchase10elqts = new BigDecimal(purch10elqts.getText());
        BigDecimal purchase19elqts = new BigDecimal(purch19elqts.getText());
        BigDecimal purchasedisqts = new BigDecimal(purchdisqts.getText());
       
       
       
       
       
        BigDecimal purchase500price = new BigDecimal(purch500price.getText());
        BigDecimal purchase750price = new BigDecimal(purch750price.getText());
        BigDecimal purchase1000price = new BigDecimal(purch1000price.getText());
        BigDecimal purchase1500price = new BigDecimal(purch1500price.getText());
        BigDecimal purchase5000price = new BigDecimal(purch5000price.getText());
        BigDecimal purchase7000price = new BigDecimal(purch7000price.getText());
        BigDecimal purchase10lprice = new BigDecimal(purch10lprice.getText());
        BigDecimal purchase19lprice = new BigDecimal(purch19lprice.getText());
        BigDecimal purchase10elprice = new BigDecimal(purch10elprice.getText());
        BigDecimal purchase19elprice = new BigDecimal(purch19elprice.getText());
        BigDecimal purchasedisprice = new BigDecimal(purchdisprice.getText());
       
       
       BigDecimal total = purchase500qts.multiply(purchase500price).add(purchase750qts.multiply(purchase750price)).add(purchase1000qts.multiply(purchase1000price).add(purchase1500qts.multiply(purchase1500price))).add(purchase5000qts.multiply(purchase5000price).add(purchase7000qts.multiply(purchase7000price)).add(purchase10lqts.multiply(purchase10lprice).add(purchase19lqts.multiply(purchase19lprice)))).add(purchase10elqts.multiply(purchase10elprice).add(purchase19elqts.multiply(purchase19elprice)).add(purchasedisqts.multiply(purchasedisprice))) ;
       
       
        try 
        {
            String sql = "INSERT INTO purchase ( date , ml500 , ml750 ,ml1000 , ml1500  , ml5000 , ml7000 , l10 ,l19 , el10 , el19 ,dispencer , total )VALUES('"+date+"'  , '"+purchase500qts+"' ,'"+purchase750qts+"','"+purchase1000qts+"','"+purchase1500qts+"','"+purchase5000qts+"', '"+purchase7000qts+"','"+purchase10lqts+"','"+purchase19lqts+"' ,'"+purchase10elqts+"','"+purchase19elqts+"','"+purchasedisqts+"' , '"+total+"' )";
            
            pst = conn.prepareStatement(sql);
            pst.execute();
            JOptionPane.showMessageDialog(null,"Inserted!");
        } 
        catch (HeadlessException | SQLException e) 
        {
            JOptionPane.showMessageDialog(null,e);
        }
        
        
        updatestore() ;
        clear();
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
         Home objectHome = new Home();
            objectHome.setVisible(true);
            this.dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
            Purchase2 objectPurchase2 = new Purchase2();
            objectPurchase2.setVisible(true);
            this.dispose();
    }//GEN-LAST:event_jButton3ActionPerformed

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
            java.util.logging.Logger.getLogger(purchase.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(purchase.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(purchase.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(purchase.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new purchase().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel dat;
    private javax.swing.JTextField datex;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
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
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField10;
    private javax.swing.JTextField jTextField11;
    private javax.swing.JTextField jTextField12;
    private javax.swing.JTextField jTextField13;
    private javax.swing.JTextField jTextField14;
    private javax.swing.JTextField jTextField15;
    private javax.swing.JTextField jTextField16;
    private javax.swing.JTextField jTextField17;
    private javax.swing.JTextField jTextField18;
    private javax.swing.JTextField jTextField19;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField20;
    private javax.swing.JTextField jTextField21;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField8;
    private javax.swing.JTextField jTextField9;
    private javax.swing.JTextField monthtxt;
    private javax.swing.JTextField purch1000price;
    private javax.swing.JTextField purch1000qts;
    private javax.swing.JTextField purch10elprice;
    private javax.swing.JTextField purch10elqts;
    private javax.swing.JTextField purch10lprice;
    private javax.swing.JTextField purch10lqts;
    private javax.swing.JTextField purch1500price;
    private javax.swing.JTextField purch1500qts;
    private javax.swing.JTextField purch19elprice;
    private javax.swing.JTextField purch19elqts;
    private javax.swing.JTextField purch19lprice;
    private javax.swing.JTextField purch19lqts;
    private javax.swing.JTextField purch5000price;
    private javax.swing.JTextField purch5000qts;
    private javax.swing.JTextField purch500price;
    private javax.swing.JTextField purch500qts;
    private javax.swing.JTextField purch7000price;
    private javax.swing.JTextField purch7000qts;
    private javax.swing.JTextField purch750price;
    private javax.swing.JTextField purch750qts;
    private javax.swing.JTextField purchdisprice;
    private javax.swing.JTextField purchdisqts;
    private javax.swing.JTextField qts1000;
    private javax.swing.JTextField qts10el;
    private javax.swing.JTextField qts10l;
    private javax.swing.JTextField qts1500;
    private javax.swing.JTextField qts19el;
    private javax.swing.JTextField qts19l;
    private javax.swing.JTextField qts500;
    private javax.swing.JTextField qts5000;
    private javax.swing.JTextField qts7000;
    private javax.swing.JTextField qts750;
    private javax.swing.JTextField qtsdis;
    private javax.swing.JTable total;
    private javax.swing.JTextField total1000;
    private javax.swing.JTextField total10el;
    private javax.swing.JTextField total10l;
    private javax.swing.JTextField total1500;
    private javax.swing.JTextField total19el;
    private javax.swing.JTextField total19l;
    private javax.swing.JTextField total500;
    private javax.swing.JTextField total5000;
    private javax.swing.JTextField total7000;
    private javax.swing.JTextField total750;
    private javax.swing.JTextField totaldis;
    // End of variables declaration//GEN-END:variables
}
