package edu.bu.met.cs665.DeliverySystem;

/**
 * Name: Praveen Singh
 * Course: CS-665 Software Designs & Patterns
 * Date: 02/16/2024
 * File Name: Driver.java
 * Description: This class implements the Observer interface. This class represents a driver who can receive delivery
 * requests from a Shop object.
 */

public class Driver implements Observer {
    private String name;
    private boolean notified = false;
    private Shop shop;
    private String previousNotificationDetails = null;

    /**
     * Constructor to initialize the Driver object.
     *
     * @param name The name of the driver.
     * @param shop The Shop object associated with the driver.
     */
    public Driver(String name, Shop shop) {
        this.name = name;
        this.shop = shop;
        this.shop.addDriver(this);
    }

    /**
     * Get the name of the driver
     */
    public String getName() {
        return name;
    }

    /**
     * Set the name of the driver
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * This method enables the subscribers/drivers to receive notifications about the delivery request.
     */
    @Override
    public void receiveDeliveryRequest(DeliveryRequest request) {
        System.out.println(name + ", this is to notify that: " + request.getDeliveryRequest());
        notified = true;
        previousNotificationDetails = request.getDeliveryRequest();
    }

    public boolean wasDriverNotified() {
        return notified;
    }

    /**
     * This method retrieves the last notification that was sent to the driver.
     */
    public String getPreviousNotificationDetails() {
        return previousNotificationDetails;
    }

    /**
     * This method resets the notification status and details sent to the driver.
     */
    @Override
    public void resetDriverNotification() {
        notified = false;
        previousNotificationDetails = null;
    }
}
