//Reversing of String in Java
import java.util.*;
public class ReverseString{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the String which you want to Reverse");
        String str=sc.nextLine();
        //Here we are using Methods of String class for finding length of the string.....
        String rev="";
         int len=str.length();
         
         for(int i=len-1;i>=0;i--){
            rev=rev+str.charAt(i);

         }System.out.println(rev);
          sc.close();





    }
    
}
