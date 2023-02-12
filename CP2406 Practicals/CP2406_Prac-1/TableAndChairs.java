public class TableAndChairs {

    public static void main(String[] args){
        int i, j;
        for(i = 1; i <= 3; i++){
            for( j = 1; j <= 26; j++){
                if(i == 3 && j>=8 && j<20)
                    System.out.print("X");
                else if(j == 1 || j == 26)
                    System.out.print("X");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
        for(i = 1; i <= 3; i++){
            for( j = 1; j <= 26; j++){
                if(i == 1 && (j<=5 ||  j>=21 || j == 8))
                    System.out.print("X");
                else if(j == 19 || j == 21 || j == 26 || j == 1 || j == 5 || j == 8)
                    System.out.print("X");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
    }
}
