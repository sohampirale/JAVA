// package OOP.Exceptions;

import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static int divide(int num1,int num2) throws Exception , Error{
        if(num2==-1){
            throw new StackOverflowError();
        }
        if(num2==0){
            throw new ArithmeticException("Divide by 0");
        }
        return num1/num2;
    }


    public static int test(int num1,int num2)throws Exception{
        System.out.println("hi");
        divide(num1,num2);
        System.out.println("hey");

        throw new Exception("Exceptionn");
    }
    public static void divider(){
        int num1,num2,ans;
        Scanner input=new Scanner(System.in);
        System.out.println("Enter num1 : ");
        if(!input.hasNextInt()){
            throw new InputMismatchException("Entered input is not an integer");
        }
        num1=input.nextInt();
        System.out.print("Enter num2 : ");
        if(!input.hasNextInt()){
            throw new InputMismatchException("Entered input is not an integer");
        }
        num2=input.nextInt();
        // ans=divide(num1,num2);
        // System.out.println("ans = "+ans);
    }

    public static void main(String[] args) {
        try {
            test(10,0);
        //    divider()/;
            // int ans=divide(10,0);
            // System.out.println("ans = "+ans);
        } catch (ArithmeticException e) {
            System.out.println("Error caught in main Arithmetic Exception");
            System.out.println("Error : "+e.getMessage());
        }catch (Exception e) {
            System.out.println("Error caught in main,Exception only");
            System.out.println("Error : "+e.getMessage());
        } 
            finally{
            System.out.println("Finally block");
        }
    }
}
