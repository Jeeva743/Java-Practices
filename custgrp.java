
import java.util.Scanner;

public class custgrp {
    public static void main(String[] args) {
        Scanner s1= new Scanner(System.in);
        System.out.print("Enter the Age : ");
        int age = s1.nextInt();
        System.out.print("Enter the Gender Code: ");
        int gencode=s1.nextInt();
        // Group 1: Males under 25 years old
        // Group 2: Females under 25 years old
        // Group 3: Males between 25 - 45 years old
        // Group 4: Females between 25 - 45 years old
        // Group 5: All people over 45 years old.
        if(gencode==1){
            if(age<=25){
                System.out.println("Group 1");
            }
            else if(25<age&&age<=45){
                System.out.println("Group 3");

            }
        }
         else if(gencode==2){
            if(age<=25){
                System.out.println("Group 2");
            }
            else if(25<age&&age<=45){
                System.out.println("Group 4");

            }
        }
        else if(age>45){
            System.out.println("group 5");
        }
        else{
           System.out.println("Invalid code please press 1 and 2 ");
         }
        

    }
    
}
