//Task-06
import java.util.Scanner;
 public class Task06{
  public static void main(String[]args){
    Scanner sc=new Scanner(System.in);
    System.out.print("Enter the length of the array:");
    int n=sc.nextInt();
    double[] arr=new double[n];
    for(int i=0;i<arr.length;i++){
     System.out.print("Enter a number:");
     arr[i]=sc.nextDouble();
    }
    double sum=arr[0];
    double max=arr[0];
    double min=arr[0];
    int indexMax=0;
    int indexMin=0;
    for(int i=1;i<arr.length;i++){
      if(max<arr[i]){
        max=arr[i];
        indexMax=i;
      }
      if(min>arr[i]){
        min=arr[i];
        indexMin=i;
      }
      sum=sum+arr[i];
    }
    System.out.println("Maximum element "+max+"found at index "+indexMax);
    System.out.println("Minimum element "+min+"found at index "+indexMin);
    System.out.println("Summation: "+sum+"\nAverage: "+(sum/n));                    
  }
}