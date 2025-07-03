//Task-05
public class Task05{
  //(A)
  public static void showDots(int x){
    for(int i=1;i<=x;i++) System.out.print(".");
  }
  //(B)
  public static void show_palindrome(int x){
    for(int i=1;i<=x;i++) System.out.print(i);
    for(int i=x-1;i>0;i--) System.out.print(i);
  }
  //(C)
  public static void showDiamond(int x){
    int d=x;
    for(int i=1;i<=x;i++){
      showDots(x-i);
      show_palindrome(i);
      showDots(x-i);
      System.out.println();
    }
    int n=x-1;
    int d2=1;
    for(int i=1;i<x;i++){
      showDots(d2);
      show_palindrome(n);
      showDots(d2);
      n--;
      d2++;
      System.out.println();      
    }
  }
  public static void main(String[]args){
    //==A==
System.out.println("=============A==============");
    showDots(5);
    System.out.println();
    showDots(3);
    System.out.println();
    //==B==
System.out.println("=============B==============");
    show_palindrome(5);
    System.out.println();
    show_palindrome(3);
    System.out.println();
    //==C==
System.out.println("=============C-1==============");
    showDiamond(5);
System.out.println("=============C-2==============");
    showDiamond(3);
  }
}