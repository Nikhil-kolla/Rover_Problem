package org.javaexercises.cabby;

public class CabRide {
    private static final int FARE_PER_KM = 10;
    private static final int FARE_PER_WAIT_MIN = 2;
    private static final int Min_Fare = 40;
    private int actualFare;
    private final int distanceTravelled;
    private final int waitTimeInMinutes;

    public CabRide(int distanceTravelledInKm, int waitTimeInMinute) {
        this.waitTimeInMinutes = waitTimeInMinute;
        this.distanceTravelled = distanceTravelledInKm;
    }

    public int fare() {

        actualFare= calculateActualFare(distanceTravelled, waitTimeInMinutes);
        return ((actualFare < Min_Fare ? Min_Fare : actualFare));

    }

    private int calculateActualFare(int distanceTravelled, int waitTimeInMinutes){

        return ((distanceTravelled * FARE_PER_KM) + (waitTimeInMinutes * FARE_PER_WAIT_MIN));

    }
}

