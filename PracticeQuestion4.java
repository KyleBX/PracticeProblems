public class PracticeQuestion4 {
    public static void main(String[] args) {
 
        int n = 10; 
        int result = fib(n);
        System.out.println("The " + n + "th Fibonacci number is: " + result);
    }
    public static int fib(int n) {
        if (n == 0) {
            return 0; 
        }
        if (n == 1) {
            return 1;
        }

        int a = 0; 
        int b = 1; 

    
        for (int i = 2; i <= n; i++) {
            int temp = a + b;
            a = b;
            b = temp;
        }

        return b; 
    }
}
