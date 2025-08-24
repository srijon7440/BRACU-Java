//Task03
public class Cargo{
  //count
  static int count;
  //capacity
  public static double cap=10.0;
  public static double loadCap;
  public  static double capacity(){
    return cap-loadCap;
  }
  //constructor
  public int id;
  public String content;
  public double weight;
  public String loaded="false";
  Cargo(String n,double w){
    content=n;
    weight=w;
    count++;
    id=count;
  }
  //details()
  public void details(){
   System.out.println("Cargo ID: "+id+", Contents: "+content+
                      ",\nWeight: "+weight+", Loaded: "+loaded);
  }
  //load()
  public void load(){
    if(capacity()<weight){
      System.out.println("Cannot load cargo, exceeds weight capacity.");
    }
    else{
      loadCap+=weight;
      loaded="true";
      System.out.println("Cargo "+id+" loaded for transport.");
    }
  }
  //unload()
  public void unload(){
    loaded="false";
    loadCap-=weight;
    System.out.println("Cargo "+id+" unloaded.");
  }
}