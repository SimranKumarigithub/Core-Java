// Swapping program with using third Variable
import java.util.Scanner;
public class swap{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the two number which you want to swap");
        System.out.println("Value of a");
        int a=sc.nextInt();
        System.out.println("Value of b");
        int b=sc.nextInt();
        System.out.println("Numbers before swapping");
        System.out.println("a="+a);
        System.out.println("b="+b);
        int temp=a;
        a=b;
        b=temp;
        System.out.println("Numbers after swapping");
        System.out.println("a="+a);
        System.out.println("b="+b);

        


    }
    
}
