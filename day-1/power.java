
// Implement pow(x, n), which calculates x raised to the power n (i.e., xn).

public class power {

    public static double poweron(double x, int n) {

        long N = n;             //  to control overflow of negative power 

        // handle minus power 
         if (N < 0) {
            x = 1 / x;
            N = -N;
        }
        return fastPow(x,N);
    }


        

        private static double fastPow( double x, long n){
             if (n == 0) {
            return 1;
        }
        double half = fastPow(x, n / 2);
        if (n % 2 == 0) {
            return half * half;
        } else {
            return half * half * x;
        }
        }
       
    

    public static void main(String[] args) {
        int x= 2;
        int n = 10;
        double ans = poweron(x, n);
        System.out.println(ans);

    }

}
