
public class purmutation {
    
    public static void printPerm(String str, String permut){
        if(str.length()==0){
            System.out.println(permut);
            return;
        }

        for(int i=0; i<str.length(); i++){
            char currChar = str.charAt(i);
            String newStr = str.substring(0, i)+ str.substring(i+1);
            printPerm(newStr, permut+currChar);
        }
    }

    public static void main(String[] args) {
        String str = "abc";
        printPerm(str, "");
        
    }
}
