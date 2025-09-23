import java.util.Scanner;
class mile {
    public static void main(String[] args) {
        Scanner s1 = new Scanner(System.in);
        System.out.print("Enter the Beginning: ");
        float reading1 = s1.nextFloat();
        System.out.print("Enter the Ending: ");
        float reading2 = s1.nextFloat();
        float a = reading2-reading1;
        System.out.println("Enter the one mile cost");
        int rupee = s1.nextInt();
        float cost = a*rupee;
        System.out.println("The last amount is "+cost);
        System.out.println("The miles is"+a);
    }
}