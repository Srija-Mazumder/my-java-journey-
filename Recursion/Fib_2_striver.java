
// time complexity - O(2^n)  [ due to 2 recursive calls] 
// spca complexity - O(n)

import java.util.*;
public class Fib_2_striver {
    public static int fib(int n){
        if(n <= 1)
        return n;
       
        return fib(n - 2)+ fib(n-1);
        //System.out.println(b);

    }
    
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter no of terms = ");
        int no = sc.nextInt();
      
        System.out.print(" " + fib(no));
      
      }

}

