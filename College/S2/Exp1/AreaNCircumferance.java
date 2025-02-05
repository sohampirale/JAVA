package College.S2.Exp1;
import java.util.Scanner;

class AreaNCircumferance{
    static double findArea(int r){
        return (3.14*r*r);
    }

    static double findCircumferance(int r){
        return 2*3.14*r;
    }
    public static void main(String[] args) {
        System.out.println("hello");

        int r=1;
        Scanner input=new Scanner(System.in);
        while(r!=0){
            System.out.print("Enter radius : ");
            r=input.nextInt();
            System.out.println("Area of circle is "+findArea(r));
            System.out.println("Circumferance of circle is "+findCircumferance(r));
        }
        input.close();
    }
    
    static{
        System.out.println("hii");
    }
}