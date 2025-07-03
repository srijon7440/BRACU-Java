import java.util.Scanner;
public class arrayTEST{
  public static void main(String[]args){
    Scanner sc=new Scanner(System.in);
    System.out.print("Enter Array-Size:");
    int n=sc.nextInt(); 
    int max=Integer.MIN_VALUE;
    int min=Integer.MAX_VALUE;
    int[] ar=new int[n];
    for(int i=0;i<n;i++){
    ar[i]=sc.nextInt();
    if(ar[i]>max) max=ar[i];
    if(ar[i]<min) min=ar[i];
    }
    int smax=Integer.MIN_VALUE;
    int smin=Integer.MAX_VALUE;
    for(int j=0;j<n;j++){
    if(ar[j]>smax && ar[j]!=max) smax=ar[j];
    if(ar[j]<smin && ar[j]!=min) smin=ar[j];
    }
    System.out.println("Max= "+max);
    System.out.println("Min= "+min);
    System.out.println("Second Max= "+smax);
    System.out.println("Second Min= "+smin);
  }
}
                          