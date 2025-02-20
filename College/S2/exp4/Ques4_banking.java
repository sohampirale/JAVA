import java.util.Scanner;
interface banking{
    void deposit(double m);

    double withdraw(double req);

    double check();

}

class SBI implements banking{
    double balance;
    public void deposit(double m){
        balance+=m;
    } 

    public double withdraw(double req){
        if(req>balance){
            System.out.println("Insufficient balance");
            return 0;
        } else{
            balance-=req;
            return req;
        }
    }

    public double check(){
        return balance;
    }
}

public class Ques4_banking{
    
}