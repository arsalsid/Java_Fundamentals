package Polymorphism;

import chapter3.A;

public class Run {
    public static void main(String[] args) {
/*
        B b = new B ();
        b.print(5);
        */
      /*
        Animal animal = new Cat(); //Cat
        animal.print();
        */
/*
        Cat cat = new Cat();
        Animal animal =  (Cat) cat;
        animal.print();

        Cat cat = (Animal) cat;
        cat.print();
        */
/*
        Cat cat = new (Animal); // Runtime Error
        cat.print();
        */
/*
        Animal animal = new Animal(); // Animal
        animal.print();

        Cat cat = (Cat) animal; //animal
        cat.print();
        */
/*
        Animal animal = cat; // Cat
        animal.print();

        animal = (Animal) cat; //Animal
        animal.print();
        */

        Test t = new Test();
        t.bark("Sheperd" , "German" , "20");

    }
}
