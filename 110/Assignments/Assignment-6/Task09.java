//Task-09
import java.util.Scanner;
 public class Task09{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    System.out.print("Enter Password:");
    String str=sc.nextLine();
    int uc=0,lc=0,dg=0,sp=0;
  
      for(int i=0;i<str.length();i++){
        char c=str.charAt(i);
        if(c>='A'&&c<='Z') uc++;
        else if(c>='a'&& c<='z') lc++;
        else if(c>='0'&&c<='9') dg++;
        else sp++; 
      }
      
    if(str.length()>7){  
    if(uc>0 && lc>0 && dg>0 && sp>0) System.out.print("True");
    else System.out.print("False");
    }
    else System.out.print("False");
    
  }
}