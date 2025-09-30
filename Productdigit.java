import java.util.Scanner;
public class Productdigit {
    public static void main(String[] args) {
        Scanner s1=new Scanner(System.in);
        System.out.print("Enter the Number: ");
        int num=s1.nextInt();
        int product=1;
        while(num!=0){
            int digit=num%10;
            product=product*digit;
            num=num/10;
        }
        System.out.println("The Product of Digits is: "+product);
    }

}
