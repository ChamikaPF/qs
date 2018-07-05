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


public class Suplier {
    private int supid;
    private int itmid;
    private String itmdis;
    
    public void addsuplierdetails(){
        try {
            DbConnection db=new DbConnection();
            db.mysqlconnection();
            String q1="insert into suplier (itemid, itemdescription, SuplierID) values("+itmid+",'"+itmdis+"','"+supid+"')";
            db.st.executeUpdate(q1);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Data Format or Connection error \nTry Again", "Error",
        JOptionPane.WARNING_MESSAGE);
            //Logger.getLogger(RestaurantManager.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }

    /**
     * @return the supid
     */
    public int getSupid() {
        return supid;
    }

    /**
     * @param supid the supid to set
     */
    public void setSupid(int supid) {
        this.supid = supid;
    }

    /**
     * @return the itmid
     */
    public int getItmid() {
        return itmid;
    }

    /**
     * @param itmid the itmid to set
     */
    public void setItmid(int itmid) {
        this.itmid = itmid;
    }

    /**
     * @return the itmdis
     */
    public String getItmdis() {
        return itmdis;
    }

    /**
     * @param itmdis the itmdis to set
     */
    public void setItmdis(String itmdis) {
        this.itmdis = itmdis;
    }
        
    
}
