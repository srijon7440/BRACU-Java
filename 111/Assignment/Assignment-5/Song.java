//Song
public class Song{
  public Song next;
  public String title;
  public String artist;
  public int length;
  //Constrator Song
  public Song(String title,String artist,int length){
    this.title=title;
    this.artist=artist;
    this.length=length;
  }
  //song info method
  public void songInfo(){
    System.out.println("Title: "+title+", "+
                       "Artist: "+artist+
                       "\nLength: "+length+" minutes");
  }
}
//Playlist
class Playlist{
  public int songIndex;
  public Song start;
  public String name;
  public Playlist(String playlistName){
    this.name=playlistName;
    System.out.println(playlistName+" created."); 
  }
  //playlists info method
  public void info(){
    System.out.println(name+" has the following\nsongs:");
    if(start==null) System.out.println("No songs "+name+".");
    else{
      songIndex=1;
      Song temp=start;
      while(temp!=null){
      System.out.println("Song-"+songIndex);
      temp.songInfo();
      temp=temp.next;
      songIndex++;
      }
    }
  }
   //addsong method 1
   public void addSong(Song song){
      Song temp=start;
      System.out.println(song.title+" added to "+name+".");
      if(temp!=null){ 
       while(temp.next!=null){
       temp=temp.next;
   }
       temp.next=song;
   }
      else{
        start=song;
      }
  }
   //addsong method 2
   public void addSong(Song song, boolean flag){
     if(!flag) addSong(song);
     else{
       song.next=start;
       start=song;
     }
  }
   //Playsong method 1
   public void playSong(String song){
     Song temp=start;
     boolean found =false;
     while(temp.next!=null){
       if(temp.title.equals(song)){
         found=true;
         break;
       }
       else temp=temp.next;
     }
       if(found==true)
         System.out.println("Playing "+song+" by "+temp.artist+".");
       else
         System.out.println(song+" not found in "+name+".");
     }
   //Playsong method 2
   public void playSong(int index){
     Song temp=start;
     int SongNumber=0;
     boolean found =false;
     while(temp.next!=null){
       if(SongNumber==index){
         found=true;
         break;
       }
       else{
         SongNumber++;
         temp=temp.next;
       }
     }
     if(found) System.out.println("Playing "+temp.title+" by "+temp.artist+".");
     else System.out.println("Song at Index "+index+" not found in "+name+".");
   }
   //deleteSong method 1
   public void deleteSong(){
     Song temp=start;
     while(true){
       if(temp.next.next==null){
         System.out.println(temp.next.title+" deleted from "+name);
         temp.next=null;
         break;
       }
       else temp=temp.next;
     }
   }
   //deleteSong method 2
   public void deleteSong(boolean flag){
     if(!flag){
       deleteSong();
     }
     else{
      start=start.next;
      System.out.println("First Song Deleted!");
     }
   }
   //totalSong method
   public int totalSong(){
     Song temp=start;
     int total=0;
     while(temp!=null){
       total++;
       temp=temp.next;
     }
     return total;
   }
   //merge playlist method
   public void merge(Playlist playlist){
     int songs=playlist.totalSong();
     Song temp=start;
     while(temp.next!=null){
       temp=temp.next;
     }
     temp.next=playlist.start;
     
     System.out.println("Merge Completed!");
   }
}