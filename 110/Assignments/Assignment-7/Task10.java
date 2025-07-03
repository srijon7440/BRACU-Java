//Task-10
 public class Task10{
  public static void main(String[] args){
    int [] marks = {85, 90, 75, 44, 99};
    String [] names = {"Bob", "Alice", "Max", "Marry", "Rosy"};
    System.out.println("Sorted Array:");
    for(int i=0;i<marks.length-1;i++){
    for(int j=i+1;j<marks.length;j++){
      if(marks[i]>marks[j]){
        int temp = marks[i];
        marks[i]=marks[j];
        marks[j]=temp;
        String temp2 = names[i];
        names[i]=names[j];
        names[j]=temp2;
      }
    }
    }
    for(int i=0;i<names.length;i++) System.out.print(marks[i]+" ");
    System.out.println();
    for(int i=0;i<names.length;i++) System.out.print(names[i]+" ");
  }
}
