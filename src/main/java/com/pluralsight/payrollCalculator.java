package com.pluralsight;

import java.util.Scanner;

public class payrollCalculator {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter your name here: ");
        String name = input.nextLine();

        System.out.println("Enter hours worked: ");
        double hoursWorked = input.nextDouble();

        System.out.println("Enter pay rate: ");
        double payRate = input.nextDouble();

        double grossPay = hoursWorked * payRate;

        System.out.println("Employee Name: " + name);
        System.out.println("Gross Pay: $" + grossPay);



    }
}
