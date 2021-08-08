package org.javaexercises.roboticRover;

public class CoordinatePoint {

    private final int x,y;

    CoordinatePoint(int x, int y)
    {
        this.x = x;
        this.y = y;
    }

    public boolean isCurrentPointGreaterThanBottomLeft(CoordinatePoint currentPoint){
        return currentPoint.x >= this.x && currentPoint.y >= this.y;
    }

    public boolean isCurrentPointLessThanTopRight(CoordinatePoint currentPoint){
        return currentPoint.x <= this.x && currentPoint.y <= this.y;
    }

    public boolean canXMoveTowardsEast(CoordinatePoint currentPoint){
        return currentPoint.x < this.x;
    }

    public boolean canXMoveTowardsWest(CoordinatePoint currentPoint){
        return currentPoint.x > this.x;
    }

    public boolean canYMoveTowardsNorth(CoordinatePoint currentPoint){
        return currentPoint.y < this.y;
    }

    public boolean canYMoveTowardsSouth(CoordinatePoint currentPoint){
        return currentPoint.y > this.y;
    }

    public CoordinatePoint moveXTowardsWest(){
        return new CoordinatePoint(this.x-1,this.y);
    }

    public CoordinatePoint moveXTowardsEast(){
        return new CoordinatePoint(this.x+1,this.y);
    }

    public CoordinatePoint moveYTowardsNorth(){
        return new CoordinatePoint(this.x,this.y+1);
    }

    public CoordinatePoint moveYTowardsSouth(){
        return new CoordinatePoint(this.x,this.y-1);
    }

    @Override
    public String toString() {
        String pointInString = ""+this.x+" "+this.y+" ";
        return pointInString;
    }
}
