import java.util.Arrays;
import java.util.ArrayList;
public class NormalArrays {
    public static void main(String[] args) {
        // int[] arr1={1,2};
        // int[] arr2=new int[2];
        // arr2[0]=1;
        // arr2[1]=2;

        // if(arr1==arr2){
        //     System.out.println("equal by referance");
        // } else {
        //     System.out.println("not equal by referance");
        // }

        // if(arr1.equals(arr2)){
        //     System.out.println("Equal by values");
        // } else {
        //     System.out.println("Not equal by values");
        // }

        // if(Arrays.equals(arr1,arr2)){
        //     System.out.println("Equal when checked with Arrays.equals");
        // }


        // int num1=10;
        // Integer num2=20;

        // if(num1==num2){
            // System.out.println("Same by referance");
        // } else {
            // System.out.println("not same by referance");;
        // }


        // if(num1.equals(num2)){
        //     System.out.println("Equals by value");
        // } else {
        //     System.out.println("Not equal by values");
        // }

        // Integer number=new Integer;//error
        // int[]arr=new int[4];
        // if(arr[0]==arr[2]){
        //     System.out.println("Same by referance");
        // } else {
        //     System.out.println("Not same by referance");
        // }

        //error
        // if(Arrays.equals(arr[0], arr[2])){
        //     System.out.println("equal by values");
        // } else {
        //     System.out.println("not equal by values");
        // }

        // int num1=10;
        // int num2=10;
        
        // if(num1==num2){
        //     System.out.println("Same");//this executes
        // }

        // int []arr=new int[4];
        // if(arr[0]==arr[2]){
            // System.out.println("Initialized same");
        // }

        // int [] arr={10,20,30,40};
        // String str=Arrays.toString(arr);
        // System.out.println("In string : "+str);

        int [][] arr2d=new int[2][2];
        arr2d[0][0]=1;
        arr2d[0][1]=2;
        arr2d[1][0]=3;
        arr2d[1][1]=4;

        // for(int i=0;i<arr2d.length;i++){
        //     for(int j=0;j<arr2d[i].length;j++){
        //         System.out.print(arr2d[i][j]+" ");
        //     }
        //     System.out.println();
        // }

        // for(int[] arr:arr2d){
        //     System.out.println(Arrays.toString(arr));
        // }

        // System.out.println();

        // System.out.println(Arrays.toString(for(int[] arr:arr2d))); //error

        //error
        // for(auto it:arr2d){
            // System.out.println(Arrays.toString(it));
        // }


        // int[] arr={1,2,3,4};
        // for(int var:arr){
            // System.out.print(var+" ");
        // }
        // int var=10;
        // System.out.println(var);



        ArrayList<Integer> arr=new ArrayList<>();
        // System.out.println(arr);
        arr.add(10);
        arr.add(20);
        arr.add(30);
        arr.add(40);

        System.out.println(arr);

        ArrayList<Integer> arr2=new ArrayList<>();
        arr2.add(10);
        arr2.add(20);
        arr2.add(30);
        arr2.add(40);
        // arr2.add(50);

        // arr.addAll(arr2);
        // arr.addAll(2, arr2);

        // System.out.println(arr);

        // arr.addFirst(-10);

        // System.out.println(arr);

        // arr.addLast(50);

        // System.out.println(arr);

        // System.out.println(arr.containsAll(arr2));

        System.out.println(arr.equals(arr2));//true if all elements same


        System.out.println(arr==arr2); //false checking referance
    }
}
