//Task-03
import java.util.Scanner;
 public class Task03{
  public static void main(String[]args){
    Scanner sc= new Scanner(System.in);
    System.out.print("Enter String: ");
    String str=sc.nextLine();
    int x=str.length()-1;
    boolean flag=true;
    for(int i=0;i<str.length()/2;i++){
      if(str.charAt(i)==str.charAt(x)){
        x--;
      }
      else{
        flag=false;
        break;
      }
    }
      if(flag==true) System.out.print(flag);
      else System.out.print(flag); 
  }
}