
import java.util.Scanner;

public class evensum{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number: ");
        int n = sc.nextInt();
        int evencount = 0;
        int oddcount=0;
        for(int i=0;i<=n;i++){
            if(i%2==0){
                evencount = i+evencount;
            }
            else{
                oddcount = i+oddcount;
            }


        }
        System.out.println("The Sum of Even Numbers is: "+evencount);
        System.out.print("The Sum of Odd Numbers is: "+oddcount);
    }
}