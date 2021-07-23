/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication12;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


/**
 *
 * @author LENOVO
 */
public class MainClass {
   
    public static boolean customer_order(String wanted_meal,meals meal , Restaurant restaurant){
        if(wanted_meal.toLowerCase().equals(meal.getName().toLowerCase()))
        {

            meal.makeorder(restaurant);
            Scanner input_info=new Scanner(System.in).useDelimiter("\n");   
            System.out.println("Enter your name:");
            String customer_name=input_info.next();
            System.out.println("Enter your address:");
            String customer_address=input_info.next();

            while(true)
      {
       System.out.println("Enter your phone number:");
       String customer_phone=input_info.next();
       if(customer_phone.length()==11)
       {
          System.out.println("Your order has been successfully completed");
         break;
       }

       else 
       {
            System.out.println("invalid phone number please try again");

       }
       }
            return true;
        }

    else
        return false;

    }
    
 public static void main(String[] args){
     
    Restaurant restaurant1=new Restaurant("Tikka","Zamalek");
    Restaurant restaurant2=new Restaurant("Macdonalds","Nasr city");
    Restaurant restaurant3=new Restaurant("Vikings","Heliopolis");
    Restaurant restaurant4=new Restaurant("Arabiata","Zamalek");
    List<Restaurant>restaurants=new ArrayList<>();
    restaurants.add(restaurant1);
    restaurants.add(restaurant2);
    restaurants.add(restaurant3);
    restaurants.add(restaurant4);
    meals meal1_restaurant1=new Maindish("Grilled Chicken Fillet Meal" , "3 grilled chicken fillet,sauteed vegetables, garlic dip, puri bread and your choice of rice or French fries",91.5 ,"5%");
    meals meal2_restaurant1=new Maindish("Quail Meal","2 pieces jumbo quail,sauteed vegetables, garlic dip ,salad, Arabian bread and your choice of rice or French fries",103,"10%");
    meals meal3_restaurant1=new Sandwich("Tawook","Chicken tawook, tomatoes,green pepper,pickled cucumber and garlic sauce",45);
    meals meal4_restaurant1=new Maindish("Meat Kofta Meal","4 kofta sticks,sauteed vegetables,garlic dip,puri bread and your choice of rice or French fries",85.5,"2%");
    meals meal5_restaurant1=new Maindish("Grilled Chicken","Grilled Chicken Breast ,tomatoes,green pepper,pickled cucumber and garlic sauce",45,"1.5%");
    meals meal6_restaurant1=new Dessert("Chocolate Cake","a cake flavored with melted chocolate, cocoa powder or both",35);
    meals meal7_restaurant1=new Dessert("Cream Caramel","a custard dessert with a layer of clear caramel sauce, contrasted with crème brûlée which is custard with a hard caramel layer on top",27);
    restaurant1.getMenu().add(meal1_restaurant1);
    restaurant1.getMenu().add(meal2_restaurant1);
    restaurant1.getMenu().add(meal3_restaurant1);
    restaurant1.getMenu().add(meal4_restaurant1);
    restaurant1.getMenu().add(meal5_restaurant1);
    restaurant1.getMenu().add(meal6_restaurant1);
    restaurant1.getMenu().add(meal7_restaurant1);
    meals meal1_restaurant2=new Sandwich("Grand Big Mac","Two grand beef patties that unbeatably tasty Big Mac sauce,melting signature cheese,crisp shredded lettuce, onions,pickles and a bun in the middle all between a toasted sesame seed bun" ,85.5 );
    meals meal2_restaurant2=new Sandwich("Grand Chicken Premier","A deliciously grand chicken patty topped with our special deluxe sauce, two fresh tomato slices,crispy lettuce,two slices of Emmental cheese and a piece of chicken", 67.5);
    meals meal3_restaurant2=new Sandwich("Fillet-O-Fish","Delicious breaded fish filet with tartar sauce and melty cheese served in a steamed bun", 34);
    meals meal4_restaurant2=new Sandwich("Share Box","Pick 2 sandwiches from Big Mac (beef/chicken)and McChicken ,2 sandwiches from Beefburger,cheeseburger and Chicken MacDo ,2 regular fries and 1.25 liter Coke", 123);
    meals meal5_restaurant2=new Dessert("Oreo McFlurry"," an popular combination of oreo pieces and vanilla soft serve",22.5);
    meals meal6_restaurant2=new Dessert("Apple Pie","a pie in which the principal filling ingredient is apple, it is often served with whipped cream, ice cream, or cheddar cheese",14);
    restaurant2.getMenu().add(meal1_restaurant2);
    restaurant2.getMenu().add(meal2_restaurant2);
    restaurant2.getMenu().add(meal3_restaurant2);
    restaurant2.getMenu().add(meal4_restaurant2);
    restaurant2.getMenu().add(meal5_restaurant2);
    restaurant2.getMenu().add(meal6_restaurant2);
    meals meal1_restaurant3=new Maindish("Chicken Scaloppini"," Breaded tender chicken bites in lemon creamy sauce,dill, smoked beef & mix pepper & beef bacon served with creamy fettuccine pasta.",120,"5%"); 
    meals meal2_restaurant3=new Maindish("Salmon Kabayaki"," Roasted Salmon fillet served with sticky rice and creamy coconut sauce",225,"10%"); 
    meals meal3_restaurant3=new Maindish("Raspberry Tenderloin"," Tenderloin fillet in a wild sensational raspberry sauce served with mashed potato and sauteed vegetables",180,"5%"); 
    meals meal4_restaurant3=new Sandwich("Garlic Spinach French Rolls"," French bread stuffed with mix cheese, spinach& garlic herbs served with roasted tomato",75); 
    meals meal5_restaurant3=new Sandwich("Butter Burned Beef Tartar"," Slice beef with butter on a bread loaf topped with parmesan cheese, roasted cherry tomato,balsamic cream & Truffle oil.",113); 
    meals meal6_restaurant3=new Dessert("Chocolate Roche","a chocolate and hazelnut",56); 
    meals meal7_restaurant3=new Dessert("Melted Banana and Chocolate Crepe ","crepes drizzle with melted chocolate and top with banana slices.",56); 
    restaurant3.getMenu().add(meal1_restaurant3);
    restaurant3.getMenu().add(meal2_restaurant3);
    restaurant3.getMenu().add(meal3_restaurant3);
    restaurant3.getMenu().add(meal4_restaurant3);
    restaurant3.getMenu().add(meal5_restaurant3);
    restaurant3.getMenu().add(meal6_restaurant3);
    restaurant3.getMenu().add(meal7_restaurant3);
    meals meal1_restaurant4=new Maindish("Mix Grill"," Quarter Grilled chicken and Kabab and Kofta with side rice and vegetables",120,"15%"); 
    meals meal2_restaurant4=new Maindish("Grilled Chiken"," one kilo of chicken grilled on charcoal with basmaty rice",90,"12%"); 
    meals meal3_restaurant4=new Sandwich("Chiken Crispy"," Chicken strips with salad and ketchub and musturd",25); 
    meals meal4_restaurant4=new Sandwich("Fol sandwitch"," fol sandwitch with salad and taheena",5);
    meals meal5_restaurant4=new Dessert("roz belaban","rice with milk and nuts",10);
    meals meal6_restaurant4=new Dessert("om ali","dessert of soaked bread, milk and loads of nuts.",15);
    restaurant4.getMenu().add(meal1_restaurant4);
    restaurant4.getMenu().add(meal2_restaurant4);
    restaurant4.getMenu().add(meal3_restaurant4);
    restaurant4.getMenu().add(meal4_restaurant4);
    restaurant4.getMenu().add(meal5_restaurant4);
    restaurant4.getMenu().add(meal6_restaurant4);
             
     Customer c=new Customer();
     Manager m = new Manager();
     userActions ua=new userActions();
     boolean close_system=false;
     boolean check=false;
   
 while(true){

  
    if (close_system==true)
    {
    break;
    }
    else{
        System.out.println("            talabat clone              ");
        
        Scanner in= new Scanner(System.in);
        System.out.println("Login");
        System.out.println("Register");
        String first_choice=in.next();
        switch (first_choice.toLowerCase()) {
            case "login":
                {
                    check=true;
                    Scanner input= new Scanner(System.in);
                 while(true){
                    System.out.println("1- As manager ");
                    System.out.println("2- As customer ");
                    System.out.println("choose a number : ");
                    String second_choice=input.next();
                    switch (second_choice) {
                        case "1":
                        {
                            
                            String restaurant_names=ua.CheckLogin(m);
                            for (int restaurant_index=0; restaurant_index<restaurants.size();restaurant_index++){
                                if (restaurant_names.toLowerCase().equals(restaurants.get(restaurant_index).getName().toLowerCase())){
                                    System.out.println("You have signed in successfully");
                                     for (int menu_index=0 ; menu_index < restaurants.get(restaurant_index).getMenu().size(); menu_index++){
                                    System.out.println(restaurants.get(restaurant_index).getMenu().get(menu_index).toString());
                                    }
                                    
                                    Scanner input_option = new Scanner(System.in).useDelimiter("\n");
                                while(true)
                                {
                                    System.out.println("DO you want to add, update, delete or show order?");
                                    String manager_action=input_option.next();
                                    switch (manager_action.toLowerCase()) {
                                        case "update":
                                        {
                                            while(true){
                                                boolean name_exist=false;
                                              
                                                Scanner input_meal = new Scanner(System.in).useDelimiter("\n");
                                                
                                                System.out.println("Enter the meal name :");
                                                String meal_name=input_meal.next();
                               
                                                for (int menu_index=0 ; menu_index<restaurants.get(restaurant_index).getMenu().size();menu_index++)
                                                {
                                                    if (meal_name.toLowerCase().equals(restaurants.get(restaurant_index).getMenu().get(menu_index).getName().toLowerCase())){
                                                        name_exist=true;
                                                       
                                                        restaurants.get(restaurant_index).getMenu().get(menu_index).update();
                                                        
                                                    }
                                                   
                                                  
                                                    
                                                }
                                                if(name_exist==true)
                                                {
                                                    break;
                                                }
                                                else
                                                {
                                                    System.out.println("wrong name ! try again");
                                                }
                                                
                                            }
                                            break;
                                        }
                                        
                                        case "add":
                                        {
                                            while(true)
                                            {
                                                Scanner input_new_meal = new Scanner(System.in).useDelimiter("\n");
                                                System.out.print("Enter the meal name : ");
                                                String meal_name=input_new_meal.next();
                                                System.out.print("Enter the meal description : ");
                                                String meal_description=input_new_meal.next();
                                                System.out.print("Enter the meal price : ");
                                                double meal_price=input_new_meal.nextDouble();
                                                System.out.print("Enter the type of meal (sandwich, maindish, or dessert) : ");
                                                String meal_type=input_new_meal.next();
                                                switch (meal_type) {
                                                    case "sandwich":
                                                    {
                                                        meals newmeal=new Sandwich(meal_name,meal_description,meal_price);
                                                        newmeal.Add(restaurants.get(restaurant_index));
                                                        break;
                                                    }
                                                    case "maindish":
                                                    { 
                                                        
                                                        System.out.print("Enter the meal offer : ");
                                                        String meal_offer=input_new_meal.next();
                                                        meals newmeal=new Maindish(meal_name,meal_description,meal_price,meal_offer);
                                                        
                                                        newmeal.Add(restaurants.get(restaurant_index));
                                                        break;
                                                    }
                                                    case "dessert":
                                                    {
                                                        meals newmeal=new Dessert(meal_name,meal_description,meal_price);
                                                       
                                                        newmeal.Add(restaurants.get(restaurant_index));
                                                        break;
                                                    }
                                                    default:
                                                        System.out.println("wrong meal type ! try again");
                                                        continue;
                                                }
                                                break;
                                            }
                                            break;                                            
                                        }
                                        case "delete":
                                        {
                                              while(true){
                                                boolean name_exist=false;
                                                
                                                Scanner input_remove_meal = new Scanner(System.in).useDelimiter("\n");
                                                System.out.print("Enter the meal name : ");
                                                String meal_name=input_remove_meal.next();
                                                for (int menu_index=0;menu_index<restaurants.get(restaurant_index).getMenu().size();menu_index++) {
                                                     if (meal_name.toLowerCase().equals(restaurants.get(restaurant_index).getMenu().get(menu_index).getName().toLowerCase())){

                                                                restaurants.get(restaurant_index).getMenu().get(menu_index).Delete(restaurants.get(restaurant_index));
                                                                name_exist=true;
                                                        }

                                                     } 
                                                if(name_exist==true)
                                                    {
                                                        break;
                                                    }
                                                    else
                                                    {
                                                        System.out.println("wrong name ! try again");
                                                    }
                                                }
                                            break;
                                        }
                                        case "show order" :
                                        {
                           
                                           restaurants.get(restaurant_index).showOrder();
                                          
                                           break;
                                        }
                                        default:                                        
                                            System.out.println("we do not have such a functionality ! try again");
                                           continue;
                                            
                                    }
                                      break;
                                }
                                break;
                            }

                        }
                            break;
                        }
                        case "2":
                        {
                             
                            ua.CheckLogin(c);
                            for(int restaurant_index=0;restaurant_index<restaurants.size();restaurant_index++){
                                System.out.println(restaurants.get(restaurant_index).getName());
                            }   Scanner input_restaurant_name=new Scanner(System.in).useDelimiter("\n");
                       while(true)
                       {
                             boolean restaurant_exist=false;
                            System.out.print("Enter the restaurant name : ");
                            String restaurant_name=input_restaurant_name.next();
                            for (int restaurant_index=0; restaurant_index<restaurants.size();restaurant_index++){
                                if (restaurant_name.toLowerCase().equals(restaurants.get(restaurant_index).getName().toLowerCase()))
                                {
                                    restaurant_exist=true;
                                    for (int menu_index=0 ; menu_index < restaurants.get(restaurant_index).getMenu().size(); menu_index++){
                                    System.out.println(restaurants.get(restaurant_index).getMenu().get(menu_index).toString());
                                    }
                                    
                                    Scanner in_order=new Scanner(System.in);
                                    System.out.println("Make an order ?");
                                    String choice=in_order.next();
                                    if(choice.equalsIgnoreCase("yes")){
                                        
                                        while(true){
                                            boolean meal_exist=false;
                                            Scanner inputmeal=new Scanner(System.in).useDelimiter("\n");
                                            System.out.println("Enter the name of meal you want to order from our menu:");
                                              String wanted_meal=inputmeal.next();
                                         for(int menu_index=0;menu_index<restaurants.get(restaurant_index).getMenu().size();menu_index++)
                                            {
                                                if (customer_order(wanted_meal,restaurants.get(restaurant_index).getMenu().get(menu_index) ,restaurants.get(restaurant_index)) == true){
                                                 meal_exist=true;
                                                 break;
                                                }
                                            }
                                          if (meal_exist==true)
                                            {
                                            break;
                                            }else{
                                            System.out.println("we do not have such a meal! try again");

                                            }
                                        }
                                                }
                                    break;
                            }
                            
                             
                                }
                            if(restaurant_exist==true)
                            {
                                break;
                            }
                            else
                            {
                                System.out.println("wrong restaurant name ! try again");
                            }
                            
                       }
                         
                              break; 
                            }
                      
                        default:
                            System.out.println("wrong number ! try again");
                           continue;
                    }
                        break;
                        }
                 break;
                        
        }     
                
    
            case "register":
                {
                    check=true;
                    Scanner input= new Scanner(System.in);
                    while(true)
                 {
                    System.out.println("1- As manager ");
                    System.out.println("2- As customer ");
                    System.out.println("choose a number : ");
                 
                    String second_choice=input.next();
                    switch (second_choice) {
                        case "1":
                        {
                          
                            restaurants.add( ua.Register(m));
                            
                            break;
                        }
                        case "2":
                        {
                            ua.Register(c);
                            for(int restaurant_index=0;restaurant_index<restaurants.size();restaurant_index++){
                                System.out.println(restaurants.get(restaurant_index).getName());
                            }
                             while(true)
                       {
                             boolean restaurant_exist=false;
                            Scanner input_restaurant_name=new Scanner(System.in).useDelimiter("\n");
                            System.out.print("Enter the restaurant name : ");
                            String restaurant_name=input_restaurant_name.next();
                            for (int restaurant_index=0; restaurant_index<restaurants.size();restaurant_index++){
                                if (restaurant_name.toLowerCase().equals(restaurants.get(restaurant_index).getName().toLowerCase())){
                                    restaurant_exist=true;
                                    for (int menu_index=0 ; menu_index < restaurants.get(restaurant_index).getMenu().size(); menu_index++){
                                    System.out.println(restaurants.get(restaurant_index).getMenu().get(menu_index).toString());
                                    }
                                    Scanner in_order=new Scanner(System.in);
                                    System.out.println("Make an order ?");
                                    String choice=in_order.next();
                                    if(choice.equalsIgnoreCase("yes"))
                                    {
                                          while(true){
                                            boolean meal_exist=false;
                                            Scanner inputmeal=new Scanner(System.in).useDelimiter("\n");
                                            System.out.println("Enter the name of meal you want to order from our menu:");
                                              String wanted_meal=inputmeal.next();
                                         
                                         for(int menu_index=0;menu_index<restaurants.get(restaurant_index).getMenu().size();menu_index++)
                                            {
                                                if (customer_order(wanted_meal,restaurants.get(restaurant_index).getMenu().get(menu_index) ,restaurants.get(restaurant_index)) == true){
                                                 meal_exist=true;
                                                 break;
                                                }
                                            }
                                          if (meal_exist==true)
                                            {
                                            break;
                                            }else{
                                            System.out.println("we do not have such a meal! try again");

                                            }
                                        }
                                    }
                                    break;
                                }
                                
                            }
                            if(restaurant_exist==true)
                            {
                                break;
                            }
                            else
                            {
                                System.out.println("wrong restaurant name ! try again");
                            }
                          
                       }
                             break;
                        }
                             
                        default:
                            System.out.println("wrong number ! try again");
                           continue;
                    }
                 
                    break;
                }
                    break;
                }
            default:
                 if(check==true)
        {
            break;
        }
                 else{
                System.out.println(" something went wrong ! try again");
               continue;
                 }
              
        }
       boolean input=false;
    while(true){
         
       Scanner close =new Scanner(System.in);
       System.out.println("Do you want to close the system?");
       String close_input=close.next();
       if (close_input.toLowerCase().equals("yes")){
           close_system=true;
           input=true;
       }
       else if (close_input.toLowerCase().equals("no")){
       close_system=false;
       input=true;
       }
       
       else{
       System.out.println("Wrong input! try again");
       }
         if (input==true){
       break;
       }
         
    
    }
    
    }
    
 }
 }
 
 }

