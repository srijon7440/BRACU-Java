//Task-05
import java.util.Scanner;
 public class Task05{
  public static void main(String[]args){
    Scanner sc= new Scanner(System.in);
    System.out.print("Enter String: ");
    String str=sc.nextLine();
    String str2="";
    String str3="";
    for(int i=str.length()-1;i>=0;i--){
      if(str.charAt(i)==32){
      
      str3=str3+str2+str.charAt(i);
      str2="";
      
      }
      else str2=str.charAt(i)+str2;{
      }
    } str3=str3+str2;
      System.out.print(str3);
  }
}