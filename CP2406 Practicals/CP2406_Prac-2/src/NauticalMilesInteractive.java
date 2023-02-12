import java.util.*;
public class NauticalMilesInteractive {
    public static void main(String[] args){
        Scanner Sc = new Scanner(System.in);
        double NAUTICAL_MILE_TO_KILOMETER = 1.852, NAUTICAL_MILE_TO_MILE = 1.150779, num_of_kilo_meters, num_of_miles;
        int num_of_nautMiles;
        System.out.print("Enter the number of Nautical Miles >> ");
        num_of_nautMiles = Sc.nextInt();
        num_of_kilo_meters = num_of_nautMiles * NAUTICAL_MILE_TO_KILOMETER;
        num_of_miles = num_of_nautMiles * NAUTICAL_MILE_TO_MILE;
        System.out.println(num_of_nautMiles + " nautical miles is equal to " + num_of_kilo_meters + " kilometers");
        System.out.println(num_of_nautMiles + " nautical miles is equal to " + num_of_miles + " miles");
    }
}
