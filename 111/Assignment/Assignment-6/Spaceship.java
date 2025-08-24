//Task04
public class Spaceship{
  public String name;
  public int capacity;
  public int cargoWeight;
  public String Cargos="";
  Spaceship(String name,int capacity){
    this.name=name;
    this.capacity=capacity;
  }
  //loadCargo
  public void loadCargo(Cargo c){
    int W=cargoWeight+c.getWeight();
    if(W<=capacity){
    Cargos+=c.getName()+" ";
    cargoWeight+=c.getWeight();
    }
    else System.out.println("Warning: Unable to load "+c.getName()+" inside "+name+". Exceeds capacity by "+(W-capacity)+".");
  }
  //displayDetails
  public void displayDetails(){
    System.out.println("Spaceship Name: "+name+
                       "\nCapacity: "+capacity+
                       "\nCurrent Cargo Weight: "+cargoWeight+
                       "\nCargo: "+Cargos);
  }
}
class Cargo{
  private String name;
  private int weight;
  Cargo(String name,int weight){
    setName(name);
    setWeight(weight);
  }
  public void setName(String s){
    name=s;
  }
  public void setWeight(int n){
    weight=n;
  }
  public String getName(){
    return name;
  }
  public int getWeight(){
    return weight;
  }
}