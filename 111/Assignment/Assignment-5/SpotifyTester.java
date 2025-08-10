public class SpotifyTester {
 public static void main(String[] args) {
   Song s1 = new Song("Song-A", "Artist-A", 3);
   System.out.println("1===========");
   s1.songInfo();
// More lines will be added in this Tester class
   System.out.println("2===========");
// Continuation from Task 1
   Playlist p1 = new Playlist("First Playlist");
   System.out.println("3===========");
// Continuation from Task 2
   p1.info();
   System.out.println("4===========");
   p1.start = s1;
   p1.info();
   System.out.println("5===========");
   Song s2 = new Song("Song-B", "Artist-B", 4);
   Song s3 = new Song("Song-C", "Artist-C", 2);
   p1.start.next = s2;
   p1.start.next.next = s3;
   p1.info();
   System.out.println("6===========");
   // Continuation from Task 3
   Song s4 = new Song("Song-D","Artist-D",3);
   Song s5 = new Song("Song-E","Artist-E",4);
   p1.addSong(s4);
   p1.addSong(s5);
   System.out.println("7===========");
   p1.info();
   System.out.println("8===========");
   Song s6 = new Song("Song-F", "Artist-F", 2);
    Song s7 = new Song("Song-G", "Artist-G", 2);
    Song s8 = new Song("Song-H", "Artist-H", 4);
    Song s9 = new Song("Song-I", "Artist-I", 3);
    p1.addSong(s6, false);
    p1.addSong(s7, true);
    p1.addSong(s8, false);
    p1.addSong(s9, false);
    System.out.println("9===========");
    p1.info();
    System.out.println("10==========");
    //    Continuation from Task 5   
   p1.playSong("Song-F");
   p1.playSong("Song-Z");
   p1.playSong("Song-B");
   System.out.println("11==========");
   // Continuation from Task 6
   p1.playSong(0);
   p1.playSong(4);
   p1.playSong(10);
   System.out.println("12==========");
   p1.deleteSong();
   p1.deleteSong();
   p1.deleteSong(false);
   p1.deleteSong(true);
   System.out.println("13==========");
   p1.info();
   System.out.println("14==========");
   //    Continuation from Task 8   
   System.out.println(p1.name +" has "+p1.totalSong() +" songs");
   System.out.println("15==========");
   // Continuation from Task 9
   Song ns1 = new Song("Song-Z", "Artist-Z", 3);
   Song ns2 = new Song("Song-Y", "Artist-Y", 4);
   Song ns3 = new Song("Song-X", "Artist-X", 2);
   System.out.println("16==========");
   Playlist p2 = new Playlist("Second Playlist");
   p2.addSong(ns1);
   p2.addSong(ns2);
   p2.addSong(ns3);
   System.out.println("17==========");
   p1.info();
   System.out.println("18==========");
   p2.info();
   System.out.println("19==========");
   p1.merge(p2);
   System.out.println("20==========");
   p1.info();
   System.out.println("21==========");

 }
}
