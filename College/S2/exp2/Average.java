package College.S2.exp2;
import java.util.ArrayList;
import java.util.Scanner;
public class Average {
    double num1,num2,num3;
    Average(double num1,double num2,double num3){
        this.num1=num1;
        this.num2=num2;
        this.num3=num3;
    }

    public double giveAverage(){
        return (num1+num2+num3)/3;
    }
    public static void main(String[] args) {
        Scanner  input=new Scanner(System.in);
        double num1,num2,num3;;
        System.out.print("Enter num1 : ");
        num1=input.nextDouble();
        System.out.print("Enter num2 : ");
        num2=input.nextDouble();
        System.out.print("Enter num3 : ");
        num3=input.nextDouble();
        Average obj=new Average(num1,num2,num3);
        System.out.println("Average of the Entered numbers is : "+obj.giveAverage());
    }
}
