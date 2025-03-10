package OPPS;

public class SingleInheritance {

    public static void main(String args[]) {
        Animal ob1 = new Animal();
        ob1.run();
        dog ob2 = new dog();
        ob2.run();
        ob2.eat();
    }
}

class Animal {
    public void run() {
        System.out.println("Animal can run");

    }
}
// Class dog is not public because in java there is only one public class in a
// program. which is the name of the file

class dog extends Animal {
    public void eat() {
        System.out.println("Animal can eat");
    }
}
