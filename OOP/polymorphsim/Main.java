class Class1{
    int var1=1;
    static void print(){
        System.out.println("Class 1 print() function");
    }

}


class Class2 extends Class1{
    int var1=2;  
    static void print(){
        System.out.println("Class 2 print() function");
    }
  
}

class Class3 extends Class2{
    int var1=3;

    static void print(){
        System.out.println("Class 3 print() function");
    }

}
public class Main {
    public static void main(String[] args) {
        // Object.main(args);
        // Circle c1=new Circle();
        // c1.area();
        // Shapes c2=new Circle2();
        // c2.area();
        // c2.test();
        // // Square s1=new Square();
        // Square.main(args);
        // // Circle2 c3=new Circle();
        
        // Circle c3=new Circle2();

        // Class1 obj=new Class3();
        // System.out.println(obj.var1);
        // System.out.println();
        // Class1.print();
        // obj.print();

        Class3 obj=new Class3();
        System.out.println(obj.var1);
        System.out.println(obj.var1);
        // System.out.println(obj.super.var1);
    }    
}
class Shapes {
    // @Override
    void area(){
        System.out.println("Area of shapes");
    }

    void test(){
        System.out.println("test() function of Shapes");
    }
}

class Square{
    public static void main(String[] args) {
        System.out.println("Square class form Main.java");
    }
}
class Object{
    Object(){
        super();
    }
    public static void main(String[] args) {
        System.out.println("Object Class");
    }
}
class Circle extends Shapes{
    // @Override
    void area(){
        System.out.println("Area of circle");
    }

    final void test(){
        System.out.println("test() function of Circle");
    }
}

 class Circle2 extends Circle{
    void area(){
        System.out.println("Area of Circle2");
    }

    //  void test(){
    //     System.out.println("test() function of Circle2");
    // }
}