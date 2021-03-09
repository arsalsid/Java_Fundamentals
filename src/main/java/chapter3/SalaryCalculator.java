package chapter3;

import java.util.Scanner;

public class SalaryCalculator {
    /*
    IF Statement.
    All Salespeople get a payment of $1000 per week.
    Salespeople who exceed a 10 sales get an additional bonus of $250.
     */
    public static void main(String[] args) {

        int salary = 1000;
        int bonus = 250;
        int quota = 10;

        System.out.println("How many sales did the employee make this week : ");

        Scanner sc = new Scanner(System.in);
        int sales = sc.nextInt();
        sc.close();

        if(sales > quota){
            salary = salary + bonus;
        }
        System.out.println("The employee pay is $" +salary);
    }
}
