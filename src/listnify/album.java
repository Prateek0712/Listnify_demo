package listnify;
import java.util.*;
public class album {
    private String albumName;
    private String artistName;
    List<songs>songsList;

    public album(String albumName,String artistName)
    {
        this.albumName=albumName;
        this.artistName=artistName;
        songsList=new ArrayList<>();
    }

    public album(String albumName, String artistName, List<songs> songsList) {
        this.albumName = albumName;
        this.artistName = artistName;
        this.songsList = songsList;
    }

    public boolean findSong(String  title)
    {
        if(songsList.size()==0) return false;
        else {
            for(songs s:songsList)
            {
                if(s.getTitle().equals(title))return true;
            }
        }
        return false;
    }
    public void addSong(String title,double Duration)
    {
        if(!findSong(title))
        {
            songsList.add(new songs(title,Duration));
        }
        else
        {
            System.out.println("Song Already Exist :)");
        }
    }
    public void addToPlayList(List<songs>playlist,int SongNo)
    {
        if(songsList.size()>0 && songsList.size()>=SongNo-1)
        {
            playlist.add(songsList.get(SongNo-1));
            System.out.println("Song added succesfully");
        }
        else
        {
            System.out.println("Song doesn't exist");
        }
    }
    public void addToPlayList(String title,List<songs>playlist)
    {
        for(songs s:songsList) {
            if (s.getTitle().equals(title)) {
                playlist.add(s);
                System.out.println("Song added successfullly");
                break;
            }
        }
        System.out.println("Song ur trying to add does not exist");
    }
}
