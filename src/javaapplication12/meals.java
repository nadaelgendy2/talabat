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
public abstract class meals implements meal_actions {
    private String name;
    private double Price;   
    private String Description;
   
   
    
     public meals(String Name, String Description,  double Price) {
        this.name = Name;
        this.Price = Price;
        this.Description = Description;
        
   }
   
     public void setName(String Name) {
        this.name=Name;
        
    } 
  public void setPrice(double Price) {
        this.Price = Price;
    }

    public void setDescription(String Description) {
        this.Description = Description;
    }

    public String getName() {
        return name;
    }    
       
    public double getPrice() {
        return Price;
    }

    public String getDescription() {
        return Description;
    }

 
    public void makeorder(Restaurant restaurant)
    {
    while(true)
    {
       
        System.out.println("wanted meal is:"+this.getName()+" ,"+ "its price:"+this.getPrice());
              
                Scanner in=new Scanner(System.in);
               System.out.println("Enter the quantity of that meal :");
              int wanted_quantity=in.nextInt();
               
             double totalprice=wanted_quantity *(this.getPrice());
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
     @Override
    public void update() {
         
         while (true)
         {
            Scanner update_meal=new Scanner(System.in).useDelimiter("\n");
            System.out.println("Do you want to update the name, description, or price?");
            String new_update=update_meal.next();
             switch (new_update.toLowerCase()) {
                 case "name":
                     System.out.print("Enter the new meal name : ");
                     String updated_meal_name=update_meal.next();
                     this.setName(updated_meal_name);
                     System.out.println(this);
                     System.out.println("meal name has been successfully updated");
                     break;
                 case "description":
                     System.out.print("Enter the new meal description : ");
                     String updated_meal_description=update_meal.next();
                    this.setDescription(updated_meal_description);
                     System.out.println(this);
                     System.out.println("meal description has been successfully updated");
                     break;
                 case "price":
                     System.out.print("Enter the new meal price : ");
                     double updated_meal_price=update_meal.nextDouble();
                     this.setPrice(updated_meal_price);
                     System.out.println(this);
                     System.out.println("meal price has been successfully updated");
                     break;
                 default:
                     System.out.println("wrong entry ! try again");
                     continue;
             }
             break;
         }
   
}


    @Override
    public void Delete(Restaurant restaurant) {
            restaurant.getMenu().remove(this);
        System.out.println(this.toString());
         System.out.println("the selected meal has been removed from your restaurant");
   
     }

    @Override
    public void Add(Restaurant restaurant) {
          restaurant.getMenu().add(this);
            System.out.println(this.toString());
            System.out.println("A new meal has been added to your restaurant");
    
    }
   
    
    
    
}
