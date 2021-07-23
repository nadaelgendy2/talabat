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
public class userActions {
   
   public boolean CheckLogin(Customer C)
        {
            while(true){
            Scanner user_input=new Scanner(System.in).useDelimiter("\n");
            System.out.println("Enter username :");
            String customer_username=user_input.next();
            System.out.println("Enter password :");
            String password=user_input.next();
             connect connection=new connect();  
            
            if (connection.Customerlogin(customer_username, password))
            {                      
                System.out.println("You have signed in successfully ");
                return true; 
              
            }
            else{
               System.out.println("Invalid username or Password ");
            continue;
            }
           
            }
            
            }
          
        public String CheckLogin(Manager m)
        {
            while(true){
            Scanner manager_input=new Scanner(System.in).useDelimiter("\n");
            System.out.println("Enter username :");
            String manager_username=manager_input.next();
            System.out.println("Enter password :");
            String password=manager_input.next();
            System.out.println("Enter resturant name :");
            String restaurant_name=manager_input.next();
                 
            connect connection=new connect();  
                
        if (connection.RestaurantManagerlogin(manager_username, password, restaurant_name) )
         {    
             return restaurant_name;
            
         }      
            else{
            System.out.println("Invalid Username , Password or Restaurant Name ! ");   
            continue;
            }
          
            }
        } 
        
       public void Register(Customer c)
        {
            
            Scanner user_input=new Scanner(System.in).useDelimiter("\n");
            System.out.println("Enter username :");
            String customer_username=user_input.next();
            c.setUsername(customer_username);
            System.out.println("Enter password :");
            String password=user_input.next();
            c.setPassword(password);
            while(true){
            System.out.println("Enter confirm password :");
            String confirmpassword=user_input.next();
            if(!confirmpassword.equals(password))
            {
                System.out.println("password does not match confirm password ! try again");
                continue;
            }
            connect connection=new connect();  
            connection.insertcustomer(c.getUsername(), c.getPassword());
            System.out.println(" Account is successfully created");
           
            break;
            
            }  
            
        }
    
       public Restaurant Register(Manager m)
       {
            Scanner manager_input=new Scanner(System.in).useDelimiter("\n");
            System.out.println("Enter username :");
            String manager_username=manager_input.next();
            m.setUsername(manager_username);
            System.out.println("Enter password :");
            String password=manager_input.next();
            m.setPassword(password);
            
            while(true){
            System.out.println("Enter confirm password :");
            String confirmpassword=manager_input.next();
            if(!confirmpassword.equals(password))
            {
                System.out.println("password does not match confirm password !try again");
                continue;
            }
            
            else{
            System.out.println("Add your restaurant : ");
            Scanner new_restaurant=new Scanner(System.in).useDelimiter("\n");
            System.out.println("Enter the restaurant name :");
            String restaurant_name=new_restaurant.next();
            System.out.println("Enter resturant Address :");
            String restaurant_Address=new_restaurant.next();
            Restaurant myRestaurant = new Restaurant (restaurant_name, restaurant_Address);
            System.out.println("Add Restaurant menu :");
            System.out.println("How many meals would you like to add?");
            int meals_count=new_restaurant.nextInt();
            for (int i=0;i<meals_count ;i++)
            {
                    System.out.print("Enter the meal name : ");
                    String meal_name=new_restaurant.next();
                    System.out.print("Enter the meal description : ");
                    String meal_description=new_restaurant.next();
                    System.out.print("Enter the meal price : ");
                    double meal_price=new_restaurant.nextDouble();
                    System.out.print("Enter the type of meal (sandwich, maindish, or dessert) : ");
                    String meal_type=new_restaurant.next();
                    if (meal_type.equalsIgnoreCase("sandwich")){
                        meals newmeal=new Sandwich(meal_name,meal_description,meal_price);
                        newmeal.Add(myRestaurant);
                    }
                    else if(meal_type.equalsIgnoreCase("maindish"))
                    {
                       
                        System.out.print("Enter a meal offer : ");
                        String meal_offer=new_restaurant.next();
                        meals newmeal=new Maindish(meal_name,meal_description,meal_price,meal_offer);
                        newmeal.Add(myRestaurant);
                    }
                    else if(meal_type.equals("dessert"))
                    {
                        meals newmeal=new Dessert(meal_name,meal_description,meal_price);
                        newmeal.Add(myRestaurant);
                    }
             
            }
            
            m.setMyRestaurant(myRestaurant);
            
                connect connection=new connect();  
                connection.insertmanager(m.getUsername(), m.getPassword(),myRestaurant.getName());
                System.out.println(" The restaurant has been created successfully");
            break;
            }    
            }
            return m.getMyRestaurant();
       }
       
  
}
