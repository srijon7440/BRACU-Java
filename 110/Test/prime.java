import java.util.Scanner;
public class prime{
  public static void main(String[] args){
    Scanner sc =new Scanner(System.in);
    System.out.print("Enter Number:");
    int n=sc.nextInt();
    boolean flag=true;
    for(int i=2;i<=Math.sqrt(n);i++){
      if(n%i==0){
        flag=false;
        break;
      }
      }
    if(flag) System.out.print("Prime");
    else System.out.print("not prime");
    }
  }
                                      
                           