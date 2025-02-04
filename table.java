import java.util.*;
public class table{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String choice="y";
        while(!choice.equalsIgnoreCase("exit")){
        System.out.println("Enter the number");
        int n=sc.nextInt();
        for(int i=1;i<=10;i++){
            System.out.println(n+"*"+i+"="+n*i);
        }
        System.out.println("Enter Exit to terminate or enter any key to continue");
        choice=sc.next();

        }
        
    }
    
}
