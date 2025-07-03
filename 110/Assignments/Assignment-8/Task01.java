//Task-01
public class Task01{
  //(A)
  public static void evenChecker(int x){
    if(x%2==0) System.out.println("Even!!");
    else System.out.println("Odd!!");
  }
  //(B)
  public static boolean isEven(int x){
    if(x%2==0) return true;
    else return false;
  }
  //(C)
  public static boolean isPos(int x){
    if(x>0) return true;
    else return false;
  }
  //(D)
  public static void sequence(int x){
    if(isPos(x)){
    for(int i=0;i<=x;i++){
    if(isEven(i)) System.out.print(i+" ");
    }
  }
    else{
    for(int i=x;i<=-1;i++){
          if(!isEven(i)) System.out.print(i+" ");
      }
    }
  }

  public static void main(String[]args){
    //==A==
System.out.println("=============A==============");
   evenChecker(10); 
   evenChecker(17); 
   //==B==
System.out.println("=============B==============");
   boolean result=isEven(10);
   System.out.println(result);
   result=isEven(17);
System.out.println(result);
   //==c==
   System.out.println("=============C==============");
   boolean Result = isPos(-5);
   System.out.println( Result );
   Result = isPos(12);
   System.out.println( Result );
   //==D==
System.out.println("=============D==============");
   sequence(10);
   System.out.println();
   sequence(-7);
   System.out.println();
   sequence(7);
   System.out.println();
   sequence(-8);
  }
}