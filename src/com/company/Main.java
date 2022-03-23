package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double fahren;
        double celsius;
        int choice;
        do {
            System.out.println("Menu");
            System.out.println("1. Fahren to celsius");
            System.out.println("2. Celsius to fahren");
            System.out.println("0. Exit");
            System.out.println("Enter your choice");
            choice = input.nextInt();
            switch (choice) {
                case 1: {
                    System.out.println("Enter fahren: ");
                    fahren = input.nextDouble();
                    System.out.println("Fahren to Celsius: " + fahrentocelsius(fahren));
                    break;
                }
                case 2: {
                    System.out.println("Enter Celsius: ");
                    celsius = input.nextDouble();
                    System.out.println("Celsius to Fahren: " + celsiustofahren(celsius));
                    break;
                }
                case 0:
                    System.exit(0);
            }
        }while (choice!=0);


    }
    public static double celsiustofahren(double celsius){
        double fahren=(9.0/5)*celsius+32;
        return fahren;
    }
    public static double fahrentocelsius(double fahren){
        double celsius=(5.0/9)*(fahren-32);
        return celsius;
    }
}
