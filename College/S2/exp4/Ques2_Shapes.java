import java.util.Scanner;
interface shape{
    void showPerimeter();

    void showArea();
}


class rectangle implements shape{
    double length;
    double breadth;
    rectangle(double lentgh,double breadth){
        this.length=lentgh;
        this.breadth=breadth;
    }
    public void showPerimeter(){
        System.out.println("Perimeter of rectangle : "+(2*(length+breadth)));
    }

    public void showArea(){
        System.out.println("Area of rectangle is : "+(length*breadth));
    }
}


class circle implements shape{
    double radius;
    circle(double radius){
        this.radius=radius;
    }
    public void showPerimeter(){
        System.out.println("Perimeter of Circle : "+(2*3.14*radius));
    }

    public void showArea(){
        System.out.println("Area of Circle is : "+(3.14*radius*radius));
    }
}
public class Ques2_Shapes {
    public static void main(String[] args) {
        int choice=1;
        double length,breadth;
        double radius;
        Scanner input=new Scanner(System.in);
        rectangle rec=null;
        circle cir=null;
        while(choice!=0){
            System.out.println("1 :Perimeter of rectangle ");
            System.out.println("2 : Perimeter of Circle ");
            System.out.println("3 : Area of rectangle ");
            System.out.println("4 : Area of Circle ");
            System.out.print("Your chocie : ");
            choice=input.nextInt();
            if(choice==1){
                if(rec==null){
                    System.out.print("Enter length : ");
                    length=input.nextInt();
                    System.out.print("Enter breadth : ");
                    breadth=input.nextInt();
                    rec=new rectangle(length, breadth);
                } 
                rec.showPerimeter();
            } else if(choice==2){
                if(cir==null){
                    System.out.print("Enter radius : ");
                    radius=input.nextInt();
                    cir=new circle(radius);
                } 
                cir.showPerimeter();
            } else if(choice==3){
                if(rec==null){
                    System.out.print("Enter length : ");
                    length=input.nextInt();
                    System.out.print("Enter breadth : ");
                    breadth=input.nextInt();
                    rec=new rectangle(length, breadth);
                } 
                rec.showArea();
            } else if(choice==4){
                if(cir==null){
                    System.out.print("Enter radius : ");
                    radius=input.nextInt();
                    cir=new circle(radius);
                } 
                cir.showArea();
            }
        }
    }
}
