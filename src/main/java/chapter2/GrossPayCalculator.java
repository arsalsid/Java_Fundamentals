package chapter2;

import java.util.Scanner;

public class GrossPayCalculator {

    public static void main(String[] args) {

        //Get the number of hours worked
        System.out.println("Enter the nyumber of hours employee worked." );
        Scanner scanner = new Scanner(System.in);
        int hours = scanner.nextInt();

        //Get the hourly pay rate
        System.out.println("Enter a hourly pay rate. ");
        double rate = scanner.nextDouble();
        scanner.close();

        //Multiply hours and pay rate
       double grossPay = hours * rate;

        //Display result
        System.out.println("Result is : $" +grossPay);
    }
}
