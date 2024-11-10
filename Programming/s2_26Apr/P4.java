package s2_26Apr;
//10 Fibonacci Series
//Starting 2 elements -> a,b
//fibonssci series is the the series we create by adding two consecutive numbers
//a,b,n,n,n......
//a->0, b->1
//0,1,(0+1),(1+1),(1+2),(2+3),(3+5).....
//0,1,1,2,3,5,8.......

public class P4 {
	public static void main(String[] args) {
        int n = 10; // Number of terms in the series
        int a = 0;
        int b = 1;

        System.out.println("Fibonacci Series up to " + n + " terms:");
        System.out.print(a + " " + b + " ");

        for (int i = 2; i < n; i++) {
            int nextTerm = a + b;
            System.out.print(nextTerm + " ");
            a = b;
            b = nextTerm;
        }
    }
}
