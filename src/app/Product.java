/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app;

/**
 *
 * @author ale
 */
public class Product {
    int id;
    int price;
    int number;// how many in stock
    String name;
    
    Product(int id, int price, int number){
        this.id = id;
        this.price = price;
        this.number = number;
        
    }
    
    Product(int id, int price, int number, String name){
        this.id = id;
        this.price = price;
        this.number = number;
        this.name = name;  
    }

    @Override
    public String toString() {
        return "Product{" + "id=" + id + ", price=" + price + ", number=" + number + '}';
    }

    
    
}
