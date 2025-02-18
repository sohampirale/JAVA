package expClass;
import java.util.Scanner;
interface P1{
    int var1=10;
    void showVar1();
}

interface P2{
    int var2=20;
    void showVar2();
}

interface P12 extends P1,P2{
    int var3=30;
    void showVar3();
}

class PrintClass implements P12{

    PrintClass(){
        System.out.println("Constructing obj of PrintClass");
    }

    public void showVar1(){
        System.out.println("var1 = "+var1);
    }

    public void showVar2(){
        System.out.println("var2 = "+var2);
    }

    public void showVar3(){
        System.out.println("var3 = "+var3);
    }
}
public class Ques10_ImplementInterface {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        PrintClass obj=new PrintClass();
        int choice=1;
        while(choice!=0){
            System.out.println("1 : showVar1()");
            System.out.println("2 : showVar2()");
            System.out.println("3 : showVar3()");
            System.out.print("Your choice : ");
            choice=input.nextInt();
            if(choice==1){
                obj.showVar1();
            } else if(choice==2){
                obj.showVar2();
            } else if(choice==3){
                obj.showVar3();
            }
        }
    }
}
