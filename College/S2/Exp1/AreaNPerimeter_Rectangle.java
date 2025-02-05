package College.S2.Exp1;
import java.util.Scanner;

class AreaNCircumferance{
    static double findArea(float l,float b){
        return l*b;
    }

    static double findPerimeter(float l,float b){
        return (l+b)*2;
    }

    public static void main(String[] args) {
        float l=1,b=1;;
        Scanner input=new Scanner(System.in);
        while(l!=0&&b!=0){
            System.out.print("Enter length : ");
            l=input.nextInt();
            System.out.print("Enter breadth : ");
            b=input.nextInt();
            System.out.println("Area of rectangle is "+findArea(l,b));
            System.out.println("Perimeter of rectangle is "+findPerimeter(l,b));
        }
        input.close();
    }
}