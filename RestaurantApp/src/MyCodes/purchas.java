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


public class purchas {
    private int purchaseid;
    private int totalamounttopay;
    private int paid;
    private int outstanding;
    private int quantity;
    private int itemid;

    
    public void createpurc(){
        try {
            DbConnection db=new DbConnection();
            db.mysqlconnection();
            String q1="insert into purchases  values("+purchaseid+","+totalamounttopay+","+paid+","+outstanding+","+quantity+","+itemid+")";
            db.st.executeUpdate(q1);
        } catch (SQLException ex) {JOptionPane.showMessageDialog(null, "Data Format or Connection error \nTry Again", "Error",
        JOptionPane.WARNING_MESSAGE);
            //Logger.getLogger(RestaurantManager.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * @return the purchaseid
     */
    public int getPurchaseid() {
        return purchaseid;
    }

    /**
     * @param purchaseid the purchaseid to set
     */
    public void setPurchaseid(int purchaseid) {
        this.purchaseid = purchaseid;
    }

    /**
     * @return the totalamounttopay
     */
    public int getTotalamounttopay() {
        return totalamounttopay;
    }

    /**
     * @param totalamounttopay the totalamounttopay to set
     */
    public void setTotalamounttopay(int totalamounttopay) {
        this.totalamounttopay = totalamounttopay;
    }

    /**
     * @return the paid
     */
    public int getPaid() {
        return paid;
    }

    /**
     * @param paid the paid to set
     */
    public void setPaid(int paid) {
        this.paid = paid;
    }

    /**
     * @return the outstanding
     */
    public int getOutstanding() {
        return outstanding;
    }

    /**
     * @param outstanding the outstanding to set
     */
    public void setOutstanding(int outstanding) {
        this.outstanding = outstanding;
    }

    /**
     * @return the quantity
     */
    public int getQuantity() {
        return quantity;
    }

    /**
     * @param quantity the quantity to set
     */
    public void setQuantity(int quantity) {
        this.quantity = quantity;
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
    
    
}
