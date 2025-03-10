package OPPS;
//Important interview question
//Can we overload main Method?
//Yes we can overload main method in java because in java JVM only call main method whose paramether is Sting array Explicitly when we create more than one main method we have to explicitly call and pass the argument so there is no error in the code.

//Implementation

public class mainoverloading {
    public static void main(String args[]){
        System.out.println("This is the actual main method");
        mainoverloading m=new mainoverloading();
        m.main(3);
        m.main("Simran");

    }
    public void main(int a){
        System.out.println(a);

    }
    public void main(String name){
        System.out.println(name);


    }
    
}
