/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app;

import java.util.ArrayList;

/**
 *
 * @author ale
 */
public class Customer {
    int id;
    int amount;
    
    Customer(int id, int amount){
        this.id = id;
        this.amount = amount;
    }

    //create the Array of Products for a Customer
    ArrayList<Product> bag = new ArrayList<Product>();
    
    
    @Override
    public String toString() {
        return "Customer{" + "id=" + id + ", amount=" + amount + '}';
    }
    
    
}
