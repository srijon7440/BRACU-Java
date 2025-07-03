import java.util.Scanner;
public class practice{
  public static void main(String[]args){
    Scanner sc=new Scanner(System.in);
    System.out.print("enter number:");
    int n=sc.nextInt();
    boolean safe=false;
    for(int i=2;i<n/2;i++){
      int j=n-i;
      if(prime(i)&&prime(j)){
        safe=true;
        System.out.println(i+"+"+j+"="+n); 
      }
    }
      if(!safe)
      System.out.println("No prime pair found");
  }

   public static boolean prime(int a){
     for(int i=2;i*i<=a;i++){
       if(a%i==0){ return false;
       }
  }
     return true;
}
}