import java.util.Scanner;
import java.util.Arrays;
import java.util.HashMap;

public class fiboSequence{

    static HashMap<Integer,Integer>map=new HashMap<>();
    static{
        map.put(1,1);
        map.put(2,1);
    }

    static Integer fiboDP(Integer n){
        if(map.containsKey(n)){
            return map.get(n);
        } 
        int result=fiboDP(n-1)+fiboDP(n-2);
        map.put(n,result);
        return map.get(n);
    }

    static int[] generateSeqFibo(int n){
        int[] seq=new int[n+1];
        fiboDP(n);
        for(int i=1;i<=n;i++){
            seq[i]=map.get(i);
        }
        return seq;
    }

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int n=1;
        while(n!=0){
            System.out.print("Enter a number : ");
            n=input.nextInt();
            int[] seq=generateSeqFibo(n);
            System.out.println("Fibonachi sequence generated is : ");
            System.out.println(Arrays.toString(seq));
            map.clear();
            map.put(1,1);
            map.put(2,1);
        }
        input.close();
    }
}