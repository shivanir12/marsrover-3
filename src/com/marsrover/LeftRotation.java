package com.marsrover;

public class LeftRotation {
    public char rotate(char position) {
        if(position == 'N')
            return 'W';
        else if(position == 'W')
            return 'S';
        else if(position == 'S')
            return 'E';
        else if(position == 'E')
            return 'N';
        return position;
    }
}
