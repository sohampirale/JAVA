import java.util.Scanner;
// import Ques1.Ques1File;
// import Ques2.prime;
// import Ques2.factorial;
// import Ques2.MainTest;
import Ques2.*;
// import Ques1.MainTest;

// import ..*;
// import packagesLearning.*;
public class Main {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int choice=1;
        while(choice!=0){
            System.out.println("1 : Question 1");
            System.out.println("2 : Question 2");
            System.out.println("3 : Question 3");
            System.out.println("4 : Question 4");
            System.out.println("5 : Question 5");
            choice=input.nextInt();
            if(choice==1){
                // Ques1File.main(new String[]{});
            } else if(choice==2){
                prime.main(new String[]{});
            } else if(choice==3){
                factorial.main(new String[]{});
            }
        }

    }
}
