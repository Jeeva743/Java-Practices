import java.util.Scanner;
public class Gcd {
    public static void main(String[] args) {
        Scanner s1 = new Scanner(System.in);
        System.out.print("Enter two numbers: ");
        int a = s1.nextInt();
        int b = s1.nextInt();
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        System.out.println("GCD is: " + a);
    }
    
}
