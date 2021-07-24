/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication12;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author nadahmed
 */
public class connect {
    
    public Connection databaseConnection;
    private final String databaseUrl = "jdbc:mysql://remotemysql.com:3306/1SHQ2hXpbf";

    public connect() {

        try {
            this.databaseConnection = DriverManager.getConnection(databaseUrl, "1SHQ2hXpbf", "6Z3mlaH3ip");
        } catch (Exception e) {
            System.err.println( e.getClass().getName() + ": " + e.getMessage() );
         System.exit(0);
            System.out.println("not successfull");
        }
        
    }
    public void insertcustomer(String username,String password){
     
     Statement myStmt = null;


            
         try {
             myStmt = databaseConnection.createStatement();
              String st = "INSERT INTO customer Values( '" +username+ "','" + password + "');";
              myStmt.executeUpdate(st);        
         } catch (SQLException ex) {
             Logger.getLogger(connect.class.getName()).log(Level.SEVERE, null, ex);
         }
               
           
   }
     public void insertmanager(String name,String pass,String rname){
     
       Statement myStmt = null;


            
         try {
             myStmt = databaseConnection.createStatement();
              String st = "INSERT INTO restaurantmanagers Values( '" +name+ "','" + pass + "','" + rname + "');";
              myStmt.executeUpdate(st);        
         } catch (SQLException ex) {
             Logger.getLogger(connect.class.getName()).log(Level.SEVERE, null, ex);
         }
               
           
   }

     public boolean Customerlogin(String name,String pass)
    
     {
        Statement myStmt = null;
        ResultSet myRs = null; 
        boolean result=false;
        try {
            myStmt = databaseConnection.createStatement();
             String sql1 = "Select * from customer";

        myRs=myStmt.executeQuery(sql1);
        while(myRs.next()){
            
            if(myRs.getString("username").equals(name) && myRs.getString("password").equals(pass)){
       
        result=true;
    return true;
        }
        }
       
        } catch (SQLException ex) {
            Logger.getLogger(connect.class.getName()).log(Level.SEVERE, null, ex);
        }
 
   return false ;
    }
          
      

          
      public boolean RestaurantManagerlogin(String name,String pass,String restname)
    
     {
        Statement myStmt = null;
        ResultSet myRs = null; 

        boolean result=false;
        try {
            myStmt = databaseConnection.createStatement();
             String sql1 = "Select * from restaurantmanagers";

        myRs=myStmt.executeQuery(sql1);
        while(myRs.next()){
            
            if(myRs.getString("username").equals(name) && myRs.getString("password").equals(pass) && myRs.getString("restaurantname").equals(restname)){
       
        result=true;
     return true;
        }
        }
       
        } catch (SQLException ex) {
            Logger.getLogger(connect.class.getName()).log(Level.SEVERE, null, ex);
        }
 
   return false ;
    }
     
           
      }
     
     
      
         