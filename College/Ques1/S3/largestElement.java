import java.util.Scanner;
public class largestElement {

    static int findLargest(int[] arr){
        int max=Integer.MIN_VALUE;
        for(int num:arr){
            if(num>max){
                max=num;
            }
        }
        return max;
    }
 public static void main(String[] args) {
    Scanner input=new Scanner(System.in);
        int n=1;
        while(n!=0){
            System.out.print("Enter size of array : ");
            n=input.nextInt();
            int []arr=new int[n];
            System.out.println("Enter "+n+" numbers : ");   
            for(int i=0;i<n;i++){
                arr[i]=input.nextInt();
            }
            System.out.println("Largest element present in the array is : "+findLargest(arr));
        }   
 }   
}
