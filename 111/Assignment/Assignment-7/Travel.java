//Task02
public class Travel{
  //count
  private static int count;
  public static int getCount(){
    return count;
  }
  //time
  private int time = 1;
  public int getTime(){
    return time;
  }
  public void setTime(int t){
    time=t;
  }
  //constructor
  //source
  private String source;
  public String getSource(){
    return source;
  }
  public void setSource(String s){
    source=s;
  }
  //destination
  private String destination;
  public String getDestination(){
    return destination;
  }
  public void setDestination(String d){
    destination=d;
  }
  Travel(String s,String d){
    setSource(s);
    setDestination(d);
  }
  //displayTravelInfo()
  public String displayTravelInfo(){
    return "Source: "+getSource()+
           "\nDestination: "+getDestination()+
           "\nFlight Time: "+getTime()+":00";
  }
}