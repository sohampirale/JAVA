import java.util.Scanner;
interface multimedia{
    void play(String next);
    void pause();
    void stop();
    String seek();
}

class audio{
    String currAudio="";
    Boolean playing;
    public void play(String next){
        this.currAudio=next;
        System.out.println("Playing now "+next);
        playing=true;
    }

    public void pause(){
        playing=false;
        System.out.println(this.currAudio+" paused");
    }

    public  void stop(){
        playing=false;
        System.out.println("AUdio stopped");
    }
}

class video{
    String currvideo="";
    Boolean playing;
    public void play(String next){
        this.currvideo=next;
        System.out.println("Playing now "+next);
        playing=true;
    }

    public void pause(){
        playing=false;
        System.out.println(this.currvideo+" paused");
    }

    public void stop(){
        playing=false;
        System.out.println("video stopped");
    }
}

public class Ques3_multimedia{
    public static void main(String[] args) {
        int choice=1;
        Scanner input=new Scanner(System.in);
        String next;
        video vplayer=new video();
        audio aplayer=new audio();
        while(choice!=0){
            System.out.println("1 : PLay an audio");
            System.out.println("2 : Pause the audio");
            System.out.println("3 : Stop the audio");
            System.out.println("4 : Play the video");
            System.out.println("5 : Pause the video");
            System.out.println("6 : stop the video");
            if(choice==1){
                System.out.print("ENter next audio to play : ");
                next=input.next();
                aplayer.play(next);
            } else if(choice==4){
                System.out.print("ENter next video to play : ");
                next=input.next();
                vplayer.play(next);
            } else if(choice==2){
                aplayer.pause();
            } else if(choice==3){
                aplayer.stop();
            } else if(choice==5){
                vplayer.pause();
            } else if(choice==6){
                vplayer.stop();
            }
        }
    }
}