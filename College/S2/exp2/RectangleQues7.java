package College.S2.exp2;
<<<<<<< HEAD

=======
import java.util.Scanner;
>>>>>>> b0a7f37e5360921acdbb5827be9ac31827aea3ba
public class RectangleQues7 {
    double lentgh,breadth;
    RectangleQues7(double lentgh,double breadth){
        this.lentgh=lentgh;
        this.breadth=breadth;
    }
    
    double giveArea(){
        return lentgh*breadth;
    }

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        double length,breadth;
        System.out.print("Enter length : ");
        length=input.nextInt();
        System.out.print("Enter breadth : ");
        breadth=input.nextInt();
        RectangleQues7 rec=new RectangleQues7(length,breadth);
        System.out.println("Area of the rectangle is : "+rec.giveArea());
    }
}
