//We can Initialize the object in three way 
//1.) By reference variable
//2.) By using Method
//3.) By using constructor 

//Here we are performing by using Reference variable

package OPPS;

public class ObjectInitialization{
    String color;//Instance Variable
    int age;//Instance variable
    public static void main(String[]args){
        ObjectInitialization obj=new ObjectInitialization();
        obj.color="Black";//Initializing the variales of class with the help of object
        obj.age=18;//Initializing the Instance variable of the class with the help of object
        System.out.println(obj.color);
        System.out.println(obj.age);


    }
    
}
