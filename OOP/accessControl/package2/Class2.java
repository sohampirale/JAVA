package package2;

import package1.Class1;

public class Class2 extends Class1{
    // public int var1=-1;
    // protected int var2=-1;
    // private int var3=-1;
    // int var4=-1;
    
    public static void main(String[] args) {
        Class1 obj = new Class1();
        // Accessing variables from Class1
        System.out.println("var1 = " + obj.var1);
        // System.out.println("var2 = " + obj.var2);//not acceible becuase it s different package also Class2 is not inheriting Class1
        // System.out.println("var3 = " + obj.var3); // var3 is private in Class1
        // System.out.println("var4 = " + obj.var4);//

        Class2 obj2=new Class2();

        System.out.println(obj2.var1);
        System.out.println(obj2.var2);

        // System.out.println(obj2.var3);
        System.out.println(obj2.var4);

    }
}


// System.out.println("var2 = " + obj.var2);//not acceible becuase it s different package also Class2 is not inheriting Class1
        // System.out.println("var3 = " + obj.var3); // var3 is private in Class1
        // System.out.println("var4 = " + obj.var4);/    }

    // void display(){
    //     System.out.println("var1 = "+var1);
    //     System.out.println("var2 = "+var2);
    //     System.out.println("var3 = "+var3);
    //     System.out.println("var4 = "+var4);
    // }