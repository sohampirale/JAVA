public class Main {
    static class InnerClass1{
        int var1;
        InnerClass1(int var1){
            this.var1=var1;
        }
    }

    class InnerClass2{
        int var2;
        InnerClass2(int var2){
            this.var2=var2;
        }
        
        void print2(){
            System.out.println("hello from print2 InnerClass2");
        }

        static void print1(){
            System.out.println("hello from print1 InnerClass2");
        }

        class doubleInnerClass{
            int test2;
        }
    }

    public static void main(String[] args) {
        // InnerClass1 obj1=new InnerClass1(10);
        // InnerClass1 obj2=new InnerClass1(20);

        // System.out.println(obj1.var1);
        // System.out.println(obj2.var1);

        InnerClass2.print1();

        // // InnerClass2.print2();
        // OutsideClass.InsideClass.greet();

        // OutsideClass.InsideClass obj3 = new OutsideClass.InsideClass(30);

        // obj3.greet2();
        Main mainObj=new Main();
        InnerClass2 obj = mainObj.new InnerClass2(10);
    }
}


class OutsideClass{
    static class InsideClass{
        int test;
        static void greet(){
            System.out.println("Hello there");
        }

        void greet2(){
            System.out.println("hii there");
        }

        public InsideClass(int test){
            System.out.println("Constructor of inside class");
            this.test=test;
        }
         
    }

    OutsideClass(){
        System.out.println("Constructor of OutsideClass");
    }
}

class Student{
    int rollno;
    int age;
    Student(int rollno,int age){
        this.age=age=
        this.rollno=rollno;
    }

    void print1(){
        System.out.println("age = "+age);
        print2();
    }

    void print2(){
        System.out.println("rollno = "+rollno);
    }
}
