
import java.util.Scanner;

public class Armstrong {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = scan.nextInt();
        int originalnum,remainder,result=0;
        originalnum = num;
      {  
        int count=1;
        int temp=num;
        for(int i=0;i<=temp;i++){
        count++;
        temp=temp/10;
        }
        int digit=count;

        
        
        while(originalnum!=0){
            remainder =originalnum%10;
            result+=Math.pow(remainder,digit);
            originalnum=originalnum/10;

        }
    if(result==num){
        System.out.println(num+ " this is armstrong number");
    }
    else{
        System.out.println(num+" this is not armstrong number");
    }
}
}}
