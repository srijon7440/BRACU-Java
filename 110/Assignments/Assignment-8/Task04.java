//Task-04
public class Task04{
  //(A)
  public static boolean isPrime(int x){
    if(x>=2){
    for(int i=2;i<x;i++){
     if(x%i==0) return false;
      }
    }
    else return false;
    return true;
  }
  //(B)
  public static boolean isPerfect(int x){
    int sum=0;
    if(x==0||x==1) return false;
    for(int i=1;i<x;i++){
      if(x%i==0) sum+=i;
    }
    if(sum==x) return true;
    return false;
  }
  //(C)
  public static int special_sum(int x){
    int sum=0;
    for(int i=1;i<=x;i++){
      boolean flag1=isPrime(i);
      if(flag1) sum+=i;
      boolean flag2=isPerfect(i);
      if(flag2) sum+=i;
    }
    return sum;
  }
  public static void main(String[]args){
    //==A==
System.out.println("=============A==============");
    boolean check = isPrime(7);
    System.out.println(check);
    check = isPrime(15);
    System.out.println(check);
    //==B==
System.out.println("=============B==============");
    boolean check1 = isPerfect(6);
    System.out.println(check1);
    check1 = isPerfect(33);
    System.out.println(check1);
    //==C==
System.out.println("=============C==============");
    int result = special_sum(8);
    System.out.println(result);

  }
}