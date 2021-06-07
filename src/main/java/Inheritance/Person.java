package Inheritance;

public class Person {

    protected String name;
    protected String address;
    protected String mobileNumber;
    private String personID;
/*

    public void setName(String name) {
        this.name = name;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setMobileNumber(String mobileNumber) {
        this.mobileNumber = mobileNumber;
    }

*/

    public Person (String name , String address , String mobileNumber) {
        super();
        this.name = name;
        this.address = address;
        this.mobileNumber = mobileNumber;
    }

    //Constructor------> Construct Class variable
}
