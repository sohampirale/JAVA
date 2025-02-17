package College.S2.exp2;
import java.util.ArrayList;
import java.util.Scanner;
public class Average {
<<<<<<< HEAD
    int num1,num2,num3;
    Average(int num1,int num2,int num3){
=======
    double num1,num2,num3;
    Average(double num1,double num2,double num3){
>>>>>>> b0a7f37e5360921acdbb5827be9ac31827aea3ba
        this.num1=num1;
        this.num2=num2;
        this.num3=num3;
    }

<<<<<<< HEAD
    public int giveAverage(){
=======
    public double giveAverage(){
>>>>>>> b0a7f37e5360921acdbb5827be9ac31827aea3ba
        return (num1+num2+num3)/3;
    }
    public static void main(String[] args) {
        Scanner  input=new Scanner(System.in);
<<<<<<< HEAD
        int num1,num2,num3;;
        System.out.print("Enter num1 : ");
        num1=input.nextInt();
        System.out.print("Enter num2 : ");
        num2=input.nextInt();
        System.out.print("Enter num3 : ");
        num3=input.nextInt();
=======
        double num1,num2,num3;;
        System.out.print("Enter num1 : ");
        num1=input.nextDouble();
        System.out.print("Enter num2 : ");
        num2=input.nextDouble();
        System.out.print("Enter num3 : ");
        num3=input.nextDouble();
>>>>>>> b0a7f37e5360921acdbb5827be9ac31827aea3ba
        Average obj=new Average(num1,num2,num3);
        System.out.println("Average of the Entered numbers is : "+obj.giveAverage());
    }
}
