//Task-03
public class Task03{
  public static boolean isTriangle(int x,int y,int z){
    if((x+y>z)&&(y+z>x)&&(z+x>y)) return true;
    else return false;
  }
  public static void triArea(int x,int y,int z){
    if(isTriangle(x,y,z)){
      double s=(x+y+z)/2;
      double a=Math.sqrt(s*((s-x)*(s-y)*(s-z)));
      System.out.println(a);
    }
    else System.out.println("Can’t form triangle");
  }
  public static void main(String[]args){
    //==A==\\
System.out.println("=============A==============");
    boolean res = isTriangle(7,5,10);
    System.out.println( res );
    res = isTriangle(3,2,1);
    System.out.println( res );
    //==B==\\
System.out.println("=============B==============");
    triArea(3,2,1);
    triArea(7,5,10);
  }
}