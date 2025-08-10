//Task-04
public class MoneyTracker{
  public double balance;
  public double ld;
  public double ls;
  public String name;
  public void createTracker(String s){
    name=s;
    balance=1.0;
  }
  public String info(){
    return ("Name: "+name+"\nCurrent Balance: "+balance);
  }
  public void expense(){
    System.out.println("You’re broke!");
  }
  public void expense(int ex){
    if(balance>=ex){
    balance-=ex;
    ls=ex;
    if(balance==0) expense();
    else
    System.out.println("Balance Updated.");
    }
    else if(balance<ex){
      System.out.println("Not enough balance.");
    }
  }
  public void income(int b){
  System.out.println("Balance Updated!");
  balance+=b;
  ld=b;
  }
  public void showHistory(){
    System.out.println("Last added: "+ld+
                       "\nLast spent: "+ls);
  }
}