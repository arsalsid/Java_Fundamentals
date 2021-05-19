package chapter3;

import java.util.Scanner;

public class GrossPayInputValidation {
    public static void main(String[] args) {

        int rate = 15;
        int maxHours = 50;

        System.out.println("How many hours did you work this week? " );
        Scanner sc = new Scanner(System.in);
        double hoursWorked = sc.nextDouble();

        while(hoursWorked > maxHours)
        {
            System.out.println("Invalid Entry . your entry should be in between 1 to 40 hours. Try Again please! ");
            hoursWorked = sc.nextDouble();
        }
        sc.close();

        double gross = hoursWorked * rate;
        System.out.println("Gross Pay: $" +gross);
    }
}
