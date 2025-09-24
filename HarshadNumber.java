import java.util.Scanner;

public class HarshadNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        int a = num;
        int sum = 0;
        while (a> 0) {
            int digit = a % 10;
            sum =sum+ digit;
            a =a/ 10;
        }

        if (num % sum == 0) {
            System.out.println(num + " is a Harshad number.");
        } else {
            System.out.println(num + " is NOT a Harshad number.");
        }

        
    }
}
