
import java.util.Scanner;

public class factorial {
    public static void main(String[] args) {
        Scanner s1 = new Scanner(System.in);
        System.out.print("Enter the Number: ");
        int num = s1.nextInt();
        int fact = 1;
        if(num<0){
            System.out.print("Factorial is not defined for negative numbers");
        }
        else{
        for(int i=1;i<=num;i++){
            fact = fact*i;
        }System.out.print("The Factorial of the Number is: "+fact);
    }    
    }
}

