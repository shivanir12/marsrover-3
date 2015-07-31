package com.marsrover;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LeftRotationTest {
    @Test
    public void ifTheInitialPositionIsNorthThenTurnTowardsWest(){
        LeftRotation leftRotation = new LeftRotation();
        char rotate = leftRotation.rotate('N');
        assertEquals('W', rotate);
    }
}
