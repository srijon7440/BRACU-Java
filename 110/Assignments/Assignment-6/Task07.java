//Task-07
import java.util.Scanner;
 public class Task07{
  public static void main(String[]args){
    Scanner sc=new Scanner(System.in);
    System.out.print("Enter String1:");
    String str1=sc.nextLine();
    System.out.print("Enter String2:");
    String str2=sc.nextLine();
    String str3="";
    boolean found=false;
    for(int i=0;i<str1.length();i++){
      char c1=str1.charAt(i);
      for(int j=0;j<str2.length();j++){
        char c2=str2.charAt(j);
        if(c1!=c2){
          found=true;
        }else{
          found=false;
          break;
        }
      }
      if(found){
        if(c1>96&&c1<123){
          int cnv=(int)(c1-32);
          str3+=(char)(cnv);
        }
        else str3+=c1;
      }
    }
    for(int i=0;i<str2.length();i++){
      char c1=str2.charAt(i);
      for(int j=0;j<str1.length();j++){
        char c2=str1.charAt(j);
        if(c1!=c2){
          found=true;
        }else{
          found=false;
          break;
        }
      }
      if(found){
        if(c1>96&&c1<123){
          int cnv=(int)(c1-32);
          str3+=(char)(cnv);
        }
        else str3+=c1;
      }
    }
    System.out.print(str3);
  }
}