
import java.util.Scanner;

public class even {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("enter the number: ");        
        long num = scan.nextLong();
        if(num%2==0)
        {
            System.out.println("it is even number");
        }
        else
        {
            System.out.println("it is odd number");
        }
        

    }
    
}
