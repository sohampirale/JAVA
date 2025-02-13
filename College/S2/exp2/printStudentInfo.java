package College.S2.exp2;

import java.util.Scanner;
public class printStudentInfo{
    public static void main(String []args){
        Scanner input=new Scanner(System.in);
        int choice=1;
        String name;
        int year;
        String address;
        System.out.print("Enter your name : ");
        name=input.next();
        System.out.print("Enter your year of joining : ");
        year=input.nextInt();
        input.nextLine();
        System.out.print("Enter your address : ");
        address=input.nextLine();
        Student s1=new Student(name,year,address);
        s1.display();
    }
}

class Student{
    String name,address;
    int year;
    
    Student(String name,int year,String address){
        this.name=name;
        this.year=year;
        this.address=address;
    }

    public void display(){
        System.out.println("Name : "+name);
        System.out.println("Year of joining : "+year);
        System.out.println("Address : "+address);
    }
}