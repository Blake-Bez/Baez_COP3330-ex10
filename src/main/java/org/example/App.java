/*
 *  UCF COP3330 Fall 2021 Assignment 10 Solution
 *  Copyright 2021 Blake Baez
 */
package org.example;
import java.util.Scanner;
public class App 
{
        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);

            System.out.print("Enter the price of item 1: ");
            String itemOne_p = input.nextLine();

            System.out.print("Enter the quantity of item 1: ");
            String itemOne_q = input.nextLine();

            System.out.print("Enter the price of item 2: ");
            String itemTwo_p = input.nextLine();

            System.out.print("Enter the quantity of item 2: ");
            String itemTwo_q = input.nextLine();

            System.out.print("Enter the price of item 3: ");
            String itemThree_p = input.nextLine();

            System.out.print("Enter the quantity of item 3: ");
            String itemThree_q = input.nextLine();

            int oneP = Integer.parseInt(itemOne_p);
            int oneQ = Integer.parseInt(itemOne_q);
            int twoP = Integer.parseInt(itemTwo_p);
            int twoQ = Integer.parseInt(itemTwo_q);
            int threeP = Integer.parseInt(itemThree_p);
            int threeQ = Integer.parseInt(itemThree_q);

            //Subtotal calculation:
            double subtotal = (oneP * oneQ) + (twoP * twoQ) + (threeP * threeQ);

            //Tax calculations:
            double taxPercentage = 0.055;
            double subtotalTax = subtotal * taxPercentage;

            //Total calculations:
            double total = subtotal + subtotalTax;

            //Printing checkout:
            System.out.println("Subtotal: $" +subtotal);
            System.out.println("Tax: $" +subtotalTax);
            System.out.println("Total: $" +total);


        }
    }