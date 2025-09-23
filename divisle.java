import java.util.Scanner;

public class divisle {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the number:" );
        int n = scan.nextInt();
        if(n%3==0&&n%5==0)
        {
            System.out.println("Divisle by 3 and 5 numbers");
        }
        else
        {
            System.out.println("Not Divisle by 3 and 5 numbers  ");
        }
    }
    
}
