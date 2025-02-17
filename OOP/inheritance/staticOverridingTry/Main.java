class Class1{
    public static void hello(){
        System.out.println("hello from class1");
    }
}

class Class2 extends Class1{
    public static void hello(){
        System.out.println("Hello from class2");
    }
}

class Class3 extends Class2{

}

public class Main{
    public static void main(String[] args) {
        Class3 obj=new Class3();
        obj.hello();
    }
}

