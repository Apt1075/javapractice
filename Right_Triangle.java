import java.util.*;
public class Right_Triangle {
    public static Scanner scn = new Scanner(System.in);
    public static void right_triangle(int n) {

            int nsp =0 , nst =1;
        for(int r =1; r<=n;r++){
          
            for(int cst =1; cst<=nst;cst++){
                System.out.print("*");
            }

            for(int csp =1; csp<=nsp;csp++){
                System.out.print("");
            }
           System.out.println();
            nst++;
           
        }
    }

    public static void main(String[] args) {
        System.out.println("Enter the number ");
        int n = scn.nextInt();
        right_triangle(n);
    }
}
