import java.util.Scanner;
public class FirstProgram{
    public static void main(String[] args) {
        // Scanner input=new Scanner(System.in);
        // System.out.println("ENter a number : ");
        // int rollno=input.nextInt();
        // System.out.println("You enetred "+rollno);
        // System.out.print("Enter your name : ");;
        // String name=input.next();
        // System.out.println("Your name is : "+name);
        // System.out.println("Peace");

        // int a=20;
        // a=24;
        // int b=20;
        // if(b==a){
            // System.out.println("Same");
        // } else {
            // System.out.println("Not same");
        // }
        Scanner input=new Scanner(System.in);
        System.out.println("Input something : ");
        int test=input.nextInt();
        while(input.hasNext()){
            String word=input.next();
            System.out.println(word);
        }
    }
}