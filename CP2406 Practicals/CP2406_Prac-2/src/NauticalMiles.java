public class NauticalMiles {
    public static void main(String[] args){
        double NAUTICAL_MILE_TO_KILOMETER = 1.852, NAUTICAL_MILE_TO_MILE = 1.150779, num_of_kilo_meters, num_of_miles;int num_of_nautMiles = 20;
        num_of_kilo_meters = num_of_nautMiles * NAUTICAL_MILE_TO_KILOMETER;
        num_of_miles = num_of_nautMiles * NAUTICAL_MILE_TO_MILE;
        System.out.println(num_of_nautMiles + " nautical miles is equal to " + num_of_kilo_meters + " kilometers");
        System.out.println(num_of_nautMiles + " nautical miles is equal to " + num_of_miles + " miles");
    }
}
