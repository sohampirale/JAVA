package College.S2.exp3;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

abstract class Person{
    String name,address;
    int phoneNo;
    Person(String name,String address,int phoneNo){
        this.name=name;
        this.address=address;
        this.phoneNo=phoneNo;
    }

}

abstract class Employee extends Person{
    int employeeId;
    Employee(String name,String address,int phoneNo,int id){
        super(name,address,phoneNo);
        this.employeeId=id;
    }

}

class Manager extends Employee implements Comparable<Manager>{

    private static Manager managerWithHighestSalary;
    double salary;
    static ArrayList<Manager> managers=new ArrayList<>();

    Manager(String name,String address,int phoneNo,int id,double salary){
        super(name, address, phoneNo, id);
        this.salary=salary;
    }

    static Manager calculateHighestSalManager(){
        managerWithHighestSalary=managers.get(0);
        for(int i=1;i<managers.size();i++){
            if(managers.get(i).salary>managerWithHighestSalary.salary){
                managerWithHighestSalary=managers.get(i);
            }
        }
        return managerWithHighestSalary;
    }

    @Override
    public String toString(){
        String ans = "Name : " + this.name + 
                     ", Salary : " + String.format("%.0f", this.salary) + 
                     ", Id : " + this.employeeId + ".";
        return ans;
    }
    

    @Override
    public int compareTo(Manager other){
        double diff=other.salary-this.salary;
        return (int)diff;
    }

}

public class Ques3_ManagerHIghestSalary {
    public static void main(String[] args) {
        
        Scanner input=new Scanner(System.in);
        String name,address;
        int Id,phoneNo;
        double salary;
        

        ArrayList<Manager> managers=new ArrayList<>();
        int choice=1;
        while(choice!=0){
            System.out.println("1 : Create new manager");
            System.out.println("0 : Stop creating managers");
            choice=input.nextInt();
            if(choice==1){
                input.nextLine();
                System.out.print("Enter name : ");
                name=input.nextLine();
                System.out.println("Enter Address : ");
                address=input.nextLine();
                System.out.print("Enter phone no : ");
                phoneNo=input.nextInt();
                System.out.print("Enter ID : ");
                Id=input.nextInt();
                System.out.print("Enter salaray : ");
                salary=input.nextDouble();
                Manager.managers.add(new Manager(name,address,phoneNo,Id,salary));
                System.out.println("Total "+Manager.managers.size()+"'s are present now");
            } 
        }

        System.out.println("Total managers created till now are : "+Manager.managers.size());
        Manager managerWithHighestSalary=Manager.calculateHighestSalManager();
        System.out.println("Lets print the manager with highest salary");
        System.out.println(managerWithHighestSalary);

        Collections.sort(Manager.managers);
        System.out.println("Manager with highest salary is : "+Manager.managers.get(0));
        // System.out.println(Manager.managers);
    }
}