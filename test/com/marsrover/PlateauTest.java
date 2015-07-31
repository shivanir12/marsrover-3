package com.marsrover;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PlateauTest {
    @Test
    public void checkTheBoundaryConditionsWhenTheRoverMovesTowardsNorth(){
        Plateau plateau = new Plateau(5,5);
        boolean result = plateau.moveTowardsNorth(1, 2);
        assertEquals(true,result);
    }

}
