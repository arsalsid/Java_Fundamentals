package Constructor;

public class Demo {
    int a = 2;
    int b = 3;

    public int Add () {
        int c = a + b;

        return c;
    }
    public Demo () {

        this.a = a;
        this.b = b;
        System.out.println(a);
        System.out.println(b);

//        int c = a + b;
//        System.out.println(c);
    }
    public static void main(String[] args) {
        Demo d = new Demo();
        System.out.println(d.Add());
//        Demo d1 = new Demo();

    }
}
