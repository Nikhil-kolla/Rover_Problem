package org.javaexercises.roboticRover;

public class Rover {

    private final Plateau plateau;
    private final Coordinate currentPosition;
    private final Direction currentDirection;

    Rover(Plateau plateau, Coordinate currentPosition, Direction direction) {
        this.plateau = plateau;
        this.currentPosition = currentPosition;
        this.currentDirection = direction;
    }



    public String move(String instructions) throws Exception {
        Coordinate dummyCurrentPosition = this.currentPosition;
        Direction dummyDirection = this.currentDirection;

        System.out.print("Rover starting at : ");
        System.out.println(dummyCurrentPosition.toString()+dummyDirection.toString());

        for (int i = 0; i < instructions.length(); i++) {

            char currentInstruction = instructions.charAt(i);

            switch (currentInstruction) {
                case 'M':
                    if (dummyDirection.checkForHorizontal()) {
                        if(dummyDirection.isWest()){
                            if(plateau.isCurrentPointValid(dummyCurrentPosition)){
                                if(plateau.canXMoveTowardsWest(dummyCurrentPosition)){
                                    dummyCurrentPosition = dummyCurrentPosition.moveXTowardsWest();
                                }
                                else{
                                    throw new Exception("Moving towards West is not possible.!");
                                }
                            }
                        }
                        else if(dummyDirection.isEast()){
                            if(plateau.isCurrentPointValid(dummyCurrentPosition)){
                                if(plateau.canXMoveTowardsEast(dummyCurrentPosition)) {
                                    dummyCurrentPosition = dummyCurrentPosition.moveXTowardsEast();
                                }
                                else{
                                    throw new Exception("Moving towards East is not possible.!");
                                }
                            }
                        }
                    } else if (dummyDirection.checkForVertical()) {
                        if(dummyDirection.isNorth()){
                            if(plateau.isCurrentPointValid(dummyCurrentPosition)){
                                if(plateau.canYMoveTowardsNorth(dummyCurrentPosition)){
                                    dummyCurrentPosition = dummyCurrentPosition.moveYTowardsNorth();
                                }
                                else{
                                    throw new Exception("Moving towards North is not possible.!");
                                }
                            }
                        }
                        else if(dummyDirection.isSouth()){
                            if(plateau.isCurrentPointValid(dummyCurrentPosition)){
                                if(plateau.canYMoveTowardsSouth(dummyCurrentPosition)){
                                    dummyCurrentPosition = dummyCurrentPosition.moveYTowardsSouth();
                                }
                                else{
                                    throw new Exception("Moving towards South is not possible.!");
                                }
                            }
                        }
                    }
                    break;

                case 'L': dummyDirection = dummyDirection.rotateLeft();
                    break;
                case 'R': dummyDirection = dummyDirection.rotateRight();
                    break;
                default:
                    throw new IllegalArgumentException();
            }
            System.out.print("For "+currentInstruction+": ");
            System.out.println(dummyCurrentPosition.toString()+dummyDirection.toString()+" ");
        }
        return dummyCurrentPosition.toString()+dummyDirection.toString();
    }

}
