// package cloning;

import java.util.ArrayList;
import java.util.Arrays;

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

class Testing{

    public static void swap(Integer num1,Integer num2){
        int temp=num1;
        num1=num2;
        num2=num1;
    }
}

public class Main  {
    static{
        System.out.println("Static from Main");
    }
    public static void main(String[] args) throws CloneNotSupportedException{
        int[] arr1=new int[5];
        System.out.println(Arrays.toString(arr1));

        ArrayList<Integer> al=new ArrayList<>(10);
        System.out.println(al);
        System.out.println(al.size());
        // System.out.println(al.capacity());
        // Test obj1=new Test(20);
        // Test obj2=obj1.clone();
        // obj1.var=10;

        // System.out.println(obj1);
        // System.out.println(obj2);
        // System.out.println("hi");
        // c2 obj3=new c2();
        // System.out.println("hi");
        // c2 obj4=new c2();
        Integer var1=10;
        Integer var2=20;
        Testing.swap(var1,var2);
        System.out.println("var1 = "+var1);
        System.out.println("var2 = "+var2);
    }
}
