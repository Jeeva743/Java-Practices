
import java.util.Scanner;

public class perfectsquare {
    public static void main(String[] args) {
        Scanner s1 = new Scanner(System.in);
        int num =s1.nextInt();
        int sqrt = (int) Math.sqrt(num);
        if (sqrt * sqrt == num) {
            System.out.println(num + " is a perfect square.");
        } else {
            System.out.println(num + " is NOT a perfect square.");
        }
    }
    

}
