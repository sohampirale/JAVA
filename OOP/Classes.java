public class Classes{
    public static void main(String[] args) {
        // Student s1=new Student("Soham",2032,(float)99.99);
        // Student s2=new Student(s1);
        // int a=10;
        // int b=a;
        // System.out.println(a);
        // System.out.println(b);
        // b=20;
        // System.out.println(a);
        // System.out.println(b);

        // Integer a=10;
        // Integer b=a;
        // System.out.println(a);
        // System.out.println(b);

        // b=20;
        // System.out.println(a);
        // System.out.println(b);
        // System.out.println(a.toBinaryString(10));
        
        Student obj;
        String name="obj-";
        for(int i=0;i<10000;i++){
            obj=new Student((name+i));
        }
    }
}

class Student{

    int rollno;
    String name;
    float marks;
    boolean passed;
    Student(){
        // this ("default",2000,100);
        System.out.println("Default constructor");
    }

    Student(String name){
        this.name=name;
    }

    Student(String name,int rollno,float marks){
        this();
        this.name=name;
        this.rollno=rollno;
        this.marks=marks;
        System.out.println("student "+this.name+" created");
    }

    Student(Student otherStudent){
        this.name=otherStudent.name;
        this.rollno=otherStudent.rollno;
        this.marks=otherStudent.marks;
        System.out.println("Copy constructor");
    }

    @Override
    protected void finalize() throws Throwable{
        System.out.println(this.name+" is destoyed");
    }
    // ~Student(){
    //     System.out.println("Destructor of "+this.name);
    // }
}
