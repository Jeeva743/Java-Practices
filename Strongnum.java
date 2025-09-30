import java.util.Scanner;
public class Strongnum {
    public static void main(String[] args) {
        Scanner s1=new Scanner(System.in);
        System.out.print("Enter the Number: ");
        int num=s1.nextInt();
        int temp=num;
        int sum=0;
        while(num>0){
            int digit=num%10;
            int fact=1;
            for(int i=1;i<=digit;i++){
                fact=fact*i;
            }
            sum=sum+fact;
            num=num/10;
        }
        if(temp==sum){
            System.out.println(temp+" is a Strong Number");
        }
        else{
            System.out.println(temp+" is not a Strong Number");
        }
        
    }
    
}
