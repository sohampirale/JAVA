import java.util.Scanner;
public class reverseDigits {

    static int reverseInt(Integer n){
        int ret=0;
        while(n!=0){
            ret=(ret*10)+(n%10);
            n/=10;
        }
        return ret;
    }
    public static void main(String[] args) {
        int n=1;
        Scanner input=new Scanner(System.in);
        while(n!=0){
            System.out.print("Enter a number : ");
            n=input.nextInt();
            System.out.println("Reverse of the entered number is receievd as "+reverseInt(n));
        }
        input.close();
    }
}
