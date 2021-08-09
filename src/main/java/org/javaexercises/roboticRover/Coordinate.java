package org.javaexercises.roboticRover;

public class Coordinate {

    private final int x, y;

    Coordinate(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public boolean isCurrentPointGreaterThanBottomLeft(Coordinate currentPoint) {
        return currentPoint.x >= this.x && currentPoint.y >= this.y;
    }

    public boolean isCurrentPointLessThanTopRight(Coordinate currentPoint) {
        return currentPoint.x <= this.x && currentPoint.y <= this.y;
    }

    public boolean canXMoveTowardsEast(Coordinate currentPoint) {
        return currentPoint.x < this.x;
    }

    public boolean canXMoveTowardsWest(Coordinate currentPoint) {
        return currentPoint.x > this.x;
    }

    public boolean canYMoveTowardsNorth(Coordinate currentPoint) {
        return currentPoint.y < this.y;
    }

    public boolean canYMoveTowardsSouth(Coordinate currentPoint) {
        return currentPoint.y > this.y;
    }

    public Coordinate moveXTowardsWest() {
        return new Coordinate(this.x - 1, this.y);
    }

    public Coordinate moveXTowardsEast() {
        return new Coordinate(this.x + 1, this.y);
    }

    public Coordinate moveYTowardsNorth() {
        return new Coordinate(this.x, this.y + 1);
    }

    public Coordinate moveYTowardsSouth() {
        return new Coordinate(this.x, this.y - 1);
    }

    @Override
    public String toString() {
        return "" + this.x + " " + this.y + " ";
    }
}
