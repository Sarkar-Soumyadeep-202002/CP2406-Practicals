public class InchestoFeet {
    public static void main(String[] args){
        int length_in_inches = 25, length_in_feet, remaining_inches;
        length_in_feet = length_in_inches/12;
        remaining_inches = length_in_inches % 12;
        System.out.println(length_in_inches + " inches is equal to " + length_in_feet + " feet and " + remaining_inches + " inches");
    }
}
