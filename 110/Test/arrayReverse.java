import java.util.Scanner;
public class arrayReverse{
  public static void main(String[]args){
    int[] arr={1,2,3,4,5,6};
    int temp=0;
    int j=5;
    for(int i=0;i<6/2;i++){
      for(;j>=0;j--){
       temp=arr[i];
       arr[i]=arr[j];
       arr[j]=temp;
       break;
        }
      j--;
      }
    
  System.out.print("Reversed Array: {");
  for(int k=0;k<6;k++){
    if(k==5) System.out.println(arr[k]+"}");
    else     System.out.print(arr[k]+",");
  }
  int n=arr.length;
  System.out.print(n);
  }
}
