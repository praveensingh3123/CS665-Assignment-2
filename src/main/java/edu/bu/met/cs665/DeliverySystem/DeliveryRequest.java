package edu.bu.met.cs665.DeliverySystem;

/**
 * Name: Praveen Singh
 * Course: CS-665 Software Designs & Patterns
 * Date: 02/16/2024
 * File Name: DeliveryRequest.java
 * Description: This is the constructor for initializing the delivery message which will be sent to the observers.
 */

public class DeliveryRequest {
    private final String deliveryRequestMessage;

    /**
     * This method initializes the constructor for delivery message.
     */
    public DeliveryRequest(String deliveryRequestMessage) {
        this.deliveryRequestMessage = deliveryRequestMessage;
    }

    /**
     * This method retrieve the delivery message.
     */
    public String getDeliveryRequest() {
        return deliveryRequestMessage;
    }

}
