package Sortings;

public class BubbleSort {
    public static void main(String[] args) {

        int data []  = {23 , 45 , 13 , 13 , 10};
        int  temp;

        for (int index = 0; index < data.length -1; index ++)
        {
            System.out.println(data[index] + "  ");
            temp = data[index];
            if (data[index] > data[index +1])
            { //Swapping
                data[index] = data[index + 1];
                data[index + 1] = temp;
            }
        }
        System.out.println(" ");

         for (int d : data) {
             System.out.println(d  + "  ");
         }
    }

}
