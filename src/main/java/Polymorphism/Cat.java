package Polymorphism;

public class Cat extends Animal {
   /*
    @Override
    public void print (int i){

    }*/

    @Override
    public void print() {
        System.out.println("Cat");

    }

    @Override
    public Animal fun() {
        return new Cat();
    }
}

