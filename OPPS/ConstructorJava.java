package OPPS;

public class ConstructorJava {
    String name;
    int age;

    public ConstructorJava(String name,int age){
        this.name=name;
        this.age=age;

    }

    public static void main(String[] args){
        // creating an object of class
        ConstructorJava obj=new ConstructorJava("Simran",18); //Parameterized constructor
        System.out.println("Name :" + obj.name);
        System.out.println("Age :"+ obj.age);
        


    }
    
}
