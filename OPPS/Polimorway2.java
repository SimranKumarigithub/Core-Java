package OPPS;
//These is the second way of polimorphism 
//Here changing the type of data type is occur 

public class Polimorway2 {
    public int product(int a, int b){
        int c= a*b;
        return c;

    }
    public double product(double a, double b){
        double c=a*b;
        return c;

    }
    public static void main(String args[]){
        Polimorway2 p= new Polimorway2();
        System.out.println("The product of two number is "+p.product(2,3));

        System.out.println("The product of two double number is " +p.product(3.2,4.5));
    }
    
}
