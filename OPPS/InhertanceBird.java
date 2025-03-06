package OPPS;

public class InhertanceBird {

    public void fly() {
        System.out.println("Birds Can Fly");

    }

}

class Sparroe extends InhertanceBird {

    public static void main(String[] args) {
        InhertanceBird obj = new InhertanceBird();
        obj.fly();

    }
}
