/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app;

import java.util.Random;

/**
 *
 * @author ale
 */
public class Functionality {
    
    public static void main(String args[]) throws InterruptedException{
        
        //create the list of products
        Product product1 = new Product(1,23,5,"butter");
        Product product2 = new Product(2,33,5,"cheese");
        Product product3 = new Product(3,53,5,"milk");
        Product product4 = new Product(4,73,5,"catfish");
        Product product5 = new Product(5,43,5,"ham");
        
        
        Shop shop1 = new Shop();
        shop1.productsList.add(product1);
        shop1.productsList.add(product2);
        shop1.productsList.add(product3);
        shop1.productsList.add(product4);
        shop1.productsList.add(product5);
        
        
        //inventory at the start of the day
        int total = 0;
        for (Product prod : shop1.productsList) {
            total +=  prod.price * prod.number;
         }
        
        System.out.println("Inventory at the start of day: " + total + "\n");
        
        //create list of customers
        Customer cust1 = new Customer(1,200);
        Customer cust2 = new Customer(2,400);
        Customer cust3 = new Customer(3,500);
        Customer cust4 = new Customer(4,300);
        
        shop1.customersList.add(cust1);
        shop1.customersList.add(cust2);
        shop1.customersList.add(cust3);
        shop1.customersList.add(cust4);
        //System.out.println(shop1.customersList);
        
        //Functionality
        Random rand = new Random();
        int inventoryFin = 0;
        long x = System.currentTimeMillis();
        
        while(System.currentTimeMillis()-x<20000){
            //a customer who buys
            int customerNr = rand.nextInt(4) ;
            //the product that he wants to buy
            int prodNr = rand.nextInt(5);
            
            //verify if the transaction can be done
            Customer cust = shop1.customersList.get(customerNr);
            Product prod = shop1.productsList.get(prodNr);
            if(prod.number >=1 && cust.amount > prod.price){
                prod.number -= 1;
                cust.amount -= prod.price;
                inventoryFin += prod.price;
                cust.bag.add(prod);
            }
            Thread.sleep(3000);
        }
        
        
     
        //list what evry customer bought
        for(int i = 0; i < 4; i++){
            System.out.println("\n Customer " + shop1.customersList.get(i).id + " bought:");//  + shop1.customersList.get(i).bag);
            for(Product prod : shop1.customersList.get(i).bag)
                System.out.println(prod.name);
        }
        
        System.out.println("\n Inventory at the end of day: " + inventoryFin);
        
        //about the customrs after they bought in the shop
        System.out.println("\n Information about customers after the shopping: \n" + shop1.customersList);
        
        //about the products at the end of the day
        System.out.println("\n Information about the products at the end of the day: \n" + shop1.productsList);
    }
}
