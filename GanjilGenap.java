import java.util.Scanner;

public class GanjilGenap {
  public static void main(String[] args) {
    int angka;
    Scanner input = new Scanner(System.in);
    System.out.print("");
    angka = input.nextInt();
    if (angka % 2 == 0) {
      System.out.print("Genap");
    } else {
      System.out.print("Ganjil");
    }
  }
}