//This is the code of Multiple Inheritance

package OPPS;

public class MultipleInheritance {

    public static void main(String[] args){
        A ob1 = new A();
        B ob2 = new B();
        C ob3 = new C();

        System.out.println("------Class A---------");
         ob1.Animal();
         //ob1.run();
         //ob1.eat();

        System.out.println("------Class B---------");
        ob2.run();
        ob2.Animal();
        //ob2.eat();

        System.out.println("------Class C---------");
        ob3.Animal();
        ob3.eat();
        ob3.run();


     }
}
// This is the parent class 
class A {
    public void Animal(){
        System.out.println("It is a Animal class");
    }

}
//This is the child class extends class A
class B extends A{
    public void run(){
        System.out.println("animal can run");
    }

}
//This is the child class which extends class A
class C extends B{
    public void eat(){
        System.out.println("Animal can eat");
    }

}