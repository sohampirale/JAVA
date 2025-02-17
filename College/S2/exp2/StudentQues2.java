<<<<<<< HEAD
=======
package College.S2.exp2;

>>>>>>> b0a7f37e5360921acdbb5827be9ac31827aea3ba
public class StudentQues2 {
    int rollno;
    String name;
    StudentQues2(){
        this.rollno=2;
        this.name="John";
    }

    public void display(){
        System.out.println("Name : "+this.name);
        System.out.println("Rollno : "+this.rollno);
    }
    public static void main(String[] args) {
        StudentQues2 s1=new StudentQues2();
        s1.display();
    }
}

