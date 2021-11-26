import java.util.Scanner;

public class Swap {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a,b;
        System.out.println("Enter value of a and b");
        a =sc.nextInt();
        b = sc.nextInt();
        System.out.println("Value before swapping a = "+a+" b = "+b);
        a = a+b;
        b = a-b;
        a = a-b;
        System.out.println("Value after swapping a = "+a+" b = "+b);

        
    }
}
