/*
 *  UCF COP3330 Fall 2021 Assignment 8 Solution
 *  Copyright 2021 Rami Amm
 */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int people;
        int pizzas;
        int slices;
        int total;
        int quotient;
        int remainder;

        Scanner in = new Scanner(System.in);
        System.out.println("How many people are eating pizza?");
        people = in.nextInt();

        System.out.println("How many pizzas do you have?");
        pizzas = in.nextInt();

        System.out.println("How many slices of pizza are there?");
        slices = in.nextInt();

        total = pizzas * slices;

        System.out.println("There are " + people + " people with " + pizzas + " pizzas (" + total + " slices)");

        quotient = total / people;

        System.out.println("Each person gets " + quotient + " slices of pizza");

        remainder = total % people;

        System.out.println("There are " + remainder + " leftover slices");
    }
}
