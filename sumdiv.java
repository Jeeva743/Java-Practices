
import java.util.Scanner;

public class sumdiv {
    public static void main(String[] args) {
        Scanner s1 = new Scanner(System.in);
        System.out.print("Enter the Start Number: ");
        int start = s1.nextInt();
        System.out.print("Enter the End Number: ");
        int end = s1.nextInt();
       int a =0;
        for(int i=start;i<=end;i++){
             
            if(i%3==0 || i%5==0){
               a=i+a;
               
          } 
    }System.out.println("The Sum of the Numbers Divisible by 3 or 5 is: "+a);
       
}      
    
}
