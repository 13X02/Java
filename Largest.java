import java.util.Scanner;

class Largest{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter N");
        int n = sc.nextInt();
        int i,l;
        int a[] = new int[n];
        System.out.println("Enter the Numbers");
        for(i = 0; i < n; i++){
            a[i] = sc.nextInt();
        }
        l = a[0];
        for(i = 0;i<n;i++){
            if(a[i]> l){
                l = a[i];
            }
        }
        System.out.println("Largest no is "+l);

    }
}