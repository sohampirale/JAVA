import java.util.Scanner;
public class reverseString {

    static String reverseStr(String str){
        // String str2=new String(str.length(),'');
        // String str2=new String();
        StringBuilder str2=new StringBuilder("");
        for(int i=str.length()-1;i>=0;i--){
            str2.append(str.charAt(i));
        }
        return str2.toString();
    }
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        String str1="",str2;
        while(!str1.equals(".")){
            System.out.print("Enter str 1 :");
            str1=input.next();
            str2=reverseStr(str1);
            System.out.println("reveresed string is : "+str2);
            if(str1.equals(str2)){
                System.out.println(str1+" is palindrome");
            } else {
                System.out.println(str1+" is not palindrome");
            }
        }
        input.close();
    }
}
