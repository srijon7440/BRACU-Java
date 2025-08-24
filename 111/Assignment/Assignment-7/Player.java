//Task01
public class Player{
  String name;
  int jerseyNumber;
  String country;
  //constructor
  Player(String n,String c,int j){
    name=n;
    jerseyNumber=j;
    country=c;
    nameList[total++]=name;
  }
  static String nameList[]=new String[11];
  static int total;
  static void info(){
    System.out.print("Total number of players: "+total+
                       "\nPlayers enlisted so far: ");
    for(int i=0;i<total;i++){
      if(i==total-1)
      System.out.println(nameList[i]);
      else System.out.print(nameList[i]+", ");
    }
  }
  String player_detail(){
    return "Player Name: "+name+
           "\nJersey Numbber: "+jerseyNumber+
           "\nCountry :"+country;
  }
}