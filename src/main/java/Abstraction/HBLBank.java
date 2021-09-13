package Abstraction;

public class HBLBank extends Bank {


    public HBLBank(int id) {
        super(id);
    }

    @Override
    public void loan(){
        //super(20);
        System.out.println("HBL--Loan Method");

    }

    public void fund(){
        System.out.println("HBL ---Funds Methods");
    }
}
