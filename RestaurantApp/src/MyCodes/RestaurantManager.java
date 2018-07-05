/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MyCodes;

import FrameSet.logdetails;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import net.proteanit.sql.DbUtils;


public class RestaurantManager extends Users{
    private int empid;
    private String resulttype;
    
    
    
    public void showresult(JTable jt){
        try {
            String tablename=configresulttable();
            
            DbConnection db=new DbConnection();
            db.mysqlconnection();
            String q1="select * from "+tablename+"";
            db.rs=db.st.executeQuery(q1);
            db.pst = (PreparedStatement) db.con.prepareStatement(q1);
            
            jt.setModel(DbUtils.resultSetToTableModel(db.rs));
            db.st.close();
        } catch (SQLException ex) {
            //Logger.getLogger(RestaurantManager.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Data Format or Connection error \nTry Again", "Error",
        JOptionPane.WARNING_MESSAGE);
        }
    }
    
    
    private String configresulttable(){
        String tablename;
        if ("Food Items".equals(getResulttype())) {
            tablename="fooditem";
        }else if ("Customer Details".equals(getResulttype())) {
            tablename="customer";
        }else if ("Order Details".equals(getResulttype())) {
            tablename="orders";
        }else if ("purchas Details".equals(getResulttype())) {
            tablename="purchases";
        }else{
            tablename="suplier";
        }
        return tablename;
    }
    
    public void addfood(){
        try {
            DbConnection db= new DbConnection();
            db.mysqlconnection();
            String q1="insert into fooditem values("+getItemid()+",'"+getItemname()+"',"+getItemprice()+","+getItemqunt()+",'"+getItemtype()+"')";
            db.st.executeUpdate(q1);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Data Format or Connection error \nTry Again", "Error",
        JOptionPane.WARNING_MESSAGE);
            //Logger.getLogger(RestaurantManager.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    

    public void remfood(){
        try {
            DbConnection db= new DbConnection();
            db.mysqlconnection();
            String q1="DELETE FROM fooditem WHERE itemid="+getItemid()+"";
            db.st.executeUpdate(q1);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Data Format or Connection error \nTry Again", "Error",
        JOptionPane.WARNING_MESSAGE);
            //Logger.getLogger(RestaurantManager.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void adduser(){
        try {
            DbConnection db= new DbConnection();
            db.mysqlconnection();
            String q1="insert into login values("+getEmpid()+",'"+getUsername()+"','"+getPassword()+"')";
            db.st.executeUpdate(q1);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Data Format or Connection error \nTry Again", "Error",
        JOptionPane.WARNING_MESSAGE);
            //Logger.getLogger(RestaurantManager.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public void updateuser(){
        try {
            DbConnection db= new DbConnection();
            db.mysqlconnection();
            String q1="UPDATE login SET usernam='"+getUsername()+"', password='"+getPassword()+"' WHERE userid ="+getEmpid()+"";
            db.st.executeUpdate(q1);
        } catch (SQLException ex) {
              JOptionPane.showMessageDialog(null, "Data Format or Connection error \nTry Again", "Error",
        JOptionPane.WARNING_MESSAGE);
            //Logger.getLogger(RestaurantManager.class.getName()).log(Level.SEVERE, null, ex);

        }
    }

    @Override
    public void displaylogrec() {
        super.displaylogrec(); //To change body of generated methods, choose Tools | Templates.
        logdetails ll=new logdetails();
        ll.setEid(empid);
    }
    
    

    /**
     * @return the empid
     */
    public int getEmpid() {
        return empid;
    }

    /**
     * @param empid the empid to set
     */
    public void setEmpid(int empid) {
        this.empid = empid;
    }

    /**
     * @return the resulttype
     */
    public String getResulttype() {
        return resulttype;
    }

    /**
     * @param resulttype the resulttype to set
     */
    public void setResulttype(String resulttype) {
        this.resulttype = resulttype;
    }
    
    
    
    
    
    
    
    
    
    
}
