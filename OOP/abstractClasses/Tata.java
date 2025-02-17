public class Tata extends Car{

    Tata(String modelName,double price){
        this.modelName=modelName;
        this.price=price;
    }

    void printModelName(){
        System.out.println("Model Name : "+modelName);
    }

    void printPrice(){
        System.out.println("Price : "+price);
    }

    protected void greet(){
        System.out.println("Welcome");
    }
    public static void main(String[] args) {
        Tata obj=new Tata("Tigor",1000000);
        obj.greet();
        obj.printModelName();
        obj.printPrice();
    }

}