public class g1{
  public static void main(String[] args){
    int x =2,y=1;
    x=1+methA()+y++;
    System.out.println(x);
  }
  public static int methA(){
    int x=2;
    return x++;
  }
}