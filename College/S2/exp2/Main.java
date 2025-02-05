import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int choice=1;
        while(choice!=0){
            System.out.println("1 : Area of Rectangle");
            System.out.println("0 : Exit");
            System.out.print("Your choice : ");
            choice=input.nextInt();
            if(choice==1){
                AreaOfRectangle.main(new String[]{});
                // AreaOfRectangle.main(args);/
            }
        }
    }
}
