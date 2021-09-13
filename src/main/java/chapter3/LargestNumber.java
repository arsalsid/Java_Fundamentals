package chapter3;

public class LargestNumber {
    public static void main(String[] args) {
        int numbers [] = {4 , 3 , 5 ,10, 2, 12, 7};

        int max = numbers[0];

        for(int index = 1; index < numbers.length; index ++){
            if(max < numbers[index]) {
                max = numbers[index];
                }

            }
        System.out.println(max);
        }
    }

