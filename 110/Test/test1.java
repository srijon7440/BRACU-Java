import java.util.Scanner;
public class test1{
  public static void main(String[]args){
    Scanner sc=new Scanner(System.in);
    System.out.print("Enter row");
    int row=sc.nextInt();
    for(int r=1;r<=row;r++){
      for(int sp=1;sp<=row-r;sp++){
        System.out.print(" ");
      }
      for(int i=1;i<=row;i++){
        if(r==1||r==row) System.out.print(i);
        else if(i==1||i==row) System.out.print(i);
        else System.out.print(" ");
      }System.out.println();
    }
  }
}