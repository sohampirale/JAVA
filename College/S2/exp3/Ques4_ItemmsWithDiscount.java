package expClass;
import java.util.HashMap;
import java.util.Scanner;
abstract class Itemm{
    static HashMap<String,Integer> priceMap=new HashMap<>();
    static{
        priceMap.put("sugar",50);
        priceMap.put("rice", 80);
        priceMap.put("wheat", 45);
        priceMap.put("flour", 60);
        priceMap.put("salt", 20);
    }

}

class DiscountItemms extends Itemm{
    static HashMap<String,Integer>discount=new HashMap<>();
    static{
        discount.put("sugar",10);
        discount.put("rice", 5);
        discount.put("wheat", 2);
        discount.put("flour", 3);
        discount.put("salt", 15);
    }

    public static void showItemms(){
        priceMap.forEach((itemm,price) -> {
            System.out.println(itemm+" avalaible for "+price+"Rs/kg at discount of "+discount.get(itemm));
        });
    }
}


class Cart extends DiscountItemms{

    HashMap<String,Double> cart=new HashMap<>();

   

    void order(String itemm,Double quantity){
        cart.put(itemm,quantity);
    }

    double cost=0;
    double totalSaved=0;
    static double giveDiscountedPrice(String itemm){
        return priceMap.get(itemm)-(priceMap.get(itemm)*discount.get(itemm)/100);
    }

    double checkOut(){
        cart.forEach((itemm,quantity)-> {
            double discountedCost=giveDiscountedPrice(itemm);
            totalSaved+=(priceMap.get(itemm)-discountedCost)*quantity;
            cost+=(discountedCost*quantity);
        });
        double temp=cost;
        cost=0;
        cart.clear();
        return temp;
    }

}

public class Ques4_ItemmsWithDiscount {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int choice=1;
        String itemm;
        double quantity;
        DiscountItemms.showItemms();
        Cart cart=null;
        while(choice!=0){
            System.out.println("1 : Buy another itemm");
            System.out.println("0 : Checkout");
            System.out.print("Your choice : ");
            choice=input.nextInt();
            if(choice==1){
                System.out.print("Enter name of the itemm : ");
                itemm=input.next();
                itemm=itemm.toLowerCase();
                if(!Itemm.priceMap.containsKey(itemm)){
                    System.out.println("Invalid itemm name entered");
                } else {
                    System.out.print("Enter quantity you want of : "+itemm);
                    quantity=input.nextDouble();
                    if(cart==null){
                        cart=new Cart();
                    }
                    cart.order(itemm, quantity);
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
