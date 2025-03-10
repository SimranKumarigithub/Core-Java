package OPPS;
//This is the second way of polimorphism 
//Here Changing the order of the parameters 

public class Polimorway3 {
    public void StudentID(int rollno,String name){
        System.out.println("The rollno of the Student is" + rollno + "The name of the student is" + name);
    }
    public void StudentID(String name, int rollno){
        System.out.println("The name of the Student is"+ name +"The rollno of the student is" + name);

    }

    public static void main(String args[]){
        Polimorway3 p=new Polimorway3();
        p.StudentID(3,"Simran");
        p.StudentID("Ramiz",5);


    }
    
}
