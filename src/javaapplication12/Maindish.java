/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication12;

import java.util.Scanner;

/**
 *
 * @author LENOVO
 */
public class Maindish extends meals {
    private String offer;
    
    
   public Maindish(String name, String description, double price, String offer) {
        super(name,description,price);
        this.offer=offer;
    }
   
   
    public String getOffer() {
        return offer;
    }

    public void setOffer(String offer) {
        this.offer = offer;
    }
   
    @Override
     public String toString() {
          System.out.println("Maindish : ");
        return " { Name : "+this.getName()+" , " +"Description : "+this.getDescription()+" , "+"Price : "+this.getPrice()+" , "+"Offer : " + offer+" }"+"\n";
  
    }

  @Override
    public void update() {
        while (true)
         {
            Scanner update_maindish=new Scanner(System.in).useDelimiter("\n");
            System.out.println("Do you want to update the name, description, price or offer?");
            String new_update=update_maindish.next();
             switch (new_update.toLowerCase()) {
                 case "name":
                     System.out.print("Enter the new maindish name : ");
                     String updated_maindish_name=update_maindish.next();
                     this.setName(updated_maindish_name);
                     System.out.println(this);
                     System.out.println("maindish name has been successfully updated");
                     break;
                 case "description":
                     System.out.print("Enter the new maindish description : ");
                     String updated_maindish_description=update_maindish.next();
                    this.setDescription(updated_maindish_description);
                     System.out.println(this);
                     System.out.println("maindish description has been successfully updated");
                     break;
                 case "price":
                     System.out.print("Enter the new maindish price : ");
                     double updated_maindish_price=update_maindish.nextDouble();
                     this.setPrice(updated_maindish_price);
                     System.out.println(this);
                     System.out.println("maindish price has been successfully updated");
                     break;
                   case "offer": 
                     System.out.print("Enter the new maindish offer : ");
                    String updated_maindish_offer=update_maindish.next();
                    this.setOffer(updated_maindish_offer);
                    System.out.println(this);
                    System.out.println("maindish offer has been successfully updated");
                     break;
                 default:
                     System.out.println("wrong entry ! try again");
                     continue;
             }
             break;
         }
   

            
    }

    @Override
    public void makeorder(Restaurant restaurant) {
          while(true)
    {
        System.out.println("wanted meal is:"+this.getName()+" ,"+ "its price:"+this.getPrice());
              
                Scanner in=new Scanner(System.in);
               System.out.println("Enter the quantity of that meal :");
              int wanted_quantity=in.nextInt();               
             double totalprice=wanted_quantity *(this.getPrice()-(this.getPrice()*((Double.parseDouble(this.getOffer().substring(0,this.getOffer().length() - 1)))/100)));
             System.out.println("total price :"+totalprice);
             System.out.println("want to write notes?");
            String choose=in.next();
            String notes="no notes added";
                if(choose.equalsIgnoreCase("yes"))
                {
                  notes=in.next();

                }
                   else
                {
                    System.out.println("no notes added !");
                }

             Orders customer_order=new Orders(this.getName(),wanted_quantity,notes);
             restaurant.getOrder().add(customer_order);
             break;
            }
        
        
    }
 
}
