import java.util.Scanner;
public class arrays{
 public static void main(String[] args){
  Scanner sc=new Scanner(System.in);
  System.out.println("Enter Array Size:");
  int n=sc.nextInt();
  int[] array =new int[n];
  for(int i=0;i<n;i++){
    System.out.println("Enter array"+(i+1)+" :");
    array[i]=sc.nextInt();
  }int temp=0;
  for(int j=0;j<n/2;j++){
    temp=array[j];
    array[j]=array[n-(j+1)];
    array[n-(j+1)]=temp; 
  }
  for(int j=0;j<n;j++){
    System.out.println(array[j]);
  }
 }
}                   
                                       