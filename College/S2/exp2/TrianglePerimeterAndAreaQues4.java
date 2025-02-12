package College.S2.exp2;

public class TrianglePerimeterAndAreaQues4 {
    double s1,s2,s3;
    double perimeter,area;
    TrianglePerimeterAndAreaQues4(){

        this.s1=3;
        this.s2=4;
        this.s3=5;
        perimeter=s1+s2+s3;
        area=Math.sqrt(perimeter*(perimeter-s1)*(perimeter-s2)*(perimeter-s3));
    }

    public void showArea(){
        System.out.println("Area = "+area);
    }

    public void showPerimeter(){
        System.out.println("perimeter = "+perimeter);
    }
    public static void main(String[] args) {
        TrianglePerimeterAndAreaQues4 t1=new TrianglePerimeterAndAreaQues4();
        t1.showArea();
        t1.showPerimeter();
    }
}
