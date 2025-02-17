<<<<<<< HEAD
=======
package College.S2.exp2;
>>>>>>> b0a7f37e5360921acdbb5827be9ac31827aea3ba
import java.util.Scanner;

public class StudentQues3 {
    int rollno;
    String name;
    long phoneNo;
    String address;
<<<<<<< HEAD
=======

>>>>>>> b0a7f37e5360921acdbb5827be9ac31827aea3ba
    StudentQues3(int rollno,long phoneNo,String name,String address){
        this.name=name;
        this.rollno=rollno;
        this.address=address;
        this.phoneNo=phoneNo;
    }

    public void display(){
        System.out.println("Name : "+this.name);
        System.out.println("Rollno : "+this.rollno);
        System.out.println("Name : "+this.name);
        System.out.println("Address : "+this.address);
    }

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        StudentQues3 s1=new StudentQues3(2032,8208363244l,"Sam","Sangli");
        StudentQues3 s2=new StudentQues3(2022,1234567891l,"John","Ashta");
        s1.display();
        s2.display();
    }
}

