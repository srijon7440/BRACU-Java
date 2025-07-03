import java.util.Arrays;
import java.util.Scanner;
 public class arrays2D{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    System.out.print("Enter Array Row: ");
    int r=sc.nextInt();
    System.out.print("Enter Array Collum: ");
    int c=sc.nextInt();
    int[][] arr1=new int[r][c];
    for(int i=0;i<arr1.length;i++){
      for(int j=0;j<arr1[i].length;j++){
      System.out.print("Enter Number:");
      arr1[i][j]=sc.nextInt();
    }
   }
    System.out.print(Arrays.deepToString(arr1));
  }
}