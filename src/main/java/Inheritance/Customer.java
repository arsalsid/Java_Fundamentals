package Inheritance;

public class Customer extends Person {

    private String id;
    private String cardDetail;

    public Customer(String name, String address, String mobileNumber) {
        super(name, address, mobileNumber);
    }


    public void doPayment () {
        System.out.println("Customer made the Payment");
    }

    public String toString() {

        String data = "Name : " +name + "Address : " +address + "Mobile Number :" + mobileNumber;
        return data;
    }
}
