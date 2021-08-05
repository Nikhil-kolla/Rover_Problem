package org.javaexercises.cabby;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CabRideTest {
    @Test
    public void cabFareShouldBe_34_For_3_KmTravelled() {
        CabRide cabRide = new CabRide(3,2);
        assertEquals(34, cabRide.fare());
    }

    @Test
    public void cabFareShouldBe_26_For_2_KmTravelled() {
        CabRide cabRide = new CabRide(2,3);
        assertEquals(26, cabRide.fare());
    }

    @Test
    public void cabFareShouldBe_24_For_2_Minutes_Wait_Period() {
        CabRide cabRide = new CabRide(2, 2);
        assertEquals(24, cabRide.fare());
    }
}
