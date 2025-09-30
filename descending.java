
import java.util.Arrays;
    import java.util.Scanner;

public class descending {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numbers = new int[4];
        for (int i = 0; i < 4; i++) {
            numbers[i] = sc.nextInt();
        }
        Arrays.sort(numbers);
        for (int i = 3; i >= 0; i--) {
            System.out.print(numbers[i] +" ");
        }

        
    }
}

    

