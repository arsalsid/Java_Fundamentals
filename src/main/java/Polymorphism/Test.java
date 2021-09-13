package Polymorphism;

public class Test {

    public void bark (String name , String type) {
        System.out.println("Dog name");
    }
    protected void bark (String name , String type , String breed) {
        System.out.println("Additional para");
    }
}
