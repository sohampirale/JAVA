// package cloning;

class c2{
    static{
        System.out.println("Static from c2");
    }
}

class Test implements Cloneable{
    int var;
    static{
        System.out.println("Static from Test");
    }
    Test(int var){
        this.var=var;
    }

    Test(Test obj){
        this.var=-obj.var;
    }

    // @Override
    public Test clone() throws CloneNotSupportedException {
        return (Test)super.clone();
    }

    // @Override
    public String toString(){
        return "var = "+var;
    }
}

public class Main  {
    static{
        System.out.println("Static from Main");
    }
    public static void main(String[] args) throws CloneNotSupportedException{
        Test obj1=new Test(20);
        Test obj2=obj1.clone();
        obj1.var=10;

        System.out.println(obj1);
        System.out.println(obj2);
        System.out.println("hi");
        c2 obj3=new c2();
        System.out.println("hi");
        c2 obj4=new c2();
    }
}
