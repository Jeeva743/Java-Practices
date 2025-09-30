
import java.util.Scanner;

public class spynum {
    public static void main(String[] args) {
        Scanner s1 = new Scanner(System.in);
        System.out.print("Enter the Number: ");
        int num = s1.nextInt();
        int sum = 0;
        int product=1;
        int temp=num;
        while(temp>0){
            temp=num%10;
            sum=sum+temp;
            product=product*temp;
            temp/=10;

    }
    if(sum==product){
        System.out.println("The Given Number "+num+" is a Spy Number");
    }
    else{
        System.out.println("The Given Number "+num+" is not a Spy Number");
    }
    
}
}