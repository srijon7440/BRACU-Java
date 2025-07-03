//Task-07
public class Task07{
  public static void main(String[] args){
    int arr[]={23,100,23,56,100};
    int[] arr2=new int[arr.length];
    int count=0; 
    for(int i=0;i<arr.length;i++){
      boolean flag=true;
      for(int j=0;j<count;j++){
        if(arr[i]==arr2[j]){
          flag=false;
          break;
      }
      }
        if(flag){
          arr2[count]=arr[i];
          count++;
        }
      
    }
    System.out.println("Input array:");
    for(int i=0;i<arr.length;i++) System.out.print(arr[i]+" ");
    System.out.println();
    System.out.println("new array:");
    for(int i=0;i<count;i++) System.out.print(arr2[i]+" ");
    
  }
}