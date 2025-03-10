package OPPS;

//User define constructor
public class userdefineconst {
    String Name;
    int age;

    public userdefineconst() {
        System.out.println("This is a user define constructure");

    }

    public static void main(String args[]) {

        userdefineconst obj = new userdefineconst();
        System.out.println(obj.Name);

    }

}
