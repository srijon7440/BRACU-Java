import java.util.Scanner;
 public class Task04{
  public static void main(String[]args){
    Scanner sc =new Scanner(System.in);
    System.out.print("N :");
    int n=sc.nextInt();
    int[] arr=new int[n];
    int[] arr2=new int[n];
    int cn=0;
    for(int i=0;i<n;i++) arr[i]=sc.nextInt();

    for(int i=0;i<n;i++){
      boolean flag=true;
      for(int j=0;j<i;j++){
        if(arr[i]==arr[j]){
          flag=false;
          break;
        }
      }
      if(flag){
        arr2[cn]=arr[i];
        cn++;
      }
    }
    int[] arr3=new int[cn];
    for(int i=0;i<cn;i++){
      arr3[i]=arr2[i];
      int count =0;
      for(int j=0;j<n;j++){
        if(arr3[i]==arr[j]) count++;
      }
      System.out.println(arr3[i]+" - "+count+" times");
    }
  }
}