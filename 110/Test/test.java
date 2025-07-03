import java.util.Scanner;
public class test{
  public static int d(int x){
    int digits=0;
    for(int i=1;x>0;i++){
      x=x/10;
      digits++;
    }
    return digits;
  }
  public static void main(String[]args){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter Number");
    int n=sc.nextInt();
    int Num=1;
    int a=d(n);
    System.out.println("Total Digits= "+a);
    for(int j=1;j<a;j++){
      Num=Num*10;
    }
    System.out.println("Power:"+Num);
    } 
  }
