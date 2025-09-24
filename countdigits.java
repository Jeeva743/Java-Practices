import java.util.Scanner;
public class countdigits{
public static void main(String[]args){
Scanner s1 =new Scanner(System.in);
System.out.print("Enter the Number: ");
int num = s1.nextInt();
int count=1;
for(int i=0;i<=num;i++){
 count++;
 num=num/10;

}
System.out.println("The Number of Digits Counts is "+count);
}}