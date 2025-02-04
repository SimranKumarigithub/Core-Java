import java.util.*;
public class even_odd{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number which you want to find iwheater it is even or odd");
        int var=sc.nextInt();
        if(var%2==0){
            System.out.println("The entered number is Even");

        }
        else{
            System.out.println("The Entered number is odd");
        }
    }
    
}
