package expClass;
import java.util.Scanner;

abstract class Marks{
    int[] marks;
    Marks(int []marks){
        this.marks=new int[marks.length];
        this.marks=marks;
    }

    abstract double totalMarks();

    abstract void showPercentage();

    // void displayMarks(){
    //     System.out.println("All subjects marks are : "+Arrays.toString(marks));
    // }
}

abstract class Total extends Marks{
    Total(int[] marks){
        super(marks);
    }

    double totalMarks(){
        double total=0;
        for(int mark:marks){
            total+=mark;
        }
        return total;
    }

    abstract void showPercentage();

}

class Percentage extends Total{
    Percentage(int[] marks){
        super(marks);
    }

    void showPercentage(){
        double total=totalMarks();
        double percentage=(total/(marks.length*100))*100;
        System.out.println("Percentage of the student is : "+percentage+"%");
    }
}
public class Ques2_CalculatePercentage {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int n,choice=1;
        System.out.print("How many subjects do you have : ");
        n=input.nextInt();
        int []marks=new int[n];
        System.out.print("Enter marks of "+n+" subjects : ");
        for(int i=0;i<n;i++){
            marks[i]=input.nextInt();
        }

        Marks obj=new Percentage(marks);
        while(choice!=0){
            System.out.println("1 : Calculate total marks");
            System.out.println("2 : Calculate percentage");
            System.out.print("Your chocie : ");
            choice=input.nextInt();
            if(choice==1){
                System.out.println("Total makrs of the student are : "+obj.totalMarks());
            } else if(choice==2){
                obj.showPercentage();
            }
        }
    }
}
