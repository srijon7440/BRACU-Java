public class TracingProblem {
    public int temp = 4;
    public int y = 2, x, sum;

    public TracingProblem() {
        this.x = 3;
        sum += x;
    }

    public TracingProblem(TracingProblem obj) {
        this.y = temp - 2;
        obj.y = x + temp - 1;
        obj.methodA(this.y);  // what if this.methodA(this.y)? or methodA(this.y)?
        // what if there were more lines here?
    }

    public void methodA(int y) {
        int[] n = {2, 5};
        int x = 1;
        this.y = y + this.methodB(n) + (temp++) + this.y;  // what if just y?
        x = this.x + (++n[0]);
        sum = sum + x + y;
        System.out.println(x + " " + y + " " + sum);
    }

    public void methodB(int m, int n) {
        TracingProblem t4 = new TracingProblem();
        this.y = this.y + m;
        this.x = t4.temp + temp - n;
        System.out.println(this.x + " " + sum + " " + y);
    }

    public int methodB(int[] arr) {
        this.y += arr[1];
        arr[0]++;
        this.x = this.y + 1 + temp;
        System.out.println(this.x + " " + sum + " " + y);
        return this.y--;
    }
}
