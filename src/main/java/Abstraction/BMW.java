package Abstraction;

public class BMW implements Car{

    @Override
    public void start() {
        System.out.println("BMW---START");
    }

    @Override
    public void stop() {
        System.out.println("BMW--stop");

    }

    @Override
    public void refuel() {
        System.out.println("BNW--refuel");
    }

    //non overridden method
    public void theftSafety(){
        System.out.println("BMW---theftSafety");
    }
}
