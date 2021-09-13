/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Diego Santiago
 */


package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);

        System.out.print("What is the input string?");
        String y = x.nextLine();

        System.out.println(y+" has " + y.length()+" characters.");
    }
}
