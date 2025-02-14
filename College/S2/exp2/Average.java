package College.S2.exp2;
import java.util.ArrayList;
import java.util.Scanner;
public class Average {
    int num1,num2,num3;
    Average(int num1,int num2,int num3){
        this.num1=num1;
        this.num2=num2;
        this.num3=num3;
    }

    public int giveAverage(){
        return (num1+num2+num3)/3;
    }
    public static void main(String[] args) {
        Scanner  input=new Scanner(System.in);
        int num1,num2,num3;;
        System.out.print("Enter num1 : ");
        num1=input.nextInt();
        System.out.print("Enter num2 : ");
        num2=input.nextInt();
        System.out.print("Enter num3 : ");
        num3=input.nextInt();
        Average obj=new Average(num1,num2,num3);
        System.out.println("Average of the Entered numbers is : "+obj.giveAverage());
    }
}
