package edu.bu.met.cs665.DeliverySystem;

/**
 * Name: Praveen Singh
 * Course: CS-665 Software Designs & Patterns
 * Date: 02/16/2024
 * File Name: Subject.java
 * Description: This interface serves as a contract for classes that act as subject in an observer
 * pattern implementation.
 */
public interface Subject {

    /**
     * This method registers new driver to the subscriber list.
     */
    void addDriver(Observer driver);

    /**
     * This method removes or deregister driver from the subscriber list.
     */
    void removeDriver(Observer driver);

    /**
     * This method notify the drivers about the delivery request.
     */
    void notifyDrivers(DeliveryRequest request);

    /**
     * This method is called to send a delivery request to the drivers. It internally calls the notifyDrivers method.
     */
    void sendDeliveryRequest(String deliveryRequestMessage);
}
