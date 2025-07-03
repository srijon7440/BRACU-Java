//Task-01
import java.util.Scanner;
 public class Task01{
   //< A >
   public static void oneToN(int x,int n){
     if(n==x){
       System.out.print(n+" ");
     }
     else{
       oneToN(x,n-1);
       System.out.print(n+" ");
     }
   }
   //< B >
   public static void nToOne(int x,int n){
     if(n==x){
       System.out.print(n+" ");
     }
     else{ 
       System.out.print(n+" ");
       nToOne(x,n-1);
     }
   }
   //< C >
   public static int recursiveSum(int x,int n){
     if(n==x) return n;
     else return n+recursiveSum(x,n-1);
   }
  public static void main(String[]args){
    Scanner sc=new Scanner(System.in);
System.out.println("============A==============");   
    System.out.print("N = ");
    int N=sc.nextInt();
    oneToN(1,N);
    System.out.println();   
System.out.println("============B==============");   
    nToOne(1,N);
    System.out.println();   
System.out.println("============C==============");
    System.out.println(recursiveSum(1,N));
  }
 }
    