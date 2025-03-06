// Initilizing Object with the help of Method

package OPPS;

public class ByMethod {
    String Name;
    int Age;

    public void info(String name,int age){
        Name=name;
        Age=age;

        System.out.println(Name);
        System.out.println(Age);

    }


    public static void main(String[] args){
        ByMethod obj=new ByMethod();
        obj.info("Simran",20);
        System.out.println(obj.Name);
        System.out.println(obj.Age);

        



    }
    
}
