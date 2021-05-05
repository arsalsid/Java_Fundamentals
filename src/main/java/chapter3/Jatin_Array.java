package chapter3;

public class Jatin_Array {
    public static void main(String[] args) {

    /*
        double itemArray [];
        itemArray = new double[5];
        int x [] = new int [3]; //Declaration of array, memory and size of array//
    */

    /*
         1st type of write array

        int totalOfFiveItems [] = new int [5];//size of the array
        totalOfFiveItems[0] =32;
        totalOfFiveItems[1] =34;
        totalOfFiveItems[2] =321;
        totalOfFiveItems[3] =312;
        totalOfFiveItems[4] =312;
    */

   /*
        System.out.println(totalOfFiveItems[0]); //index
        System.out.println(totalOfFiveItems[1]); //index
        System.out.println(totalOfFiveItems[2]); //index
    */

        /* 2nd type of write array */
        int totalOfFiveItems[] = {12, 32, 42, 50, 100};

        System.out.println("Size of the Array" + totalOfFiveItems.length);
        System.out.println(totalOfFiveItems[4]);

    }
}
