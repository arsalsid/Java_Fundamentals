package Abstraction;

public class TestBank {
    public static void main(String[] args) {

        HBLBank hb = new HBLBank(2);
        hb.credit();
        hb.debit();
        hb.loan();
        hb.fund();

        Bank b = new HBLBank(20); //Dynamic polymorphism
        b.credit();
        b.debit();
        b.loan();

    }
}
