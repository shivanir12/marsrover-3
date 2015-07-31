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

    public boolean moveTowardsNorth(int currentPositionY) {
        if (currentPositionY < plateauYMax)
            return true;
        else
            return false;
    }

    public boolean moveTowardsEast(int currentPositionX) {
        if (currentPositionX < plateauXMax)
            return true;
        else
            return false;
    }

    public boolean moveTowardsSouth(int currentPositionY) {
        if (currentPositionY > plateauYMin)
            return true;
        else
            return false;
    }
}
