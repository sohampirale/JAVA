package expClass;
import java.util.Scanner;

abstract class Base{
    double num1,num2;

    Base(double num1,double num2){
        this.num1=num1;
        this.num2=num2;
    }

    abstract double add();
}

class Perform extends Base{

    Perform(double num1,double num2){
        super(num1,num2);
    }

    double add(){
        return num1+num2;
    }
}


public class Ques1AddTwoNumbers {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        double num1,num2;
        System.out.print("Enter num1 : ");
        num1=input.nextDouble();
        System.out.print("Enter num2 : ");
        num2=input.nextDouble();

        Base obj=new Perform(num1, num2);
        System.out.println("Addition of the two enetred numbers is : "+obj.add());
    }
}
