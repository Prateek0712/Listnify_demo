import listnify.album;
import listnify.songs;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        album a1=new album("Gangster","Honey Singh");
        a1.addSong("Desi Kalastar",3.50);
        a1.addSong("Blue Eyes",4.20);
        a1.addSong("Brown rang",5.0);
        a1.addSong("Hookah Bar",2.70);
        a1.addSong("Paani Paani",4.40);
        a1.addSong("Lamborgini",4.80);

        album a2=new album("healers","Arijit Singh");
        a2.addSong("uska hi bana",4.20);
        a2.addSong("kesariya",4.00);
        a2.addSong("Maa",5.50);
        a2.addSong("kafirana",4.550);

        List<songs> playList=new ArrayList<>();
        a1.addToPlayList(playList,1);
        a1.addToPlayList(playList,2);
        a1.addToPlayList(playList,3);
        a1.addToPlayList(playList,4);
        a1.addToPlayList("Paani Paani",playList);
        a1.addToPlayList("Lamborgini",playList);
        a2.addToPlayList(playList,1);
        a2.addToPlayList(playList,2);
        a2.addToPlayList(playList,3);
        a2.addToPlayList(playList,4);


        int currIdx=0;
        System.err.println("Now Playing"+playList.get(currIdx).toString());
        printMenu();

        playPlayList(playList);
    }

    private static void playPlayList(List<songs>myHealers) {
        Scanner sc=new Scanner(System.in);
        int currIdx=0;

        boolean quit=false;
        while(!quit)
        {
            int choise=sc.nextInt();

            switch(choise){
                case 1:
                    currIdx+=1;
                    if(currIdx%myHealers.size()==0) currIdx=0;
                    System.out.println("Now Playing: "+myHealers.get(currIdx).toString());
                    break;
                case 2:
                    currIdx-=1;
                    if(currIdx<0) currIdx=0;
                    System.out.println("Now Plying: "+myHealers.get(currIdx).toString());
                    break;
                case 3:
                    System.out.println("Now Plying: "+myHealers.get(currIdx).toString());
                    break;
                case 4:
                    Collections.shuffle(myHealers);
                    break;
                case 5:
                    printMenu();
                    break;
                case 6:
                    for(songs s:myHealers)
                    {
                        System.err.println(s.toString());
                    }
                    break;
                case 7:
                    System.err.println(myHealers.get(currIdx).toString()+" Deleted Successfully");
                    myHealers.remove(currIdx);
                    break;
                case 8:
                    quit=true;
                    break;
            }
        }
    }


    private static void printMenu() {
        System.out.println("<<<--------------->>>");
        System.out.println("1. Play the next Song");
        System.out.println("2. Play the previous Song");
        System.out.println("3. Repeat this Song");
        System.out.println("4. Shuffle the playList");
        System.out.println("5. Print the menu !!");
        System.out.println("6. Print PlayList");
        System.out.println("7. Delete the current Song");
        System.out.println("8. Exit the System");
        System.out.println("<<<--------------->>>");
        System.out.println("Enter your choice");

    }
}