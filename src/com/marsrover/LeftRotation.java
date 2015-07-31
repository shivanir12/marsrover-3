package com.marsrover;

public class LeftRotation {
    public char rotate(char position) {
        if(position == 'N')
            return 'W';
        else if(position == 'W')
            return 'S';
        return position;
    }
}
