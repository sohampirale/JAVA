package College.S2.exp2;
import java.util.Scanner;
import College.S2.exp2.ComplexNums;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int choice = 1;
        while (choice != 0) {
            System.out.println("1 : Area of Rectangle Question1");
            System.out.println("2 : Create student obj Question2");
            System.out.println("3 : Create student obj Question3");
            System.out.println("4 : Perimeter & area of a triangle Question4");
            System.out.println("5 : Perimeter & area of a traingle Question5");
            System.out.println("6 : Area of two rectangles Question6");
            System.out.println("7 : Area of two rectangles Question7");
            System.out.println("8 : Average of 3 numbers Question8");
            System.out.println("9 : Operations on complex numbers Question9");
            System.out.println("10 : Prin information fo student Question10");
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
                printStudentInfo.main(args);
            }
        }
    }
}
