package com.marsrover;

import java.util.Scanner;

public class Controller {
    private final char currentLocationX;
    private final char currentLocationY;
    private char currentPosition;
    private RightRotation rightRotation;


    public Controller(char currentLocationX, char currentLocationY, char currentPosition, RightRotation rightRotation) {

        this.currentLocationX = currentLocationX;
        this.currentLocationY = currentLocationY;
        this.currentPosition = currentPosition;
        this.rightRotation = rightRotation;
    }

    public void getCommand() {
        System.out.println("Enter the instructions");
        Scanner input = new Scanner(System.in);
        String commandString = input.next();
        int commandLength = commandString.length();
        for(int i=0; i<commandLength; i++){
            char command = commandString.charAt(i);
            if(command == 'R'){
                currentPosition = rightRotation.rotate('N');
            }

        }
    }
}
