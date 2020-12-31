import java.util.Scanner;

public class Kualitas {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int nilai = input.nextInt();

        if( nilai < 55 ) {
            System.out.println("Kurang");
        }  else if( nilai > 75 ) {
            System.out.println("Sangat Bagus");
        }  else {
            System.out.println("Bagus");
        }
    }

}