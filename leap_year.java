// Leap Year second way--------we can also do it by logical operator
import java.util.*;
public class leap_year{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the year");
        int year=sc.nextInt();
        
        if(year%4==0 && year%100!=0|| year%4==0){
            System.out.println("Entered year is a leap year");

        }

    }

    
}
