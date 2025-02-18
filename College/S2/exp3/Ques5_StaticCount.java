package expClass;
import java.util.Scanner;
class Count{
    static int count=0;
    Count(){
        count++;
    }
}
public class Ques5_StaticCount{
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        int choice=1;
        Count obj=null;
        while(choice!=0){
            System.out.println("Currently Total no fo objects created of class Count are : "+Count.count);
            System.out.println("1 : Create another object");
            System.out.println("0 : Exit");
            System.out.print("Your chocie : ");
            choice=input.nextInt();
            if(choice==1){
                obj=new Count();
            }
        }
        System.out.println("Total no of objects created of class Count are : "+Count.count);
    }
}