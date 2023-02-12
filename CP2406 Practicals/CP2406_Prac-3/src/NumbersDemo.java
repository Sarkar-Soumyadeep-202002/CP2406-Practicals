public class NumbersDemo {
    public static void main(String[] args){
        int num1 = 10, num2 = 15;
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
