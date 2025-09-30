import java.util.Scanner;
public class Freqdigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        String num = sc.next();    
        int[] freq = new int[10];  
        for (int i = 0; i < num.length(); i++) {
            char ch = num.charAt(i);
            if (Character.isDigit(ch)) {
                freq[ch - '0']++;
            }
        }
        for (int i = 0; i <= 9; i++) {
            if (freq[i] > 0) {
                System.out.println(i + "->" + freq[i]);
            }
        }
    }
}
