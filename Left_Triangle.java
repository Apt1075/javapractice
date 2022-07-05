import java.util.*;
public class Left_Triangle {
    public static Scanner scn = new Scanner(System.in);
    public static void left_triangle(int n) {
        int nsp = n-1,nst= 1;
        for(int row =1; row <=n; row++){
          
            for(int csp =1; csp<=nsp;csp++){
                System.out.print("");
            }
            for(int cst =1; cst<=nst;cst++){
                System.out.print("*");
            }

        
           System.out.println();
            nst++;
            nsp--;
        }
    }

    public static void main(String[] args) {
        System.out.println("Enter the number ");
        int n = scn.nextInt();
        left_triangle(n);
    }

}
