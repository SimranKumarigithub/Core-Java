// Inheritance
package OPPS;
//AnimalInheritence is a parent class
public class AnimalInheritence {
    public void eat()
    {
        System.out.println("Animal can Eat");
    }

   
    
}
 //Dog is a child class
 class Dog extends AnimalInheritence{

    public static void main(String args[]){
        Dog d= new Dog();
        d.eat();

    }
    }


