/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MyCodes;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;


public class DbConnection {
   String driver = "com.mysql.jdbc.Driver";
   String url = "jdbc:mysql://localhost:3306/restaurantdb";
   String dbusername = "root";
   String dbpassword = "";
   public Statement st=null;
   public ResultSet rs = null;
   public PreparedStatement pst = null;
   public Connection con=null;
   
   public void mysqlconnection(){
           
       try {
           Class.forName(driver);
           
           
               con = DriverManager.getConnection(url,dbusername,dbpassword);
           
           st = con.createStatement();
           
       } catch (ClassNotFoundException | SQLException ex) {
           //Logger.getLogger(DbConnection.class.getName()).log(Level.SEVERE, null, ex);
           JOptionPane.showMessageDialog(null, "Check DataBase Connection ", "MYSQL Connection error",
        JOptionPane.WARNING_MESSAGE);
       }
   }
    
}
