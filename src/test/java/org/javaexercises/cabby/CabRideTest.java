package org.javaexercises.cabby;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CabRideTest {
    @Test
    public void cabFareShouldBe_40_For_3_KmTravelled() {
        CabRide cabRide = new CabRide(3,2);
        assertEquals(40, cabRide.fare());
    }

    @Test
    public void cabFareShouldBe_40_For_2_KmTravelled() {
        CabRide cabRide = new CabRide(2,3);
        assertEquals(40, cabRide.fare());
    }

    @Test
    public void cabFareShouldBe_40_For_2_Minutes_Wait_Period() {
        CabRide cabRide = new CabRide(2, 2);
        assertEquals(40, cabRide.fare());
    }

    @Test
    public void cabFareShouldBe_40_For_0_Minutes_Wait_Period_And_0_KmTravelled() {
        CabRide cabRide = new CabRide(0, 0);
        assertEquals(40, cabRide.fare());
    }

    @Test
    public void cabFareShouldBe_54_For_0_Minutes_Wait_Period_And_0_KmTravelled() {
        CabRide cabRide = new CabRide(5, 2);
        assertEquals(54, cabRide.fare());
    }
}
