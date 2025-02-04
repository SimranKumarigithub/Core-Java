
//Factorial Program Using Recursion
import java.util.Scanner;

public class FactRecursion {
    int fact = 1;

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int number = sc.nextInt();
        //Creating Object of class for calling "calfact" method
        FactRecursion f = new FactRecursion();
        int value = f.calfact(number);
        System.out.println("Factorial of " + number + " is " + value);

    }

    int calfact(int no){
        if(no==1||no==0){
            return 1;
        }
        return 
            fact=fact*no;
            calfact(no-1);
              }return fact;
        }

}
