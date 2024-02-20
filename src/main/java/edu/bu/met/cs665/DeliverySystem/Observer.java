package edu.bu.met.cs665.DeliverySystem;

/**
 * Name: Praveen Singh
 * Course: CS-665 Software Designs & Patterns
 * Date: 02/16/2024
 * File Name: Observer.java
 * Description: This interface serves as a contract for classes that act as observers in an observer
 * pattern implementation.
 */
public interface Observer {

    /**
     * This method enables the subscribers/drivers to receive notifications about the delivery request.
     */
    void receiveDeliveryRequest(DeliveryRequest request);

    /**
     * This method is used to remove any notification that was sent to the driver.
     */
    void resetDriverNotification();

}
