import java.util.Scanner;

public class Factorial {
    static long factorial(Integer n){
        long ans=1;
        for(int i=2;i<=n;i++){
            ans*=i;
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int n=1;
        while(n!=0){
            System.out.print("Enter a number : ");
            n=input.nextInt();
            System.out.println("Factorial of "+n+" is : "+factorial(n));
        }
    }   
}
