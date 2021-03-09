package chapter3;

import java.util.Scanner;

public class QuotaCalculator {
    /*
    IF Statement.
    All Salespeople are expected to make at least 10 sales each week.
    For those who do, they receive a Congratulatory message.
    For those who don't, they are informed of how many sales they were short.
     */
    public static void main(String[] args) {

        int quota = 10;

        System.out.println("Enter the number of sales you made this week :");
        Scanner sc = new Scanner(System.in);
        int sales = sc.nextInt();
        sc.close();

        if (sales >= quota){

            System.out.println("Congratulations! You 've met the quota...");
        }
        else {
            int salesShort = quota - sales;
            System.out.println("Sorry You did'nt met the quota :( " + salesShort + " Sales Short  ");
        }
    }
}
