import java.util.Scanner;

public class swapTwo {
    static int var1=-1, var2=-1;

    static void swapTwoNum(){
        var1=var1+var2;
        var2=var1-var2;
        var1=var1-var2;
    }
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        while(var1!=0&&var2!=0){
            System.out.print("Enter var 1 : ");
            var1=input.nextInt();
            System.out.print("Enter var2 : ");
            var2=input.nextInt();
            swapTwoNum();
            System.out.println("var1 = "+var1);
            System.out.println("var2 = "+var2);
        }
        input.close();
    }
}
