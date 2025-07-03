public class Trace1{
    public static int f3(int a, int c){
        System.out.println("F3 begins");
        System.out.println(a+c);
        System.out.println("F3 ends soon");
        return a*5;
    }
    public static String f1(int n){
        System.out.println("F1 begins");
        f2(5,n);
        System.out.println("F1 ends soon");
        return n+1+" from F1";
    }
    public static void main(String[] args){
        System.out.println("Starting soon...");
        int c = 99;
        String s = f1(c);
        System.out.println(s);
        System.out.println("The End");
    }
    public static void f2(int c, int d){
        System.out.println("F2 begins");
        System.out.println( f3(c+1,d-1) );
        System.out.println("F2 ends");
    }
}

