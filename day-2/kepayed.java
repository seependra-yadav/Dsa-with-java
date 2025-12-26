
//print kepayd combination
public class kepayed {


    public static String[] keypad ={".","abc","def","ghi","jkl","mno","pqrs","tu","vwx","yz"};

    public static void printCombo(String str, int idx, String combo){
        if(idx==str.length()){
            System.out.println(combo);
            return; 
        }

        char currChar = str.charAt(idx);
        String mapping = keypad[currChar-'0'];
        for(int i=0; i<mapping.length(); i++){
            printCombo(str, idx+1, combo+mapping.charAt(i));
        }
    }
    public static void main(String[] args) {
        String str = "9";
        printCombo(str, 0, "");
        

    }
    
}
