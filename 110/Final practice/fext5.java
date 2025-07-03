import java.util.Scanner;
public class fext5{
  public static boolean ihn(int x){
    int y=x/10;
    int z=x%10;
    int sum=(y*y)+(z*z);
    while(sum>0){
      if(sum==1) return true;
      else if(sum==4) return false;
      else{
        int a=sum/10;
        int b=sum%10;
        sum=(a*a)+(b*b);
        if(sum==100) return true;
      }
    }
    return false;
  }
  public static void main(String[]args){
    System.out.print("Enter Number: ");
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    boolean check = ihn(n);
    System.out.println(check);
  }
}