/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MyCodes;

import FrameSet.logdetails;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;


public class RestaurantWaiter extends Users{
    
    public void updatitem(){
        try {
            System.out.println("\n"+getItemid()+getItemname()+getItemprice()+getItemqunt()+getItemtype());
            DbConnection db=new DbConnection();
            db.mysqlconnection();
            String q1 ="select itemqty from fooditem where itemid="+getItemid()+"";
            db.rs=db.st.executeQuery(q1);
            int dbq=0;
            
            while (db.rs.next()) {
                
                dbq=Integer.parseInt(db.rs.getString("itemqty"));
                //jComboBox1.addItem(db.rs.getString("itemname"));
            }
            
            dbq=dbq+getItemqunt();
            
            q1="update fooditem set itemname='"+getItemname()+"',itemprice="+getItemprice()+",itemqty="+dbq+",type='"+getItemtype()+"' where itemid="+getItemid()+"";
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
        System.out.println("\n"+empid);
        logdetails ll=new logdetails();
        ll.setEid(empid);
    }
    
    
    
}
 