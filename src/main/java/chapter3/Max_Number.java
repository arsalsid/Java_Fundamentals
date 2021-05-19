package chapter3;

import java.util.Arrays;

public class Max_Number {
    public static void main(String[] args) {

        int  numbers [] = {2 , 5 ,  6 , 8 , 10};

        Arrays.sort(numbers);

        for(int d : numbers)
        {
            System.out.println(d);
        }
        System.out.println("Max_numbers" + numbers[numbers.length-3]);
    }
}
