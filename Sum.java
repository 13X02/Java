//program that accepts two integer input and perform summation

import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int a,b,s;
    System.out.println("Enter Two Numbers");
    a = sc.nextInt();
    b = sc.nextInt();
    s = a + b;
    System.out.println("Sum of "+ a+" and "+b+" is "+s);


    
}
}
