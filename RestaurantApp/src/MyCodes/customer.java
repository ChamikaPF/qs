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


public class customer {
    private String customername;
    private int customercont;
    
    
    public void updatecustomer(){
        try {
            System.out.println("\n"+customername+" "+customercont);
            DbConnection db= new DbConnection();
            db.mysqlconnection();
            String q2="insert into customer (customername,phone) values('"+customername+"',"+customercont+" )";
            db.st.executeUpdate(q2);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Data Format or Connection error \nTry Again", "Error",
        JOptionPane.WARNING_MESSAGE);
            //Logger.getLogger(RestaurantManager.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }


    /**
     * @return the customername
     */
    public String getCustomername() {
        return customername;
    }

    /**
     * @param customername the customername to set
     */
    public void setCustomername(String customername) {
        this.customername = customername;
    }

    /**
     * @return the customercont
     */
    public int getCustomercont() {
        return customercont;
    }

    /**
     * @param customercont the customercont to set
     */
    public void setCustomercont(int customercont) {
        this.customercont = customercont;
    }
    
}
