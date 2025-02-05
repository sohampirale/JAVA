package College.S2.Exp1;
import java.util.Scanner;

public class DiffSIAndCI {

    static double p=-1,n=-1,rate=-1;

    static double giveCI(){
        return ((p*Math.pow((1+(rate/100)),n))-p);
    }

    static double giveSI(){
        return (p*rate*n)/100;
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
        //    System.out.println("Compount interest on the given values is : "+giveCI());
            double CI=giveCI();
            double SI=giveSI();
            System.out.println("Difference between CI & SI is : "+(CI-SI));
            System.out.println("SI = "+SI);
            System.out.println("CI = "+CI);
        }
        input.close();
    }
}
