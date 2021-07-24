/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication12;

/**
 *
 * @author LENOVO
 */
public class Sandwich extends meals {

    public Sandwich(String Name, String Description, double Price) {
        super(Name, Description, Price);
    }
    

  @Override
     public String toString() {
           System.out.println("Sandwich : ");
        return " { Name : "+this.getName()+" , " +"Description : "+this.getDescription()+" , "+"Price : "+this.getPrice()+" }"+"\n";
   
    }

}