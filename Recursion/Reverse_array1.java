import java.util.*;

public class Reverse_array1 {

    public static void rever(int arr[], int start , int end){

        if(start >= end)
        return;
        swap(arr, start, end);
    
        rever(arr, start+1, end -1);

    }

    public static void swap(int arr[], int s , int r){
        int t;
        t = arr[s];
        arr[s]= arr[r];
        arr[r]= t;
    }
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
        int arr[] = new int[15];
        System.out.println("enter the no of array elements ");
        int no = sc.nextInt();

        System.out.print("enter the array elements = ");
        for(int i= 0; i < no ; i++)
        arr[i] = sc.nextInt(); 

        rever(arr, 0, no-1);

        System.out.println("the reversed array is = ");
        for(int i =0; i< no ; i++)
        System.out.println(arr[i]);
    }
}