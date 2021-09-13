package Abstraction;

public interface Car {

    //only static and final variable allowed.

     final int WHEELS = 4;
     static int MIRROR = 9;

    //Always define only abstract methods
    //no method body
    //only method declaration
    //we achieve 100% abstraction
    //Cannot create the object of interfaces

    public void start();
    public void stop();
    public void refuel();

}
