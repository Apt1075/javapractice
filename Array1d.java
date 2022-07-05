

import java.util.*;
public class Array1d {
   


    public static Scanner scn = new Scanner(System.in);

    public static void input1D(int[] arr) {
        System.out.print("Enter the Element ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scn.nextInt(); // write
        }
    }

    public static void print1D(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " "); // read
        }
        System.out.println();
    }
    
    // return index if data found, if not then return -1;
    public static int  findElement(int[] arr, int data) {
        int i;
       
        for ( i= 0; i < arr.length; i++) {
            if(arr[i] == data){
                return i;
            }
       
     }
        
     return -1;   
    }

    public static void  maxElement(int[] arr) {
        for ( int i= 0; i < arr.length; i++) {
            if(arr[0] < arr[i])
            arr[0] = arr[i];
        }
        System.out.print(" Max Element" + arr[0] );
    }
    


    public static void  minElement(int[] arr) {
        for ( int i= 0; i < arr.length; i++) {
            if(arr[0] > arr[i])
            arr[0] = arr[i];
        }
        System.out.print(" Min Element" + arr[0] );
    }


  

     public static void reverse(int[] arr ,int n) {

        for(int i=(n-1); i>=0; i--)
      {
    
           // System.out.print(" Reverse number " + arr[i] );
        }
      
    
   }

   public static int[] inverse(int[] arr){

    int[] inversearr = new int[arr.length];

    for(int i = 0;i < arr.length;i++){

        inversearr[arr[i]] = i;
    }

    return inversearr;
}

    public static void main(String[] args) {
        int n = scn.nextInt();
        int[] arr = new int[n]; // int[] arr = {10,20,-40,50,70,90,-89,-56};
      //  int Element = scn.nextInt();
        input1D(arr);
       int q[] =inverse(arr);
       for (int i = 0; i < arr.length; i++) {
        System.out.print(" index "+i+" value "+q[i] + "\n "); // read
    }
      //  print1D(arr);
    }
}
