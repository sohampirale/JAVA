package College.S2.exp2;

<<<<<<< HEAD
public package College.S2.exp2;

=======
>>>>>>> b0a7f37e5360921acdbb5827be9ac31827aea3ba
public class RectangleQues6 {
    double lentgh,breadth;

    RectangleQues6(double lentgh,double breadth){
        this.lentgh=lentgh;
        this.breadth=breadth;
    }
    
    double giveArea(){
        return lentgh*breadth;
    }

    public static void main(String[] args) {
        RectangleQues6 rec1=new RectangleQues6(4,5);
        RectangleQues6 rec2=new RectangleQues6(5,8);

        System.out.println("Area of the rectangle1 is : "+rec1.giveArea());
        System.out.println("Area of the rectangle2 is : "+rec2.giveArea());

    }
}
 
