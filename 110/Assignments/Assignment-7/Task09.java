//Task-09
import java.util.Scanner;
 public class Task09{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    System.out.print("N = ");
    int n=sc.nextInt();
    int[] arr=new int[n];   
    for(int i=0;i<arr.length;i++){
      System.out.print("Enter a number: ");
      arr[i]=sc.nextInt();
    }
    System.out.println("Original Array:");
    for(int i=0;i<arr.length;i++) System.out.print(arr[i]+" ");
    System.out.println();
    for(int i=0;i<arr.length-1;i++){
      int big=i;
    for(int j=i+1;j<arr.length;j++){
      if(arr[big]<arr[j]){
        big=j;
      }
    }
    int temp=arr[i];
    arr[i]=arr[big];
    arr[big]=temp;
    }
    System.out.println("Sorted Array:");
    for(int i=0;i<arr.length;i++) System.out.print(arr[i]+" ");
    
  }
}
