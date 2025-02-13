class Test1 {

    public static void print() {
        System.out.println("print() from test1");
    }

}

class Test2 extends Test1 {

    public static void print() {
        System.out.println("print() form test2");
    }

}

final public class Class1 {

    public static void main(String[] args) {
        Test2 obj = new Test2();
        obj.print();
    }

}