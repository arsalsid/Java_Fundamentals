package Abstraction;

public class TestCar {

    public static void main(String[] args) {

        BMW bw = new BMW();
        bw.start();
        bw.stop();
        bw.refuel();
        bw.theftSafety();


        Car c = new BMW(); //Dynamic polymorphism
        c.start();
        c.stop();
        c.refuel();

    }
}
