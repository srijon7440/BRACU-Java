import java.util.Scanner;
public class fext2{
  public static void modifyStrings(String s,String s1,String s2){
    String st=s.replace(s1,s2);
    System.out.print(st);
  }
  public static void main(String[]args){
    Scanner sc=new Scanner(System.in);
    System.out.print("Enter S:");
    String s=sc.nextLine();
    System.out.print("Enter S1:");
    String s1=sc.nextLine();
    System.out.print("Enter S2:");
    String s2=sc.nextLine();
    modifyStrings(s, s1, s2);
  }
}