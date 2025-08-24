//Task01
public class Product{
  public String name="Unknown";
  private double Price;
  private int Quantity;
  Product(){
  }
  public void displayInfo(){
    System.out.println("Product Name: "+name+
                       "\nPrice: $"+Price);
  }
  Product(String name,double price){
    this.name=name;
    setPrice(price);
  }
  public void setQuantity(int n){
    Quantity=n;
  }
  public void setPrice(double n){
    Price=n;
  }
  public int getQuantity(){
    return Quantity;
  }
  public double getPrice(){
    return Price;
  }
  public void displayInfo(boolean s){
    System.out.println("Product Name: "+name+
                       "\nPrice: $"+Price+
                       "\nQuantity: "+Quantity);
  }
}