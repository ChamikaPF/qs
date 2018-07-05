/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MyCodes;

import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;


public class Order {

    private int orderID;
    private String Mitem;
    private String Deitem;
    private String Dritem;
    private int Mq;
    private int Deq;
    private int Drq;
    public boolean makeorder(){
        try {
            DbConnection db= new DbConnection();
            db.mysqlconnection();
            String q1,q2,q3;
            
            boolean f1=chkmainfood();
            boolean f2=chkdesert();
            boolean f3=chkdrink();
            
            if (f1==true && f2==true && f3==true) {
                q1="insert into orders values("+orderID+",'"+Mitem+"',"+Mq+",'"+Deitem+"',"+Deq+",'"+Dritem+"',"+Drq+")";
                db.st.executeUpdate(q1);
                redusmainitem();
                redusdeserttem();
                redusdrinktem();
                return true;
            }
            else{
                System.out.println("no enough items");
                return false;
            }
            
            
        } catch (SQLException ex) {
            //Logger.getLogger(Order.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Data Format or Connection error \nTry Again", "Error",
        JOptionPane.WARNING_MESSAGE);
        }
        return false;
    }
    
    
    private void redusmainitem(){
        
        try {
            DbConnection db= new DbConnection();
            db.mysqlconnection();
            String q1,qup;
            
            q1 ="select itemqty from fooditem where itemname='"+Mitem+"'";
            db.rs=db.st.executeQuery(q1);
            int dbq=0;
            
            while (db.rs.next()) {
                dbq=Integer.parseInt(db.rs.getString("itemqty"));
                
            }
            
            dbq = dbq-Mq;//database eke thiyen qty eken use krpu tika adu wela ena qty eka
            
            qup="UPDATE fooditem SET itemqty="+dbq+" WHERE itemname ='"+Mitem+"'";
        db.st.executeUpdate(qup);
            
        } catch (SQLException ex) {
            //Logger.getLogger(Order.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Data Format or Connection error \nTry Again", "Error",
        JOptionPane.WARNING_MESSAGE);
        }
    }
    
    
    private void redusdeserttem(){
        try {
            DbConnection db= new DbConnection();
            db.mysqlconnection();
            String q1,qup;
            
            q1 ="select itemqty from fooditem where itemname='"+Deitem+"'";
            db.rs=db.st.executeQuery(q1);
            int dbq=0;
            
            while (db.rs.next()) {
                dbq=Integer.parseInt(db.rs.getString("itemqty"));
                
            }
            
            dbq=dbq-Deq;
            
            qup="UPDATE fooditem SET itemqty="+dbq+" WHERE itemname ='"+Deitem+"'";
        db.st.executeUpdate(qup);
            
        } catch (SQLException ex) {
            //Logger.getLogger(Order.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Data Format or Connection error \nTry Again", "Error",
        JOptionPane.WARNING_MESSAGE);
        }
    }
    
    
    private void redusdrinktem(){
        try {
            DbConnection db= new DbConnection();
            db.mysqlconnection();
            String q1,qup;
            
            q1 ="select itemqty from fooditem where itemname='"+Dritem+"'";
            db.rs=db.st.executeQuery(q1);
            int dbq=0;
            
            while (db.rs.next()) {
                dbq=Integer.parseInt(db.rs.getString("itemqty"));
                
            }
            
            dbq=dbq-Drq;
            
            qup="UPDATE fooditem SET itemqty="+dbq+" WHERE itemname ='"+Dritem+"'";
        db.st.executeUpdate(qup);
            
        } catch (SQLException ex) {
            //Logger.getLogger(Order.class.getName()).log(Level.SEVERE, null, ex);
           JOptionPane.showMessageDialog(null, "Data Format or Connection error \nTry Again", "Error",
        JOptionPane.WARNING_MESSAGE);
        }
    }
    //----

    private boolean chkmainfood(){
        boolean flage1=false;
        try {
            DbConnection db= new DbConnection();
            db.mysqlconnection();
            String q1;
            
            q1 ="select itemqty from fooditem where itemname='"+Mitem+"'";
            db.rs=db.st.executeQuery(q1);
            int dbitmq=0;
            
            while (db.rs.next()) {
                dbitmq=Integer.parseInt(db.rs.getString("itemqty"));
                
            }
            if (dbitmq>=Mq) {
                flage1=true;
                
            }
            
                    } catch (SQLException ex) {
            //Logger.getLogger(Order.class.getName()).log(Level.SEVERE, null, ex);
                        JOptionPane.showMessageDialog(null, "Data Format or Connection error \nTry Again", "Error",
        JOptionPane.WARNING_MESSAGE);
        }
        return flage1;
    }
    
    private boolean chkdesert(){
        boolean flage1=false;
        try {
            DbConnection db= new DbConnection();
            db.mysqlconnection();
            String q1;
            
            q1 ="select itemqty from fooditem where itemname='"+Deitem+"'";
            db.rs=db.st.executeQuery(q1);
            int dbitmq=0;
            
            while (db.rs.next()) {
                dbitmq=Integer.parseInt(db.rs.getString("itemqty"));
                
            }
            if (dbitmq>=Deq) {
                flage1=true;
            }
            
                    } catch (SQLException ex) {
            //Logger.getLogger(Order.class.getName()).log(Level.SEVERE, null, ex);
                        JOptionPane.showMessageDialog(null, "Data Format or Connection error \nTry Again", "Error",
        JOptionPane.WARNING_MESSAGE);
        }
        return flage1;
    }
    
    private boolean chkdrink(){
        boolean flage1=false;
        try {
            DbConnection db= new DbConnection();
            db.mysqlconnection();
            String q1;
            
            q1 ="select itemqty from fooditem where itemname='"+Dritem+"'";
            db.rs=db.st.executeQuery(q1);
            int dbitmq=0;
            
            while (db.rs.next()) {
                dbitmq=Integer.parseInt(db.rs.getString("itemqty"));
                
            }
            if (dbitmq>=Drq) {
                flage1=true;
            }
            
                    } catch (SQLException ex) {
            //Logger.getLogger(Order.class.getName()).log(Level.SEVERE, null, ex);
                        JOptionPane.showMessageDialog(null, "Data Format or Connection error \nTry Again", "Error",
        JOptionPane.WARNING_MESSAGE);
        }
        return flage1;
    }
    
    /**
     * @return the orderID
     */
    public int getOrderID() {
        return orderID;
    }

    /**
     * @param orderID the orderID to set
     */
    public void setOrderID(int orderID) {
        this.orderID = orderID;
    }

    /**
     * @return the Mitem
     */
    public String getMitem() {
        return Mitem;
    }

    /**
     * @param Mitem the Mitem to set
     */
    public void setMitem(String Mitem) {
        this.Mitem = Mitem;
    }

    /**
     * @return the Deitem
     */
    public String getDeitem() {
        return Deitem;
    }

    /**
     * @param Deitem the Deitem to set
     */
    public void setDeitem(String Deitem) {
        this.Deitem = Deitem;
    }

    /**
     * @return the Dritem
     */
    public String getDritem() {
        return Dritem;
    }

    /**
     * @param Dritem the Dritem to set
     */
    public void setDritem(String Dritem) {
        this.Dritem = Dritem;
    }

    /**
     * @return the Mq
     */
    public int getMq() {
        return Mq;
    }

    /**
     * @param Mq the Mq to set
     */
    public void setMq(int Mq) {
        this.Mq = Mq;
    }

    /**
     * @return the Deq
     */
    public int getDeq() {
        return Deq;
    }

    /**
     * @param Deq the Deq to set
     */
    public void setDeq(int Deq) {
        this.Deq = Deq;
    }

    /**
     * @return the Drq
     */
    public int getDrq() {
        return Drq;
    }

    /**
     * @param Drq the Drq to set
     */
    public void setDrq(int Drq) {
        this.Drq = Drq;
    }
    
}
