// package inheritance;
public class Main{
    public static void main(String[] args) {
        // System.out.println("hey");
        //Child obj1=new Child();
        //System.out.println(obj1.test1);
        //System.out.println(obj1.test2);
        Parents obj=new Child2();
        obj.print();
        System.out.println(obj.test2);
    }
}



class Parents{
    int test1;
    protected int test2;
    private int test3;

    Parents(int test1){
        this.test1=test1;
        System.out.println("Constructor of parents class");
    }

    Parents(){
        test1=-1;
        test2=-1;
        test3=-1;
        System.out.println("Default constructor of parents class");
    }

    void print(){
        System.out.println("print() fucntion from Parents Class");
    }

    void display(){
        System.out.println("test1 = "+test1);
        System.out.println("test2 = "+test2);
        System.out.println("test3 = "+test3);
    }
}

class Child extends Parents{
    int test2;
    Child(int test2){
        super(5);
        this.test2=test2;
        System.out.println("Constructor of child class");
    }

    Child(){
        System.out.println("Defautl constructor of child class");
    }

    
    void print(){
        System.out.println("print() fucntion from Child Class");
    }
}

class Child2 extends Parents{
    int test2;

    Child2(){
        test2=1;
    }
    
    void print(){
        System.out.println("print() fucntion from Child Class");
    }

    int getTest2(){
        return test2;
    }

    int getTest3(){
        return 0;
    }
}