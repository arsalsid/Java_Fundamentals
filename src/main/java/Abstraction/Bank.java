package Abstraction;

public abstract class Bank {

    public Bank (int id){

    }

    int amt = 100;
    final int rate = 10;
    static int loanRate = 5;

    //partial abstraction
    //hiding the implementation logic is called Abstraction
    //Abstract class can have abs and non abs methods
    //Cannot create the object of abstract classes

    public abstract void loan(); //abstract method -- with no method body

    public void credit(){ // Non abs method
        System.out.println("BANK---CREDIT CARD");
    }

    public void debit(){
        System.out.println("BANK---DEBIT CARD");
    }

}
