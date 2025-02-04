//Simple Calculator Performing Some basic operations(+,-,*,/,%)
import java.util.Scanner;
public class calculator{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String choice="y";
        
        while(!choice.equalsIgnoreCase("exit")){
        
        System.out.println("Enter the First Number");
        int a=sc.nextInt();
        System.out.println("Enter the second number");
        int b=sc.nextInt();
        System.out.println("Enter the Symbol(+,-,*,/,%)");
        String symbol=sc.next();
        int result;
        switch(symbol){
            case "+":
            result=a+b;
            System.out.println("Result is"+result);
            break;

            case "-":
            result=a-b;
            System.out.println("Result is"+result);
            break;

            case "*":
            result=a*b;
            System.out.println("Result is "+result);
            break;

            case "/":
            if(b!=0){
            result=a/b;
            System.out.println("Result is"+result);
            }else{
                System.out.println("Devision by 0 is not possible please enter valid number");

            }
            break;

            case "%":
            result=a%b;
            System.out.println("Result is"+result);
            break;

            default:
            System.out.println("Invalid Symbol");

            
        }
        System.out.println("Enter exit to quit or press any key to continue");
        choice=sc.next();

            

        }

         

    }
    
}
