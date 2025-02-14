package College.S2.exp2;

import java.util.Scanner;

public class AreaOfRectangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int choice = 1;
        double length, width;
        while (choice != 0) {
            System.out.print("Enter length of the rectangle: ");
            length = input.nextDouble();
            System.out.print("Enter width of the rectangle: ");
            width = input.nextDouble();
            Area.setDim(length, width);
            System.out.println("Area of the rectangle is: " + Area.getArea());
            System.out.print("Enter 0 to stop: ");
            choice = input.nextInt();
        }
    }
}

class Area {
    public static double length;
    public static double width;

    public static double getArea() {
        return length * width;
    }

    public static void setDim(double length, double width) {
        Area.length = length;
        Area.width = width;
    }
}