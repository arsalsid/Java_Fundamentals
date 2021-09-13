package chapter3;
import java.util.Scanner;

public class ReverseThroughBuiltin {

    public static String Reverse (String str){

        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.reverse();


        return sb.toString();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print(Reverse(sc.nextLine()));

    }


}
