package edu.bu.met.cs665.DeliverySystem;

public class DeliveryRequest {
    private String deliveryRequestMessage;

    //This method initializes the constructor for delivery message.
    public DeliveryRequest(String deliveryRequestMessage){
        this.deliveryRequestMessage = deliveryRequestMessage;
    }

    //This method retrieve the delivery message.
    public String getDeliveryRequest() {
        return deliveryRequestMessage;
    }

}
