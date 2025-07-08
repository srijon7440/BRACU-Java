import java.util.Scanner;
 public class ungrade05{
  public static void main(String[] args){
    Scanner sc=new Scanner (System.in);
    System.out.print("M = ");
    int M=sc.nextInt();
    System.out.print("N = ");
    int N=sc.nextInt();
    int [ ] [ ] A = new int[M][N];
    
    //taking 2Darray input
    for(int i=0;i<M;i++){
      for(int j=0;j<N;j++){
        System.out.print("Enter Element= ");
        A[i][j]=sc.nextInt();
      }
    }
  
     //printing the  matrix A
    System.out.println("Matrix A");
    for(int i=0;i<M;i++){
      for(int j=0;j<N;j++){
        System.out.print(A[i][j]+"  ");
      }
      System.out.println();
    }
    System.out.println("\n================\n");
    //creating new array for transpose of A
    int[][] AT=new int[N][M];
    
    //logic of matrix Transpose of A
    for(int i=0;i<N;i++){
      for(int j=0;j<M;j++){
        AT[i][j]=A[j][i];
      }
    }
    //printing matrix Transpose of A
    System.out.println("Transpose A");
    for(int i=0;i<N;i++){
      for(int j=0;j<M;j++){
       System.out.print(AT[i][j]+"  ");
      }
      System.out.println();
    }
  }
 }