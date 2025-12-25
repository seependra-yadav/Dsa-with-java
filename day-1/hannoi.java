

public class hannoi {

    public static void towerOfHannoi(int n, String src, String helper, String destination){
        if(n==1){
            System.out.println("transfer "+n+" from "+src+" to "+destination);
            return;
        }

        towerOfHannoi(n-1, src, destination, helper);
        System.out.println("transfer "+n+" from "+src+" to "+destination);
        towerOfHannoi(n-1, helper, src, destination);
    }

    public static void main(String[] args) {
        int n=2;
        towerOfHannoi(n, "S", "H", "D");
        
    }
    
}
