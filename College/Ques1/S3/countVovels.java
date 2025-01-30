import java.util.HashMap;
import java.util.Scanner;
public class countVovels {
    static HashMap<String,Integer>count=new HashMap<>();
    static int cnt=0;
    static int countVovel(String str){
        str=str.toLowerCase();
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')cnt++;
        }
        return cnt;
    }
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        String str="";
        while(!str.equals(".")){
            System.out.print("Enter a string : ");
            str=input.next();
            System.out.println("no of vovels present = "+countVovel(str));
            cnt=0;
        }
    }
}
