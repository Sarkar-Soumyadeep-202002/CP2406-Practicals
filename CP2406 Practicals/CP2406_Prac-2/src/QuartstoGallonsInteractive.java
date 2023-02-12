import java.util.*;
public class QuartstoGallonsInteractive {
    public static void main(String[] args){
        Scanner Sc = new Scanner(System.in);
        int QUARTS_IN_GALLON = 4, num_of_quarts, num_of_gallons, remaining_num_of_quarts;
        System.out.print("Enter the number of Quarts >> ");
        num_of_quarts = Sc.nextInt();
        num_of_gallons = num_of_quarts/QUARTS_IN_GALLON;
        remaining_num_of_quarts = num_of_quarts%QUARTS_IN_GALLON;
        System.out.println("A job that needs" + " " + num_of_quarts + " " + "quarts requires" + " " + num_of_gallons + " " + "gallons plus" + " " + remaining_num_of_quarts + " " + "quarts");
    }
}
