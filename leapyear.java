//leap year program by using ifelse

import java.util.Scanner;
public class leapyear{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the year");
        int year=sc.nextInt();
        if(year%4==0){
            if(year%100==0){
                if(year%400==0){
                    System.out.println("Entered year is a leap year");

                }
                System.out.println("Not a leap year");
            }
            System.out.println("Entered year is a leap year");
        }



    }
    
}
