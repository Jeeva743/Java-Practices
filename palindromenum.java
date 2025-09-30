import java.util.Scanner;
public class palindromenum {
    public static void main(String[] args) {
        Scanner s1=new Scanner(System.in);
        System.out.print("Enter the Number: ");
        int num=s1.nextInt();
        int rev=0;
        int temp=num;
        while(num!=0){
            int digit=num%10;
            rev=rev*10+digit;
            num=num/10;
        }
        if(temp==rev){
            System.out.println(temp+" is a Palindrome Number");
        }
        else{
            System.out.println(temp+" is not a Palindrome Number");
        }
    }
}
