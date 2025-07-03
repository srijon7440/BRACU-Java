public class Trace1{
    public static void main(String [] args){
        int[] arr = {7, 2, 5};
        for (int idx = 0; idx < arr.length; idx++){
            System.out.println(findFibonacci(arr[idx]));
        }
    }
    public static int findFibonacci(int n){
        if (n < 2){
            return n;
        }
        else{
            return findFibonacci(n - 2) + findFibonacci(n - 1);
        }
    }
}

