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

