package edu.bu.met.cs665.DeliverySystem;
/**
 * Name: Praveen Singh
 * Course: CS-665 Software Designs & Patterns
 * Date: 02/16/2024
 * File Name: Main.java
 * Description: This is the entry point of the Delivery Notification System. It presents a system to send
 * delivery notification from a shop to different drivers.
 */

public class Main {
    // Main method which is the starting point of execution. Here a shop's instance is created and multiple drivers
    // are instantiated, then we call the function to send delivery request to the drivers.
    public static void main(String[] args){
        Shop shop = new Shop();

        for (int i = 1; i <= 50; i++) {
            new Driver("Driver " + i, shop);
        }
        shop.sendDeliveryRequest("Packages are ready to be picked up.");
    }
}
