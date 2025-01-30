import java.util.Scanner;

class ConvertTime{
    static int timeSec=-1,timeMin=-1,timeHours=-1;

    static int giveMins(){
        int ret=timeSec/60;
        timeSec=timeSec%60;
        return ret;
    }

    static int giveHours(){
        int ret=timeMin/60;
        timeMin=timeMin%60;
        return ret;
    }
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        while(timeSec!=0){
            System.out.print("Enter time in sec : ");
            timeSec=input.nextInt();
            timeMin=giveMins();
            timeHours=giveHours();

            System.out.println("hours : "+timeHours);
            System.out.println("minutes : "+timeMin);
            System.out.println("seconds : "+timeSec);
        }
        input.close();
    }
}