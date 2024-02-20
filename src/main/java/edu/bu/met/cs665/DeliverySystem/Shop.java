package edu.bu.met.cs665.DeliverySystem;

import java.util.ArrayList;
import java.util.List;

public class Shop implements Subject{

    List<Observer> driversList = new ArrayList<>();

    // This method registers new driver to the subscriber list.
    @Override
    public void addDriver(Observer driver) {
        driversList.add(driver);
    }

    //This method removes or deregister driver from the subscriber list
    @Override
    public void removeDriver(Observer driver) {
        driversList.remove(driver);
    }

    // This method notify the drivers about the delivery request
    @Override
    public void notifyDrivers(DeliveryRequest deliveryRequestMessage) {
        for(Observer drivers: driversList){
            drivers.receiveDeliveryRequest(deliveryRequestMessage);
        }
    }

    //This method is called to send a delivery request to the drivers. It internally calls the notifyDrivers method.
    @Override
    public void sendDeliveryRequest(String deliveryRequestMessage){
        DeliveryRequest deliveryRequest = new DeliveryRequest(deliveryRequestMessage);
        notifyDrivers(deliveryRequest);
    }
}
