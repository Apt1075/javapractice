import java.util.*;
public class Inverse_pyramid {
    public static Scanner scn = new Scanner(System.in); 
    public static void pyramid(int n) {
        int nst =n,nsp=0;
        for(int row =1; row<=n; row++){
            for(int csp=1; csp<=nsp; csp++){
                    System.out.print(" ");
            }
            for(int cst=1; cst<=nst; cst++){
                System.out.print("* ");
        }
        System.out.println();
        nsp++;
        nst--;
    }
        
    }

public static void main(String[] args) {
    System.out.print("Enter The Number ");
int n = scn.nextInt();
pyramid(n);
}
}
