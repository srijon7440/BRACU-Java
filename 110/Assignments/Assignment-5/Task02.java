//Task-02
import java.util.Scanner;
public class Task02{
  public static void main(String[]args){
    Scanner sc=new Scanner(System.in);
    System.out.print("Enter Row: ");
    int r=sc.nextInt();
    System.out.print("Enter Collum: ");
    int c=sc.nextInt();
    for(int i=1;i<=r;i++){
      for(int j=1;j<=c;j++){
       System.out.print(j);
    }  System.out.println();
   }
  }
 }