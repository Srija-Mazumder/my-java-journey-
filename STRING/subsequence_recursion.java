
import java.util.*;

public class subsequence_recursion{
public static void Subsequence(String str, String ans){
if(str.length() == 0){
    System.out.println(ans);
    return;
}
Subsequence(str.substring(1), ans + str.charAt(0));
Subsequence(str.substring(1), ans);
}

public static void main(String args[]){
    Scanner sc = new Scanner(System.in);

    System.out.println("enter the string = ");
    String str = sc.nextLine();


    Subsequence(str,"");

}
}


