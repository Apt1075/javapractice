import java.util.Scanner;

public class Binarysearch {
    public static Scanner sc = new Scanner(System.in);

    public static int binary_search(int arr[], int data){
        int si = 0 , ei =arr.length-1,mid; //
        while(si<=ei){
            mid = (si+ei)/2;
            if(arr[mid] == data){
                return mid;
            }else if(arr[mid]<data){
              si= mid+1;
            }else{
               ei =  mid-1;
            }
        }
        if(si>ei)
        System.out.println("Number Not Found");
        return -1;
    }
    // comment
    public static void main(String[] args) {
        int n = sc.nextInt();
       
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt(); // write
        }
        int m = sc.nextInt();
     int k =  binary_search(arr, m);
     System.out.println(k);
    }
}
