//Task-01
import java.util.Scanner;
 public class Task01{
  public static void main(String[]args){
    Scanner sc= new Scanner(System.in);
    System.out.print("Enter String: ");
    String str=sc.nextLine();
    String str2="";
    for(int i=0;i<str.length();i++){
      if(str.charAt(i)>96 && str.charAt(i)<123){
        str2+=(char)(str.charAt(i)-32);
      }
      else{
        str2+=str.charAt(i);
      }
    }
        System.out.print(str2);  
  }
}