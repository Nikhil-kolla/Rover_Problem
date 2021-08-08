package org.javaexercises.roboticRover;

import java.lang.IllegalArgumentException;

public class Direction {
    private final int directionInNumber;

    Direction(String directionString)  {
        this.directionInNumber = directionStringToInt(directionString);
    }

    public int directionStringToInt(String directionString)throws IllegalArgumentException{
        switch (directionString) {
            case "N":
                return 0;
            case "E":
                return 1;
            case "S":
                return 2;
            case "W":
                return 3;
            default:
                throw new IllegalArgumentException();
        }
    }

    public String directionIntToString(int directionInNumber)throws IllegalArgumentException{
        switch (directionInNumber) {
            case 0:
                return "N";
            case 1:
                return "E";
            case 2:
                return "S";
            case 3:
                return "W";
            default:
                throw new IllegalArgumentException();
        }
    }

    public boolean checkForHorizontal() {
        if (directionInNumber == 1 || directionInNumber == 3)
            return true;
        return false;
    }

    public boolean checkForVertical() {
        if (directionInNumber == 0 || directionInNumber == 2)
            return true;
        return false;
    }

    public boolean isWest()
    {
        return this.directionInNumber==3;
    }

    public boolean isEast()
    {
        return this.directionInNumber==1;
    }

    public boolean isNorth()
    {
        return this.directionInNumber==0;
    }

    public boolean isSouth()
    {
        return this.directionInNumber==2;
    }

    public Direction rotateLeft(){
        //System.out.println("hello"+this.directionInNumber);
        int newDirectionInNumber = ((this.directionInNumber-1)+4)%4;
        //
        // System.out.println("hai"+newDirectionInNumber);
        return new Direction(this.directionIntToString(newDirectionInNumber));
    }

    public Direction rotateRight(){
        //System.out.println(this.directionInNumber);
        int newDirectionInNumber = (this.directionInNumber+1)%4;
        //System.out.println(newDirectionInNumber);
        return new Direction(this.directionIntToString(newDirectionInNumber));
    }

    @Override
    public String toString() {
        return directionIntToString(this.directionInNumber);
    }
}
