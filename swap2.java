// With out Using Third Variable
import  java.util.Scanner;
public class swap2{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the two number which you want to swap");
        System.out.println("Enter Value of a");
        int a=sc.nextInt();
        System.out.println("Enter Value of b");
        int b=sc.nextInt();
        System.out.println("Numbers before swapping");
        System.out.println("a="+a);
        System.out.println("b="+b);
        //Logic
        //Ex=a=2,b=3
        a=a+b;
        //a=5
        b=a-b;
        //b=2
        a=a-b;
        System.out.println("Number after swapping is ");
        System.out.println("a="+a);
        System.out.println("b="+b);



        
        


    }
    
}
