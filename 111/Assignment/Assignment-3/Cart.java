//Task-02
public class Cart{
  public int idx;
  public int c;
  public double discount;
  public double totalPrice;
  public String[] item=new String[3];
  public double[] price=new double[3];
  public void create_cart(int n){
   c=n;
  }
  public void addItem(String s,double p){
    if(idx<3){
    item[idx]=s;
    System.out.println(item[idx]+" added to cart "+c+"."+
                       "\nYou have "+(idx+1)+" item(s) in your cart now.");
    price[idx]=p;
    idx++;
    }
    else
      System.out.println("You already have "+(idx)+" item(s) on your cart.");
  }
  public void addItem(double p,String s){
    if(idx<3){
    item[idx]=s;
    System.out.println(item[idx]+" added to cart "+c+"."+
                       "\nYou have "+(idx+1)+" item(s) in your cart now.");  
    price[idx]=p;
    idx++;
    }
    else
      System.out.println("You already have "+(idx)+" item(s) on your cart.");
  }
  public void giveDiscount(int d){
    discount=d;
    totalPrice=totalPrice-((totalPrice/100)*d);
  }
  public void cartDetails(){
    System.out.println("Your cart(c"+c+"): ");
    for(int i=0;i<idx;i++){
      System.out.println(item[i]+" - "+price[i]);
      if(discount==0.0)
      totalPrice+=price[i];
    }
    System.out.println("Discount Applied: "+discount+"%"+
                       "\nTotal price: "+totalPrice);
  }
}