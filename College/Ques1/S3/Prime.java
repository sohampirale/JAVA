import java.util.Scanner;
public class Prime {

    static boolean isPrime(int n){
        for(int i=2;(i*i)<=n;i++){
            if((n%i)==0)return false;
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int n=1;
        while(n!=0){
            System.out.print("Enter a number : ");
            n=input.nextInt();
            if(isPrime(n)){
                System.out.println("Entered number is prime");
            } else {
                System.out.println("Entered number is not prime");
            }
        }
        input.close();
    }
}
