// interface Interface1{
//     void test1();
// }

// interface Interface2 extends Interface1{
//     void test2();
// }

class class1{
    public static void test(){
        System.out.println("test() from class1");
    }
}

interface interface1{
    static void test2(){
        System.out.println("hey there");
    }

    void test();

    default void test3(){
        System.out.println("test3() from interface1");
    }
}

public class Main implements interface1{

    public void test(){
        System.out.println("test2()");
    }

    public void test3(){
        System.out.println("test3() form class Main");
    }

    public static void main(String[] args) {
        interface1 obj=new Main();
        obj.test();
        // obj.test2();
        obj.test3();
    }
}