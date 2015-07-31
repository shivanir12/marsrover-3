package com.marsrover;

import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class PlateauTest {
    @Test
    public void checkTheBoundaryConditionsWhenTheRoverMovesTowardsNorth(){
        Plateau plateau = new Plateau(5,5);
        boolean result = plateau.moveTowardsNorth(2);
        assertEquals(true,result);
    }

    @Test
    public void checkTheBoundaryConditionsWhenTheRoverMovesTowardsEast(){
        Plateau plateau = new Plateau(5,5);
        boolean result = plateau.moveTowardsEast(1);
        assertEquals(true,result);
    }

}
