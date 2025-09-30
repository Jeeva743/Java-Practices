import java.util.Scanner;

public class centerdigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter a number: ");
        String num = sc.next();  
        int len = num.length();
        if (len % 2 == 0) {
            System.out.println("-1");
        } else {
            int midIndex = len / 2;  
            System.out.println(num.charAt(midIndex));
        }
    }
}
