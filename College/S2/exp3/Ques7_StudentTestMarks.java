package expClass;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;
import java.util.ArrayList;
class Student{
    public static HashSet<Integer>allStudents=new HashSet<>();
    Student(int rollno){
        allStudents.add(rollno);
        System.out.println("Student with rollno : "+rollno+" created successfully!");
    }
}

class Test extends Student{
    static HashMap<Integer,Double>percentageOfAllStudents=new HashMap<>();
    static HashMap<Integer,ArrayList<Integer>>makrsOfAllStudents=new HashMap<>();

    public Double calculatePercentage(int rollno){
        int total=0;
        for(int mark:makrsOfAllStudents.get(rollno)){
            total+=mark;
        }
        return (double)(((double)total/(double)(100*makrsOfAllStudents.get(rollno).size()))*100);
    }

    Test(ArrayList<Integer>marks,int rollno){
        super(rollno);
        makrsOfAllStudents.put(rollno,marks);
        percentageOfAllStudents.put(rollno,calculatePercentage(rollno));
    }
    
}

interface Sports{
    HashMap<Integer,Double>sportsMarks=new HashMap<>();
}

class Result extends Test implements Sports{

    Result(int rollno,ArrayList<Integer>marks,Double sportsMarks){
        super(marks, rollno);
        Sports.sportsMarks.put(rollno,sportsMarks);
    }

    public static void displayResult(Integer rollno){
        if(!Student.allStudents.contains(rollno)){
            System.out.println("Student with roll no : "+rollno+" does not exists in the database");
            return;
        }
        System.out.println("Percentage of student with rollno : "+rollno+ " is : "+Test.percentageOfAllStudents.get(rollno));
        System.out.println("Score of Sports of student with rollno : "+rollno+ " is : "+Sports.sportsMarks.get(rollno));
    }
}
public class Ques7_StudentTestMarks{
    public static void main(String []args){
        Scanner input=new Scanner(System.in);
        int choice=1,rollno,n;
        double sportsMarks;
        while(choice!=0){
            System.out.println("1 : CReate another student");
            System.out.println("2 : See result of a student");
            System.out.print("Your choice : ");
            choice=input.nextInt();
            if(choice==1){
                System.out.print("Enter roll no : ");
                rollno=input.nextInt();
                if(Student.allStudents.contains(rollno)){
                    System.out.println("Student with roll no : "+rollno+" already exists");
                    continue;
                }
                System.out.print("How many subject do you have : ");
                n=input.nextInt();
                ArrayList<Integer> marks=new ArrayList<>(n);
                System.out.print("Enter marks of "+n+" subjects : ");
                for(int i=0;i<n;i++){
                    marks.add(i,input.nextInt());
                }
                System.out.println("Enter your makrs in sports : ");
                sportsMarks=input.nextInt();
                new Result(rollno, marks, sportsMarks);
            }   else if(choice==2){
                System.out.print("Enter your rollno : ");
                rollno=input.nextInt();
                Result.displayResult(rollno);
            }
        } 
    }
}