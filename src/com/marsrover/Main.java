package com.marsrover;

import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the maximum x Coordinates for plateau");
        int maxX = input.nextInt();
        System.out.println("Enter the maximum y Coordinates for plateau");
        int maxY = input.nextInt();
        Plateau plateau = new Plateau(maxX, maxY);
        System.out.println("Enter the current location");
        String location = input.next();
        char currentLocationX = location.charAt(0);
        char currentLocationY = location.charAt(1);
        char currentPosition = location.charAt(2);
        RightRotation rightRotation = new RightRotation();

        Controller controller = new Controller(currentLocationX, currentLocationY, currentPosition, rightRotation);
        controller.getCommand();
    }
}
