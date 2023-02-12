import java.util.Scanner;
public class NumberDemo2 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num1 = input.nextInt();
        System.out.print("Enter another number: ");
        int num2 = input.nextInt();

        displayNumberPlusFive(num1);
        displayTwiceTheNumber(num2);
        displayNumberSquared(num1);
    }
    public static void displayTwiceTheNumber(int num){
        System.out.println("Double of " + num + " is " + (num*2));
    }
    public static void displayNumberPlusFive(int num){
        System.out.println(num + " plus five is " + (num + 5));
    }
    public static void displayNumberSquared(int num){
        System.out.println(num + " Squared is " + (num * num));
    }
}
