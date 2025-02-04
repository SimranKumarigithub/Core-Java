import java.util.Scanner;

public class secondway{
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the Three numbers");
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        if(a>b){
            if(a>c){
                System.out.println("a is Greatest Number");
            }
            else{
                System.out.println("C is Greatest");
            }
        }
        else if(b>c){
            System.out.println("b is the Greatest number");
        }
        else{
            System.out.println("C is the Greatest  number");
        }

        

        
    }
    
}
