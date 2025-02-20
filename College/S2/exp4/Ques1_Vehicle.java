import java.util.Scanner;

interface vehicle{
    long getIdentificationNumber();

    String getModel();

    String getMake();

    int getSpeed();

    double getFuelLevel();

    void accelerate(int newSpeed);

    void deaccelerate(int newSpeed);

    void refuel(int extra);
}

class Car implements vehicle{
    String model,make;
    long identificationNUmber;
    int speed;
    double fuelTank,fuelLevel;

    Car(String model,String make,long identificationNUmber,double fuelTank,double fuelLevel){
        this.make=make;
        
        this.model=model;
        this.identificationNUmber=identificationNUmber;
        this.fuelLevel=fuelLevel;
        this.fuelTank=fuelTank;
        this.speed=0;
    }

    public long getIdentificationNumber(){
        return identificationNUmber;
    }

    public String getModel(){
        return model;
    }

    public String getMake(){
        return make;
    }

    public int getSpeed(){
        return speed;
    }

    public double getFuelLevel(){
        return fuelLevel;
    }

    public void accelerate(int newSpeed){
        this.speed=newSpeed;
    }

    public void deaccelerate(int newSpeed){
        this.speed=newSpeed;
    }

    public void refuel(int extra){
        fuelLevel=(fuelLevel+extra);
        if(fuelLevel>fuelTank){
            System.out.println("Fuel overflow");
        }
    }
}

class motorcycles implements vehicle{
    String model,make;
    long identificationNUmber;
    int speed;
    double fuelTank,fuelLevel;

    motorcycles(String model,String make,long identificationNUmber,double fuelTank,double fuelLevel){
        this.make=make;
        
        this.model=model;
        this.identificationNUmber=identificationNUmber;
        this.fuelLevel=fuelLevel;
        this.fuelTank=fuelTank;
        this.speed=0;
    }

    public long getIdentificationNumber(){
        return identificationNUmber;
    }

    public String getModel(){
        return model;
    }

    public String getMake(){
        return make;
    }

    public int getSpeed(){
        return speed;
    }

    public double getFuelLevel(){
        return fuelLevel;
    }

    public void accelerate(int newSpeed){
        this.speed=newSpeed;
    }

    public void deaccelerate(int newSpeed){
        this.speed=newSpeed;
    }

    public void refuel(int extra){
        fuelLevel=(fuelLevel+extra);
        if(fuelLevel>fuelTank){
            System.out.println("Fuel overflow");
        }
    }
}


class trucks implements vehicle{
    String model,make;
    long identificationNUmber;
    int speed;
    double fuelTank,fuelLevel;

    trucks(String model,String make,long identificationNUmber,double fuelTank,double fuelLevel){
        this.make=make;
        
        this.model=model;
        this.identificationNUmber=identificationNUmber;
        this.fuelLevel=fuelLevel;
        this.fuelTank=fuelTank;
        this.speed=0;
    }

    public long getIdentificationNumber(){
        return identificationNUmber;
    }

    public String getModel(){
        return model;
    }

    public String getMake(){
        return make;
    }

    public int getSpeed(){
        return speed;
    }

    public double getFuelLevel(){
        return fuelLevel;
    }

    public void accelerate(int newSpeed){
        this.speed=newSpeed;
    }

    public void deaccelerate(int newSpeed){
        this.speed=newSpeed;
    }

    public void refuel(int extra){
        fuelLevel=(fuelLevel+extra);
        if(fuelLevel>fuelTank){
            System.out.println("Fuel overflow");
        }
    }
}
public class Ques1_Vehicle {
    public static void main(String[] args) {
        int choice=1,operation=1;
        Scanner input=new Scanner(System.in);
        Car car=null;
        motorcycles motorcycle=null;
        trucks truck=null;
        while(choice!=0){
            System.out.println("1 : Work with cars");
            System.out.println(" : Work with motorcycle");
            System.out.println("3 : Work with trucks");
            System.out.print("Your choice : ");
            choice=input.nextInt();
    // car(String model,String make,long identificationNUmber,double fuelTank,double fuelLevel){
            if(choice==1){
                if(car==null)car=new Car("Tigor OP+","2024",123456789,20,12.5);
                while(operation!=0){
                    System.out.println("1 : Get Modelname");
                    System.out.println("2 : Get Identification Number");
                    System.out.println("3 : Get speed");
                    System.out.println("4 : Get Fuel Level");
                    System.out.println("5 : Accelerate Car");
                    System.out.println("6 : Deaccelerate Car");
                    System.out.println("7 : Refuel");
                    System.out.print("Your chocie : ");
                    choice=input.nextInt();
                    if(operation==1){
                        
                    }
                }
            }

        }
    }
}
