//Task-06
import java.util.Scanner;
 public class Task06{
  public static void main(String[]args){
    Scanner sc=new Scanner(System.in);
    System.out.print("Enter String:");
    String str=sc.nextLine();
    int c1=0,c2=0;
    for(int i=0;i<str.length();i++){
      char c=str.charAt(i);
      if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u'||c=='A'||c=='E'||c=='I'||c=='O'||c=='U')
        c1++;
      else if((c>='a'&&c<='z')||(c>='A'&&c<='Z')){
        if(c!='a'||c!='e'||c!='i'||c!='o'||c!='u'||c!='A'||c!='E'||c!='I'||c!='O'||c!='U')
          c2++;
      }
    }
    if(c1%3==0&&c2%5==0) System.out.println("Aaarr! Me Plunder!!");
    else  System.out.println("Blimey! No Plunder!!");
  }
}