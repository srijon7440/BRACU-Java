//Task-08
import java.util.Scanner;
 public class Task08{
   public static int fibonacci(int a){
     if(a<=1) return a;
     else return fibonacci(a-1)+fibonacci(a-2);
   }
  public static void main(String[]args){
  Scanner sc=new Scanner(System.in);
  System.out.println(fibonacci(9));
  }
 }