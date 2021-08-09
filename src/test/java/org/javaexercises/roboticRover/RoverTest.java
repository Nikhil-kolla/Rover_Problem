package org.javaexercises.roboticRover;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class RoverTest {

    @Test
    public void _01N_ShouldBeThePositionOfRoverWith_00N_AsStartingAnd_M_AsInstruction() throws Exception {
        Plateau plateau = new Plateau(5,5);
        Coordinate currentRoverPosition = new Coordinate(0,0);
        Direction currentRoverDirection = new Direction("N");

        Rover rover = new Rover(plateau,currentRoverPosition,currentRoverDirection);

        assertEquals("0 1 N", rover.move("M"));
    }

    @Test
    public void _10N_ShouldBeThePositionOfRoverWith_00N_AsStartingAnd_RML_AsInstruction() throws Exception {
        Plateau plateau = new Plateau(5,5);
        Coordinate currentRoverPosition = new Coordinate(0,0);
        Direction currentRoverDirection = new Direction("N");

        Rover rover = new Rover(plateau,currentRoverPosition,currentRoverDirection);

        assertEquals("1 0 N", rover.move("RML"));
    }

    @Test
    public void shouldNotMoveTowardsEastAtBottomRight() throws Exception {
        Plateau plateau = new Plateau(5,5);
        Coordinate currentRoverPosition = new Coordinate(5,0);
        Direction currentRoverDirection = new Direction("E");

        Rover rover = new Rover(plateau,currentRoverPosition,currentRoverDirection);

        assertThrows(Exception.class,()->rover.move("M"));
    }

    @Test
    public void shouldNotMoveTowardsWestAtBottomLeft() throws Exception {
        Plateau plateau = new Plateau(5,5);
        Coordinate currentRoverPosition = new Coordinate(0,0);
        Direction currentRoverDirection = new Direction("W");

        Rover rover = new Rover(plateau,currentRoverPosition,currentRoverDirection);

        assertThrows(Exception.class,()->rover.move("M"));
    }

    @Test
    public void shouldNotMoveTowardsNorthAtTopRight() throws Exception {
        Plateau plateau = new Plateau(5,5);
        Coordinate currentRoverPosition = new Coordinate(5,5);
        Direction currentRoverDirection = new Direction("N");

        Rover rover = new Rover(plateau,currentRoverPosition,currentRoverDirection);

        assertThrows(Exception.class,()->rover.move("M"));
    }

    @Test
    public void shouldNotMoveTowardsSouthAtBottomRight() throws Exception {
        Plateau plateau = new Plateau(5,5);
        Coordinate currentRoverPosition = new Coordinate(5,0);
        Direction currentRoverDirection = new Direction("S");

        Rover rover = new Rover(plateau,currentRoverPosition,currentRoverDirection);

        assertThrows(Exception.class,()->rover.move("M"));
    }

    @Test
    public void _13N_ShouldBeThePositionOfRoverWith_12N_AsStartingAnd_LMLMLMLMM_AsInstruction() throws Exception {
        Plateau plateau = new Plateau(5,5);
        Coordinate currentRoverPosition = new Coordinate(1,2);
        Direction currentRoverDirection = new Direction("N");

        Rover rover = new Rover(plateau,currentRoverPosition,currentRoverDirection);

        assertEquals("1 3 N", rover.move("LMLMLMLMM"));
    }

    @Test
    public void _51E_ShouldBeThePositionOfRoverWith_33E_AsStartingAnd_MMRMMRMRRM_AsInstruction() throws Exception {
        Plateau plateau = new Plateau(5,5);
        Coordinate currentRoverPosition = new Coordinate(3,3);
        Direction currentRoverDirection = new Direction("E");

        Rover rover = new Rover(plateau,currentRoverPosition,currentRoverDirection);

        assertEquals("5 1 E", rover.move("MMRMMRMRRM"));
    }
}
