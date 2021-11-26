import java.util.Scanner;

public class Binary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n,r,c=0;
        System.out.println("Enter a Binary number");
        n = sc.nextInt();
        while(n>0){
            r=n%10;
            if(r==1){
                c++;
            }
            n /= 10;
        }
        System.out.println("Count of 1 is "+c);
    }
    
}
