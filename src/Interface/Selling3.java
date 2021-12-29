package Interface;

import Codes.DBconnect;
import java.awt.HeadlessException;
import java.math.BigDecimal;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import java.sql.SQLException;
import java.sql.Statement;
import java.util.Calendar;
import java.util.GregorianCalendar;
import javax.swing.JOptionPane;
import static jdk.nashorn.internal.runtime.Debug.id;
import net.proteanit.sql.DbUtils;
import static org.omg.CORBA.AnySeqHelper.id;
import static org.omg.CORBA.ServiceDetailHelper.id;
import static org.omg.CORBA.SetOverrideTypeHelper.id;

public class Selling3 extends javax.swing.JFrame {

    BigDecimal newqts500, newpricePer500, newtotalPrice500;

    Connection conn = null;
    PreparedStatement pst = null;
    ResultSet rs1 = null;

    public Selling3() {
        initComponents();

        conn = DBconnect.connect();
        CurrentDeta();
    

        tableload2();
        tabledeta2();

        tableload3();
        tabledeta3();

        tableload4();
        tabledeta4();

        tableload5();
        tabledeta5();

        tableload6();
        tabledeta6();

        tableload7();

        //  tableload8();
        // tabledeta8();
    }

    //date
    public void CurrentDeta() {
        Calendar cal = new GregorianCalendar();
        int month = cal.get(Calendar.MONTH);
        int year = cal.get(Calendar.YEAR);
        int day = cal.get(Calendar.DAY_OF_MONTH);

        dat.setText(year + "-" + (month + 1) + "-" + day);
        sellingdate.setText(year + "-" + (month + 1) + "-" + day);

    }

   

    //clear
    public void clear() {

        type500new.setText("");
        type750new.setText("");
        type1000new.setText("");
        type1500new.setText("");
        type5000new.setText("");
        type7000new.setText("");
        type10lnew.setText("");
        type19lnew.setText("");
        type10elnew.setText("");
        type19elnew.setText("");
        typedisnew.setText("");

        sell500type.setText("");
        sell750type.setText("");
        sell1000type.setText("");
        sell1500type.setText("");
        sell5000type.setText("");
        sell7000type.setText("");
        sell10ltype.setText("");
        sell19ltype.setText("");
        sell10eltype.setText("");
        sell19eltype.setText("");
        selldistype.setText("");

        txtinvoice.setText("");
        namebox.setText("");
        sellingdate.setText("");
        profitbox.setText("");

    }

    //store ,price load
    public void tableload2() {
        try {
            String sql = "SELECT price_per_one  FROM store  ";
            pst = conn.prepareStatement(sql);
            rs1 = pst.executeQuery();
            pricepertable.setModel(DbUtils.resultSetToTableModel(rs1));
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }

    //price get from variable
    public void tabledeta2() {
        // int r =pricepertable.getValueAt(r , 0);

        String ml500 = pricepertable.getValueAt(0, 0).toString();
        String ml750 = pricepertable.getValueAt(1, 0).toString();
        String ml1000 = pricepertable.getValueAt(2, 0).toString();
        String ml1500 = pricepertable.getValueAt(3, 0).toString();
        String ml5000 = pricepertable.getValueAt(4, 0).toString();
        String ml7000 = pricepertable.getValueAt(5, 0).toString();

        String l10 = pricepertable.getValueAt(6, 0).toString();
        String l19 = pricepertable.getValueAt(7, 0).toString();
        String el10 = pricepertable.getValueAt(8, 0).toString();
        String el19 = pricepertable.getValueAt(9, 0).toString();

        String dis = pricepertable.getValueAt(10, 0).toString();

        rs500.setText(ml500);
        rs750.setText(ml750);
        rs1000.setText(ml1000);
        rs1500.setText(ml1500);
        rs5000.setText(ml5000);
        rs7000.setText(ml7000);

        rs10l.setText(l10);
        rs19l.setText(l19);
        rs10el.setText(el10);
        rs19el.setText(el19);

        rsdis.setText(dis);

    }

    //store ,load qts
    public void tableload3() {
        try {
            String sql2 = "SELECT qts  FROM store  ";
            pst = conn.prepareStatement(sql2);
            rs1 = pst.executeQuery();
            qtstable.setModel(DbUtils.resultSetToTableModel(rs1));
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }

    //qts set for varible
    public void tabledeta3() {
        // int r =pricepertable.getValueAt(r , 0);

        String qtsml500 = qtstable.getValueAt(0, 0).toString();
        String qtsml750 = qtstable.getValueAt(1, 0).toString();
        String qtsml1000 = qtstable.getValueAt(2, 0).toString();
        String qtsml1500 = qtstable.getValueAt(3, 0).toString();
        String qtsml5000 = qtstable.getValueAt(4, 0).toString();
        String qtsml7000 = qtstable.getValueAt(5, 0).toString();

        String qtsl10 = qtstable.getValueAt(6, 0).toString();
        String qtsl19 = qtstable.getValueAt(7, 0).toString();
        String qtsel10 = qtstable.getValueAt(8, 0).toString();
        String qtsel19 = qtstable.getValueAt(9, 0).toString();

        String qtsdiss = qtstable.getValueAt(10, 0).toString();

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

    public void tableload4() {
        try {
            String sql2 = "SELECT price_per_one  FROM store  ";
            pst = conn.prepareStatement(sql2);
            rs1 = pst.executeQuery();
            priceone.setModel(DbUtils.resultSetToTableModel(rs1));
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }

    public void tabledeta4() {
        // int r =pricepertable.getValueAt(r , 0);

        String priceml500 = priceone.getValueAt(0, 0).toString();
        String priceml750 = priceone.getValueAt(1, 0).toString();
        String priceml1000 = priceone.getValueAt(2, 0).toString();
        String priceml1500 = priceone.getValueAt(3, 0).toString();
        String priceml5000 = priceone.getValueAt(4, 0).toString();
        String priceml7000 = priceone.getValueAt(5, 0).toString();

        String pricel10 = priceone.getValueAt(6, 0).toString();
        String pricel19 = priceone.getValueAt(7, 0).toString();
        String priceel10 = priceone.getValueAt(8, 0).toString();
        String priceel19 = priceone.getValueAt(9, 0).toString();

        String pricediss = priceone.getValueAt(10, 0).toString();

        price500.setText(priceml500);
        price750.setText(priceml750);
        price1000.setText(priceml1000);
        price1500.setText(priceml1500);
        price5000.setText(priceml5000);
        price7000.setText(priceml7000);

        price10l.setText(pricel10);
        price19l.setText(pricel19);
        price10el.setText(priceel10);
        price19el.setText(priceel19);

        pricedis.setText(pricediss);

    }

    public void tableload5() {
        try {
            String sql = "SELECT selling_qts  FROM store  ";
            pst = conn.prepareStatement(sql);
            rs1 = pst.executeQuery();
            sellingqts.setModel(DbUtils.resultSetToTableModel(rs1));
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }

    public void tabledeta5() {
        // int r =pricepertable.getValueAt(r , 0);

        String sellingqts500 = sellingqts.getValueAt(0, 0).toString();
        String sellingqts750 = sellingqts.getValueAt(1, 0).toString();
        String sellingqts1000 = sellingqts.getValueAt(2, 0).toString();
        String sellingqts1500 = sellingqts.getValueAt(3, 0).toString();
        String sellingqts5000 = sellingqts.getValueAt(4, 0).toString();
        String sellingqts7000 = sellingqts.getValueAt(5, 0).toString();

        String sellingqts10l = sellingqts.getValueAt(6, 0).toString();
        String sellingqts19l = sellingqts.getValueAt(7, 0).toString();
        String sellingqts10el = sellingqts.getValueAt(8, 0).toString();
        String sellingqts19el = sellingqts.getValueAt(9, 0).toString();

        String sellingqtsdiss = sellingqts.getValueAt(10, 0).toString();

        sellqt500.setText(sellingqts500);
        sellqt750.setText(sellingqts750);
        sellqt1000.setText(sellingqts1000);
        sellqt1500.setText(sellingqts1500);
        sellqt5000.setText(sellingqts5000);
        sellqt7000.setText(sellingqts7000);

        sellqt10l.setText(sellingqts10l);
        sellqt19l.setText(sellingqts19l);
        sellqt10el.setText(sellingqts10el);
        sellqt19el.setText(sellingqts19el);

        sellqtdis.setText(sellingqtsdiss);

    }

    public void tableload6() {
        try {
            String sql = "SELECT selling_total_price  FROM store  ";
            pst = conn.prepareStatement(sql);
            rs1 = pst.executeQuery();
            sellingtotal.setModel(DbUtils.resultSetToTableModel(rs1));
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }

    public void tabledeta6() {
        // int r =pricepertable.getValueAt(r , 0);

        String sellingto500 = sellingtotal.getValueAt(0, 0).toString();
        String sellingto750 = sellingtotal.getValueAt(1, 0).toString();
        String sellingto1000 = sellingtotal.getValueAt(2, 0).toString();
        String sellingto1500 = sellingtotal.getValueAt(3, 0).toString();
        String sellingto5000 = sellingtotal.getValueAt(4, 0).toString();
        String sellingto7000 = sellingtotal.getValueAt(5, 0).toString();

        String sellingto10l = sellingtotal.getValueAt(6, 0).toString();
        String sellingto19l = sellingtotal.getValueAt(7, 0).toString();
        String sellingto10el = sellingtotal.getValueAt(8, 0).toString();
        String sellingto19el = sellingtotal.getValueAt(9, 0).toString();

        String sellingtodiss = sellingtotal.getValueAt(10, 0).toString();

        sellto500.setText(sellingto500);
        sellto750.setText(sellingto750);
        sellto1000.setText(sellingto1000);
        sellto1500.setText(sellingto1500);
        sellto5000.setText(sellingto5000);
        sellto7000.setText(sellingto7000);

        sellto10l.setText(sellingto10l);
        sellto19l.setText(sellingto19l);
        sellto10el.setText(sellingto10el);
        sellto19el.setText(sellingto19el);

        selltodis.setText(sellingtodiss);

    }

    public void tableload7() {
        try {
            String sql = "SELECT c_invoice AS Coustomer_ID , c_name AS Coustomer_Name  FROM customer  ";
            pst = conn.prepareStatement(sql);
            rs1 = pst.executeQuery();
            nametable.setModel(DbUtils.resultSetToTableModel(rs1));
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }

    public void tabledeta7() {
        int r = nametable.getSelectedRow();

        String invo = nametable.getValueAt(r, 0).toString();
        String nam = nametable.getValueAt(r, 1).toString();

        txtinvoice.setText(invo);
        namebox.setText(nam);
    }

    public void tableload8() {
        try {
            String sql2 = "SELECT price_per_one  FROM store  ";
            pst = conn.prepareStatement(sql2);
            rs1 = pst.executeQuery();
            jTable123.setModel(DbUtils.resultSetToTableModel(rs1));
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }

    //qts set for varible
    /* public void tabledeta8(){
      // int r =pricepertable.getValueAt(r , 0);
       
       String priceml500 = jTable123.getValueAt(0 , 0).toString(); 
       String priceml750 = jTable123.getValueAt( 1, 0).toString(); 
       String priceml1000 = jTable123.getValueAt(2 , 0).toString(); 
       String priceml1500 = jTable123.getValueAt(3 , 0).toString(); 
       String priceml5000 =jTable123.getValueAt(4 , 0).toString(); 
       String priceml7000 = jTable123.getValueAt(5 , 0).toString(); 
       
       String pricel10 = jTable123.getValueAt( 6, 0).toString(); 
       String pricel19 = jTable123.getValueAt(7 , 0).toString(); 
       String priceel10 =jTable123.getValueAt(8 , 0).toString(); 
       String priceel19 =jTable123.getValueAt(9 , 0).toString(); 
       
        String pricediss =jTable123.getValueAt(10 , 0).toString(); 
    
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
    
     */
    public void updatestore() {

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

        BigDecimal sell500  = new BigDecimal(type500new.getText());
        BigDecimal sell750  = new BigDecimal(type750new.getText());
        BigDecimal sell1000 = new BigDecimal(type1000new.getText());
        BigDecimal sell1500 = new BigDecimal(type1500new.getText());
        BigDecimal sell5000 =new BigDecimal(type5000new.getText());
        BigDecimal sell7000 = new BigDecimal(type7000new.getText());
        BigDecimal sell10l  = new BigDecimal(type10lnew.getText());
        BigDecimal sell19l  = new BigDecimal(type19lnew.getText());
        BigDecimal sell10el = new BigDecimal(type10elnew.getText());
        BigDecimal sell19el = new BigDecimal(type19elnew.getText());
        BigDecimal selldis  = new BigDecimal(typedisnew.getText());

        BigDecimal qts500new  = qts500old.subtract(sell500);
        BigDecimal qts750new  = qts750old.subtract(sell750);
        BigDecimal qts1000new = qts1000old.subtract(sell1000);
        BigDecimal qts1500new = qts1500old.subtract(sell1500);
        BigDecimal qts5000new = qts5000old.subtract(sell5000);
        BigDecimal qts7000new = qts7000old.subtract(sell7000);
        BigDecimal qts10lnew  = qts10lold.subtract(sell10l);
        BigDecimal qts19lnew  = qts19lold.subtract(sell19l);
        BigDecimal qts10elnew = qts10elold.add(sell10el);
        BigDecimal qts19elnew = qts19elold.add(sell19el);
        BigDecimal qtsdisnew  = qtsdisold.subtract(selldis);

        BigDecimal price500old  = new BigDecimal(price500.getText());
        BigDecimal price750old  = new BigDecimal(price750.getText());
        BigDecimal price1000old = new BigDecimal(price1000.getText());
        BigDecimal price1500old = new BigDecimal(price1500.getText());
        BigDecimal price5000old = new BigDecimal(price5000.getText());
        BigDecimal price7000old = new BigDecimal(price7000.getText());
        BigDecimal price10lold  = new BigDecimal(price10l.getText());
        BigDecimal price19lold  = new BigDecimal(price19l.getText());
        BigDecimal price10elold = new BigDecimal(price10el.getText());
        BigDecimal price19elold = new BigDecimal(price19el.getText());
        BigDecimal pricedisold  = new BigDecimal(pricedis.getText());

        BigDecimal total500new  = qts500new.multiply(price500old);
        BigDecimal total750new  = qts750new.multiply(price750old);
        BigDecimal total1000new = qts1000new.multiply(price1000old);
        BigDecimal total1500new = qts1500new.multiply(price1500old);
        BigDecimal total5000new = qts5000new.multiply(price5000old);
        BigDecimal total7000new = qts7000new.multiply(price7000old);
        BigDecimal total10lnew  = qts10lnew.multiply(price10lold);
        BigDecimal total19lnew  = qts19lnew.multiply(price19lold);
        BigDecimal total10elnew = qts10elnew.multiply(price10elold);
        BigDecimal total19elnew = qts19elnew.multiply(price19elold);
        BigDecimal totaldisnew  = qtsdisnew.multiply(pricedisold);

        BigDecimal sell500price  = new BigDecimal(sell500type.getText());
        BigDecimal sell750price  = new BigDecimal(sell750type.getText());
        BigDecimal sell1000price = new BigDecimal(sell1000type.getText());
        BigDecimal sell1500price = new BigDecimal(sell1500type.getText());
        BigDecimal sell5000price = new BigDecimal(sell5000type.getText());
        BigDecimal sell7000price = new BigDecimal(sell7000type.getText());
        BigDecimal sell10lprice  = new BigDecimal(sell10ltype.getText());
        BigDecimal sell19lprice  = new BigDecimal(sell19ltype.getText());
        BigDecimal sell10elprice = new BigDecimal(sell10eltype.getText());
        BigDecimal sell19elprice = new BigDecimal(sell19eltype.getText());
        BigDecimal selldisprice  = new BigDecimal(selldistype.getText());

        BigDecimal sellingtotal500new  = sell500.multiply(sell500price);
        BigDecimal sellingtotal750new  = sell750.multiply(sell750price);
        BigDecimal sellingtotal1000new = sell1000.multiply(sell1000price);
        BigDecimal sellingtotal1500new = sell1500.multiply(sell1500price);
        BigDecimal sellingtotal5000new = sell5000.multiply(sell5000price);
        BigDecimal sellingtotal7000new = sell7000.multiply(sell7000price);
        BigDecimal sellingtotal10lnew  = sell10l.multiply(sell10lprice);
        BigDecimal sellingtotal19lnew  = sell19l.multiply(sell19lprice);
        BigDecimal sellingtotal10elnew = sell10el.multiply(sell10elprice);
        BigDecimal sellingtotal19elnew = sell19el.multiply(sell19elprice);
        BigDecimal sellingtotaldisnew  = selldis.multiply(selldisprice);

        BigDecimal sellqt500old  = new BigDecimal(sellqt500.getText());
        BigDecimal sellqt750old  = new BigDecimal(sellqt750.getText());
        BigDecimal sellqt1000old = new BigDecimal(sellqt1000.getText());
        BigDecimal sellqt1500old = new BigDecimal(sellqt1500.getText());
        BigDecimal sellqt5000old = new BigDecimal(sellqt5000.getText());
        BigDecimal sellqt7000old = new BigDecimal(sellqt7000.getText());
        BigDecimal sellqt10lold  = new BigDecimal(sellqt10l.getText());
        BigDecimal sellqt19lold  = new BigDecimal(sellqt19l.getText());
        BigDecimal sellqt10elold = new BigDecimal(sellqt10el.getText());
        BigDecimal sellqt19elold =new BigDecimal(sellqt19el.getText());
        BigDecimal sellqtdisold  = new BigDecimal(sellqtdis.getText());

        BigDecimal newsellqt500  = sellqt500old.add(sell500);
        BigDecimal newsellqt750  = sellqt750old.add(sell750);
        BigDecimal newsellqt1000 = sellqt1000old.add(sell1000);
        BigDecimal newsellqt1500 = sellqt1500old.add(sell1500);
        BigDecimal newsellqt5000 = sellqt5000old.add(sell5000);
        BigDecimal newsellqt7000 = sellqt7000old.add(sell7000);
        BigDecimal newsellqt10l  = sellqt10lold.add(sell10l);
        BigDecimal newsellqt19l  = sellqt19lold.add(sell19l);
        BigDecimal newsellqt10el = sellqt10elold.add(sell10el);
        BigDecimal newsellqt19el = sellqt19elold.add(sell19el);
        BigDecimal newsellqtdis  = sellqtdisold.add(selldis);

        try {
            String sql = " UPDATE store SET  qts ='" + qts500new + "' ,total_price='" + total500new + "', selling_qts='" + newsellqt500 + "' , selling_total_price='" + sellingtotal500new + "'   WHERE id='" + 1 + "' ";
            pst = conn.prepareStatement(sql);
            pst.execute();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "error");
        }

        try {
            String sql = " UPDATE store SET  qts ='" + qts750new + "',total_price='" + total750new + "' , selling_qts='" + newsellqt750 + "' , selling_total_price='" + sellingtotal750new + "'  WHERE id='" + 2 + "' ";
            pst = conn.prepareStatement(sql);
            pst.execute();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "error");
        }

        try {
            String sql = " UPDATE store SET  qts ='" + qts1000new + "',total_price='" + total1000new + "' , selling_qts='" + newsellqt1000 + "' , selling_total_price='" + sellingtotal1000new + "'  WHERE id='" + 3 + "' ";
            pst = conn.prepareStatement(sql);
            pst.execute();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "error");
        }

        try {
            String sql = " UPDATE store SET  qts ='" + qts1500new + "',total_price='" + total1500new + "'  , selling_qts='" + newsellqt1500 + "' , selling_total_price='" + sellingtotal1500new + "'   WHERE id='" + 4 + "' ";
            pst = conn.prepareStatement(sql);
            pst.execute();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "error");
        }

        try {
            String sql = " UPDATE store SET  qts ='" + qts5000new + "',total_price='" + total5000new + "' , selling_qts='" + newsellqt5000 + "' , selling_total_price='" + sellingtotal5000new + "'   WHERE id='" + 5 + "' ";
            pst = conn.prepareStatement(sql);
            pst.execute();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "error");
        }

        try {
            String sql = " UPDATE store SET  qts ='" + qts7000new + "',total_price='" + total7000new + "'   , selling_qts='" + newsellqt7000 + "' , selling_total_price='" + sellingtotal7000new + "'  WHERE id='" + 6 + "' ";
            pst = conn.prepareStatement(sql);
            pst.execute();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "error");
        }

        try {
            String sql = " UPDATE store SET  qts ='" + qts10lnew + "',total_price='" + total10lnew + "' , selling_qts='" + newsellqt10l + "' , selling_total_price='" + sellingtotal10lnew + "'    WHERE id='" + 7 + "' ";
            pst = conn.prepareStatement(sql);
            pst.execute();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "error");
        }

        try {
            String sql = " UPDATE store SET  qts ='" + qts19lnew + "',total_price='" + total19lnew + "' , selling_qts='" + newsellqt19l + "' , selling_total_price='" + sellingtotal19lnew + "'      WHERE id='" + 8 + "' ";
            pst = conn.prepareStatement(sql);
            pst.execute();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "error");
        }

        try {
            String sql = " UPDATE store SET  qts ='" + qts10elnew + "',total_price='" + total10elnew + "' , selling_qts='" + newsellqt10el + "' , selling_total_price='" + sellingtotal10elnew + "'         WHERE id='" + 9 + "' ";
            pst = conn.prepareStatement(sql);
            pst.execute();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "error");
        }

        try {
            String sql = " UPDATE store SET  qts ='" + qts19elnew + "',total_price='" + total19elnew + "' , selling_qts='" + newsellqt19el + "' , selling_total_price='" + sellingtotal19elnew + "'             WHERE id='" + 10 + "' ";
            pst = conn.prepareStatement(sql);
            pst.execute();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "error");
        }

        try {
            String sql = " UPDATE store SET  qts ='" + qtsdisnew + "',total_price='" + totaldisnew + "' , selling_qts='" + newsellqtdis + "' , selling_total_price='" + sellingtotaldisnew + "'            WHERE id='" + 11 + "' ";
            pst = conn.prepareStatement(sql);
            pst.execute();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "error");
        }

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel5 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jPanel8 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jPanel9 = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        type19elnew = new javax.swing.JTextField();
        type10elnew = new javax.swing.JTextField();
        sell10eltype = new javax.swing.JTextField();
        sell19eltype = new javax.swing.JTextField();
        qts10el = new javax.swing.JTextField();
        qts19el = new javax.swing.JTextField();
        qts751 = new javax.swing.JTextField();
        rs19el = new javax.swing.JTextField();
        rs10el = new javax.swing.JTextField();
        jPanel6 = new javax.swing.JPanel();
        typedisnew = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        selldistype = new javax.swing.JTextField();
        qtsdis = new javax.swing.JTextField();
        rsdis = new javax.swing.JTextField();
        insertselling = new javax.swing.JButton();
        jLabel16 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jScrollPane6 = new javax.swing.JScrollPane();
        nametable = new javax.swing.JTable();
        namebox = new javax.swing.JTextField();
        txtinvoice = new javax.swing.JTextField();
        jPanel7 = new javax.swing.JPanel();
        rs500 = new javax.swing.JTextField();
        rs750 = new javax.swing.JTextField();
        rs1000 = new javax.swing.JTextField();
        rs1500 = new javax.swing.JTextField();
        rs5000 = new javax.swing.JTextField();
        rs7000 = new javax.swing.JTextField();
        rs10l = new javax.swing.JTextField();
        rs19l = new javax.swing.JTextField();
        sell500type = new javax.swing.JTextField();
        sell750type = new javax.swing.JTextField();
        sell1000type = new javax.swing.JTextField();
        sell1500type = new javax.swing.JTextField();
        sell5000type = new javax.swing.JTextField();
        sell7000type = new javax.swing.JTextField();
        sell10ltype = new javax.swing.JTextField();
        sell19ltype = new javax.swing.JTextField();
        qts5000 = new javax.swing.JTextField();
        qts7000 = new javax.swing.JTextField();
        qts10l = new javax.swing.JTextField();
        qts19l = new javax.swing.JTextField();
        qts1500 = new javax.swing.JTextField();
        qts1000 = new javax.swing.JTextField();
        qts750 = new javax.swing.JTextField();
        qts500 = new javax.swing.JTextField();
        type500new = new javax.swing.JTextField();
        type750new = new javax.swing.JTextField();
        type1000new = new javax.swing.JTextField();
        type1500new = new javax.swing.JTextField();
        type5000new = new javax.swing.JTextField();
        type7000new = new javax.swing.JTextField();
        type10lnew = new javax.swing.JTextField();
        type19lnew = new javax.swing.JTextField();
        jButton4 = new javax.swing.JButton();
        profitbox = new javax.swing.JTextField();
        sellingdate = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        billno = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        pricepertable = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        qtstable = new javax.swing.JTable();
        jScrollPane3 = new javax.swing.JScrollPane();
        priceone = new javax.swing.JTable();
        price500 = new javax.swing.JTextField();
        price750 = new javax.swing.JTextField();
        price1000 = new javax.swing.JTextField();
        price1500 = new javax.swing.JTextField();
        price5000 = new javax.swing.JTextField();
        price7000 = new javax.swing.JTextField();
        price10l = new javax.swing.JTextField();
        price19l = new javax.swing.JTextField();
        price10el = new javax.swing.JTextField();
        price19el = new javax.swing.JTextField();
        pricedis = new javax.swing.JTextField();
        jScrollPane4 = new javax.swing.JScrollPane();
        sellingtotal = new javax.swing.JTable();
        jScrollPane5 = new javax.swing.JScrollPane();
        sellingqts = new javax.swing.JTable();
        sellto500 = new javax.swing.JTextField();
        sellto750 = new javax.swing.JTextField();
        sellto1000 = new javax.swing.JTextField();
        sellto1500 = new javax.swing.JTextField();
        sellto5000 = new javax.swing.JTextField();
        sellto7000 = new javax.swing.JTextField();
        sellto10l = new javax.swing.JTextField();
        sellto19l = new javax.swing.JTextField();
        sellto10el = new javax.swing.JTextField();
        sellto19el = new javax.swing.JTextField();
        selltodis = new javax.swing.JTextField();
        sellqt500 = new javax.swing.JTextField();
        sellqt750 = new javax.swing.JTextField();
        sellqt1000 = new javax.swing.JTextField();
        sellqt1500 = new javax.swing.JTextField();
        sellqt5000 = new javax.swing.JTextField();
        sellqt7000 = new javax.swing.JTextField();
        sellqt10l = new javax.swing.JTextField();
        sellqt19l = new javax.swing.JTextField();
        sellqt10el = new javax.swing.JTextField();
        sellqt19el = new javax.swing.JTextField();
        sellqtdis = new javax.swing.JTextField();
        monthtxt = new javax.swing.JTextField();
        jScrollPane7 = new javax.swing.JScrollPane();
        jTable123 = new javax.swing.JTable();
        dat = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        jTextField6 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Water Bottle Management System");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(0, 102, 102));
        jPanel1.setEnabled(false);
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBackground(new java.awt.Color(204, 153, 255));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel8.setBackground(new java.awt.Color(204, 255, 204));
        jPanel8.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 153));
        jLabel2.setText("Bottles");
        jPanel8.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(2, 180, 60, -1));

        jPanel4.setBackground(new java.awt.Color(204, 204, 204));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("500 ml");
        jPanel4.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, -1, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("750 ml");
        jPanel4.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, -1, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setText("1000 ml");
        jPanel4.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 140, -1, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setText("1500 ml");
        jPanel4.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 180, -1, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setText("5000 ml");
        jPanel4.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 220, -1, -1));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setText("7000 ml");
        jPanel4.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 260, -1, -1));

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel10.setText("10 L");
        jPanel4.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 300, -1, -1));

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel11.setText("19 L");
        jPanel4.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 340, -1, -1));

        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(0, 0, 153));
        jLabel15.setText("Qts");
        jPanel4.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 10, -1, -1));

        jLabel17.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(0, 0, 153));
        jLabel17.setText("Category");
        jPanel4.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, -1, -1));

        jPanel9.setBackground(new java.awt.Color(204, 204, 255));
        jPanel9.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel13.setText("10 L Empty");
        jPanel9.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, -1));

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel12.setText("19 L Empty");
        jPanel9.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, -1, -1));

        type19elnew.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        type19elnew.setText("0");
        jPanel9.add(type19elnew, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 40, 60, -1));

        type10elnew.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        type10elnew.setText("0");
        jPanel9.add(type10elnew, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 10, 60, -1));

        sell10eltype.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        sell10eltype.setText("0");
        jPanel9.add(sell10eltype, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 10, 70, -1));

        sell19eltype.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        sell19eltype.setText("0");
        jPanel9.add(sell19eltype, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 40, 70, -1));

        qts10el.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        qts10el.setEnabled(false);
        jPanel9.add(qts10el, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 10, 40, 20));

        qts19el.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        qts19el.setEnabled(false);
        jPanel9.add(qts19el, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 40, 40, 20));

        qts751.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        qts751.setEnabled(false);
        jPanel9.add(qts751, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 109, 40, -1));

        rs19el.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        rs19el.setEnabled(false);
        jPanel9.add(rs19el, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 40, 50, -1));

        rs10el.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        rs10el.setEnabled(false);
        jPanel9.add(rs10el, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 10, 50, -1));

        jPanel4.add(jPanel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 40, 390, 70));

        jPanel6.setBackground(new java.awt.Color(102, 153, 255));
        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        typedisnew.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        typedisnew.setText("0");
        jPanel6.add(typedisnew, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 10, 60, -1));

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 0, 153));
        jLabel9.setText(" Dispencers");
        jPanel6.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 80, -1));

        selldistype.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        selldistype.setText("0");
        jPanel6.add(selldistype, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 10, 60, -1));

        qtsdis.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        qtsdis.setEnabled(false);
        jPanel6.add(qtsdis, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 10, 40, 20));

        rsdis.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        rsdis.setEnabled(false);
        jPanel6.add(rsdis, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 10, 50, -1));

        jPanel4.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 380, 340, 40));

        insertselling.setBackground(new java.awt.Color(153, 153, 153));
        insertselling.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        insertselling.setForeground(new java.awt.Color(255, 0, 0));
        insertselling.setText("Insert");
        insertselling.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                insertsellingActionPerformed(evt);
            }
        });
        jPanel4.add(insertselling, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 400, 110, 30));

        jLabel16.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(0, 0, 153));
        jLabel16.setText("Qts");
        jPanel4.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 10, -1, -1));

        jLabel18.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(0, 0, 153));
        jLabel18.setText("Category");
        jPanel4.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 10, -1, -1));

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(0, 0, 153));
        jLabel14.setText("Selling Price");
        jPanel4.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 10, -1, -1));

        jLabel21.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(0, 0, 153));
        jLabel21.setText("Selling Price");
        jPanel4.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 10, -1, -1));

        nametable.setBackground(new java.awt.Color(204, 255, 204));
        nametable.setModel(new javax.swing.table.DefaultTableModel(
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
        nametable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                nametableMouseClicked(evt);
            }
        });
        nametable.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                nametableKeyReleased(evt);
            }
        });
        jScrollPane6.setViewportView(nametable);

        jPanel4.add(jScrollPane6, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 120, 390, 100));

        namebox.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        namebox.setEnabled(false);
        jPanel4.add(namebox, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 230, 310, 30));

        txtinvoice.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtinvoice.setEnabled(false);
        jPanel4.add(txtinvoice, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 230, 70, 30));

        jPanel7.setBackground(new java.awt.Color(153, 153, 255));
        jPanel7.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        rs500.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        rs500.setEnabled(false);
        jPanel7.add(rs500, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 20, 50, -1));

        rs750.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        rs750.setEnabled(false);
        jPanel7.add(rs750, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 60, 50, -1));

        rs1000.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        rs1000.setEnabled(false);
        jPanel7.add(rs1000, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 100, 50, -1));

        rs1500.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        rs1500.setEnabled(false);
        jPanel7.add(rs1500, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 140, 50, -1));

        rs5000.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        rs5000.setEnabled(false);
        jPanel7.add(rs5000, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 180, 50, -1));

        rs7000.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        rs7000.setEnabled(false);
        jPanel7.add(rs7000, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 220, 50, -1));

        rs10l.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        rs10l.setEnabled(false);
        jPanel7.add(rs10l, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 260, 50, -1));

        rs19l.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        rs19l.setEnabled(false);
        jPanel7.add(rs19l, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 300, 50, -1));

        sell500type.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        sell500type.setText("0");
        jPanel7.add(sell500type, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 20, 60, -1));

        sell750type.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        sell750type.setText("0");
        jPanel7.add(sell750type, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 60, 60, -1));

        sell1000type.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        sell1000type.setText("0");
        jPanel7.add(sell1000type, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 100, 60, -1));

        sell1500type.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        sell1500type.setText("0");
        jPanel7.add(sell1500type, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 140, 60, -1));

        sell5000type.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        sell5000type.setText("0");
        jPanel7.add(sell5000type, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 180, 60, -1));

        sell7000type.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        sell7000type.setText("0");
        jPanel7.add(sell7000type, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 220, 60, -1));

        sell10ltype.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        sell10ltype.setText("0");
        jPanel7.add(sell10ltype, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 260, 60, -1));

        sell19ltype.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        sell19ltype.setText("0");
        jPanel7.add(sell19ltype, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 300, 60, -1));

        qts5000.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        qts5000.setEnabled(false);
        jPanel7.add(qts5000, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 180, 40, -1));

        qts7000.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        qts7000.setEnabled(false);
        jPanel7.add(qts7000, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 220, 40, -1));

        qts10l.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        qts10l.setEnabled(false);
        jPanel7.add(qts10l, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 260, 40, -1));

        qts19l.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        qts19l.setEnabled(false);
        jPanel7.add(qts19l, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 300, 40, -1));

        qts1500.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        qts1500.setEnabled(false);
        jPanel7.add(qts1500, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 140, 40, -1));

        qts1000.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        qts1000.setEnabled(false);
        jPanel7.add(qts1000, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, 40, -1));

        qts750.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        qts750.setEnabled(false);
        jPanel7.add(qts750, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, 40, -1));

        qts500.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        qts500.setEnabled(false);
        jPanel7.add(qts500, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 40, -1));

        type500new.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        type500new.setText("0");
        jPanel7.add(type500new, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 20, 60, -1));

        type750new.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        type750new.setText("0");
        jPanel7.add(type750new, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 60, 60, -1));

        type1000new.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        type1000new.setText("0");
        jPanel7.add(type1000new, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 100, 60, -1));

        type1500new.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        type1500new.setText("0");
        jPanel7.add(type1500new, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 140, 60, -1));

        type5000new.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        type5000new.setText("0");
        jPanel7.add(type5000new, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 180, 60, -1));

        type7000new.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        type7000new.setText("0");
        jPanel7.add(type7000new, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 220, 60, -1));

        type10lnew.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        type10lnew.setText("0");
        jPanel7.add(type10lnew, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 260, 60, -1));

        type19lnew.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        type19lnew.setText("0");
        jPanel7.add(type19lnew, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 300, 60, -1));

        jPanel4.add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 40, 260, 340));

        jButton4.setBackground(new java.awt.Color(204, 255, 204));
        jButton4.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jButton4.setForeground(new java.awt.Color(0, 153, 51));
        jButton4.setText("Profit");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel4.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 340, 90, 50));

        profitbox.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        profitbox.setEnabled(false);
        jPanel4.add(profitbox, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 340, 290, 50));

        sellingdate.setBackground(new java.awt.Color(240, 240, 240));
        sellingdate.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        sellingdate.setForeground(new java.awt.Color(255, 0, 0));
        jPanel4.add(sellingdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 270, 290, 30));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 102, 102));
        jLabel8.setText("Date");
        jPanel4.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 270, 70, 30));

        jLabel20.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(0, 0, 255));
        jLabel20.setText("Bill No");
        jPanel4.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 310, 70, -1));

        billno.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jPanel4.add(billno, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 303, 290, 30));

        jPanel8.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 0, 750, 440));

        jPanel3.add(jPanel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 810, 440));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 830, 450));

        jLabel19.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(255, 0, 0));
        jLabel19.setText("Selling");
        jPanel1.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, -10, -1, 60));

        jButton3.setBackground(new java.awt.Color(153, 153, 153));
        jButton3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton3.setForeground(new java.awt.Color(255, 0, 0));
        jButton3.setText("HOME");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 510, 90, 30));

        jButton1.setBackground(new java.awt.Color(153, 153, 153));
        jButton1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 0, 0));
        jButton1.setText("Store");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 510, 90, 30));

        jButton2.setBackground(new java.awt.Color(153, 153, 153));
        jButton2.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 0, 0));
        jButton2.setText("Selling Report");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 510, 180, 30));

        jScrollPane1.setBackground(new java.awt.Color(204, 153, 255));
        jScrollPane1.setBorder(null);
        jScrollPane1.setForeground(new java.awt.Color(204, 153, 255));
        jScrollPane1.setEnabled(false);

        pricepertable.setBackground(new java.awt.Color(0, 102, 102));
        pricepertable.setModel(new javax.swing.table.DefaultTableModel(
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
        pricepertable.setEnabled(false);
        jScrollPane1.setViewportView(pricepertable);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 10, 10));

        jScrollPane2.setBackground(new java.awt.Color(204, 153, 255));
        jScrollPane2.setBorder(null);
        jScrollPane2.setForeground(new java.awt.Color(204, 153, 255));
        jScrollPane2.setEnabled(false);

        qtstable.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane2.setViewportView(qtstable);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, 10, 10));

        jScrollPane3.setBackground(new java.awt.Color(204, 153, 255));
        jScrollPane3.setBorder(null);
        jScrollPane3.setForeground(new java.awt.Color(204, 153, 255));
        jScrollPane3.setEnabled(false);

        priceone.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane3.setViewportView(priceone);

        jPanel1.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, 10, 10));

        price500.setEditable(false);
        price500.setBackground(new java.awt.Color(204, 153, 255));
        price500.setFont(new java.awt.Font("Tahoma", 0, 1)); // NOI18N
        price500.setForeground(new java.awt.Color(204, 153, 255));
        price500.setBorder(null);
        price500.setEnabled(false);
        jPanel1.add(price500, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 160, 10, 10));

        price750.setEditable(false);
        price750.setBackground(new java.awt.Color(204, 153, 255));
        price750.setFont(new java.awt.Font("Tahoma", 0, 1)); // NOI18N
        price750.setForeground(new java.awt.Color(204, 153, 255));
        price750.setBorder(null);
        price750.setEnabled(false);
        jPanel1.add(price750, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 170, 10, 10));

        price1000.setEditable(false);
        price1000.setBackground(new java.awt.Color(204, 153, 255));
        price1000.setFont(new java.awt.Font("Tahoma", 0, 1)); // NOI18N
        price1000.setForeground(new java.awt.Color(204, 153, 255));
        price1000.setBorder(null);
        price1000.setEnabled(false);
        jPanel1.add(price1000, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 180, 10, 10));

        price1500.setEditable(false);
        price1500.setBackground(new java.awt.Color(204, 153, 255));
        price1500.setFont(new java.awt.Font("Tahoma", 0, 1)); // NOI18N
        price1500.setForeground(new java.awt.Color(204, 153, 255));
        price1500.setBorder(null);
        price1500.setEnabled(false);
        jPanel1.add(price1500, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 190, 10, 10));

        price5000.setEditable(false);
        price5000.setBackground(new java.awt.Color(204, 153, 255));
        price5000.setFont(new java.awt.Font("Tahoma", 0, 1)); // NOI18N
        price5000.setForeground(new java.awt.Color(204, 153, 255));
        price5000.setBorder(null);
        price5000.setEnabled(false);
        jPanel1.add(price5000, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 200, 10, 10));

        price7000.setEditable(false);
        price7000.setBackground(new java.awt.Color(204, 153, 255));
        price7000.setFont(new java.awt.Font("Tahoma", 0, 1)); // NOI18N
        price7000.setForeground(new java.awt.Color(204, 153, 255));
        price7000.setBorder(null);
        price7000.setEnabled(false);
        jPanel1.add(price7000, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 210, 10, 10));

        price10l.setEditable(false);
        price10l.setBackground(new java.awt.Color(204, 153, 255));
        price10l.setFont(new java.awt.Font("Tahoma", 0, 1)); // NOI18N
        price10l.setForeground(new java.awt.Color(204, 153, 255));
        price10l.setBorder(null);
        price10l.setEnabled(false);
        jPanel1.add(price10l, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 220, 10, 10));

        price19l.setEditable(false);
        price19l.setBackground(new java.awt.Color(204, 153, 255));
        price19l.setFont(new java.awt.Font("Tahoma", 0, 1)); // NOI18N
        price19l.setForeground(new java.awt.Color(204, 153, 255));
        price19l.setBorder(null);
        price19l.setEnabled(false);
        jPanel1.add(price19l, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 230, 10, 10));

        price10el.setEditable(false);
        price10el.setBackground(new java.awt.Color(204, 153, 255));
        price10el.setFont(new java.awt.Font("Tahoma", 0, 1)); // NOI18N
        price10el.setForeground(new java.awt.Color(204, 153, 255));
        price10el.setBorder(null);
        price10el.setEnabled(false);
        jPanel1.add(price10el, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 240, 10, 10));

        price19el.setEditable(false);
        price19el.setBackground(new java.awt.Color(204, 153, 255));
        price19el.setFont(new java.awt.Font("Tahoma", 0, 1)); // NOI18N
        price19el.setForeground(new java.awt.Color(204, 153, 255));
        price19el.setBorder(null);
        price19el.setEnabled(false);
        jPanel1.add(price19el, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 250, 10, 10));

        pricedis.setEditable(false);
        pricedis.setBackground(new java.awt.Color(204, 153, 255));
        pricedis.setFont(new java.awt.Font("Tahoma", 0, 1)); // NOI18N
        pricedis.setForeground(new java.awt.Color(204, 153, 255));
        pricedis.setBorder(null);
        pricedis.setEnabled(false);
        jPanel1.add(pricedis, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 260, 10, 10));

        jScrollPane4.setBackground(new java.awt.Color(204, 153, 255));
        jScrollPane4.setBorder(null);
        jScrollPane4.setForeground(new java.awt.Color(204, 153, 255));
        jScrollPane4.setEnabled(false);

        sellingtotal.setModel(new javax.swing.table.DefaultTableModel(
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
        sellingtotal.setEnabled(false);
        jScrollPane4.setViewportView(sellingtotal);

        jPanel1.add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, 10, 10));

        jScrollPane5.setBackground(new java.awt.Color(204, 153, 255));
        jScrollPane5.setBorder(null);
        jScrollPane5.setForeground(new java.awt.Color(204, 153, 255));
        jScrollPane5.setEnabled(false);

        sellingqts.setModel(new javax.swing.table.DefaultTableModel(
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
        sellingqts.setEnabled(false);
        jScrollPane5.setViewportView(sellingqts);

        jPanel1.add(jScrollPane5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, 10, 10));

        sellto500.setEditable(false);
        sellto500.setBackground(new java.awt.Color(204, 153, 255));
        sellto500.setFont(new java.awt.Font("Tahoma", 0, 1)); // NOI18N
        sellto500.setForeground(new java.awt.Color(204, 153, 255));
        sellto500.setBorder(null);
        sellto500.setEnabled(false);
        jPanel1.add(sellto500, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 270, 10, 10));

        sellto750.setEditable(false);
        sellto750.setBackground(new java.awt.Color(204, 153, 255));
        sellto750.setFont(new java.awt.Font("Tahoma", 0, 1)); // NOI18N
        sellto750.setForeground(new java.awt.Color(204, 153, 255));
        sellto750.setBorder(null);
        sellto750.setEnabled(false);
        jPanel1.add(sellto750, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 280, 10, 10));

        sellto1000.setEditable(false);
        sellto1000.setBackground(new java.awt.Color(204, 153, 255));
        sellto1000.setFont(new java.awt.Font("Tahoma", 0, 1)); // NOI18N
        sellto1000.setForeground(new java.awt.Color(204, 153, 255));
        sellto1000.setBorder(null);
        sellto1000.setEnabled(false);
        jPanel1.add(sellto1000, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 290, 10, 10));

        sellto1500.setEditable(false);
        sellto1500.setBackground(new java.awt.Color(204, 153, 255));
        sellto1500.setFont(new java.awt.Font("Tahoma", 0, 1)); // NOI18N
        sellto1500.setForeground(new java.awt.Color(204, 153, 255));
        sellto1500.setBorder(null);
        sellto1500.setEnabled(false);
        jPanel1.add(sellto1500, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 300, 10, 10));

        sellto5000.setEditable(false);
        sellto5000.setBackground(new java.awt.Color(204, 153, 255));
        sellto5000.setFont(new java.awt.Font("Tahoma", 0, 1)); // NOI18N
        sellto5000.setForeground(new java.awt.Color(204, 153, 255));
        sellto5000.setBorder(null);
        sellto5000.setEnabled(false);
        jPanel1.add(sellto5000, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 310, 10, 10));

        sellto7000.setEditable(false);
        sellto7000.setBackground(new java.awt.Color(204, 153, 255));
        sellto7000.setFont(new java.awt.Font("Tahoma", 0, 1)); // NOI18N
        sellto7000.setForeground(new java.awt.Color(204, 153, 255));
        sellto7000.setBorder(null);
        sellto7000.setEnabled(false);
        jPanel1.add(sellto7000, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 320, 10, 10));

        sellto10l.setEditable(false);
        sellto10l.setBackground(new java.awt.Color(204, 153, 255));
        sellto10l.setFont(new java.awt.Font("Tahoma", 0, 1)); // NOI18N
        sellto10l.setForeground(new java.awt.Color(204, 153, 255));
        sellto10l.setBorder(null);
        sellto10l.setEnabled(false);
        jPanel1.add(sellto10l, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 330, 10, 10));

        sellto19l.setEditable(false);
        sellto19l.setBackground(new java.awt.Color(204, 153, 255));
        sellto19l.setFont(new java.awt.Font("Tahoma", 0, 1)); // NOI18N
        sellto19l.setForeground(new java.awt.Color(204, 153, 255));
        sellto19l.setBorder(null);
        sellto19l.setEnabled(false);
        jPanel1.add(sellto19l, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 340, 10, 10));

        sellto10el.setEditable(false);
        sellto10el.setBackground(new java.awt.Color(204, 153, 255));
        sellto10el.setFont(new java.awt.Font("Tahoma", 0, 1)); // NOI18N
        sellto10el.setForeground(new java.awt.Color(204, 153, 255));
        sellto10el.setBorder(null);
        sellto10el.setEnabled(false);
        jPanel1.add(sellto10el, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 350, 10, 10));

        sellto19el.setEditable(false);
        sellto19el.setBackground(new java.awt.Color(204, 153, 255));
        sellto19el.setFont(new java.awt.Font("Tahoma", 0, 1)); // NOI18N
        sellto19el.setForeground(new java.awt.Color(204, 153, 255));
        sellto19el.setBorder(null);
        sellto19el.setEnabled(false);
        jPanel1.add(sellto19el, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 370, 10, 10));

        selltodis.setEditable(false);
        selltodis.setBackground(new java.awt.Color(204, 153, 255));
        selltodis.setFont(new java.awt.Font("Tahoma", 0, 1)); // NOI18N
        selltodis.setForeground(new java.awt.Color(204, 153, 255));
        selltodis.setBorder(null);
        selltodis.setEnabled(false);
        jPanel1.add(selltodis, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 360, 10, 10));

        sellqt500.setEditable(false);
        sellqt500.setBackground(new java.awt.Color(204, 153, 255));
        sellqt500.setFont(new java.awt.Font("Tahoma", 0, 1)); // NOI18N
        sellqt500.setForeground(new java.awt.Color(204, 153, 255));
        sellqt500.setBorder(null);
        sellqt500.setEnabled(false);
        jPanel1.add(sellqt500, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 380, 10, 10));

        sellqt750.setEditable(false);
        sellqt750.setBackground(new java.awt.Color(204, 153, 255));
        sellqt750.setFont(new java.awt.Font("Tahoma", 0, 1)); // NOI18N
        sellqt750.setForeground(new java.awt.Color(204, 153, 255));
        sellqt750.setBorder(null);
        sellqt750.setEnabled(false);
        jPanel1.add(sellqt750, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 390, 10, 10));

        sellqt1000.setEditable(false);
        sellqt1000.setBackground(new java.awt.Color(204, 153, 255));
        sellqt1000.setFont(new java.awt.Font("Tahoma", 0, 1)); // NOI18N
        sellqt1000.setForeground(new java.awt.Color(204, 153, 255));
        sellqt1000.setBorder(null);
        sellqt1000.setEnabled(false);
        jPanel1.add(sellqt1000, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 400, 10, 10));

        sellqt1500.setEditable(false);
        sellqt1500.setBackground(new java.awt.Color(204, 153, 255));
        sellqt1500.setFont(new java.awt.Font("Tahoma", 0, 1)); // NOI18N
        sellqt1500.setForeground(new java.awt.Color(204, 153, 255));
        sellqt1500.setBorder(null);
        sellqt1500.setEnabled(false);
        jPanel1.add(sellqt1500, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 410, 10, 10));

        sellqt5000.setEditable(false);
        sellqt5000.setBackground(new java.awt.Color(204, 153, 255));
        sellqt5000.setFont(new java.awt.Font("Tahoma", 0, 1)); // NOI18N
        sellqt5000.setForeground(new java.awt.Color(204, 153, 255));
        sellqt5000.setBorder(null);
        sellqt5000.setEnabled(false);
        jPanel1.add(sellqt5000, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 420, 10, 10));

        sellqt7000.setEditable(false);
        sellqt7000.setBackground(new java.awt.Color(204, 153, 255));
        sellqt7000.setFont(new java.awt.Font("Tahoma", 0, 1)); // NOI18N
        sellqt7000.setForeground(new java.awt.Color(204, 153, 255));
        sellqt7000.setBorder(null);
        sellqt7000.setEnabled(false);
        jPanel1.add(sellqt7000, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 430, 10, 10));

        sellqt10l.setEditable(false);
        sellqt10l.setBackground(new java.awt.Color(204, 153, 255));
        sellqt10l.setFont(new java.awt.Font("Tahoma", 0, 1)); // NOI18N
        sellqt10l.setForeground(new java.awt.Color(204, 153, 255));
        sellqt10l.setBorder(null);
        sellqt10l.setEnabled(false);
        jPanel1.add(sellqt10l, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 450, 10, 10));

        sellqt19l.setEditable(false);
        sellqt19l.setBackground(new java.awt.Color(204, 153, 255));
        sellqt19l.setFont(new java.awt.Font("Tahoma", 0, 1)); // NOI18N
        sellqt19l.setForeground(new java.awt.Color(204, 153, 255));
        sellqt19l.setBorder(null);
        sellqt19l.setEnabled(false);
        jPanel1.add(sellqt19l, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 480, 10, 10));

        sellqt10el.setEditable(false);
        sellqt10el.setBackground(new java.awt.Color(204, 153, 255));
        sellqt10el.setFont(new java.awt.Font("Tahoma", 0, 1)); // NOI18N
        sellqt10el.setForeground(new java.awt.Color(204, 153, 255));
        sellqt10el.setBorder(null);
        sellqt10el.setEnabled(false);
        jPanel1.add(sellqt10el, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 470, 10, 10));

        sellqt19el.setEditable(false);
        sellqt19el.setBackground(new java.awt.Color(204, 153, 255));
        sellqt19el.setFont(new java.awt.Font("Tahoma", 0, 1)); // NOI18N
        sellqt19el.setForeground(new java.awt.Color(204, 153, 255));
        sellqt19el.setBorder(null);
        sellqt19el.setEnabled(false);
        jPanel1.add(sellqt19el, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 460, 10, 10));

        sellqtdis.setEditable(false);
        sellqtdis.setBackground(new java.awt.Color(204, 153, 255));
        sellqtdis.setFont(new java.awt.Font("Tahoma", 0, 1)); // NOI18N
        sellqtdis.setForeground(new java.awt.Color(204, 153, 255));
        sellqtdis.setBorder(null);
        sellqtdis.setEnabled(false);
        jPanel1.add(sellqtdis, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 440, 10, 10));

        monthtxt.setEditable(false);
        monthtxt.setBackground(new java.awt.Color(204, 153, 255));
        monthtxt.setFont(new java.awt.Font("Tahoma", 0, 1)); // NOI18N
        monthtxt.setForeground(new java.awt.Color(204, 153, 255));
        monthtxt.setBorder(null);
        monthtxt.setEnabled(false);
        jPanel1.add(monthtxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 150, 10, 10));

        jScrollPane7.setBackground(new java.awt.Color(204, 153, 255));
        jScrollPane7.setBorder(null);
        jScrollPane7.setForeground(new java.awt.Color(204, 153, 255));
        jScrollPane7.setEnabled(false);

        jTable123.setModel(new javax.swing.table.DefaultTableModel(
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
        jTable123.setEnabled(false);
        jScrollPane7.setViewportView(jTable123);

        jPanel1.add(jScrollPane7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, 10, 10));

        dat.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        dat.setForeground(new java.awt.Color(255, 51, 51));
        dat.setText("Date");
        jPanel1.add(dat, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 10, 70, 20));

        jTextField2.setEditable(false);
        jTextField2.setBackground(new java.awt.Color(204, 153, 255));
        jTextField2.setFont(new java.awt.Font("Tahoma", 0, 1)); // NOI18N
        jTextField2.setForeground(new java.awt.Color(204, 153, 255));
        jTextField2.setBorder(null);
        jTextField2.setEnabled(false);
        jPanel1.add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 490, 10, 10));

        jTextField3.setEditable(false);
        jTextField3.setBackground(new java.awt.Color(204, 153, 255));
        jTextField3.setFont(new java.awt.Font("Tahoma", 0, 1)); // NOI18N
        jTextField3.setForeground(new java.awt.Color(204, 153, 255));
        jTextField3.setBorder(null);
        jTextField3.setEnabled(false);
        jPanel1.add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 140, 10, 10));

        jTextField4.setEditable(false);
        jTextField4.setBackground(new java.awt.Color(204, 153, 255));
        jTextField4.setFont(new java.awt.Font("Tahoma", 0, 1)); // NOI18N
        jTextField4.setForeground(new java.awt.Color(204, 153, 255));
        jTextField4.setBorder(null);
        jTextField4.setEnabled(false);
        jPanel1.add(jTextField4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 130, 10, 10));

        jTextField5.setEditable(false);
        jTextField5.setBackground(new java.awt.Color(204, 153, 255));
        jTextField5.setFont(new java.awt.Font("Tahoma", 0, 1)); // NOI18N
        jTextField5.setForeground(new java.awt.Color(204, 153, 255));
        jTextField5.setBorder(null);
        jTextField5.setEnabled(false);
        jPanel1.add(jTextField5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 120, 10, 10));

        jTextField6.setEditable(false);
        jTextField6.setBackground(new java.awt.Color(204, 153, 255));
        jTextField6.setFont(new java.awt.Font("Tahoma", 0, 1)); // NOI18N
        jTextField6.setForeground(new java.awt.Color(204, 153, 255));
        jTextField6.setBorder(null);
        jTextField6.setEnabled(false);
        jPanel1.add(jTextField6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, 10, 10));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 860, 550));

        setSize(new java.awt.Dimension(877, 587));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void insertsellingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_insertsellingActionPerformed

        String invoice = txtinvoice.getText();
        String date = sellingdate.getText();
        String cname = namebox.getText();
        String month = monthtxt.getText();
        
                BigDecimal profit = new BigDecimal(profitbox.getText());

        BigDecimal sell500  =  new BigDecimal(type500new.getText());
        BigDecimal sell750  = new BigDecimal(type750new.getText());
        BigDecimal sell1000 = new BigDecimal(type1000new.getText());
        BigDecimal sell1500 = new BigDecimal(type1500new.getText());
        BigDecimal sell5000 = new BigDecimal(type5000new.getText());
        BigDecimal sell7000 = new BigDecimal(type7000new.getText());
        BigDecimal sell10l  = new BigDecimal(type10lnew.getText());
        BigDecimal sell19l  = new BigDecimal(type19lnew.getText());
        BigDecimal sell10le = new BigDecimal(type10elnew.getText());
        BigDecimal sell19le = new BigDecimal(type19elnew.getText());
        BigDecimal selldis  = new BigDecimal(typedisnew.getText());

        BigDecimal sellrs500  = new BigDecimal(rs500.getText());
        BigDecimal sellrs750  = new BigDecimal(rs750.getText());
        BigDecimal sellrs1000 = new BigDecimal(rs1000.getText());
        BigDecimal sellrs1500 = new BigDecimal(rs1500.getText());
        BigDecimal sellrs5000 = new BigDecimal(rs5000.getText());
        BigDecimal sellrs7000 = new BigDecimal(rs7000.getText());
        BigDecimal sellrs10l  = new BigDecimal(rs10l.getText());
        BigDecimal sellrs19l  = new BigDecimal(rs19l.getText());
        BigDecimal sellrs10le = new BigDecimal(rs10el.getText());
        BigDecimal sellrs19le = new BigDecimal(rs19el.getText());
        BigDecimal sellrsdis  = new BigDecimal(rsdis.getText());

        BigDecimal sell500pric  = new BigDecimal(sell500type.getText());
        BigDecimal sell750pric  =new BigDecimal(sell750type.getText());
        BigDecimal sell1000pric = new BigDecimal(sell1000type.getText());
        BigDecimal sell1500pric =new BigDecimal(sell1500type.getText());
        BigDecimal sell5000pric = new BigDecimal(sell5000type.getText());
        BigDecimal sell7000pric = new BigDecimal(sell7000type.getText());
        BigDecimal sell10lpric  = new BigDecimal(sell10ltype.getText());
        BigDecimal sell19lpric  = new BigDecimal(sell19ltype.getText());
        BigDecimal sell10elpric = new BigDecimal(sell10eltype.getText());
        BigDecimal sell19elpric = new BigDecimal(sell19eltype.getText());
        BigDecimal selldispric  = new BigDecimal(selldistype.getText());

        /*        int purch500pric = Integer.parseInt(purch500price.getText());
        int purch750pric = Integer.parseInt(purch750price.getText());
        int purch1000pric = Integer.parseInt(purch1000price.getText());
        int purch1500pric = Integer.parseInt(purch1500price.getText());
        int purch5000pric = Integer.parseInt(purch5000price.getText());
        int purch7000pric = Integer.parseInt(purch7000price.getText());
        int purch10lpric = Integer.parseInt(purch10lprice.getText());
        int purch19lpric = Integer.parseInt(purch19lprice.getText());
        int purch10elpric = Integer.parseInt(purch10elprice.getText());
        int purch19elpric = Integer.parseInt(purch19elprice.getText());
        int purchdispric = Integer.parseInt(purchdisprice.getText());
        
        
         */
         BigDecimal oldtotal = sell500.multiply(sellrs500).add(sell750.multiply(sellrs750)).add(sell1000.multiply(sellrs1000).add(sell1500.multiply(sellrs1500))).add(sell5000.multiply(sellrs5000).add(sell7000.multiply(sellrs7000)).add(sell10l.multiply(sellrs10l).add(sell19l.multiply(sellrs19l)))).add(sell10le.multiply(sellrs10le).add(sell19le.multiply(sellrs19le)).add(selldis.multiply(sellrsdis)));

         BigDecimal sellingtotal = sell500.multiply(sell500pric).add(sell750.multiply(sell750pric)).add(sell1000.multiply(sell1000pric).add(sell1500.multiply(sell1500pric))).add(sell5000.multiply(sell5000pric).add(sell7000.multiply(sell7000pric)).add(sell10l.multiply(sell10lpric).add(sell19l.multiply(sell19lpric)))).add(sell10le.multiply(sell10elpric).add(sell19le.multiply(sell19elpric)).add(selldis.multiply(selldispric)));

        try {
            String sql = "INSERT INTO customerbill ( invoice_number,name ,date , ml500 , ml750 ,ml1000 , ml1500  , ml5000 , ml7000 , l10 ,l19 , el10 , el19 ,dispencer , total ,oldtotal,profit )VALUES ( '" + invoice + "' ,'" + cname + "' , '" + date + "'  , '" + sell500 + "' ,'" + sell750 + "' , '" + sell1000 + "' ,'" + sell1500 + "' ,  '" + sell5000 + "',  '" + sell7000 + "' , '" + sell10l + "','" + sell19l + "','" + sell10le + "' ,'" + sell19le + "',  '" + selldis + "'  ,   '" + sellingtotal + "' , '"+oldtotal+"' , '"+profit+"'  ) ";

            pst = conn.prepareStatement(sql);
            pst.execute();
            JOptionPane.showMessageDialog(null, "Inserted!");
        } catch (HeadlessException | SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }

        updatestore();
        clear();
    }//GEN-LAST:event_insertsellingActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed

        // TODO add your handling code here:
        Home objectHome = new Home();
        objectHome.setVisible(true);
        this.dispose();

    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        Store objectstore = new Store();
        objectstore.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed

        // TODO add your handling code here:
        Selling4 objectSelling4 = new Selling4();
        objectSelling4.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void nametableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_nametableMouseClicked
        // TODO add your handling code here:
        tabledeta7();
    }//GEN-LAST:event_nametableMouseClicked

    private void nametableKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_nametableKeyReleased
        // TODO add your handling code here:
        tabledeta7();
    }//GEN-LAST:event_nametableKeyReleased

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        BigDecimal sell500 =  new BigDecimal(type500new.getText());
        BigDecimal sell750 = new BigDecimal(type750new.getText());
        BigDecimal sell1000 = new BigDecimal(type1000new.getText());
        BigDecimal sell1500 = new BigDecimal(type1500new.getText());
        BigDecimal sell5000 = new BigDecimal(type5000new.getText());
        BigDecimal sell7000 = new BigDecimal(type7000new.getText());
        BigDecimal sell10l = new BigDecimal(type10lnew.getText());
        BigDecimal sell19l = new BigDecimal(type19lnew.getText());
        BigDecimal sell10le = new BigDecimal(type10elnew.getText());
        BigDecimal sell19le = new BigDecimal(type19elnew.getText());
        BigDecimal selldis = new BigDecimal(typedisnew.getText());

        BigDecimal sellrs500 = new BigDecimal(rs500.getText());
        BigDecimal sellrs750 = new BigDecimal(rs750.getText());
        BigDecimal sellrs1000 = new BigDecimal(rs1000.getText());
        BigDecimal sellrs1500 = new BigDecimal(rs1500.getText());
        BigDecimal sellrs5000 = new BigDecimal(rs5000.getText());
        BigDecimal sellrs7000 = new BigDecimal(rs7000.getText());
        BigDecimal sellrs10l = new BigDecimal(rs10l.getText());
        BigDecimal sellrs19l = new BigDecimal(rs19l.getText());
        BigDecimal sellrs10le = new BigDecimal(rs10el.getText());
        BigDecimal sellrs19le = new BigDecimal(rs19el.getText());
        BigDecimal sellrsdis = new BigDecimal(rsdis.getText());

        BigDecimal sell500pric = new BigDecimal(sell500type.getText());
        BigDecimal sell750pric =new BigDecimal(sell750type.getText());
        BigDecimal sell1000pric = new BigDecimal(sell1000type.getText());
        BigDecimal sell1500pric =new BigDecimal(sell1500type.getText());
        BigDecimal sell5000pric = new BigDecimal(sell5000type.getText());
        BigDecimal sell7000pric = new BigDecimal(sell7000type.getText());
        BigDecimal sell10lpric = new BigDecimal(sell10ltype.getText());
        BigDecimal sell19lpric = new BigDecimal(sell19ltype.getText());
        BigDecimal sell10elpric = new BigDecimal(sell10eltype.getText());
        BigDecimal sell19elpric = new BigDecimal(sell19eltype.getText());
        BigDecimal selldispric = new BigDecimal(selldistype.getText());

       
         BigDecimal oldtotal = sell500.multiply(sellrs500).add(sell750.multiply(sellrs750)).add(sell1000.multiply(sellrs1000).add(sell1500.multiply(sellrs1500))).add(sell5000.multiply(sellrs5000).add(sell7000.multiply(sellrs7000)).add(sell10l.multiply(sellrs10l).add(sell19l.multiply(sellrs19l)))).add(sell10le.multiply(sellrs10le).add(sell19le.multiply(sellrs19le)).add(selldis.multiply(sellrsdis)));

         BigDecimal sellingtotal = sell500.multiply(sell500pric).add(sell750.multiply(sell750pric)).add(sell1000.multiply(sell1000pric).add(sell1500.multiply(sell1500pric))).add(sell5000.multiply(sell5000pric).add(sell7000.multiply(sell7000pric)).add(sell10l.multiply(sell10lpric).add(sell19l.multiply(sell19lpric)))).add(sell10le.multiply(sell10elpric).add(sell19le.multiply(sell19elpric)).add(selldis.multiply(selldispric)));

        BigDecimal profit = sellingtotal.subtract(oldtotal);

        String pro = String.valueOf(profit);

        profitbox.setText(pro);

    }//GEN-LAST:event_jButton4ActionPerformed

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
            java.util.logging.Logger.getLogger(Selling3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Selling3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Selling3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Selling3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Selling3().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField billno;
    private javax.swing.JLabel dat;
    private javax.swing.JButton insertselling;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
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
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JTable jTable123;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField monthtxt;
    private javax.swing.JTextField namebox;
    private javax.swing.JTable nametable;
    private javax.swing.JTextField price1000;
    private javax.swing.JTextField price10el;
    private javax.swing.JTextField price10l;
    private javax.swing.JTextField price1500;
    private javax.swing.JTextField price19el;
    private javax.swing.JTextField price19l;
    private javax.swing.JTextField price500;
    private javax.swing.JTextField price5000;
    private javax.swing.JTextField price7000;
    private javax.swing.JTextField price750;
    private javax.swing.JTextField pricedis;
    private javax.swing.JTable priceone;
    private javax.swing.JTable pricepertable;
    private javax.swing.JTextField profitbox;
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
    private javax.swing.JTextField qts751;
    private javax.swing.JTextField qtsdis;
    private javax.swing.JTable qtstable;
    private javax.swing.JTextField rs1000;
    private javax.swing.JTextField rs10el;
    private javax.swing.JTextField rs10l;
    private javax.swing.JTextField rs1500;
    private javax.swing.JTextField rs19el;
    private javax.swing.JTextField rs19l;
    private javax.swing.JTextField rs500;
    private javax.swing.JTextField rs5000;
    private javax.swing.JTextField rs7000;
    private javax.swing.JTextField rs750;
    private javax.swing.JTextField rsdis;
    private javax.swing.JTextField sell1000type;
    private javax.swing.JTextField sell10eltype;
    private javax.swing.JTextField sell10ltype;
    private javax.swing.JTextField sell1500type;
    private javax.swing.JTextField sell19eltype;
    private javax.swing.JTextField sell19ltype;
    private javax.swing.JTextField sell5000type;
    private javax.swing.JTextField sell500type;
    private javax.swing.JTextField sell7000type;
    private javax.swing.JTextField sell750type;
    private javax.swing.JTextField selldistype;
    private javax.swing.JTextField sellingdate;
    private javax.swing.JTable sellingqts;
    private javax.swing.JTable sellingtotal;
    private javax.swing.JTextField sellqt1000;
    private javax.swing.JTextField sellqt10el;
    private javax.swing.JTextField sellqt10l;
    private javax.swing.JTextField sellqt1500;
    private javax.swing.JTextField sellqt19el;
    private javax.swing.JTextField sellqt19l;
    private javax.swing.JTextField sellqt500;
    private javax.swing.JTextField sellqt5000;
    private javax.swing.JTextField sellqt7000;
    private javax.swing.JTextField sellqt750;
    private javax.swing.JTextField sellqtdis;
    private javax.swing.JTextField sellto1000;
    private javax.swing.JTextField sellto10el;
    private javax.swing.JTextField sellto10l;
    private javax.swing.JTextField sellto1500;
    private javax.swing.JTextField sellto19el;
    private javax.swing.JTextField sellto19l;
    private javax.swing.JTextField sellto500;
    private javax.swing.JTextField sellto5000;
    private javax.swing.JTextField sellto7000;
    private javax.swing.JTextField sellto750;
    private javax.swing.JTextField selltodis;
    private javax.swing.JTextField txtinvoice;
    private javax.swing.JTextField type1000new;
    private javax.swing.JTextField type10elnew;
    private javax.swing.JTextField type10lnew;
    private javax.swing.JTextField type1500new;
    private javax.swing.JTextField type19elnew;
    private javax.swing.JTextField type19lnew;
    private javax.swing.JTextField type5000new;
    private javax.swing.JTextField type500new;
    private javax.swing.JTextField type7000new;
    private javax.swing.JTextField type750new;
    private javax.swing.JTextField typedisnew;
    // End of variables declaration//GEN-END:variables
}
