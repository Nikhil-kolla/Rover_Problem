package org.javaexercises.cabby;

public class CabRide {
    private static final int FARE_PER_KM = 10;
    private static final int FARE_PER_WAIT_MIN = 2;

    private final int distanceTravelled;
    private final int waitMinute;

    public CabRide(int distanceTravelledInKm, int waitMinute) {
        this.waitMinute = waitMinute;
        this.distanceTravelled = distanceTravelledInKm;
    }

    public int fare() {
        return ((distanceTravelled * FARE_PER_KM) + (waitMinute * FARE_PER_WAIT_MIN));
    }
}
