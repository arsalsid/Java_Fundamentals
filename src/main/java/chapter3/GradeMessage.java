package chapter3;

import java.util.Scanner;

public class GradeMessage {
    /*
    Switch Statement
    */
    public static void main(String[] args) {

        System.out.println("Enter your Letter grade : ");
        Scanner sc = new Scanner(System.in);
        String grade = sc.next();
        sc.close();

        String message;

        switch (grade){
            case "A":
                message = "Excellent Job!";
                break;
            case "B":
                message = "Great Job!";
                break;
            case "C":
                message = "Good Job!";
                break;
            case "D":
                message = "You need to work a bit harder";
                break;
            case "F":
                message = "Uh No!";
                break;
            default:
                message = "Error Invalid grade..";
                break;
        }
        System.out.println(message);
    }
}
