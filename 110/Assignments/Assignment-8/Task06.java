//Task-06
import java.util.Scanner;
public class Task06{
  public static double calcTax(int x,int y){
    if((x<18)||(y<10000)) return 0.0;
    else if(y>=10000&&y<=20000) return (7/100.0)*y;
    else return (14.0/100)*y;
  }
  public static void calcYearlyTax(){
    Scanner sc=new Scanner(System.in);
    double sum=0.0;
    System.out.print("Age: ");
    int age=sc.nextInt();
    for(int i=1;i<=12;i++){
    System.out.print("Month "+i+" income: ");
    int m1=sc.nextInt();
    double s=calcTax(age,m1);
    System.out.println("Month"+i+" tax: "+s);
    sum+=s;
    }
    System.out.println("Total Yearly Tax: "+sum);
    }
  
  public static void main(String[]args){
    //==A==\\
System.out.println("=============A==============");
    double t = calcTax(16,20000);
    System.out.println(t);
    t = calcTax(20,18000);
    System.out.println(t);
    //==B==\\
System.out.println("=============B==============");
    calcYearlyTax();
  }
}