//Task-04
import java.util.Scanner;
 public class Task04{
  public static void main(String[]args){
    Scanner sc= new Scanner(System.in);
    System.out.print("Enter String: ");
    String str=sc.nextLine();
    System.out.print("Enter Char: ");
    String str2=sc.next();
    for(int i=0;i<str.length();i++){
      if(str.charAt(i)==str2.charAt(0)) System.out.println();
      else System.out.print(str.charAt(i));
    } 
  }
}