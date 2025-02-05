// package multilevel;

public class Multilevel {
    int multilevelVar;

    Multilevel(int var){
        multilevelVar=var;
        System.out.println("Constructor of MUltilevel Class");
    }

    Multilevel(){
        System.out.println("Default constructor o fMUltilevel Class");
    }

    // void testing(){
    //     System.out.println("Void test()");
    // }

    // int testing(int var){
    //     System.out.println("int test()");
    //     return 1;
    // }

    // double testing(double var){
    //     return 1;
    // }

    // int test(int var1,double var2){
    //     return var1+(int)var2;
    // }

    // int test(double  var1,int var2){
    //     return (int)var1+var2;
    // }

    // int test(double var1,double var2){
    //     return (int)(var1+var2);
    // }

    static double test(float var1,int var2){
        System.out.println("float,int");
        return var1+var2;
    }

    static double test(double var1,int var2){
        System.out.println("double,int");
        return var1+var2;
    }

    static double test(int var1,int var2){
        System.out.println("int,int");
        return var1+var2;
    }

   
    public static void main(String[] args) {
        // Class2 obj1=new Class2(10);
        // System.out.println("Obj1 created");;

        // Class2 obj2=new Class2();
        // System.out.println("obj2 created");
        test(2,3);
        // test(2,2.3);
    }
}

class Class1 extends Multilevel{
    int class1Var;
    Class1(){
        System.out.println("Class1 default constructor");
    }

    Class1(int var){
        super(var);
        this.class1Var=var;
        System.out.println("Constructor of Class2");
    }
}

class Class2 extends Class1{
    int class2Var;

    Class2(){
        System.out.println("Class2 default constructor");
    }

    Class2(int var){
        super(var);
        this.class2Var=var;
        System.out.println("Constructor of class2");
    }
}
