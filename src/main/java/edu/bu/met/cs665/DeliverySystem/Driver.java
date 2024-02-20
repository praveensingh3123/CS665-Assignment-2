package edu.bu.met.cs665.DeliverySystem;

public class Driver implements Observer{
    private String name;
    private boolean notified = false;
    private Shop shop;
    private String previousNotificationDetails = null;
    public Driver(String name, Shop shop) {
        this.name = name;
        this.shop = shop;
        this.shop.addDriver(this);
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    //This method enables the subscribers/drivers to receive notifications about the delivery request.
    @Override
    public void receiveDeliveryRequest(DeliveryRequest request) {
        System.out.println(name + ", this is to notify that: " + request.getDeliveryRequest());
        notified = true;
        previousNotificationDetails = request.getDeliveryRequest();
    }

    public boolean wasDriverNotified(){ return notified;}

    //This method retrieves the last notification that was sent to the driver
    public String getPreviousNotificationDetails(){
        return previousNotificationDetails;
    }

    //This method resets the notification status and details sent to the driver.
    @Override
    public void resetDriverNotification(){
        notified = false;
        previousNotificationDetails = null;
    }
}
