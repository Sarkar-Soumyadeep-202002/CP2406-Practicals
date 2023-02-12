import java.util.Scanner;
public class BookStoreCredit {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = input.next();
        System.out.print("Enter your GPA: ");
        double gpa = input.nextDouble();
        displaymessage(name, gpa);
    }
    static void displaymessage(String name, double gpa){
        System.out.println("The Credits for " + name + " is " + (gpa * 10) + " in accordance to " + gpa + " GPA");
    }
}
