package org.example;

import java.util.Scanner;

/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Jeremy Rosales
 */
public class SelfCheckout
{
    public static void main( String[] args )
    {
        Scanner input = new Scanner(System.in);

        float[] items;
        items = new float[500];
        float total = 0, tax = 0.055f;
        int x, n;

        System.out.print("How many items?" );
        n = input.nextInt();

        for(int i = 0; i < n; i++) {
            System.out.printf("Enter the price of item %d: ", i+1);
            items[i] = input.nextInt();

            System.out.printf("Enter the quantity of item %d: ", i+1);
            x = input.nextInt();
            items[i] = items[i] * x;
            total += items[i];
        }

        System.out.printf("Subtotal: $%.2f\n", total);
        tax = tax*total;
        System.out.printf("Taxes: $%.2f\n", tax);
        System.out.printf("Total: $%.2f\n", tax+total);

    }
}
