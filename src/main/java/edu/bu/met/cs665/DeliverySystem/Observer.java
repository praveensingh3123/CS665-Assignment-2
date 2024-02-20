package edu.bu.met.cs665.DeliverySystem;

public interface Observer {

    //This method enables the subscribers/drivers to receive notifications about the delivery request.
    void receiveDeliveryRequest(DeliveryRequest request);

    //This method is used to remove any notification that was sent to the driver.
    void resetDriverNotification();

}
