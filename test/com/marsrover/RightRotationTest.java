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
}
