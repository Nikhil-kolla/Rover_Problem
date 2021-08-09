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

    public boolean canRoverMoveTowardsEast(Coordinate currentPoint) {
        return this.topRightPoint.canXMoveTowardsEast(currentPoint) && this.isCurrentPointValid(currentPoint);
    }

    public boolean canRoverMoveTowardsWest(Coordinate currentPoint) {
        return this.bottomLeftPoint.canXMoveTowardsWest(currentPoint) && this.isCurrentPointValid(currentPoint);
    }

    public boolean canRoverMoveTowardsNorth(Coordinate currentPoint) {
        return this.topRightPoint.canYMoveTowardsNorth(currentPoint) && this.isCurrentPointValid(currentPoint);
    }

    public boolean canRoverMoveTowardsSouth(Coordinate currentPoint) {
        return this.bottomLeftPoint.canYMoveTowardsSouth(currentPoint) && this.isCurrentPointValid(currentPoint);
    }


}
