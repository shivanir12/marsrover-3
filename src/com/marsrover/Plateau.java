package com.marsrover;

public class Plateau {
    private final int plateauXMin = 0;
    private final int plateauYMin = 0;
    private final int plateauXMax;
    private final int plateauYMax;

    public Plateau(int plateauXMax, int plateauYMax) {

        this.plateauXMax = plateauXMax;
        this.plateauYMax = plateauYMax;
    }

    public boolean moveTowardsNorth(int currentPositionX, int currentPositionY) {
        if (currentPositionY < plateauYMax)
            return true;
        else
            return false;
    }
}