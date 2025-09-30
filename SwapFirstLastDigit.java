import java.util.Scanner;

public class SwapFirstLastDigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        String num = sc.next();   
        int len = num.length();
        if (len <= 1) {
            System.out.println(num);
        } else {
            char first = num.charAt(0);
            char last  = num.charAt(len - 1); 
            String swapped = last + num.substring(1, len - 1) + first;

            System.out.println(swapped);
        }
    }
}
