import java.util.Scanner;
public class VolumeAndSurface {
    static double radius=-1,height=-1;

    static double giveVolume(){
        return 3.14*radius*radius*height;
    }

    static double giveArea(){
        return (2*3.14*radius*(radius+height));
    }
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        while(radius!=0&&height!=0){
            System.out.print("Enter radius : ");
            radius=input.nextInt();
            System.out.print("Enter height : ");
            height=input.nextInt();
            System.out.println("Volume of the cylinder = "+giveVolume());
            System.out.println("Area of Cylinder is "+giveArea());
        }   
        input.close();
    }
}
