//Task-04
import java.util.Scanner;
 public class Task04{
   public static String reverse_string(String s, int n){
     if(n==s.length()-1) return ""+s.charAt(n);
     else return reverse_string(s,n+1)+s.charAt(n);
   }
  public static void main(String[]args){
  System.out.println(reverse_string("Hello", 0));
  System.out.println(reverse_string("swan", 0));
  }
 }
    