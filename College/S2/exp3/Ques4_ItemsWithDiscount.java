package College.S2.exp3;
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

}

class DiscountItems extends Item{
    static HashMap<String,Integer>discount=new HashMap<>();
    static{
        discount.put("sugar",10);
        discount.put("rice", 5);
        discount.put("wheat", 2);
        discount.put("flour", 3);
        discount.put("salt", 15);
    }

    public static void showItems(){
        priceMap.forEach((item,price) -> {
            System.out.println(item+" avalaible for "+price+"Rs/kg at discount of "+discount.get(item));
        });
    }
}


class Cart extends DiscountItems{

    HashMap<String,Double> cart=new HashMap<>();

   

    void order(String item,Double quantity){
        cart.put(item,quantity);
    }

    double cost=0;
    double totalSaved=0;
    static double giveDiscountedPrice(String item){
        return priceMap.get(item)-(priceMap.get(item)*discount.get(item)/100);
    }

    double checkOut(){
        cart.forEach((item,quantity)-> {
            double discountedCost=giveDiscountedPrice(item);
            totalSaved+=(priceMap.get(item)-discountedCost)*quantity;
            cost+=(discountedCost*quantity);
        });
        double temp=cost;
        cost=0;
        cart.clear();
        return temp;
    }

}

public class Ques4_ItemsWithDiscount {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int choice=1;
        String item;
        double quantity;
        DiscountItems.showItems();
        Cart cart=null;
        while(choice!=0){
            System.out.println("1 : Buy another item");
            System.out.println("0 : Checkout");
            System.out.print("Your choice : ");
            choice=input.nextInt();
            if(choice==1){
                System.out.print("Enter name of the item : ");
                item=input.next();
                item=item.toLowerCase();
                if(!Item.priceMap.containsKey(item)){
                    System.out.println("Invalid item name entered");
                } else {
                    System.out.print("Enter quantity you want of : "+item);
                    quantity=input.nextDouble();
                    if(cart==null){
                        cart=new Cart();
                    }
                    cart.order(item, quantity);
                }
            }
        }
        System.out.println("lets checkout");
        double totalBill=cart.checkOut();
        System.out.println("Total bill = "+totalBill);
        System.out.println("You saved Rs : "+cart.totalSaved);
        cart.totalSaved=0;
    }
}
