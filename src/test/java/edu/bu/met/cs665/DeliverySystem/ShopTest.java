package edu.bu.met.cs665.DeliverySystem;

import junit.framework.TestCase;

public class ShopTest extends TestCase {
    Shop shop = new Shop();
    Driver driver = new Driver("DriverTest", shop);
    String deliveryRequestMessage = "This is a dummy request for testing";

    public void testSendDeliveryRequest(){
        shop.addDriver(driver);
        shop.sendDeliveryRequest(deliveryRequestMessage);
        assertTrue(driver.wasDriverNotified());
    }

    public void testRemoveDriver(){
        shop.addDriver(driver);
        shop.removeDriver(driver);
        shop.sendDeliveryRequest(deliveryRequestMessage);
        assertTrue(driver.wasDriverNotified());
    }

}