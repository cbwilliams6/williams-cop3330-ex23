package org.example;
import java.util.Scanner;

/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Christian Williams
 */

public class App
{
    public static void main( String[] args )
    {
        Scanner input = new Scanner(System.in);

        System.out.print("Is the car silent when you turn the key? ");
        String choice = input.nextLine();

        if(choice.equalsIgnoreCase("y") || choice.equalsIgnoreCase("yes")){
            System.out.print("Are the battery terminals corroded? ");
            choice = input.nextLine();
            if(choice.equalsIgnoreCase("y") || choice.equalsIgnoreCase("yes")){
                System.out.print("Clean terminals and try starting again.");
            }
            else{
                System.out.print("Replace cables and try again.");
            }
        }
        else{
            System.out.print("Does the car make a slicking noise? ");
            choice = input.nextLine();
            if(choice.equalsIgnoreCase("y") || choice.equalsIgnoreCase("yes")){
                System.out.print("Replace the battery.");
            }
            else{
                System.out.print("Does the car crank up but fail to start? ");
                choice = input.nextLine();
                if(choice.equalsIgnoreCase("y") || choice.equalsIgnoreCase("yes")){
                    System.out.print("Check spark plug connections.");
                }
                else{
                    System.out.print("Does the engine start and then die? ");
                    choice = input.nextLine();
                    if(choice.equalsIgnoreCase("y") || choice.equalsIgnoreCase("yes")){
                        System.out.print("Does the car have fuel injection? ");
                        choice = input.nextLine();
                        if(choice.equalsIgnoreCase("y") || choice.equalsIgnoreCase("yes")){
                            System.out.print("Get it in for service.");
                        }
                        else{
                            System.out.print("Check to ensure the choke is opening and closing.");
                        }
                    }
                    else{
                        System.out.print("This should not be possible.");
                    }
                }
            }
        }
    }
}