import java.util.Scanner;

public class SumOfDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num,rem,sum = 0;
        System.out.println("Enter a Number");
        num = sc.nextInt();
        while(num >0){
            rem= num % 10;
            sum += rem;
            num /= 10;
        }
        System.out.println("Sum of digits is "+ sum);
        
    }
    
}
