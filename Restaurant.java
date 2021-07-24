/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication12;

import java.util.ArrayList;
import java.util.List;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author LENOVO
 */
public class Restaurant {

    private String Name;
    private  String Address;
    private  List<meals> menu=new ArrayList<>();
    private  List<Orders> order=new ArrayList<>();
    SimpleDateFormat sfdate=new SimpleDateFormat("dd/MM/yyyy");
    Date d=new Date();
    private String Date=sfdate.format(d);
   
    public Restaurant(String name, String address) 
    {
        this.Name = name;
        this.Address = address;
    }

    public List<Orders> getOrder() {
        return order;
    }
    
  public void setName(String Name) {
        this.Name=Name;
    }

    public void setAddress(String Address) {
        this.Address = Address;
   }

    public String getName() {
        return Name;
    }

    public String getAddress() {
        return Address;
    }

    public List<meals> getMenu() {
        return menu;
    }
    
   public void showOrder()
   {
       boolean check= order.isEmpty();
       if(check==true)
       {
           System.out.println("Unfortunately, no orders to be Shown ");
       }
       else{
           
    for(int i=0;i<order.size();i++)
    {
        System.out.println("order details :");
        System.out.println("meal name : "+order.get(i).getMealname()+"\n" + "quantity :"+order.get(i).getQuantity() +"\n" +"additional notes :"+ order.get(i).getAdditionalnotes() +"\n" +"date :"+ Date );
    }
    
       }
    
    }
    
}
