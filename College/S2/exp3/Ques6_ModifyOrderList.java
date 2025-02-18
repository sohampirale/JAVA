package expClass;
import java.util.HashMap;
import java.util.Scanner;

abstract class Item{
    static HashMap<String,Integer> priceMap=new HashMap<>();
    static{
        priceMap.put("sugar",50);
        priceMap.put("rice", 80);
        priceMap.put("wheat", 45);
        priceMap.put("flour", 60);
        priceMap.put("salt", 20);
    }
    
    public static void showItems(){
        priceMap.forEach((item,price) -> {
            System.out.println(item+" avalaible for "+price+"Rs/kg");
        });
    }
}

class Cart extends Item{

    HashMap<String,Double> cart=new HashMap<>();
    double cost=0;

    void order(String item,Double quantity){
        double currQuantity=cart.getOrDefault(item,0.0);
        currQuantity+=quantity;
        cart.put(item,currQuantity);
    }

    void remove(String item,double quantity){
        Double newQuantity=cart.get(item);
        if(quantity==newQuantity){
            cart.remove(item);
        } else {
            newQuantity-=quantity;
            cart.put(item,newQuantity);
        }
    }

    double checkOut(){
        cart.forEach((item,quantity)-> {
            cost+=(priceMap.get(item)*quantity);
        });

        double temp=cost;
        cost=0;
        cart.clear();
        return temp;
    }

    public void showMyCart(){
        System.out.println("Your cart");
        cart.forEach((item,quantity)->{
            System.out.println(item+" : "+quantity);
        });
    }
}

public class Ques6_ModifyOrderList {
    public static void main(String[] args) {
        System.out.println("hello");
        Scanner input=new Scanner(System.in);
        int choice=1;
        String item;
        double quantity;
        Cart cart=null;
        Item.showItems();
        while(choice!=0){
            System.out.println("1 : Buy/Increase item in the cart");
            System.out.println("2 : Remove one item from the cart");
            System.out.println("3 : See your cart");
            System.out.println("0 : Checkout");
            System.out.print("Your choice : ");
            choice=input.nextInt();
            input.nextLine();
            if(choice==1){
                System.out.print("Enter name of the item : ");
                item=input.next();
                item=item.toLowerCase();
                if(!Item.priceMap.containsKey(item)){
                    System.out.println("Invalid item name entered");
                } else {
                    System.out.print("Enter quantity you want of : "+item+" : ");
                    quantity=input.nextDouble();
                    input.nextLine();
                    if(cart==null){
                        cart=new Cart();
                    }
                    cart.order(item, quantity);
                }
            } else if(choice==2){
                if(cart==null){
                    cart=new Cart();
                    System.out.println("New cart created for you");
                    continue;
                }
                System.out.print("Enter name of the item : ");
                item=input.next();
                item=item.toLowerCase();
                if(!cart.cart.containsKey(item)){
                    System.out.println("You haven't added : "+item+" to your cart");
                    continue;
                } else {
                    System.out.println("You have ecurrently ordered "+cart.cart.get(item)+" kg "+item);
                    System.out.print("How many kg you want to reduce : ");
                    quantity=input.nextDouble();
                    input.nextLine();
                    if(quantity>cart.cart.get(item)){
                        System.out.println("You cant rmeove more items that you currently ordered");
                        continue;
                    } else {
                        cart.remove(item, quantity);
                    }                   
                }
            } else if(choice==3){
                if(cart==null){
                    System.out.println("Just created your cart");
                    continue;
                }
                cart.showMyCart();
            }
        }
        System.out.println("lets checkout");
        double totalBill=cart.checkOut();
        System.out.println("Total bill = "+totalBill);
    }
}