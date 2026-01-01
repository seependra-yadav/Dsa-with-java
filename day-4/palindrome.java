import java.util.*;
public class palindrome {
     static boolean isPalindrome(int x) {
       // Negative numbers and multiples of 10 (except 0) cannot be palindrome
        if (x < 0 || (x % 10 == 0 && x != 0)) {
            return false;
        }

        int reversNum= 0;
        int original = x;

        while(x>0){
            int rem = x%10;
            reversNum = reversNum*10+rem;
            x = x/10;
        }

       return original == reversNum;

        
        
    }
    public static void main(String[] args) {
          Scanner sc = new Scanner(System.in);
        System.out.println("enter a number");
        int x = sc.nextInt();
        boolean ans = isPalindrome(x) ;
        System.out.println(ans);

        
    }
    
}
