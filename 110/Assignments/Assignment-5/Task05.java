//Task-05
import java.util.Scanner;
public class Task05{
  public static void main(String[]args){
    Scanner sc=new Scanner(System.in);
    System.out.print("Enter Number ");
    int n=sc.nextInt();
    int l=1;
    for(int i=n;i>0;i--){
      for(int j=1;j<i;j++){
       System.out.print(" ");
    }  
      for(int k=1;k<=2*l-1;k++){
       System.out.print(k);
    }  l++;
      System.out.println();
   }
  }
 }