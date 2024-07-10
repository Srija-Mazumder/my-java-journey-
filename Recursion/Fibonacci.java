import java.util.*;

public class Fibonacci{
    public static void fib(int a, int b, int n){
        if(n <= 0)
        return;
       System.out.print(" "+ a);
         fib(b,a+b,n-1);
        //System.out.println(b);

    }
    
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter no of terms = ");
        int no = sc.nextInt();
      
        fib(0,1,no);
       
      
      }

}

