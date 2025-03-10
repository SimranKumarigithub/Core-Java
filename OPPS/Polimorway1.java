//This is the first way of polimorphism 
//changing the number of parameters 
package OPPS;

public class Polimorway1 {

    public int sum(int a, int b){
        return a+b;
    }
    public int sum(int a, int b, int c){
        return a+b+c;

    }
    public static void main(String[] args){
     Polimorway1 p=new Polimorway1();
     
     
     System.out.println("The sum of two number is "+p.sum(3,4));
     
     System.out.println("The sum of three number is "+ p.sum(4, 5,6));  


    }
    
}
