package chapter3;

import java.util.Scanner;

public class LogicalOperatorLoanQualifier {
        /* Logical Operator:
            To qualify for a loan, a person must make at lease $30,000
            and have been working at their working job at least 2 years.
         */
        public static void main(String[] args) {

            int requiredSalary = 30000;
            int requiredYearsEmployeed = 2;

            System.out.println("Enter your Salary :" );
            Scanner sc = new Scanner(System.in);
            double salary = sc.nextDouble();


            System.out.println("Enter the numbers of year with your current employer? " );
            double years = sc.nextDouble();
            sc.close();

            if (salary >= requiredSalary && years >= requiredYearsEmployeed){
                    System.out.println("Congrats! You qualify for the role...");
                }
                else {
                    System.out.println("Sorry! you must have worked in current employee of the job "
                            + requiredSalary  + " years.");
                }
            }
        }