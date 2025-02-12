package typecasting;
import OOP.accessControl.package1.Class1;

public class Testing extends Class1 {
    public static void main(String[] args) {
        Testing obj = new Testing();
        System.out.println(obj.var2);
        obj.print();
        Scanner input=new Scanner(System.in);
        // Student s1=new Student();
        // Student s2=new Student();

        // System.out.println(s1.var);
        // System.out.println(s2.var);

        // s2.var=20;

        // System.out.println(s1.var);
        // System.out.println(s2.var);
        // System.out.println(Student.var);
    }
}


class Student{
    static int var=10;
}



