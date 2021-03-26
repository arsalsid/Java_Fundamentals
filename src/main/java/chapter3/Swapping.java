package chapter3;
public class Swapping {

    public static void main(String[] args) {

        int x = 5, y = 10;

        x = x + y;
        y = x - y;
        x = x - y;

        System.out.println("Enter the value of x :" + x);
        System.out.println("Enter the value of y : " + y);
    }
}
