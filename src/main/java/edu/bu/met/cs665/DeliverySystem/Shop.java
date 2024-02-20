package edu.bu.met.cs665.DeliverySystem;

import java.util.ArrayList;
import java.util.List;

/**
 * Name: Praveen Singh
 * Course: CS-665 Software Designs & Patterns
 * Date: 02/16/2024
 * File Name: Shop.java
 * Description: This class implements the Subject interface. This class represents a shop which can send delivery
 * request to multiple observers or drivers.
 */

public class Shop implements Subject {

    List<Observer> driversList = new ArrayList<>();

    /**
     * This method registers new driver to the subscriber list.
     */
    @Override
    public void addDriver(Observer driver) {
        driversList.add(driver);
    }

    /**
     * This method removes or deregister driver from the subscriber list.
     */
    @Override
    public void removeDriver(Observer driver) {
        driversList.remove(driver);
    }

    /**
     * This method notify the drivers about the delivery request
     */
    @Override
    public void notifyDrivers(DeliveryRequest deliveryRequestMessage) {
        for (Observer drivers : driversList) {
            drivers.receiveDeliveryRequest(deliveryRequestMessage);
        }
    }

    /**
     * This method is called to send a delivery request to the drivers. It internally calls the notifyDrivers method.
     */
    @Override
    public void sendDeliveryRequest(String deliveryRequestMessage) {
        DeliveryRequest deliveryRequest = new DeliveryRequest(deliveryRequestMessage);
        notifyDrivers(deliveryRequest);
    }
}
