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
public class Orders {


    private String mealname;
   private int quantity;
   private String additionalnotes;
    


    public Orders(String mealname, int quantity, String additionalnotes) {
        this.mealname = mealname;
        this.quantity = quantity;
        this.additionalnotes = additionalnotes;
    }

    public String getMealname() {
        return mealname;
    }

    public int getQuantity() {
        return quantity;
    }

    public String getAdditionalnotes() {
        return additionalnotes;
    }



    public void setMealname(String mealname) {
        this.mealname = mealname;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public void setAdditionalnotes(String additionalnotes) {
        this.additionalnotes = additionalnotes;
    }

   
   
   
    
   
   
}
