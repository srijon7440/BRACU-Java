import java.util.Scanner;
 public class Task01{
  public static void main(String[]args){
    int count=0;
    Scanner sc =new Scanner(System.in);
    System.out.print("Enter Number1 :");
    int n1=sc.nextInt();
    System.out.print("Enter Number2 :");
    int n2=sc.nextInt();
    if(n1>n2){
      int temp=n1;
      n1=n2;
      n2=temp;
    }
    for(int i=n1;i<=n2;i++){
      boolean flag=prime(i);
      if(flag==true) count++;
    }
    System.out.println("There are "+count+" prime numbers between "+ n1+" and "+ n2);
  }
  public static boolean prime(int x){
    int count=0;
    if(x<2) return false;
    for(int i=2;i<x;i++){
      if(x%i==0)
        return false;
    }
    return true;
  }
}