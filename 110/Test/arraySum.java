import java.util.Scanner;
public class arraySum{
  public static void main(String[]args){
    int[] arr={1,7,2,6,74,83};
    int x=8,count=0;
    for(int i=0;i<6;i++){
      for(int j=i+1;j<6;j++){
        if(arr[i]+arr[j]==x){
          count++;
          System.out.println("The sum arrays are: "+arr[i]+" and "+arr[j]);
        }
      }
    }
    
          System.out.println("Total pairs: "+count);
  }
}