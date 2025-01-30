// import java.util.Arrays;
import java.util.Scanner;

// static int test=0;
public class PassByValue {
    static int test=0;

    static String name;

    static void fn1(String takenName){
        if(takenName==name){
            System.out.println("Both are same");
        }

        if(takenName.equals(name)){
            System.out.println("Value also same");
        }
    }

    static void fn2(int rollno){
        rollno=-1;
    }

    static void fn3(int[] arr){
        arr[0]=-1;
    }

    static void fn4(Integer num){
        num=20;
        System.out.println("Number changed in the function");
    }  
    
    public static void main(String[] args) {
        // System.out.println("Test = "+test);
        Scanner input=new Scanner(System.in);

        // System.out.print("Enter your name : ");
        // String name=input.nextLine();
        // fn1(name);
        // System.out.println("Your name is : "+name);

        // System.out.print("Enter your rollno : ");
        // int rollno=input.nextInt();
        // fn2(rollno);
        // System.out.println("Your rollno is : "+rollno);

        // System.out.print("Enter your name : ");
        // name=input.nextLine();
        // fn1(name);
        // System.out.println("Your name is : "+name);

        // int[] arr1={10,20};
        // int[] arr2=(arr1);
        // int temp1=arr1[0];
        // fn3(arr1);
        // System.out.print("Array2 is : ");
        // for(int i=0;i<2;i++){
        //     System.out.print(arr2[i]+" ");
        // }
        // // System.out.println();
        // System.out.println("\nTmep1 = "+temp1);

        // char [] arr={'a','b'};
        // fn4(arr);
        // System.out.println(Arrays.toString(arr));


        // int a=10;
        // {
        //     a=20;
        // }
        // System.out.println(a);


        // int test=20;

        // System.out.println(test);

        // Integer num=10;
        // fn4(num);
        // System.out.println(num);

        
    }
}
