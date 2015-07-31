package com.marsrover;

public class RightRotation {

    public char rotate(char position) {
        if(position == 'N')
        return 'E';
        else if(position == 'E')
            return 'S';
        else if(position == 'S')
            return 'W';
        else if(position == 'W')
            return 'N';
        return position;
    }
}
