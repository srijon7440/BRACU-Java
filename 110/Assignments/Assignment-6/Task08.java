//Task-08
import java.util.Scanner;
 public class Task08{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    System.out.print("Enter String:");
    String str1=sc.nextLine();
    String str2="";
    int x=1;
    for(int i=0;i<str1.length();i++){
      char c=str1.charAt(i);
      
        if((c>='A'&&c<='Z')||(c>='a'&&c<='z')){
        if(x%2!=0){
        if((c>='A'&&c<='Z')){
        int a = (int)(c+32);
        c=(char)a;
        str2+=c;
        }else{
          str2+=c;
        }
        x=x+1;
        }
        
        else{
        if((c>='a'&&c<='z')){
        int a = (int)(c-32);
        c=(char)a;
        str2+=c;
        }else{
          str2+=c;
        }
        x=x+1;
        }
        }
      else {
        str2+=c;
      }
    }
    System.out.print(str2);
  }
}