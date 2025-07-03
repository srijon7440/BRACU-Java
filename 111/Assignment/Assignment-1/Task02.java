import java.util.Scanner;
 public class Task02{
  public static void main(String[]args){
    int count=0;
    Scanner sc =new Scanner(System.in);
    System.out.print("Enter String :");
    String s1=sc.nextLine();
    String s2="";
    for(int i=0;i<s1.length();i++){
      char c=s1.charAt(i);
      if(c=='a')c='z';
      else {int x=(int)c;
      x--;
      c=(char)x;
      }
      s2+=c;
    }
    System.out.println(s2);
  }
}