package Inheritance;

public class Admin extends Person {

    private  String id;

    public Admin(String name, String address, String mobileNumber) {
        super(name, address, mobileNumber);
    }

    public void giveAccess () {
        System.out.println("Access given by Admin");
    }

    @Override
    public String toString() {

        String data = "Name : " +name + "Address  : " +address + "Mobile Number  :" + mobileNumber;
        return data;
    }
}
