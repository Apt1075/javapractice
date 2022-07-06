import java.util.*;
public class Sorting1 {
    public static Scanner scn = new Scanner(System.in);
    public static void input_array(int [] arr) {
        for(int i=0;i<arr.length; i++){
            arr[i] = scn.nextInt();
        }

    }
    public static void print_array(int [] arr) {
        for(int i=0;i<arr.length; i++){
            System.out.print(arr[i]+ " ");
        }
        System.out.println();
    }
    public static void bubble_sort(int [] arr) {

        int i,j;
        for(i =0;i<arr.length;i++){
            for( j = 1;j<arr.length-i;j++){
                if(arr[j]<arr[j-1]){
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                }
            }
        }
    }

    public static void selection_sort(int [] arr) {
        int i,j;
        for(i =0;i<arr.length;i++){
            for( j = i+1;j<arr.length;j++){
                if(arr[i]>arr[j]){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        int n = scn.nextInt();
        int [] arr = new int [n];
        input_array(arr);
        print_array(arr);
        System.out.println("Before Array");
        selection_sort(arr);
        System.out.println("After Array");
        print_array(arr);
    }
}
