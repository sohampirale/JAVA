import java.util.Scanner;



public class Fibonachi {

    public static int fibo(int n){
        if(n==1||n==0)return n;
        return fibo(n-1)+fibo(n-2);
    }

    public static void pripntFibo(int n){
        for(int i=0;i<=n;i++){
            System.out.print(fibo(i)+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int n=input.nextInt();
        pripntFibo(n);

    }    
}
