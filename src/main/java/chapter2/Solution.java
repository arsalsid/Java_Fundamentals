package chapter2;

import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

         System.out.print("Int:");
         int i = scan.nextInt();

         System.out.print("Double: ");
         Double d = scan.nextDouble();

         scan.nextLine();

         System.out.print("String: ");
         String s = scan.nextLine();


        // Write your code here.

        System.out.println("String: " + s);
        System.out.println("Double: " + d);
        System.out.println("Int: " + i);
    }
}

