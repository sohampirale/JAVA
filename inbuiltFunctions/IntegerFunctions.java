import java.util.Scanner;
public class IntegerFunctions {

        public static void parseInt(){
            Scanner input=new Scanner(System.in);
            System.out.print("Enter a strings : ");

            String str=input.next();
            int num;
            try{
                num=Integer.parseInt(str);
            } catch(Exception e){
                System.out.println("Invalid string entered");
                return;
            }
            System.out.println("Number found by converting to string is : "+num);;
        }

        public static int getChoice(){
            Scanner input=new Scanner(System.in);
            System.out.println("1 : parseInt");
            System.out.print("Your choice : ");
            int choice=input.nextInt();
            return choice;
        }

        public static void main(String[] args) {
            int choice=1;
            while(choice!=0){
                choice=getChoice();
                if(choice==1){
                    parseInt();
                }
            }
        }
}
