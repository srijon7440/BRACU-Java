//Task-01
public class Shelf{
  public int capacity;
  public int totalBooks;
  public void addBooks(int n){
    int b=totalBooks+n;
    if(capacity==0){
      System.out.println("Zero capacity. Cannot add books.");
    }
    else if(capacity>=b){
      totalBooks+=n;
      System.out.println(n+" books added to shelf");
    }
    else{
      System.out.println("Exceeds capacity");
    }
  }
  public void showDetails(){
    System.out.println("Shelf capacity: "+capacity+
                       "\nNumber of books: "+totalBooks);
  }
}