
import java.util.Scanner;

public class rigtoleft {
    public static void main(String[] args) {
        Scanner s1 = new Scanner(System.in);
        System.out.print("Enter the Number: ");
        int num =s1.nextInt();
        while(num>0){
            int digit = num % 10;
            System.out.print(digit+" ");
            num = num / 10;
        }        
    }

}
