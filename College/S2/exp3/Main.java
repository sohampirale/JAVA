package expClass;
import java.util.Scanner;
// import expClass.*;
public class Main {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int choice=1;
        while(choice!=0){
            System.out.println("1 : Add Two Numbers");
            System.out.println("2 : Calculate Percentage");
            System.out.println("3 : Manager with highest Salary");
            System.out.println("4 : Items with discount");
            System.out.println("5 : Static count of objects created");
            System.out.println("6 : Modify Order List");
            System.out.println("7 : Student Test Sports Class");
            System.out.println("8 : Digital Library,Books,Tapes");
            System.out.println("9 : 10 Students Data");
            System.out.println("10 : INterface INheritance P12,P1,P2");

            System.out.print("Your choice : ");
            choice=input.nextInt();
            if(choice==1){
                Ques1AddTwoNumbers.main(args);
            } else if(choice==2){
                Ques2_CalculatePercentage.main(args);
            } else if(choice==3){
                Ques3_ManagerHIghestSalary.main(args);
            } else if(choice==4){
                Ques4_ItemmsWithDiscount.main(args);
            } else if(choice==5){
                Ques5_StaticCount.main(args);
            } else if(choice==6){
                Ques6_ModifyOrderList.main(args);
            } else if(choice==7){
                Ques7_StudentTestMarks.main(args);
            } else if(choice==8){
                Ques8_LibraryBookTape.main(args);
            } else if(choice==9){
                Ques9_StudenttMarkName.main(args);
            } else if(choice==10){
                Ques10_ImplementInterface.main(args);
            }
        }
    }
}
