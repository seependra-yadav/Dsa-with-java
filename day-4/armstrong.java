import java.util.*;

public class armstrong {
    
     static boolean isArmstrong(int n) {
        int original = n;
        int digits = String.valueOf(n).length();
        int sum = 0;

        while (n > 0) {
            int rem = n % 10;
            sum += Math.pow(rem, digits);
            n /= 10;
        }

        return sum == original;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number");
        int x = sc.nextInt();

        boolean ans = isArmstrong(x);
        System.out.println(ans);
    }
}
