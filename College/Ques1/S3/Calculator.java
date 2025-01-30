import java.util.Scanner;

public class Calculator{

    public static char getChoice(Scanner input){
        System.out.println("Choose operation( . to stop)");
        System.out.println("+ - * / ");
        System.out.print("Your choice : ");
        String choice=input.next();
        return choice.charAt(0);
    }


    public static void main(String[] args) {
        Scanner input=new Scanner(System.in) ;

        char choice=getChoice(input);
        
        do{
            System.out.print("Enter num1 : ");
            int num1=input.nextInt();
            System.out.print("Enter num2 : ");
            int num2=input.nextInt();

            if(choice=='+'){
                System.out.println("ans = "+(num1+num2));
            } else if(choice=='-'){
                System.out.println("ans = "+(num1-num2));
            } else if(choice=='*'){
                System.out.println("ans = "+(num1*num2));
            } else if(choice=='/'){
                System.out.println("ans = "+(num1/num2));
            }

            choice=getChoice(input);
        }while(choice!='.');
    }
}