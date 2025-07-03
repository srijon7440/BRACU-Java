import java.util.Scanner;
public class Continue{
  public static void main(String[] args){
    Scanner sc =new Scanner(System.in);
    System.out.print("Enter Number:");
    int n=sc.nextInt();
    boolean flag=true;
    for(int i=2;i*i<=n;i++){
      if(n%i==0){
        flag=false;
        break;
      }
      }int sum=0;
    if(flag) System.out.println("Prime");
    else System.out.println("not prime");
    for(int j=1;j<=n;j++){
      if(j==3)continue;
       sum=sum+j; System.out.println(sum);
      }
    }
  }
                                      
                           