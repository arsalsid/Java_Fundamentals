package chapter3;

public class Cons {


    int id , age;
    String name , subject;

    public Cons (int id , int age , String name , String subject) {

        this.age = age;
        this.id = id;
        this .name = name;
        this.subject = subject;
    }
    public void showInfo () {
        System.out.println(id + " " + name+" "+age+ " "+subject);
    }

    public static void main(String[] args) {
        Cons obj = new Cons(23 , 27 , "Arsalan" , "Java");
        obj.showInfo();
    }
}
