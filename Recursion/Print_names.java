
// ----Simple Recursion Characteristic: ---
// This code follows a straightforward recursive pattern. 
// It prints the string first and then makes a recursive call with a decreased value of n.
// // Behavior: The rec function prints the string and then calls itself with n-1. 
// This is a straightforward recursive approach where the task is performed in the 
// "forward" direction of the recursion.it performs the action immediately and then proceeds with the recursion.




import java.util.*;

public class Print_names{
    public static void rec(String str,int n){
        if(n==0)
        return ;
        System.out.println(str);
        
            rec(str,n-1);
    }
 
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the string = ");
        String str = sc.nextLine();
        System.out.print("enter the repeatation count = ");
        int no = sc.nextInt();
        rec(str,no);

    }    
}