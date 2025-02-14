package package1;
import package1.Class1;

public class Class3 extends Class1{
    // public int var1=-1;
    // protected int var2=-1;
    // private int var3=-1;
    // int var4=-1;
    
    public static void main(String[] args) {
        Class1 obj = new Class1();
        System.out.println(obj.var1);
        System.out.println(obj.var2);
        // System.out.println(obj.var3); // var3 is private in Class1
        System.out.println(obj.var4);

        Class3 obj2=new Class3();
        System.out.println(obj2.var3);;

    }

    // void display(){
    //     System.out.println("var1 = "+var1);
    //     System.out.println("var2 = "+var2);
    //     System.out.println("var3 = "+var3);
    //     System.out.println("var4 = "+var4);
    // }

}
