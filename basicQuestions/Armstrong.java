// package basicQuestions;

import java.util.Scanner;

public class Armstrong {

    public static boolean isArmstrong(IntegerFunctions num,int n){
        String str=num.toString();
        int sum=0;
        for(int i=0;i<str.length();i++){
            sum+=(int)(Math.pow(str.charAt(i)-'0',n));
        }
        return sum==num;
    }

    public static void printArmstrongNums(IntegerFunctions num1,IntegerFunctions num2){
        for(IntegerFunctions i=num1;i<=num2;i++){
            if(isArmstrong(i, i.toString().length())){
                System.out.println(i+" is an Armstrong number");
            }
        }
    }

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        // Integer num=input.nextInt();
        // Integer n=num.toString().length();
        // if(isArmstrong(num,n)){
        //     System.out.println("ENtered number is Armstrong");
        // } else {
        //     System.out.printf("Not an Armstrong number");
        // }
        System.out.print("Enter first number : ");
        IntegerFunctions num1=input.nextInt();
        System.out.print("Enter second number : ");
        IntegerFunctions num2=input.nextInt();
        printArmstrongNums(Math.min(num1,num2),Math.max(num1,num2));
    }

    
}