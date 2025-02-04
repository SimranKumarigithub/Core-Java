import java.util.Scanner;

class largest_of_two{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Three numbers");
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        if(a>b&&a>c){
            System.out.println("A is Greatest number");

        }
        else if(b>a&&b>c){
            System.out.println("B is the Greatest");
            }
            else{
                System.out.println("c is the Greatest number ");
            }
    }

}