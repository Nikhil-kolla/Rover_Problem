package org.javaexercises.cabby;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CabRideTest {
    @Test
    public void cabFareShouldBe_MinimumFare_For_3_KmTravelled_2_Mins_Wait_Period() {
        CabRide cabRide = new CabRide(3,2);
        assertEquals(40, cabRide.fare());
    }

    @Test
    public void cabFareShouldBe_54_For_2_Minutes_Wait_Period_And_5_KmTravelled() {
        CabRide cabRide = new CabRide(5, 2);
        assertEquals(54, cabRide.fare());
    }

    @Test
    public void cabFareShouldBe_60_For_30_Minutes_Wait_Period_And_0_KmTravelled() {
        CabRide cabRide = new CabRide(0, 30);
        assertEquals(60, cabRide.fare());
    }
}
