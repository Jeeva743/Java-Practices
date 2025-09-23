import java.util.Scanner;

public class sbi_bank { 
    public static void main(String[] args) {
    Scanner s1= new Scanner(System.in);
        System.out.print("Age of primary applicant: ");
        int primary = s1.nextInt();
        System.out.print("Age of add-on applicant age: ");
        int addon = s1.nextInt();
        System.out.println("Enter your type ");
        int types = s1.nextInt();
        System.out.print("Income: ");
        int income = s1.nextInt();
        if(primary>=21 && primary<=60){
            if(addon>=18){
                if(types==1){
                    System.out.println("Salaried");
                }
                if(types==2){
                    System.out.println("Self-employed");
                }
                if(types==3){
                    System.out.println("Student");
                }
                if(types==4){
                    System.out.println("Retired pensionar");
                }
                if(income>=300000){
                    
                    System.out.println("You are eligible");
                }
                else{
                       System.out.println("You are not eligible");
                     }
            }
            else{
                       System.out.println("You are not eligible");
                     }
             
            }
            else{
                       System.out.println("You are not eligible");
                     }
                 
           
        }
            }
       
        
        

