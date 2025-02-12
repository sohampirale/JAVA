package College.S2.exp2;
import java.util.Scanner;
import College.S2.exp2.ComplexNums;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int choice = 1;
        while (choice != 0) {
            System.out.println("1 : Area of Rectangle");
            System.out.println("2 : Create student obj");
            System.out.println("0 : Exit");
            System.out.print("Your choice: ");
            choice = input.nextInt();
            if (choice == 1) {
                AreaOfRectangle.main(new String[]{});
            } else if(choice==2){
                StudentQues2.main(args);
            } else if(choice==3){
                StudentQues3.main(args);
            } else if(choice==4){
                TrianglePerimeterAndAreaQues4.main(args);
            } else if(choice==5){
                TrianglePerimeterAndArea.main(args);
            } else if(choice==6){
                RectangleQues6.main(args);
            } else if(choice==7){
                RectangleQues7.main(args);
            } else if(choice==8){
                Average.main(args);
            } else if(choice==9){
                ComplexNums.main(args);
            } else if(choice==10){

            }
        }
    }
}
