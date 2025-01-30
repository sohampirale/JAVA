import java.util.Scanner;
import java.util.ArrayList;
import java.util.HashMap;

public class fibonachi {
    static HashMap<Integer,Integer>map=new HashMap<>();
    static Integer fiboDP(Integer n){
        if(n==1||n==2){
            return 1;
        }
        else if(map.containsKey(n)){
            return map.get(n);
        } 
        int result=fiboDP(n-1)+fiboDP(n-2);
        map.put(n,result);
        return map.get(n);
    }

    static Integer fibo(Integer n){
        if(n==1||n==2)return 1;
        else return fibo(n-1)+fibo(n-2);
    }

    static Integer fiboIterative(Integer n){
        Integer first=1;
        Integer second=1;
        Integer sum=0;
        for(int i=3;i<=n;i++){
            sum=first+second;
            second=first;
            first=sum;
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int n=1,choice;
        while(n!=0){
            System.out.print("Enter a number : ");
            n=input.nextInt();
            if(n==0){
                System.out.println("Fibo of 0 is 0");
                continue;
            } else if(n<0){
                System.out.println("Enter valid number");
                continue;
            }

            System.out.println("1 : iteraive");
            System.out.println("2 : using hashmaps");
            System.out.println("3 : Recursive");
            System.out.print("Your choice : ");
            choice=input.nextInt();

            if(choice==1){
                Integer ans=fiboIterative(n);
                System.out.println("Fibo of "+n+" is : "+ans);
            }
            else if(choice==2){
                Integer ans=fiboDP(n);
                System.out.println("Fibo of "+n+" is : "+ans);
            }
            else if(choice==3){
                Integer ans=fibo(n);
                System.out.println("Fibo of "+n+" is : "+ans);
            }
        }
        input.close();
    }
}
