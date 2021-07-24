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
public class Manager extends Person{
    private Restaurant myRestaurant;
    public Manager()
    {}   
    

    public void setMyRestaurant(Restaurant myRestaurant) {
        this.myRestaurant = myRestaurant;
    } 
    public Restaurant getMyRestaurant() {
        return myRestaurant;
    }

    
    
}
