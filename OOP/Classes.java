public class Classes{
    public static void main(String[] args) {
        Student s1;
        System.out.println("Variable declared");
        s1=new Student();
        System.out.println(s1.passed);
        System.out.println(s1.);
    }
}

class Student{
    int rollno;
    String name;
    float marks;
    boolean passed;
    Student(){
        System.out.println("Default constructor");
    }
}