import java.util.Scanner;

public class CompoundInterest{
    static double p=-1,n=-1,rate=-1;

    
    static double giveCI(){
        return ((p*Math.pow((1+(rate/100)),n))-p);
    }

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        while(p!=0){
           System.out.print("Enter principle : ");
           p=input.nextInt();
           System.out.print("Enter rate : ");
           rate=input.nextInt();
           System.out.print("Enter n : ");
           n=input.nextInt();
           System.out.println("Compount interest on the given values is : "+giveCI());
        }
        input.close();
    }
}