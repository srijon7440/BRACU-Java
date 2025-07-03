//Task-02
public class Task02{
  //(A)
  public static double circleArea(double x){
    return Math.PI*Math.pow(x,2);
  }
  //(B)
  public static double sphereVolume(double x){
    return (4.0/3)*Math.PI*Math.pow(x,3);
  }
  //(C)
  public static void findSpace(double x,String str){
    String s1="circle";
    String s2="sphere";
    if(str.equals(s1)) System.out.println(circleArea(x/2));
    else if(str.equals(s2)) System.out.println(sphereVolume(x/2));
    else System.out.println("Wrong Parameter");
  }
  public static void main(String[]args){
    //==A==\\
System.out.println("=============A==============");
   double area = circleArea(5);
   System.out.println(area);
   //==B==\\
System.out.println("=============B==============");
   double volume = sphereVolume(5.0);
   System.out.println(volume);
   //==C==\\
System.out.println("=============C==============");
   findSpace(10,"circle"); 
   findSpace(5,"sphere"); 
   findSpace(10,"square");
  }
}