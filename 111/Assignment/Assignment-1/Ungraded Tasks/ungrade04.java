import java.util.Scanner;
 public class ungrade04{
  public static void main(String[] args){
    Scanner sc=new Scanner (System.in);
    System.out.print("K = ");
    int k=sc.nextInt();
    int [ ] [ ] A =   {{4, 5,  7},
                       {0, 3, -2},
                       {4, 1, -4},
                       {5, 10, 1}};
    for(int i=0;i<A.length;i++){
      for(int j=0;j<A[i].length;j++){
        A[i][j]*=k;
      }
    }
     //printing the k*A matrix
    for(int i=0;i<A.length;i++){
      for(int j=0;j<A[i].length;j++){
        System.out.print(A[i][j]+"  ");
      }
      System.out.println();
    }
  }
 }