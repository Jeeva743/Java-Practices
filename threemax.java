
import java.util.Scanner;

public class threemax {
    public static void main(String[] args) {
        Scanner s1 = new Scanner(System.in);
        System.out.print("Enter the value a: ");
        int a =s1.nextInt();
        System.out.print("Enter the value b: ");
        int b = s1.nextInt();
        System.out.print("Enter the value c: ");
        int c = s1.nextInt();
        if(a>b){
            System.out.println(a);
        }
        else if (b>c){
            System.out.println(b);
        }
        else{
            System.out.println(c);
        }
    
    }
    
}
