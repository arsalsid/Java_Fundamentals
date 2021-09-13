package chapter3;

public class SmallestNumber {
    public static void main(String[] args) {

        int numbers [] = {4 , 3 , 5 ,10, 2, 12, 7};

        int min = numbers[0];

        for(int index = 0; index < numbers.length; index++){
            if(numbers[index] < min){
                min = numbers[index];
            }
        }
        System.out.println(min);
    }
}
