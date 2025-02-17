package College.S2.exp2;
import java.lang.Math;
import java.util.Scanner;

public class TrianglePerimeterAndArea {
    double s1,s2,s3;
    double perimeter,area;
    TrianglePerimeterAndArea(){
        this.s1=3d;
        this.s2=4d;
        this.s3=5d;
        perimeter=s1+s2+s3;
        area=Math.sqrt(perimeter*(perimeter-s1)*(perimeter-s2)*(perimeter-s3));
    }


    TrianglePerimeterAndArea(double s1,double d2,double d3){
        this.s1=s1;
        this.s2=s2;
        this.s3=s3;
        this.perimeter=s1+s2+s3;
        this.area=Math.sqrt(perimeter*(perimeter-s1)*(perimeter-s2)*(perimeter-s3));
    }

    public void showArea(){
        System.out.println("Area of triangle : "+area);
    }  

    public void showPerimeter(){
        System.out.println("Perimeter of triangle : "+perimeter);
    }
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
<<<<<<< HEAD
        double s1,s2,s3;
        System.out.print("Enter s1 : ");
        s1=input.nextInt();
        System.out.print("Enter s2 : ");
        s2=input.nextInt();
        System.out.print("Enter s3 : ");
        s3=input.nextInt();
=======
        double s1=3,s2=4,s3=5;
       
>>>>>>> b0a7f37e5360921acdbb5827be9ac31827aea3ba
        TrianglePerimeterAndArea t=new TrianglePerimeterAndArea(s1,s2,s3);
        t.showArea();
        t.showPerimeter();
    }
}
