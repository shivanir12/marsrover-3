package com.marsrover;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RightRotationTest {

    @Test
    public void ifTheInitialPositionIsNorthThenTurnTowardsEast(){
        RightRotation rightRotation = new RightRotation();
        char rotate = rightRotation.rotate('N');
        assertEquals('E', rotate);
    }

    @Test
    public void ifTheInitialPositionIsEastThenTurnTowardsSouth(){
        RightRotation rightRotation = new RightRotation();
        char rotate = rightRotation.rotate('E');
        assertEquals('S', rotate);
    }

    @Test
    public void ifTheInitialPositionIsSouthThenTurnTowardsWest(){
        RightRotation rightRotation = new RightRotation();
        char rotate = rightRotation.rotate('S');
        assertEquals('W', rotate);
    }

    @Test
    public void ifTheInitialPositionIsWestThenTurnTowardsNorth(){
        RightRotation rightRotation = new RightRotation();
        char rotate = rightRotation.rotate('W');
        assertEquals('N', rotate);
    }
}
