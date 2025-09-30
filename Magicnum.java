import java.util.Scanner;

public class Magicnum {
    static int sumOfDigits(int n) {
        int sum = 0;
        while (n > 0) {
            sum += n % 10;
            n /= 10;
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        int temp = num;
        while (temp > 9) {
            temp = sumOfDigits(temp);
        }

        if (temp == 1)
            System.out.println(num + " is a Magic Number.");
        else
            System.out.println(num + " is NOT a Magic Number.");
    }
}
