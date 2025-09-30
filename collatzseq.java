
import java.util.Scanner;

public class collatzseq {
    public static void main(String[] args) {
        Scanner s1 = new Scanner(System.in);
        System.out.print("Enter a positive integer: ");
        int num=s1.nextInt();
       System.out.print(num+" ");
        while(num!=1){
          
            if (num % 2 == 0) {
                num = num / 2;
            } else {
                num = 3 * num + 1;
            }
           System.out.print(num+" ");
        }
         
        }
    }
    

