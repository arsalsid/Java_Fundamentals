package chapter3;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {

        int n, c , f = 1;

        System.out.println("Enter an integer to calculate factorial : ");
        Scanner sc = new Scanner(System.in);

        n = sc.nextInt();


        if (n < 0)
            System.out.println("Number should be non-negative ");
        else {
            for (c = 1; c <= n; c++) {

                f = f * c;
            }
            System.out.println("Factorial is " +f);
        }
    }
}
