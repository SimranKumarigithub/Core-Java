//Reversing of number 
//Ex-----2876---->6782

/* */
import java.util.*;
public class ReverseNumber{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number which you want to reverse");
        int no=sc.nextInt();
        int rev=0;
        while(no!=0){

            int rem=no%10;
            rev=rev*10+rem;
            no=no/10;
            
        


        

    }System.out.println(rev);
    
}
}
