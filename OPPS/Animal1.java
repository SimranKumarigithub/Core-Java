//Program Of Understanding objects and Classes 

// Here We are using one more class Which is present in other file of Same(OPPS) directory

//In Java There must be only one public class which is the name of the file when we are creating more than one public class we have to create in a separate file in the same direcrory.

// When we want to create more than one class in the same file then we have to make only one class as a public class and the other class must be non public.

package OPPS;

public class Animal1{
    public static void main(String[] args){
        Animal1 buzo=new Animal1();
        buzo.eat();
        buzo.bark(); 
        Bird parrot=new Bird();
        parrot.fly();

    }
    public void eat(){
        System.out.println("Dog can Eat");
    }
    public void bark(){
        System.out.println("Dog can bark");
    }

    
}

