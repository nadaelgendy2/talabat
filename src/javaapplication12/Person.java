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
public abstract class Person {
 
    private String Username;
    private String Password;

    public void setUsername(String Username) {
        this.Username = Username;
    }

    public void setPassword(String Password) {
        this.Password = Password;
    }

   
    public String getUsername() {
        return Username;
    }

    public String getPassword() {
        return Password;
    }
   
}
