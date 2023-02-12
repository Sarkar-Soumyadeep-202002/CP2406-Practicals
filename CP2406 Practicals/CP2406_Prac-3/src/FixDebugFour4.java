public class FixDebugFour4 {
    public static void main(String[] args)
    {
        final double DISCOUNT_RATE = 0.90;
        double price = 100.00;
        double price2 = 100.00;
        tenPercentOff(price, DISCOUNT_RATE);
        tenPercentOff(price2, DISCOUNT_RATE);
    }
    public static void tenPercentOff(double p, double rate)
    {
        double newPrice = p * rate;
        System.out.println("Ten percent off  + " + p);
        System.out.println("  New price is " + newPrice);
    }
    public static void tenPercentOff(double p)
    {
        double newPrice = p;
        System.out.println("Ten percent off " + p);
        System.out.println("  New price is " + newPrice);
    }
}
