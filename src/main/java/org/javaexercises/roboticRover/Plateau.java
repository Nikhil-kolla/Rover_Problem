package org.javaexercises.roboticRover;

public class Plateau {

    private final Coordinate bottomLeftPoint = new Coordinate(0, 0);
    private final Coordinate topRightPoint;

    Plateau(int xHighest, int yHighest) {
        topRightPoint = new Coordinate(xHighest, yHighest);
    }

    public boolean isCurrentPointValid(Coordinate currentPoint) {
        return this.bottomLeftPoint.isCurrentPointGreaterThanBottomLeft(currentPoint) &&
                this.topRightPoint.isCurrentPointLessThanTopRight(currentPoint);
    }


    public boolean canXMoveTowardsEast(Coordinate currentPoint) {
        return this.topRightPoint.canXMoveTowardsEast(currentPoint);
    }

    public boolean canXMoveTowardsWest(Coordinate currentPoint) {
        return this.bottomLeftPoint.canXMoveTowardsWest(currentPoint);
    }

    public boolean canYMoveTowardsNorth(Coordinate currentPoint) {
        return this.topRightPoint.canYMoveTowardsNorth(currentPoint);
    }

    public boolean canYMoveTowardsSouth(Coordinate currentPoint) {
        return this.bottomLeftPoint.canYMoveTowardsSouth(currentPoint);
    }
}
