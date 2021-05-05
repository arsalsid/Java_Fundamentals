package chapter3;

import java.util.Scanner;

public class Palindrome {

    public static void main(String[] args) {
          String str , reverse = "";

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter  a Number : ");
        str = sc. nextLine();

        int length = str.length();

        for (int i = length -1; i >= 0; i--){
            reverse = reverse + str.charAt(i);
        }

        if (str.equals(reverse)){
            System.out.println("Its Palindrome : " +str);
        }
        else
            System.out.println("Its not palindrome : " +str);

    }
}
