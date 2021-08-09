package org.javaexercises.roboticRover;

import java.lang.IllegalArgumentException;

public class Direction {
    private final int directionInNumber;

    Direction(String directionString) {
        this.directionInNumber = directionStringToInt(directionString);
    }

    public int directionStringToInt(String directionString) throws IllegalArgumentException {
        return switch (directionString) {
            case "N" -> 0;
            case "E" -> 1;
            case "S" -> 2;
            case "W" -> 3;
            default -> throw new IllegalArgumentException();
        };
    }

    public String directionIntToString(int directionInNumber) throws IllegalArgumentException {
        return switch (directionInNumber) {
            case 0 -> "N";
            case 1 -> "E";
            case 2 -> "S";
            case 3 -> "W";
            default -> throw new IllegalArgumentException();
        };
    }

    public boolean checkForHorizontal() {
        return directionInNumber == 1 || directionInNumber == 3;
    }

    public boolean checkForVertical() {
        return directionInNumber == 0 || directionInNumber == 2;
    }

    public boolean isWest() {
        return this.directionInNumber == 3;
    }

    public boolean isEast() {
        return this.directionInNumber == 1;
    }

    public boolean isNorth() {
        return this.directionInNumber == 0;
    }

    public boolean isSouth() {
        return this.directionInNumber == 2;
    }

    public Direction rotateLeft() {
        int newDirectionInNumber = ((this.directionInNumber - 1) + 4) % 4;
        return new Direction(this.directionIntToString(newDirectionInNumber));
    }

    public Direction rotateRight() {
        int newDirectionInNumber = (this.directionInNumber + 1) % 4;
        return new Direction(this.directionIntToString(newDirectionInNumber));
    }

    @Override
    public String toString() {
        return directionIntToString(this.directionInNumber);
    }
}
