
import java.util.Scanner;

public class sumdigits {
    public static void main(String[] args) {
        Scanner s1 = new Scanner(System.in);
        System.out.print("Enter the Number: ");
        int num = s1.nextInt();
        int sum = 0;
        while (num!= 0) {
            int digit = num % 10;
            sum = sum + digit;
            num = num / 10;
        }
        System.out.println("The Sum of Digits is " + sum);
    }

}
