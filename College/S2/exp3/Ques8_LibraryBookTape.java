package expClass;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

abstract class Library{
    public static HashMap<String,Integer> allBooks=new HashMap<>();
    public static HashMap<String,Integer> allTapes=new HashMap<>();
}

class Book extends Library{

    public static HashSet<String>issuedBooks=new HashSet<>();
    public static void addBook(String book,int quantity){
        if(!allBooks.containsKey(book)){
            allBooks.put(book, quantity);
            return;
        }
        int currQuantity=allBooks.get(book);
        currQuantity+=quantity;
        allBooks.put(book,currQuantity);
        System.out.println("Book added successfully");
    }

    public static void issueBook(String name){
        int currQuantity=allBooks.get(name);
        currQuantity--;
        issuedBooks.add(name);
        if(currQuantity==0){
            allBooks.remove(name);
        } else {
            allBooks.put(name, currQuantity);
        }
        System.out.println("Book issued successfully!");
    }
}

class Tape extends Library{
    public static HashSet<String>issuedTapes=new HashSet<>();

    public static void addTape(String Tape,int quantity){
        if(!allTapes.containsKey(Tape)){
            allBooks.put(Tape, quantity);
            return;
        }
        int currQuantity=allTapes.getOrDefault(Tape,0);
        currQuantity+=quantity;
        allTapes.put(Tape,currQuantity);
        System.out.println("Tape added successfully");
    }

    public static void issueTape(String name){
        int currQuantity=allTapes.get(name);
        currQuantity--;
        issuedTapes.add(name);
        if(currQuantity==0){
            allBooks.remove(name);
        } else {
            allBooks.put(name, currQuantity);
        }
        System.out.println("Tape issued successfully!");
    }
}

public class Ques8_LibraryBookTape {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int choice=1;
        String name;
        int quantity;
        while(choice!=0){
            System.out.println("1 : Add new Book");
            System.out.println("2 : Add new Tape");
            System.out.println("3 : Issue new Book");
            System.out.println("4 : Issues new Tape");
            choice=input.nextInt();
            input.nextLine();
            if(choice==1){
                System.out.print("Enter the name of the book : ");
                name=input.next();
                System.out.println("Enter quantity : ");
                quantity=input.nextInt();
                Book.addBook(name,quantity);
            } else if(choice==2){
                System.out.print("Enter the name of the Tape : ");
                name=input.next();
                System.out.println("Enter quantity : ");
                quantity=input.nextInt();
                Tape.addTape(name, quantity);
            } else if(choice==3){
                System.out.print("Enter name of the book you want to issue : ");
                name=input.next();
                if(Library.allBooks.containsKey(name)){
                    Book.issueBook(name);
                } else {
                    System.out.println("The requested book is not currently availaible");
                }
            } else if(choice==4){
                System.out.print("Enter name of the tape you want to issue : ");
                name=input.next();
                if(Library.allTapes.containsKey(name)){
                    Tape.issueTape(name);
                } else {
                    System.out.println("The requested tape is not currently availaible");
                }
            }
        }
    }
}
