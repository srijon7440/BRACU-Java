//TASK-03
import java.util.Scanner;
 public class Task03{
  public static void main(String[]args){
    int count=0;
    Scanner sc =new Scanner(System.in);
    System.out.println("Enter the length of the array :");
    int n=sc.nextInt();
    int[] arr=new int[n];
    for(int i=0;i<n;i++) arr[i]=sc.nextInt();
    for(int i=0,j=n-1;i<n/2;i++,j--){
      int temp=arr[i];
      arr[i]=arr[j];
      arr[j]=temp;
    }
    for(int i=0;i<n;i++) System.out.print(arr[i]+" ");
  }
}