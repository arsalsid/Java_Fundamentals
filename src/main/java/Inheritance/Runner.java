package Inheritance;

public class Runner {

    public static void main(String[] args) {

        Admin admin = new Admin("Arsalan " , "Karachi " , "031586 ");
        Customer customer = new Customer("Taha " , "Aachen " , "+159833 ");

        System.out.println(customer);
        System.out.println(admin);
    }
}
