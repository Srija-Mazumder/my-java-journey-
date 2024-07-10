import java.util.*;

public class Reverse_array2 {
    public static void rev(int arr[], int i, int n){
    
        if(i>=n/2)
        return;
        swap(arr, i, (n-1-i)  );
        rev(arr,i+1,n);
    }

    public static void swap(int arr[], int r, int s){
        int t;
        t =arr[r];
        arr[r] =arr[s];
        arr[s]= t;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter the no of array elements=");
           int no = sc.nextInt();

           System.out.println("enter array elements=");
           int arr[] = new int[15];
           for(int i = 0 ; i< no ; i++)
           arr[i] = sc.nextInt();

           rev(arr,0, no);

            System.out.println("reversed array=");
           for(int i = 0; i < no; i++)
           System.out.println(arr[i]);

    }
    
}
