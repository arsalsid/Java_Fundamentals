package chapter3;

import java.util.Scanner;

/*
* Reverse String through Bubble sort
*/

/*

Reverse String without using built in function

*/
public class ReverseStringSorting{
    public static void main(String[] args) {

        Scanner scanner= new Scanner(System.in); //System.in is a standard input stream
        System.out.print("input:");

        String str= scanner.nextLine();

        System.out.print("output:");

        for(int i=str.length()-1; i >= 0 ; i--)
        {
            System.out.print(str.charAt(i));
        }


    }
}
