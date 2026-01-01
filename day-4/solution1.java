import java.util.*;

public class solution1 {
     static int reverse(int x) {
        // int n = x.length();
        int reversedInt=0;
        while(x!=0){
            int rem = x%10;
             reversedInt =  reversedInt*10 + rem;
            x = x/10;

            if (reversedInt > Integer.MAX_VALUE/10 || reversedInt < Integer.MIN_VALUE/10){
                return 0;
            }
        // return 0

        }
        return reversedInt;
    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number");
        int x = sc.nextInt();
        int ans = reverse(x);
        System.out.println("reversed :"+" "+ ans);
        
    }

}