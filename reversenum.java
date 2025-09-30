import java.util.Scanner;
public class reversenum {
    public static void main(String[] args) {
        Scanner s1=new Scanner(System.in);
        System.out.print("Enter the Number: ");
        int num=s1.nextInt();
        int rev=0;
        while(num!=0){
            int digit=num%10;
            rev=rev*10+digit;
            num=num/10;
        }
        System.out.println("The Reversed Number is: "+rev);
    }
    
}
