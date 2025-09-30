
import java.util.Scanner;

public class year {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the days:" );
        int days = scan.nextInt();
        int year = 0;
        int months = 0;
        int week = 0;
        int day = 0;
        int remainingsdays = days;
        while(remainingsdays>=365 )
        {
            year++;
            remainingsdays-=365;
        }
        while(remainingsdays>=30)
        {
            months++;
            remainingsdays-=30;

        }
        while(remainingsdays>=7)
        {
            week++;
            remainingsdays-=7;
        }
        while(remainingsdays>=1)
        {
            day++;
            remainingsdays-=1;
        }
        System.out.println("Years:" +year);
        System.out.println("Months:" +months);
        System.out.println("Weeks:" +week);
       System.out.println("Day:" +day);        
    }
    
}

       