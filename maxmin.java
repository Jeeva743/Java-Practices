
import java.util.Scanner;

public class maxmin {
    public static void main(String[] args) {
        Scanner s1 = new Scanner(System.in);
        System.out.print("Enter the a value: ");
        int a =s1.nextInt();
        System.out.print("Enter the b value: ");
        int b=s1.nextInt();
        if(a>b){
            System.out.println("Max: "+a);
            System.out.println("Min: "+b);
        }
        else{
             System.out.println("Max: "+b);
            System.out.println("Min: "+a);
        }
        
    }
    
}
