package College.S2.exp3;
import java.util.HashMap;
import java.util.Scanner;
import java.util.Arrays;
class Studentt{
    public static HashMap<String,int[]>allStudentts=new HashMap<>();
    int[] marks;
    String name;
    Studentt(String name,int[] marks){
        this.marks=marks;
        this.name=name;
        allStudentts.put(name,marks);
    }
}

class markname extends Studentt{

    markname(String name,int[] marks){
        super(name, marks);
    }

    public static void create10Studentts(String[] names,int[][] marks){
        for(int i=0;i<names.length;i++){
           new Studentt(names[i],marks[i]);
        }
    }

    public static void displayAllStudentts(){
        allStudentts.forEach((name,marks)->
        {
            System.out.println("name : "+name+" & Marks : "+Arrays.toString(marks));
        });
    }
}

public class Ques9_StudenttMarkName {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int n;
        String[] names=new String[10];
        System.out.print("How many subject doe s1 studentt has : ");
        n=input.nextInt();
        int[][] marks=new int[10][n];
        for(int i=0;i<=9;i++){
            System.out.println("Enter name of studentt no -"+(i+1)+" : ");
            names[i]=input.next();
            System.out.print("Enter marks of "+n+" subjects of "+names[i]+" : ");
            for(int j=0;j<n;j++){
                marks[i][j]=input.nextInt();
            }
        }
        markname.create10Studentts(names, marks);
        System.out.println("10 Studentts created");
        markname.displayAllStudentts();
    }
}
