package edu.bu.met.cs665.DeliverySystem;

import junit.framework.TestCase;
import org.junit.Test;

public class DeliveryRequestTest extends TestCase {

    public void testGetDeliveryRequest(){
        DeliveryRequest deliveryRequest = new DeliveryRequest("Please deliver the package to 123 St. Louis St");

        assertEquals("Please deliver the package to 123 St. Louis St", deliveryRequest.getDeliveryRequest());
    }

    public void testSetDeliveryRequest() {
        String details = "Deliver the package at 123 Comm ave";
        DeliveryRequest request = new DeliveryRequest(details);

        assertEquals(details, request.getDeliveryRequest(), "Deliver the package at 123 Comm ave");
    }
}