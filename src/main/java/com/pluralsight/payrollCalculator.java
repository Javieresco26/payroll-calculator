package com.pluralsight;

import java.util.Scanner;

public class payrollCalculator {
    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);

        String name = getEmployeeName(input);
        double hoursWorked = getHoursWorked(input);
        double payRate = getPayRate(input);

        double grossPay = calculateGrossPay(hoursWorked, payRate);

        displayPayroll(name, grossPay);

        input.close();
    }

    public static String getEmployeeName(Scanner input) {
        System.out.println("Enter your name here: ");
        return input.nextLine();
    }

    public static double getHoursWorked(Scanner input) {
        System.out.println("Enter hours worked: ");
        return input.nextDouble();
    }

    public static double getPayRate(Scanner input) {
        System.out.println("Enter pay rate: ");
        return input.nextDouble();
    }

    public static double calculateGrossPay(double hoursWorked, double payRate) {
        return hoursWorked * payRate;
    }

    public static void displayPayroll(String name, double grossPay) {
        System.out.println("Employee Name: " + name);
        System.out.println("Gross Pay: $" + grossPay);



    }
}
