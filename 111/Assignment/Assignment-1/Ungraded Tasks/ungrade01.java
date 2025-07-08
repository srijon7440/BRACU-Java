import java.util.Scanner;
 public class ungrade01{
  public static void main(String[] args){
    Scanner sc=new Scanner (System.in);
    System.out.print("N");
    int n=sc.nextInt();
    int[] arr=new int[n];
    int[] arr2=new int[n];
    int c=0;
    for(int i=0;i<n;i++){
      System.out.print("Enter Element "+(i+1)+":");
      arr[i]=sc.nextInt();
    }
    System.out.print("Remove Element= ");
    int r=sc.nextInt();
    for(int i=0;i<n;i++){
      if(arr[i]!=100){
        arr2[c]=arr[i];
          c++;
      }
      else continue;
    }
    if(n==c) System.out.println("Element not found");
    else{
      for(int i=0;i<c;i++) System.out.print(arr2[i]+" ");
    }
  }
}