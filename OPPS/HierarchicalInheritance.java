package OPPS;

public class HierarchicalInheritance {
    public static void main(String args[]){
        //Creating object of classes 
        E ob1 = new E();
        F ob2 = new F();
        G ob3 = new G();

        System.out.println("Methods of class A");
        ob1.animal();
        // ob1.run();
        // ob1.eat();

        System.out.println("Methods of class B");
        ob2.animal();
        ob2.run();
        // ob2.eat();

        System.out.println("Methods of class C");
        ob3.animal();
        ob3.eat();
        // ob3.run();
    }    
}

class E{

    public void  animal(){
        System.out.println("This is the class of animal");
     }
}
class F extends E{
    public void run(){
        System.out.println("Animal can run");
    }
}
class G extends E{
    public void eat(){

    System.out.println("Animal can eat ");

    }
}