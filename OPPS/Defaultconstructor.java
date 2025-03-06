//Inplementing default constrouctor
// When we create object compiler automatically call the default constructor 
//To Check Whether the compiler is creating the default constructor or not we are creating object of class and try to get the value of instance variable
package OPPS;

public class Defaultconstructor {
    String Name;
    int age;
    public static void main(String[]args){
        Defaultconstructor obj=new Defaultconstructor();
        System.out.println(obj.Name);
    }


    
}
