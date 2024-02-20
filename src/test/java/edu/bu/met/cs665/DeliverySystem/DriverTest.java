package edu.bu.met.cs665.DeliverySystem;

import junit.framework.TestCase;

public class DriverTest extends TestCase {
    private Driver driver;
    private Shop shop = new Shop();
    public void setUp(){
        driver = new Driver("DriverTest", shop);
    }

    public void testDriverDetails(){
        assertEquals("DriverTest", new Driver("DriverTest", shop).getName());
    }

    public void testReceiveDeliveryRequest(){
        DeliveryRequest deliveryRequest = new DeliveryRequest("This is a dummy delivery request for testing purposes");
        driver.receiveDeliveryRequest(deliveryRequest);
        assertTrue(driver.wasDriverNotified());
    }

    public void testPreviousNotificationDetails(){
        DeliveryRequest deliveryRequest = new DeliveryRequest("This is a dummy delivery request for testing purposes");
        driver.receiveDeliveryRequest(deliveryRequest);
        assertEquals("This is a dummy delivery request for testing purposes", driver.getPreviousNotificationDetails());
    }

    public void testResetNotification(){
        DeliveryRequest deliveryRequest = new DeliveryRequest("This is a dummy delivery request for testing purposes");
        driver.receiveDeliveryRequest(deliveryRequest);
        driver.resetDriverNotification();
        assertFalse(driver.wasDriverNotified());
    }
}