//Task-02
import java.util.Scanner;
 public class Task02{
  public static void main(String[]args){
    Scanner sc= new Scanner(System.in);
    System.out.print("Enter String: ");
    String str=sc.nextLine();
    String str2="";
    for(int i=str.length()-1;i>=0;i--){
        str2+=str.charAt(i);
      }
        System.out.print(str2);  
  }
}