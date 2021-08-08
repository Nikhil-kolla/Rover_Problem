package org.javaexercises.roboticRover;

public class Plateau {

    private CoordinatePoint bottomLeftPoint = new CoordinatePoint(0,0);
    private CoordinatePoint topRightPoint;

    Plateau(int xHighest, int yHighest){
        topRightPoint = new CoordinatePoint(xHighest,yHighest);
    }

    public boolean isCurrentPointValid(CoordinatePoint currentPoint){
        return this.bottomLeftPoint.isCurrentPointGreaterThanBottomLeft(currentPoint) &&
                this.topRightPoint.isCurrentPointLessThanTopRight(currentPoint);
    }

    public boolean canXMoveTowardsEast(CoordinatePoint currentPoint){
        return this.topRightPoint.canXMoveTowardsEast(currentPoint);
    }

    public boolean canXMoveTowardsWest(CoordinatePoint currentPoint){
        return this.bottomLeftPoint.canXMoveTowardsWest(currentPoint);
    }

    public boolean canYMoveTowardsNorth(CoordinatePoint currentPoint){
        return this.topRightPoint.canYMoveTowardsNorth(currentPoint);
    }

    public boolean canYMoveTowardsSouth(CoordinatePoint currentPoint){
        return this.bottomLeftPoint.canYMoveTowardsSouth(currentPoint);
    }
}
