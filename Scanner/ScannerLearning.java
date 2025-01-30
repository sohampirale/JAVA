import java.util.Scanner;
public class ScannerLearning{
    public static int getChoice(){
        Scanner makeChoice=new Scanner(System.in);
        int choice;
        System.out.println("1 : Input an Integer");
        System.out.println("2 : Input a word");
        System.out.println("3 : Input a line");
        System.out.println("4 : Input a character");
        System.out.print("Your choice : ");
        choice=makeChoice.nextInt();
        return choice;
    }

    public static void inputNum(){
        int num;
        Scanner numScanner=new Scanner(System.in);
        System.out.print("Enter a number : ");
        num=numScanner.nextInt();
        System.out.println("You entered : "+num);
    }

    public static void inputWord(){
        String word;
        Scanner wordScanner=new Scanner(System.in);
        System.out.print("Enter word : ");
        word=wordScanner.next();
        System.out.println("You entered : "+word);
    }

    public static void inputLine(){
        String line;
        Scanner lineScanner=new Scanner(System.in);
        System.out.print("Enter a line : ");
        line=lineScanner.nextLine();
        System.out.println("You entered line : "+line);
    }

    public static void delimiterExample(){
        String str;
        Scanner lineScanner=new Scanner(System.in);
    }

    public static void inputChar(){
        String ch;
        Scanner charScanner= new Scanner(System.in);
        System.out.println("Enter a character : ");
        ch=charScanner.next();
        if(ch.length()>1){
            System.out.println("You enetred a string not character");
        } else {
            System.out.println("Charcater entered : "+ch.charAt(0));
        }
    }

    public static void main(String[] args){

        // Integer temp;
        // Scanner IntegerScanner= new Scanner(System.in);
        // Character ch='A';
        // System.out.println("ch = "+ch);
        // System.out.println("ch = "+ch);
        // temp=IntegerScanner.nextInt();
        // System.out.println("You entered "+temp);

        System.out.println("Hello JAVA.");
        int choice=1;
        while(choice!=0){
            choice=getChoice();
            if(choice==1){
                inputNum();
            } else if(choice==2){
                inputWord();
            }else if(choice==3){
                inputLine();
            }  else if(choice==4){
                inputChar();
            }
        }
    }
}