//Task-07
import java.util.Scanner;
 public class Task07{
   public static void print_element(int a[],int idx){
     if(idx==a.length) return;
     else{
       System.out.println(a[idx]);
       print_element(a,idx+1);
     }
   }
  public static void main(String[]args){
  Scanner sc=new Scanner(System.in);
  int[] arr = {5,6,2,1,8,7};
  int index = 2;
  print_element(arr,index);
  }
 }