// factorial program using iteration
import java.util.*;
public class factorial{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        
        String choice="y";
        while(!choice.equalsIgnoreCase("exit")){
            System.out.println("Enter the number to find factorial");
            
        
        int n=sc.nextInt();
        int fact=1;
        for(int i=1;i<=n;i++){
            fact=fact*i;      


    }
    System.out.println(fact);
    System.out.println("Do you want to continue?or want to quit then please enter exit");
    
}
    
}
}