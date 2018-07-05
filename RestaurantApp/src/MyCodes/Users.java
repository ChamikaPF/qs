/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MyCodes;

import FrameSet.Buttons;
import FrameSet.Login;
import FrameSet.logdetails;
import java.sql.SQLException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTable;


public class Users {
    
    private String username;
    private String password;
    private int itemid;
    private String itemname;
    private int itemprice;
    private int itemqunt;
    private  String itemtype;
    public static int empid;
   

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    
    public void displaylogrec(){//user kiparak log unad kiyl balanaeka
        try {
            System.out.println("hi"+empid);
            DbConnection db = new DbConnection();
            db.mysqlconnection();
            String q="Select * from logindetails where 	EmpID="+empid+"";
            db.rs=db.st.executeQuery(q);
            int cc=0;
            while (db.rs.next()) {
                cc++;
            }
            logdetails g= new logdetails();
            g.setPrelog(cc);
        } catch (SQLException ex) {JOptionPane.showMessageDialog(null, "Data Format or Connection error \nTry Again", "Error",
        JOptionPane.WARNING_MESSAGE);
            //Logger.getLogger(RestaurantManager.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    

//    public void setuname(String text1) {
//        System.out.println("\n"+text1);
//        username=text1;
//        
//    }
//
//    public void setpwd(String text2) {
//        System.out.println("\n"+text2);
//        password=text2;
//       // logintosystem();
//    }
    public int logintosystem(){
        int flag=0;
        try {
            DbConnection db= new DbConnection();
           
            db.mysqlconnection();
            String qur="select * from login ";
             System.out.println("Pwd&Unme"+"\n"+getPassword()+"\n"+getUsername());
            db.rs=db.st.executeQuery(qur);
             
            
            
            while (db.rs.next()) { 
                System.out.println("\n"+db.rs.getString(2)+"\n"+db.rs.getString(3)+"\n"+getUsername()+"\n"+getPassword());
                String un=(String) getUsername();
                String pw=(String) getPassword();
                if (un.equals(db.rs.getString(2)) && pw.equals(db.rs.getString(3))) {
                        flag=1;// norml userslat
                        //setEmpid(Integer.parseInt(db.rs.getString(1)));
                        empid=Integer.parseInt(db.rs.getString(1));
                        if (un.equals("admin")) {
                            flag=2;// admint 
                        
                    }
                        break;
                    }
            }
            
            if (flag!=0) {
                updatelogrec();
            }
        } catch (SQLException ex) {JOptionPane.showMessageDialog(null, "Data Format or Connection error \nTry Again", "Error",
        JOptionPane.WARNING_MESSAGE);
            //Logger.getLogger(RestaurantManager.class.getName()).log(Level.SEVERE, null, ex);
        }
//        if (flag==true) {
//            //Login lo=new Login();
//            //lo.setVisible(false);
//            //lo.hide();
//            Buttons b = new Buttons();
//            b.setVisible(true);
            
            
            //Login l = new Login();
            //l.setVisible(false);
//        }
       return flag;
    }

    private void updatelogrec(){
        try {
            DbConnection db= new DbConnection();
            db.mysqlconnection();
            int uid=0;
            String q1="select userid from login where usernam='"+username+"' and password='"+password+"'";
            db.rs=db.st.executeQuery(q1);
            while (db.rs.next()) {
                uid=Integer.parseInt(db.rs.getString(1));//dbq=Integer.parseInt(db.rs.getString("itemqty"));
                //jComboBox1.addItem(db.rs.getString("itemname"));
            }
            String time=gettimedate();
            
            String q2="insert into logindetails (EmpID,	Details) values("+uid+",'"+time+"')";
            db.st.executeUpdate(q2);
        } catch (SQLException ex) {
            Logger.getLogger(Users.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    private String gettimedate(){
        DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
             Date date = new Date();
             String tim=(String)dateFormat.format(date);
             return tim;
    }
    /**
     * @return the itemid
     */
    public int getItemid() {
        return itemid;
    }

    /**
     * @param itemid the itemid to set
     */
    public void setItemid(int itemid) {
        this.itemid = itemid;
    }

    /**
     * @return the itemname
     */
    public String getItemname() {
        return itemname;
    }

    /**
     * @param itemname the itemname to set
     */
    public void setItemname(String itemname) {
        this.itemname = itemname;
    }

    /**
     * @return the itemprice
     */
    public int getItemprice() {
        return itemprice;
    }

    /**
     * @param itemprice the itemprice to set
     */
    public void setItemprice(int itemprice) {
        this.itemprice = itemprice;
    }

    /**
     * @return the itemqunt
     */
    public int getItemqunt() {
        return itemqunt;
    }

    /**
     * @param itemqunt the itemqunt to set
     */
    public void setItemqunt(int itemqunt) {
        this.itemqunt = itemqunt;
    }

    /**
     * @return the itemtype
     */
    public String getItemtype() {
        return itemtype;
    }

    /**
     * @param itemtype the itemtype to set
     */
    public void setItemtype(String itemtype) {
        this.itemtype = itemtype;
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

   
}
