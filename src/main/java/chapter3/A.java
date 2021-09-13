package chapter3;

public class A
{
    int a;
    public void Add () {
        System.out.println("A");
    }
}

class B extends A
{

//    @Override
//    public void Add() {
//        System.out.println("B");
//        System.out.println();
//      //  super.Add();
//    }

    public void Subtract (){
        super.Add();
    }
}