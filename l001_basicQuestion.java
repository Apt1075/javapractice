import java.util.*;

public class l001_basicQuestion {

    public static Scanner scn = new Scanner(System.in);

    public static int countChar(String str, char ch) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (ch == str.charAt(i))
                count++;
        }

        return count;
    }
    public static int smallCaseChar = 0, upperCaseChar = 0;
    public static void printSmallUpperCase(String str) {
        for(int i=0; i<str.length(); i++){
        char ch=str.charAt(i);
        
        // code

        if(ch>='A' && ch<='Z'){
            upperCaseChar++;
        }
        else if(ch>='a' && ch<='z'){
            smallCaseChar++;
        }
    }
        System.out.println("Small Character Count: " + smallCaseChar);
        System.out.println("Upper Character Count: " + upperCaseChar);
    }

    // abADv -> ABadV
    // public static String caseConversion(String str) {
        
        
    // }

    public static void main(String[] args) {
        String str = scn.nextLine();
       // char ch = scn.next().charAt(0);
        printSmallUpperCase(str);
        // System.out.println(countChar(str, ch));
    }

}