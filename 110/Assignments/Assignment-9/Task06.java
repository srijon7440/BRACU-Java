//Task-06
import java.util.Scanner;
 public class Task06{
   public static int power(int a,int b){
     if(b==1) return a;
     else return a*power(a,b-1);
   }
  public static void main(String[]args){
  Scanner sc=new Scanner(System.in);
  int x = power(5,3);
  System.out.println(x);
  }
 }