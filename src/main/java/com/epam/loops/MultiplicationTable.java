package com.epam.loops;

import java.util.Scanner;

public class MultiplicationTable {

    public void printTable(int numberTableToPrint) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a positive number : ");
        int number = scanner.nextInt();
        int i = 0;
        while (!(i < numberTableToPrint)) {
            System.out.println(number +" x " + i + " = " + (number*i));
            i++;
        }
    }

}
