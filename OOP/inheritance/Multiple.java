// package inheritance;


public class Multiple {
    public static void main(String[] args) {
        // Class3 obj=new Class3(10);
        // obj.display();

        Class2 obj2=new Class3(12);
        System.out.println(obj2.var2);
        System.out.println(obj2);
    }
}


class Class1{
    int var1;
    Class1(int var1){
        this.var1=var1;
    }

    Class1(){}

    public String toString(){
        return "test1";
    }

    public void display(){
        System.out.println("var1 = "+var1);
    }
}

class Class2 extends Class1{
    int var2;
    Class2(int var2){
        super(5);
        this.var2=var2;
    }
    Class2(){}

    public void display(){
        super.display();
        System.out.println("var2 = "+var2);
    }

    public String toString(){
        return "test2";
    }

}

class Class3 extends Class2{
    int var3;
    Class3(int var3){
        super();
        this.var3=var3;
    }

    // Class3(){}


    public void display(){
        super.display();
        System.out.println("var3 = "+var3);
    }

    public String toString(){
        return "test3";
    }

}